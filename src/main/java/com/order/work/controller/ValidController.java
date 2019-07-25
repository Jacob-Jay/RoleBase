package com.order.work.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Jiangqing
 * @version 1.0
 * @since 2019-07-25 9:10
 * 对非法请求的处理
 */
@Controller
@RequestMapping("valid")
public class ValidController {

    @RequestMapping("accessFail")
    @ResponseBody
    public String accessValid() {
        return "您没有权限访问该资源！";
    }

    @RequestMapping("notAuthentication")
    public String notAuthentication() {
        return "valid/notAuthentication";
    }
}
