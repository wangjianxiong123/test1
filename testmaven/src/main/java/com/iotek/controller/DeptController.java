package com.iotek.controller;

import com.iotek.biz.DeptBiz;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by 13765 on 2018/4/23.
 */
@Controller
public class DeptController {
   @Resource
    private DeptBiz deptBiz;
   @RequestMapping("")
    public String add(){
        return "";
   }
}
