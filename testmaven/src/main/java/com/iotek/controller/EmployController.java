package com.iotek.controller;

import com.iotek.biz.EmployBiz;
import com.iotek.modle.Employ;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by 13765 on 2018/4/20.
 */
@Controller
public class EmployController {
    @Resource
    private EmployBiz employBiz;
    @RequestMapping("/emp_login")
    public String login(Employ employ, HttpSession session){
        Employ employ1=employBiz.getE(employ);
        if(employ1!=null){
            session.setAttribute("employ",employ1);
            return "empsuccess";
        }
        return "../../emp";
    }
}
