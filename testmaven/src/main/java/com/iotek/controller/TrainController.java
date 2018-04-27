package com.iotek.controller;

import com.iotek.biz.DeptBiz;
import com.iotek.biz.PositionBiz;
import com.iotek.biz.TrainBiz;
import com.iotek.modle.Dept;
import com.iotek.modle.Employ;
import com.iotek.modle.Position;
import com.iotek.modle.Train;
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
public class TrainController {
    @Resource
    private TrainBiz trainBiz;
    @Resource
    private DeptBiz deptBiz;
    @Resource
    private PositionBiz positionBiz;
    @RequestMapping("/trains")
    public String getByDept(){
        return "trainDeptPosition";
    }
    @RequestMapping("/trainDept")
    public String trainDept(HttpSession session){
        Employ employ= (Employ) session.getAttribute("employ");
        Dept dept=new Dept();
        dept.setDept_id(employ.getEmp_dept_id());
        Dept dept1=deptBiz.getOneId(dept);
        Position position=new Position();
        position.setPos_id(employ.getEmp_job_id());
        Position position1=positionBiz.getPosition(position);
        Train train=new Train();
        train.setTrain_dept(dept1.getDept_name());
        Train train1=trainBiz.getByDept(train);
        System.out.println(train1);
        if (train1!=null){
            if(train1.getTrain_position().equals("all")){
                session.setAttribute("trains",train1);
                System.out.println("部门");
                return "showTrainDept";
            }
        }

        System.out.println(employ);
        return "trainDeptPosition";
    }
    @RequestMapping("/trainPosition")
    public String trainPosition(HttpSession session){
        Employ employ= (Employ) session.getAttribute("employ");
        Dept dept=new Dept();
        dept.setDept_id(employ.getEmp_dept_id());
        Dept dept1=deptBiz.getOneId(dept);
        Position position=new Position();
        position.setPos_id(employ.getEmp_job_id());
        Position position1=positionBiz.getPosition(position);
        Train train=new Train();
        train.setTrain_position(position1.getPos_name());
        Train train1=trainBiz.getByPosition(train);
        System.out.println(train1);
        if (train1!=null){
            if(train1.getTrain_dept().equals("all")){
                session.setAttribute("trains",train1);
                System.out.println("职业");
                return "showTrainPosition";
            }
        }

        return "trainDeptPosition";
    }
    @RequestMapping("/trainCompany")
    public String trainCompany(HttpSession session){
        List<Train> trains=trainBiz.getAll();
        session.setAttribute("trains",trains);
        return "trainAll";
    }
    @RequestMapping("/trainDeptPositions")
    public String trainDeptPosition(HttpSession session){
        Employ employ= (Employ) session.getAttribute("employ");
        Dept dept=new Dept();
        dept.setDept_id(employ.getEmp_dept_id());
        Dept dept1=deptBiz.getOneId(dept);
        Position position=new Position();
        position.setPos_id(employ.getEmp_job_id());
        Position position1=positionBiz.getPosition(position);
        Train train=new Train();
        train.setTrain_position(position1.getPos_name());
        train.setTrain_dept(dept1.getDept_name());
        Train train1=trainBiz.getDeptPosition(train);
        if (train1!=null){
            session.setAttribute("trains",train1);
            System.out.println("1111111111");
            return "showDeptPosition";
        }
        return "trainDeptPosition";

    }

    @RequestMapping("/updateTrain")
    public String updateTrain(Train train,HttpSession session,HttpServletRequest request){
        int train_id=Integer.parseInt(request.getParameter("train_id"));
        System.out.println(train);
        train.setTrain_id(train_id);
        trainBiz.updateTrain(train);
        List<Train> trains=trainBiz.getAll();
        session.setAttribute("trains",trains);
        return "trainAll";
    }
    @RequestMapping("/addTrain")
    public String addTrain(Train train,HttpSession session){
        System.out.println(train);
        trainBiz.addTrain(train);
        List<Train> trains=trainBiz.getAll();
        session.setAttribute("trains",trains);
        return "trainAll";
    }
    @RequestMapping("/deleteTrain")
    public String deleteTrain(HttpSession session, HttpServletRequest request){
        int train_id=Integer.parseInt(request.getParameter("train_id"));
        Train train=new Train();
        train.setTrain_id(train_id);
        trainBiz.deleteTrain(train);
        List<Train> trains=trainBiz.getAll();
        session.setAttribute("trains",trains);
        return "trainAll";
    }

}
