package com.iotek.controller;

import com.iotek.biz.RootsBiz;
import com.iotek.modle.Roots;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by 13765 on 2018/4/20.
 */
@Controller
public class RootController {
    @Resource
    private RootsBiz rootsBiz;
    @RequestMapping("/root_login")
    public String login(Roots roots){
        if(rootsBiz.getR(roots)!=null){
            return "rsuccess";
        }
        return "../../root";
    }
}
