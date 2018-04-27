package com.iotek.controller;

import com.iotek.biz.*;
import com.iotek.modle.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * Created by 13765 on 2018/4/20.
 */
@Controller
public class EmployController {
    @Resource
    private EmployBiz employBiz;
    @Resource
    private VisitBiz visitBiz;
    @Resource
    private JobBiz jobBiz;
    @Resource
    private VitoBiz vitoBiz;
    @Resource
    private PositionBiz positionBiz;
    @Resource
    private DeptBiz deptBiz;
    @RequestMapping("/emp_login")
    public String login(Employ employ, HttpSession session){
        Employ employ1=employBiz.getE(employ);
        if(employ1!=null){
            session.setAttribute("employ",employ1);
            return "empsuccess";
        }
        return "../../emp";
    }
    @RequestMapping("/seachEmp")
    public String seachEmp(Employ employ, HttpSession session){
        Employ employ1= (Employ) session.getAttribute("employ");
        Dept dept=new Dept();
        dept.setDept_id(employ1.getEmp_dept_id());
        Dept dept1=deptBiz.getOneId(dept);
        Position position=new Position();
        position.setPos_id(employ1.getEmp_job_id());
        Position position1=positionBiz.getPosition(position);
        session.setAttribute("employ1",employ1);
        session.setAttribute("dept1",dept1);
        session.setAttribute("position1",position1);
        return "empself";

    }
    @RequestMapping("/changeJob")
    public String changeJob(HttpServletRequest request, HttpSession session){
        int emp_id=Integer.parseInt(request.getParameter("emp_id"));
        session.setAttribute("emp_id",emp_id);
        return "change";

    }
    @RequestMapping("/updateEmploy")
    public String updateEmploy(Employ employ,HttpServletRequest request, HttpSession session){
        int emp_id=Integer.parseInt(request.getParameter("emp_id"));
        employ.setEmp_id(emp_id);
        employBiz.updateEmp(employ);
        Employ employ1= (Employ) session.getAttribute("employ");
        employ.setEmp_sal(employ1.getEmp_sal());
        employ.setEmp_dept_id(employ1.getEmp_dept_id());
        employ.setEmp_job_id(employ1.getEmp_job_id());
        session.setAttribute("employ",employ);
        System.out.println(employ1);
        System.out.println(employ);
        return "empsuccess";

    }
    @RequestMapping("/duke")
    public String duke(HttpServletRequest request){
        int vito_vis_id=Integer.parseInt(request.getParameter("vito_vis_id"));
        //int vito_id=Integer.parseInt(request.getParameter("vito_id"));
        Vito vito=new Vito();
        vito.setVito_vis_id(vito_vis_id);
        Job job=new Job();
        job.setJob_id(vito_vis_id);
        Vito vito1=vitoBiz.getV(vito);
        Job job1=jobBiz.getG(job);
        Dept dept=new Dept();
        dept.setDept_name(job1.getJob_dept_name());
        Dept dept1=deptBiz.getOne(dept);
        Employ employ=new Employ();
        Position position=new Position();
        position.setPos_name(job1.getJob_name());
        Position position1=positionBiz.getName(position);
        employ.setEmp_name(vito1.getVito_name());
        employ.setEmp_age(vito1.getVito_age());
        employ.setEmp_sex(vito1.getVito_sex());
        employ.setEmp_phone(vito1.getVito_phone());
        employ.setEmp_dept_id(dept1.getDept_id());
        employ.setEmp_job_id(position1.getPos_id());
        employ.setEmp_sal(job1.getJob_salary());
        employ.setEmp_time(new Date());
        employ.setEmp_state(1);
        employ.setEmp_email(vito1.getVito_email());
        Employ employ1=new Employ();
        employ1.setEmp_name(vito1.getVito_name());
        employ1.setEmp_phone(vito1.getVito_phone());
        Employ employ2=employBiz.getByNamePhone(employ1);
        if (employ2==null){
            employBiz.addEmp(employ);
            return "rsuccess";
        }
        return "rsuccess";

    }
}
