package com.iotek.controller;

import com.iotek.biz.SrecordBiz;
import com.iotek.biz.VitoBiz;
import com.iotek.modle.Srecord;
import com.iotek.modle.Vistory;
import com.iotek.modle.Vito;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by 13765 on 2018/4/23.
 */
@Controller
public class VitoController {
    @Resource
    private VitoBiz vitoBiz;
    @Resource
    private SrecordBiz srecordBiz;
    @RequestMapping("/add")
    public String add(HttpSession session, Vito vito){
        Vistory vistory= (Vistory) session.getAttribute("vistory");
        vito.setVito_vis_id(vistory.getV_id());
        vitoBiz.addV(vito);
        return "success";
    }
    @RequestMapping("/send")
    public String send(HttpSession session, HttpServletRequest request){
        Vistory vistory= (Vistory) session.getAttribute("vistory");
        Vito vito=new Vito();
        int id=Integer.parseInt(request.getParameter("id"));
        vito.setVito_vis_id(vistory.getV_id());
        Vito vito1=vitoBiz.getV(vito);
        Srecord srecord=new Srecord();
        if(vito1!=null){
            srecord.setRec_visto_id(vito1.getVito_id());
            srecord.setRec_job_id(id);
            srecordBiz.addS(srecord);
        }
        return "success";
    }

}
