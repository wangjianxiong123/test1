package com.iotek.controller;

import com.iotek.biz.JobBiz;
import com.iotek.biz.VisitBiz;
import com.iotek.biz.VistoryBiz;
import com.iotek.biz.VitoBiz;
import com.iotek.modle.Job;
import com.iotek.modle.Visit;
import com.iotek.modle.Vistory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by 13765 on 2018/4/20.
 */
@Controller
public class VistorController {
    @Resource
    private VistoryBiz vistoryBiz;
    @Resource
    private VisitBiz visitBiz;
    @Resource
    private JobBiz jobBiz;
    @RequestMapping("/login")
    public String login(Vistory vistory, HttpServletRequest request, HttpSession session) {
        Vistory vistory1 = vistoryBiz.getV(vistory);
        Job job=new Job();
        job.setJob_state(1);
        List<Job> jobs=jobBiz.getAllD(job);
        System.out.println(jobs.size());
        if (vistory1 != null) {
            session.setAttribute("jobs",jobs);
            session.setAttribute("vistory",vistory1);
            return "success";
        }
        return "../../vistory";
    }
    @RequestMapping("/regin")
    public String regin(Model model,Vistory vistory, HttpServletRequest request) {
        Vistory vistory1 = new Vistory();
        vistory1.setV_name(vistory.getV_name());
        if (vistoryBiz.getN(vistory1)==null){
            vistoryBiz.addV(vistory);
            return "../../vistory";
        }
        model.addAttribute("error","用户名重复");
        return "../../regin";
    }
    @RequestMapping("/inform")
    public String inform( HttpServletRequest request, HttpSession session) {
        Vistory vistory= (Vistory) request.getSession().getAttribute("vistory");
        Visit visit=new Visit();
        visit.setVisit_vistory_id(vistory.getV_id());
        List<Visit> visits=visitBiz.getV(visit);
        session.setAttribute("visits",visits);
        return "visitConfor";
    }

}
