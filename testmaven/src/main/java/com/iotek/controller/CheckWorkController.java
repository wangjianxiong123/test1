package com.iotek.controller;

import com.iotek.biz.CheckWorkBiz;
import com.iotek.modle.CheckWork;
import com.iotek.modle.Employ;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 13765 on 2018/4/27.
 */
@Controller
public class CheckWorkController {
    @Resource
    private CheckWorkBiz checkWorkBiz;
    @RequestMapping("/check_work")
    public String all(){
        return "checkButton";
    }
    @RequestMapping("/addCheck")
    public String addCheck(HttpSession session){
        System.out.println("11111111111");
        CheckWork checkWork=new CheckWork();
        Employ employ= (Employ) session.getAttribute("employ");
        Date date=new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s=dateFormat.format(date);
        checkWork.setCheck_begin(s);
        checkWork.setCheck_emp_id(employ.getEmp_id());
        CheckWork checkWork2=checkWorkBiz.getByDate(checkWork);
        checkWorkBiz.addCheck(checkWork);
        session.setAttribute("check_begin",s);
        session.setAttribute("check_emp_id",employ.getEmp_id());
        return "begincheckButton";
    }
    @RequestMapping("/updateCheck")
    public String updateCheck(HttpSession session, HttpServletRequest request){
        int check_emp_id=Integer.parseInt(request.getParameter("check_emp_id"));
        String s=request.getParameter("check_begin");
        CheckWork checkWork=new CheckWork();
        checkWork.setCheck_begin(s);
        checkWork.setCheck_emp_id(check_emp_id);
        CheckWork checkWork1=checkWorkBiz.getByDate(checkWork);
        Date date=new Date();

        CheckWork checkWork2=new CheckWork();
        checkWork2.setCheck_end(date);
        checkWork2.setCheck_id(checkWork1.getCheck_id());

        CheckWork checkWork3=new CheckWork();
        checkWork3.setCheck_id(checkWork1.getCheck_id());
        CheckWork checkWork4=checkWorkBiz.getById(checkWork3);
        System.out.println(checkWork3);
        if(checkWork4.getCheck_end()==null){
            checkWorkBiz.updateCheck(checkWork2);
            CheckWork checkWork5=checkWorkBiz.getById(checkWork3);
            System.out.println(checkWork5);
            session.setAttribute("checkWork",checkWork5);
            return "beginEnd";
        }
        CheckWork checkWork6=checkWorkBiz.getById(checkWork3);
        session.setAttribute("checkWork",checkWork6);
        return "beginEnd";
    }
    @RequestMapping("/backrsu")
    public String back(){
        return "empsuccess";
    }
}
