package com.iotek.controller;

import com.iotek.biz.PushimentBiz;
import com.iotek.modle.Employ;
import com.iotek.modle.Pushiments;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * Created by 13765 on 2018/4/27.
 */
@Controller
public class PushimentsController {
    @Resource
    private PushimentBiz pushimentBiz;
    @RequestMapping("/pushiment")
    public String getAll(HttpSession session){
        List<Pushiments> pushiments=pushimentBiz.getAll();
        System.out.println(pushiments);
        session.setAttribute("pushiment",pushiments);
        return "allPush";
    }
    @RequestMapping("/myPushiments")
    public String myPushiments(HttpServletRequest request,HttpSession session){
        Employ employ1= (Employ) session.getAttribute("employ");
        Pushiments pushiments=new Pushiments();
        pushiments.setPush_emp_id(employ1.getEmp_id());
        List<Pushiments> pushiment=pushimentBiz.getByEmp(pushiments);
        System.out.println(pushiment);
        session.setAttribute("pushiment",pushiment);
        return "PushiMassage";
    }
    @RequestMapping("/addPush")
    public String addAll(Pushiments pushiments,HttpSession session){
        System.out.println(pushiments);
        pushiments.setPush_time(new Date());
        pushimentBiz.addPush(pushiments);
        List<Pushiments> pushiment=pushimentBiz.getAll();
        session.setAttribute("pushiment",pushiment);
        return "allPush";
    }
    @RequestMapping("/updatePush")
    public String updateAll(HttpServletRequest request,Pushiments pushiments,HttpSession session){
        System.out.println(pushiments);
        int push_id=Integer.parseInt(request.getParameter("push_id"));
        pushiments.setPush_id(push_id);
        pushimentBiz.updatePush(pushiments);
        List<Pushiments> pushiment=pushimentBiz.getAll();
        session.setAttribute("pushiment",pushiment);
        return "allPush";
    }
    @RequestMapping("/deletePush")
    public String deleteAll(HttpServletRequest request,HttpSession session){
        int push_id=Integer.parseInt(request.getParameter("push_id"));
        Pushiments pushiments=new Pushiments();
        pushiments.setPush_id(push_id);
        pushimentBiz.deletePush(pushiments);
        List<Pushiments> pushiment=pushimentBiz.getAll();
        session.setAttribute("pushiment",pushiment);
        return "allPush";
    }
}
