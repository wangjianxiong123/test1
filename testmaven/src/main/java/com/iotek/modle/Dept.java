package com.iotek.modle;

import java.util.Date;

/**
 * Created by 13765 on 2018/4/23.
 */
public class Dept {
    private int dept_id;
    private String dept_name;
    private Date dept_ctime;


    public Dept() {
    }

    public int getDept_id() {
        return dept_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public Date getDept_ctime() {
        return dept_ctime;
    }

    public void setDept_ctime(Date dept_ctime) {
        this.dept_ctime = dept_ctime;
    }


    @Override
    public String toString() {
        return "Dept{" +
                "dept_id=" + dept_id +
                ", dept_name='" + dept_name + '\'' +
                ", dept_ctime=" + dept_ctime +
                '}';
    }
}
