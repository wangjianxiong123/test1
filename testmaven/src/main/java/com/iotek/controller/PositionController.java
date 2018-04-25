package com.iotek.controller;

import com.iotek.biz.EmployBiz;
import com.iotek.biz.PositionBiz;
import com.iotek.modle.Employ;
import com.iotek.modle.Position;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by 13765 on 2018/4/25.
 */
@Controller
public class PositionController {
    @Resource
    private PositionBiz positionBiz;
    @Resource
    private EmployBiz employBiz;
    @RequestMapping("/updatePosition")
    public String updatePos(HttpServletRequest request, HttpSession session){
        int pos_id=Integer.parseInt(request.getParameter("pos_id"));
        String pos_name=request.getParameter("pos_name");
        int pos_salary=Integer.parseInt(request.getParameter("pos_salary"));
        int dept_id=Integer.parseInt(request.getParameter("pos_dept_id"));
        Position position=new Position();
        position.setPos_id(pos_id);
        position.setPos_name(pos_name);
        position.setPos_salary(pos_salary);
        position.setPos_dept_id(dept_id);
        positionBiz.updatePos(position);
        Position position1=new Position();
        position1.setPos_dept_id(dept_id);
        List<Position> positions=positionBiz.getDept(position1);
        session.setAttribute("positions",positions);
        return "getPosition";
    }
    @RequestMapping("/deletePosition")
    public String deletePos(HttpServletRequest request,HttpSession session){
        int pos_id=Integer.parseInt(request.getParameter("pos_id"));
        int dept_id=Integer.parseInt(request.getParameter("pos_dept_id"));
        Employ employ=new Employ();
        employ.setEmp_job_id(pos_id);
        List<Employ> employs=employBiz.getEmpName(employ);
        Position position=new Position();
        position.setPos_id(pos_id);
        System.out.println(position);
        System.out.println(employs);
        if(employs.size()==0){
            positionBiz.deletePosition(position);
            Position position1=new Position();
            position1.setPos_dept_id(dept_id);
            List<Position> positions=positionBiz.getDept(position1);
            session.setAttribute("positions",positions);
            return "getPosition";
        }
        return "getPosition";
    }
    @RequestMapping("/seachPosition")
    public String seachPos(HttpServletRequest request,HttpSession session){
        int pos_id=Integer.parseInt(request.getParameter("pos_id"));
        Employ employ=new Employ();
        employ.setEmp_job_id(pos_id);
        List<Employ> employs=employBiz.getEmpName(employ);
        session.setAttribute("employs",employs);
        return "getEmployByName";
    }
    @RequestMapping("/addPosition")
    public String addPos(Position position,HttpServletRequest request,HttpSession session){
        int dept_id=Integer.parseInt(request.getParameter("dept_id"));
        position.setPos_dept_id(dept_id);
        Position position2=new Position();
        position2.setPos_name(position.getPos_name());
        if(positionBiz.getName(position2)==null){
            positionBiz.addPos(position);
            System.out.println(position);
            Position position1=new Position();
            position1.setPos_dept_id(dept_id);
            List<Position> positions=positionBiz.getDept(position1);
            session.setAttribute("positions",positions);
            return "getPosition";
        }

        return "getPosition";
    }
}
