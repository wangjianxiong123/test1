package com.iotek.modle;

/**
 * Created by 13765 on 2018/4/23.
 */
public class Job {
    private int job_id;
    private String job_name;
    private String job_dept_name;
    private int job_salary;
    private String job_address;

    public Job() {
    }

    public int getJob_id() {
        return job_id;
    }

    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }

    public String getJob_name() {
        return job_name;
    }

    public void setJob_name(String job_name) {
        this.job_name = job_name;
    }

    public String getJob_dept_name() {
        return job_dept_name;
    }

    public void setJob_dept_name(String job_dept_name) {
        this.job_dept_name = job_dept_name;
    }

    public int getJob_salary() {
        return job_salary;
    }

    public void setJob_salary(int job_salary) {
        this.job_salary = job_salary;
    }

    public String getJob_address() {
        return job_address;
    }

    public void setJob_address(String job_address) {
        this.job_address = job_address;
    }

    @Override
    public String toString() {
        return "Job{" +
                "job_id=" + job_id +
                ", job_name='" + job_name + '\'' +
                ", job_dept_name='" + job_dept_name + '\'' +
                ", job_salary=" + job_salary +
                ", job_address='" + job_address + '\'' +
                '}';
    }
}
