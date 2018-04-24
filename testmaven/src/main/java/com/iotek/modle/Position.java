package com.iotek.modle;

/**
 * Created by 13765 on 2018/4/23.
 */
public class Position {
    private int pos_id;
    private String pos_name;
    private int pos_salary;
    private int pos_dept_id;

    public Position() {
    }

    public int getPos_id() {
        return pos_id;
    }

    public void setPos_id(int pos_id) {
        this.pos_id = pos_id;
    }

    public String getPos_name() {
        return pos_name;
    }

    public void setPos_name(String pos_name) {
        this.pos_name = pos_name;
    }

    public int getPos_salary() {
        return pos_salary;
    }

    public void setPos_salary(int pos_salary) {
        this.pos_salary = pos_salary;
    }

    public int getPos_dept_id() {
        return pos_dept_id;
    }

    public void setPos_dept_id(int pos_dept_id) {
        this.pos_dept_id = pos_dept_id;
    }

    @Override
    public String toString() {
        return "Position{" +
                "pos_id=" + pos_id +
                ", pos_name='" + pos_name + '\'' +
                ", pos_salary=" + pos_salary +
                ", pos_dept_id=" + pos_dept_id +
                '}';
    }
}
