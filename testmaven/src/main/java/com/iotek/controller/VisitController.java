package com.iotek.controller;

import com.iotek.biz.JobBiz;
import com.iotek.biz.VisitBiz;
import com.iotek.modle.Job;
import com.iotek.modle.Visit;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * Created by 13765 on 2018/4/23.
 */
@Controller
public class VisitController {
    @Resource
    private VisitBiz visitBiz;
    @Resource
    private JobBiz jobBiz;
    @RequestMapping("/seeVistoty")
    public String seeV(int visitory_id,int job_id,HttpSession session, HttpServletRequest request){
        Job job=new Job();
        job.setJob_id(job_id);
        Job job1=jobBiz.getG(job);
        session.setAttribute("visitory_id",visitory_id);
        session.setAttribute("job",job1);
        System.out.println(job1);
        return "visitTime";
    }
    @RequestMapping("/addVisit")
    public String addVisit(HttpSession session, HttpServletRequest request){
        String visit_job=request.getParameter("job_name");
        int visit_salary=Integer.parseInt(request.getParameter("job_salary"));
        String visit_address=request.getParameter("job_address");
        String date=request.getParameter("time");
        int vistory_id=Integer.parseInt(request.getParameter("vistory_id"));
        Visit visit=new Visit();
        visit.setVisit_job(visit_job);
        visit.setVisit_salary(visit_salary);
        visit.setVisit_address(visit_address);
        visit.setVisit_time(date);
        visit.setVisit_vistory_id(vistory_id);
        visitBiz.addVisit(visit);
        System.out.println(vistory_id);
        return "rsuccess";
    }
}
