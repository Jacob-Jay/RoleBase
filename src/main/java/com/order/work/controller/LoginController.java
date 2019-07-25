package com.order.work.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Jiangqing
 * @version 1.0
 * @since 2019-07-25 10:20
 * 登录相关
 */
@Controller
@RequestMapping("login")
public class LoginController {
    @RequestMapping()
    public String login() {
        return "login";
    }
}
