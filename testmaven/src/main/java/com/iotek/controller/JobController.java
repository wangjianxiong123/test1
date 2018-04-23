package com.iotek.controller;

import com.iotek.biz.JobBiz;
import com.iotek.modle.Job;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by 13765 on 2018/4/23.
 */
@Controller
public class JobController {
    @Resource
    private JobBiz jobBiz;
    @RequestMapping("/addG")
    public String addG(Job job, HttpSession session){
        jobBiz.addG(job);
        return "";
    }
    @RequestMapping("/deleteG")
    public String deleteG(HttpSession session, HttpServletRequest request){
        int id=Integer.parseInt(request.getParameter("job_id"));
        Job job=new Job();
        job.setJob_id(id);
        jobBiz.deleteG(job);
        return "";
    }
    @RequestMapping("/updateG")
    public String updateG(Job job, HttpSession session){
        jobBiz.updateG(job);
        return "";
    }
    @RequestMapping("/seachMassage")
    public String getG( HttpSession session){
        List<Job> jobs=jobBiz.getAll();
        session.setAttribute("jobs",jobs);
        return "emploMassage";
    }
    @RequestMapping("/recordMessage")
    public String recordMessage( HttpSession session,HttpServletRequest request){
        int id=Integer.parseInt(request.getParameter("rid"));
        Job job=new Job();
        job.setJob_id(id);
        Job job1=jobBiz.getG(job);
        session.setAttribute("job1",job1);
        return "recordMessageVito";
    }

}
