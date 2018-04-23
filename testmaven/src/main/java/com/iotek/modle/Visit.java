package com.iotek.modle;

/**
 * Created by 13765 on 2018/4/23.
 */
public class Visit {
    private int visit_id;
    private String visit_job;
    private int visit_salary;
    private String visit_address;
    private String visit_time;
    private int visit_vistory_id;

    public Visit() {
    }

    public int getVisit_id() {
        return visit_id;
    }

    public void setVisit_id(int visit_id) {
        this.visit_id = visit_id;
    }

    public String getVisit_job() {
        return visit_job;
    }

    public void setVisit_job(String visit_job) {
        this.visit_job = visit_job;
    }

    public int getVisit_salary() {
        return visit_salary;
    }

    public void setVisit_salary(int visit_salary) {
        this.visit_salary = visit_salary;
    }

    public String getVisit_address() {
        return visit_address;
    }

    public void setVisit_address(String visit_address) {
        this.visit_address = visit_address;
    }

    public String getVisit_time() {
        return visit_time;
    }

    public void setVisit_time(String visit_time) {
        this.visit_time = visit_time;
    }

    public int getVisit_vistory_id() {
        return visit_vistory_id;
    }

    public void setVisit_vistory_id(int visit_vistory_id) {
        this.visit_vistory_id = visit_vistory_id;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "visit_id=" + visit_id +
                ", visit_job='" + visit_job + '\'' +
                ", visit_salary=" + visit_salary +
                ", visit_address='" + visit_address + '\'' +
                ", visit_time='" + visit_time + '\'' +
                ", visit_vistory_id=" + visit_vistory_id +
                '}';
    }
}
