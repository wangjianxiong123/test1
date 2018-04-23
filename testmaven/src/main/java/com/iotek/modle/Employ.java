package com.iotek.modle;

/**
 * Created by 13765 on 2018/4/20.
 */
public class Employ {
    private int emp_id;
    private String emp_name;
    private String emp_age;
    private String emp_sex;
    private String emp_phone;
    private String emp_dept;
    private String emp_job;
    private int emp_sal;

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

    public String getEmp_age() {
        return emp_age;
    }

    public void setEmp_age(String emp_age) {
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

    public String getEmp_dept() {
        return emp_dept;
    }

    public void setEmp_dept(String emp_dept) {
        this.emp_dept = emp_dept;
    }

    public String getEmp_job() {
        return emp_job;
    }

    public void setEmp_job(String emp_job) {
        this.emp_job = emp_job;
    }

    public int getEmp_sal() {
        return emp_sal;
    }

    public void setEmp_sal(int emp_sal) {
        this.emp_sal = emp_sal;
    }

    @Override
    public String toString() {
        return "Employ{" +
                "emp_id=" + emp_id +
                ", emp_name='" + emp_name + '\'' +
                ", emp_age='" + emp_age + '\'' +
                ", emp_sex='" + emp_sex + '\'' +
                ", emp_phone='" + emp_phone + '\'' +
                ", emp_dept='" + emp_dept + '\'' +
                ", emp_job='" + emp_job + '\'' +
                ", emp_sal=" + emp_sal +
                '}';
    }
}
