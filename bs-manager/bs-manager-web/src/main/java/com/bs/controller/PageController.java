package com.bs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    /**
     * 公共页面跳转 restful 风格
     * 前台传 index 就跳转到/WEB-INF/pages/index.jsp
     * ...
     *
     * @param page page's string expected
     * @return page expected
     *
     * */
    @RequestMapping("/{page}")
    public String page(@PathVariable String page) {
        return page;
    }
}
