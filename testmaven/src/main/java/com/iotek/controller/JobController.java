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
        job.setJob_state(0);
        jobBiz.addG(job);
        return "Massage";
    }
    @RequestMapping("/deleteG")
    public String deleteG(HttpSession session, HttpServletRequest request){
        int id=Integer.parseInt(request.getParameter("job_id"));
        Job job=new Job();
        job.setJob_id(id);
        jobBiz.deleteG(job);
        return "Massage";
    }

    @RequestMapping("/sendMessage")
    public String sendMessage( HttpSession session, HttpServletRequest request){
        Job job=new Job();
        int job_id=Integer.parseInt(request.getParameter("job_id"));
        job.setJob_id(job_id);
        job.setJob_state(1);
        jobBiz.updateJob(job);
        return "Massage";
    }
    @RequestMapping("/updateAll")
    public String updateG(Job job, HttpSession session,HttpServletRequest request){
        int job_id=Integer.parseInt(request.getParameter("job_id"));
        job.setJob_id(job_id);
        job.setJob_state(0);
        jobBiz.updateG(job);
        return "Massage";
    }
    @RequestMapping("/updateJobState")
    public String updateJobState( HttpSession session,HttpServletRequest request){
        Job job=new Job();
        int job_id=Integer.parseInt(request.getParameter("job_id"));
        job.setJob_id(job_id);
        job.setJob_state(0);
        jobBiz.updateJob(job);
        return "Massage";
    }
    @RequestMapping("/seachMassage1")
    public String getG1( HttpSession session){
        return "Massage";
    }
    @RequestMapping("/seachMassage")
    public String getG( HttpSession session){
        Job job=new Job();
        job.setJob_state(1);
        List<Job> jobs=jobBiz.getAllD(job);
        session.setAttribute("jobs",jobs);
        return "emploMassage";
    }
    @RequestMapping("/seachMassage2")
    public String getG2( HttpSession session){
        Job job=new Job();
        job.setJob_state(0);
        List<Job> jobs=jobBiz.getAllD(job);
        System.out.println(jobs);
        session.setAttribute("jobs1",jobs);
        return "emppages";
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
