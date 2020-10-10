package com.security.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.ibatis.type.TypeAliasRegistry;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.io.IOException;

import static org.springframework.core.io.support.ResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX;

/**
 * @author Jiangqing
 * @version 1.0
 * @since 2019-07-24 14:51
 */
@Configuration
@ComponentScan(value = {"com.order.work.service","com.order.work.dao"})
@MapperScan("com.order.work.dao.mapper")
@PropertySource(value = "classpath:/spring/db.properties")
public class AppConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(AppConfig.class);


    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String name;
    @Value("${jdbc.password}")
    private String password;
//    @Value("${pool.init}")
//    private int initSize;
//    @Value("${pool.min}")
//    private int min;
//    @Value("${pool.max}")
//    private int max;
//    @Value("${pool.getSize}")
//    private int newSize;




    @Bean
    public DataSource dataSource() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
//        dataSource.setMinPoolSize(min);
//        dataSource.setMaxPoolSize(max);
//        dataSource.setInitialPoolSize(initSize);
//        dataSource.setAcquireIncrement(newSize);
        dataSource.setUser(name);
        dataSource.setPassword(password);
        dataSource.setJdbcUrl(url);
        try {
            dataSource.setDriverClass(driver);
        } catch (PropertyVetoException e) {
            LOGGER.error("初始化连接池失败");
            throw e;
        }
        return dataSource;
    }

    @Bean
    public DataSourceTransactionManager transactionManager() throws PropertyVetoException {
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource());
        return dataSourceTransactionManager;
    }


    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean() throws Exception{
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setConfiguration(configuration());
        sqlSessionFactoryBean.setDataSource(dataSource());
        try {
            PathMatchingResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
            Resource[] resources = resourcePatternResolver.getResources(CLASSPATH_ALL_URL_PREFIX+"/mapper/*.xml");
            sqlSessionFactoryBean.setMapperLocations(resources);
        } catch (IOException e) {
            LOGGER.error("解析mapper文件位置失败");
            e.printStackTrace();
            throw e;
        }
        return sqlSessionFactoryBean;
    }

    @Bean
    public org.apache.ibatis.session.Configuration configuration() {
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        configuration.setMapUnderscoreToCamelCase(true);
        TypeAliasRegistry typeAliasRegistry = configuration.getTypeAliasRegistry();
        typeAliasRegistry.registerAliases("com.order.work.dao.domain");
        return configuration;
    }


}
