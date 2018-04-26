package com.iotek.controller;

import com.iotek.biz.DeptBiz;
import com.iotek.biz.EmployBiz;
import com.iotek.biz.PositionBiz;
import com.iotek.modle.Dept;
import com.iotek.modle.Employ;
import com.iotek.modle.Position;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * Created by 13765 on 2018/4/23.
 */
@Controller
public class DeptController {
   @Resource
    private DeptBiz deptBiz;
   @Resource
   private PositionBiz positionBiz;
    @Resource
    private EmployBiz employBiz;
   @RequestMapping("/checkDept")
    public String checkDept(HttpSession session){
       List<Dept> depts=deptBiz.getAll();
       session.setAttribute("depts",depts);
        return "allDept";
   }
    @RequestMapping("/addDept")
    public String add(HttpSession session, HttpServletRequest request, Model model){
        String dept_name=request.getParameter("dept_name");
        Dept dept=new Dept();
        Dept dept1=new Dept();
        dept.setDept_name(dept_name);
        dept1.setDept_name(dept_name);
        dept.setDept_ctime(new Date());
        Dept dept2=deptBiz.getOne(dept1);
        if (dept2==null){
            deptBiz.addD(dept);
            List<Dept> depts=deptBiz.getAll();
            session.setAttribute("depts",depts);
            return "allDept";
        }
        model.addAttribute("error","该部门已被创建,不能重复创建");
        return "allDept";

    }
    @RequestMapping("/updateDept")
    public String updateDept(HttpSession session,HttpServletRequest request){
        String dept_name=request.getParameter("dept_name");
        int dept_id=Integer.parseInt(request.getParameter("dept_id"));
        Dept dept=new Dept();
        dept.setDept_id(dept_id);
        dept.setDept_name(dept_name);
        deptBiz.updateDept(dept);
        List<Dept> depts=deptBiz.getAll();
        session.setAttribute("depts",depts);
        return "allDept";
    }
    @RequestMapping("/deleteDept")
    public String deleteDept(HttpSession session,HttpServletRequest request){
        int dept_id=Integer.parseInt(request.getParameter("dept_id"));
        Dept dept=new Dept();
        dept.setDept_id(dept_id);
        Position position=new Position();
        position.setPos_dept_id(dept_id);
        System.out.println(dept);
        Dept dept1=deptBiz.getOneId(dept);
        Employ employ=new Employ();
        employ.setEmp_dept_id(dept1.getDept_id());
        List<Employ> employ1=employBiz.getEmpName(employ);
        System.out.println(employ1);
        if(employ1.size()==0){
            deptBiz.deleteDept(dept);
            positionBiz.deletePos(position);
            System.out.println("*********");
            List<Dept> depts=deptBiz.getAll();
            session.setAttribute("depts",depts);
            return "allDept";
        }

        return "allDept";

    }
    @RequestMapping("/seachDept")
    public String seachDept(HttpSession session,HttpServletRequest request){

        /*Dept dept=new Dept();
        dept.setDept_id(dept_id);
        Dept dept1=deptBiz.getOneId(dept);
        Employ employ=new Employ();
        employ.setEmp_dept_id(dept1.getDept_id());
        List<Employ> employ1=employBiz.getEmpName(employ);
        session.setAttribute("employs",employ1);*/
        int dept_id=Integer.parseInt(request.getParameter("dept_id"));
        Position position=new Position();
        position.setPos_dept_id(dept_id);
        List<Position> positions=positionBiz.getDept(position);
        session.setAttribute("positions",positions);
        session.setAttribute("dept_id",dept_id);
        return "getPosition";
        //"getEmployByName";
    }
    @RequestMapping("/seachDeptMessag")
    public String seachDeptMessag(HttpSession session){
        List<Dept> depts=deptBiz.getAll();
        session.setAttribute("depts",depts);
        return "empaAllDepts";
    }
    @RequestMapping("/seachDeptDetail")
    public String seachDeptD(HttpSession session,HttpServletRequest request){
        int dept_id=Integer.parseInt(request.getParameter("dept_id"));
        Position position=new Position();
        position.setPos_dept_id(dept_id);
        List<Position> positions=positionBiz.getDept(position);
        session.setAttribute("positions",positions);
        session.setAttribute("dept_id",dept_id);
        return "getPositionDetail";
    }
}
