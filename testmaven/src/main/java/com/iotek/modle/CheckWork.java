package com.iotek.modle;

import java.util.Date;

/**
 * Created by 13765 on 2018/4/27.
 */
public class CheckWork {
    private int check_id;
    private String check_begin;
    private Date check_end;
    private int check_emp_id;

    public CheckWork() {
    }

    public int getCheck_id() {
        return check_id;
    }

    public void setCheck_id(int check_id) {
        this.check_id = check_id;
    }

    public String getCheck_begin() {
        return check_begin;
    }

    public void setCheck_begin(String check_begin) {
        this.check_begin = check_begin;
    }

    public Date getCheck_end() {
        return check_end;
    }

    public void setCheck_end(Date check_end) {
        this.check_end = check_end;
    }

    public int getCheck_emp_id() {
        return check_emp_id;
    }

    public void setCheck_emp_id(int check_emp_id) {
        this.check_emp_id = check_emp_id;
    }

    @Override
    public String toString() {
        return "CheckWorkBiz{" +
                "check_id=" + check_id +
                ", check_begin=" + check_begin +
                ", check_end=" + check_end +
                ", check_emp_id=" + check_emp_id +
                '}';
    }
}
