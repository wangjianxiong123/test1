package com.iotek.modle;

import java.util.Date;

/**
 * Created by 13765 on 2018/4/27.
 */
public class Pushiments {
    private int push_id;
    private int push_money;
    private Date push_time;
    private String push_cause;
    private int push_emp_id;

    public Pushiments() {
    }

    public int getPush_id() {
        return push_id;
    }

    public void setPush_id(int push_id) {
        this.push_id = push_id;
    }

    public int getPush_money() {
        return push_money;
    }

    public void setPush_money(int push_money) {
        this.push_money = push_money;
    }

    public Date getPush_time() {
        return push_time;
    }

    public void setPush_time(Date push_time) {
        this.push_time = push_time;
    }

    public String getPush_cause() {
        return push_cause;
    }

    public void setPush_cause(String push_cause) {
        this.push_cause = push_cause;
    }

    public int getPush_emp_id() {
        return push_emp_id;
    }

    public void setPush_emp_id(int push_emp_id) {
        this.push_emp_id = push_emp_id;
    }

    @Override
    public String toString() {
        return "Pushiments{" +
                "push_id=" + push_id +
                ", push_money=" + push_money +
                ", push_time=" + push_time +
                ", push_cause='" + push_cause + '\'' +
                ", push_emp_id=" + push_emp_id +
                '}';
    }
}
