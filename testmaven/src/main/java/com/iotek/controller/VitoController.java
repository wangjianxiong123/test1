package com.iotek.controller;

import com.iotek.biz.SrecordBiz;
import com.iotek.biz.VitoBiz;
import com.iotek.modle.Srecord;
import com.iotek.modle.Vistory;
import com.iotek.modle.Vito;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

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
    public String send(HttpSession session, HttpServletRequest request, Model model){
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
            model.addAttribute("error","投递成功");
            return "success";
        }
        model.addAttribute("error1","投递失败,请填写简历");
        return "success";
    }
    @RequestMapping("/confin")
    public String confin(int vito_id,HttpSession session){
       Vito vito=new Vito();
        System.out.println("/////////////");
        System.out.println(vito_id);
       vito.setVito_id(vito_id);
       vito.setVito_state(3);
       vitoBiz.updateV(vito);
        return "success";
    }
    @RequestMapping("/machsee")
    public String machsee(HttpSession session){
        Vito vito=new Vito();
        vito.setVito_state(3);
        List<Vito> vitos=vitoBiz.getVito(vito);
        session.setAttribute("vitos",vitos);
        return "machseeResult";
    }

}
