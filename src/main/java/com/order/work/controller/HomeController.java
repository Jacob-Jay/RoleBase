package com.order.work.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Jiangqing
 * @version 1.0
 * @since 2019-07-25 9:00
 * 主页相关的视图控制
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping()
    public String home() {
        return "home";
    }
}
