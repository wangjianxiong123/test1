package com.iotek.modle;

import java.util.Date;

/**
 * Created by 13765 on 2018/4/20.
 */
public class Employ {
    private int emp_id;
    private String emp_name;
    private int emp_age;
    private String emp_sex;
    private String emp_phone;
    private int emp_dept_id;
    private int emp_job_id;
    private int emp_sal;
    private Date emp_time;
    private int emp_state;
    private String emp_email;

    public Employ() {
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public int getEmp_age() {
        return emp_age;
    }

    public void setEmp_age(int emp_age) {
        this.emp_age = emp_age;
    }

    public String getEmp_sex() {
        return emp_sex;
    }

    public void setEmp_sex(String emp_sex) {
        this.emp_sex = emp_sex;
    }

    public String getEmp_phone() {
        return emp_phone;
    }

    public void setEmp_phone(String emp_phone) {
        this.emp_phone = emp_phone;
    }

    public int getEmp_dept_id() {
        return emp_dept_id;
    }

    public void setEmp_dept_id(int emp_dept_id) {
        this.emp_dept_id = emp_dept_id;
    }

    public int getEmp_job_id() {
        return emp_job_id;
    }

    public void setEmp_job_id(int emp_job_id) {
        this.emp_job_id = emp_job_id;
    }

    public int getEmp_sal() {
        return emp_sal;
    }

    public void setEmp_sal(int emp_sal) {
        this.emp_sal = emp_sal;
    }

    public Date getEmp_time() {
        return emp_time;
    }

    public void setEmp_time(Date emp_time) {
        this.emp_time = emp_time;
    }

    public int getEmp_state() {
        return emp_state;
    }

    public void setEmp_state(int emp_state) {
        this.emp_state = emp_state;
    }

    public String getEmp_email() {
        return emp_email;
    }

    public void setEmp_email(String emp_email) {
        this.emp_email = emp_email;
    }

    @Override
    public String toString() {
        return "Employ{" +
                "emp_id=" + emp_id +
                ", emp_name='" + emp_name + '\'' +
                ", emp_age=" + emp_age +
                ", emp_sex='" + emp_sex + '\'' +
                ", emp_phone='" + emp_phone + '\'' +
                ", emp_dept_id=" + emp_dept_id +
                ", emp_job_id=" + emp_job_id +
                ", emp_sal=" + emp_sal +
                ", emp_time='" + emp_time + '\'' +
                ", emp_state=" + emp_state +
                ", emp_email='" + emp_email + '\'' +
                '}';
    }
}
