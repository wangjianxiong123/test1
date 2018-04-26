package com.iotek.modle;

import java.util.Date;

/**
 * Created by 13765 on 2018/4/25.
 */
public class Train {
    private int train_id;
    private String train_theme;
    private String train_content;
    private String train_dept;
    private String train_position;
    private String train_begin;
    private String train_end;
    private String train_address;

    public Train() {
    }

    public int getTrain_id() {
        return train_id;
    }

    public void setTrain_id(int train_id) {
        this.train_id = train_id;
    }

    public String getTrain_theme() {
        return train_theme;
    }

    public void setTrain_theme(String train_theme) {
        this.train_theme = train_theme;
    }

    public String getTrain_content() {
        return train_content;
    }

    public void setTrain_content(String train_content) {
        this.train_content = train_content;
    }

    public String getTrain_dept() {
        return train_dept;
    }

    public void setTrain_dept(String train_dept) {
        this.train_dept = train_dept;
    }

    public String getTrain_position() {
        return train_position;
    }

    public void setTrain_position(String train_position) {
        this.train_position = train_position;
    }

    public String getTrain_begin() {
        return train_begin;
    }

    public void setTrain_begin(String train_begin) {
        this.train_begin = train_begin;
    }

    public String getTrain_end() {
        return train_end;
    }

    public void setTrain_end(String train_end) {
        this.train_end = train_end;
    }

    public String getTrain_address() {
        return train_address;
    }

    public void setTrain_address(String train_address) {
        this.train_address = train_address;
    }

    @Override
    public String toString() {
        return "Train{" +
                "train_id=" + train_id +
                ", train_theme='" + train_theme + '\'' +
                ", train_content='" + train_content + '\'' +
                ", train_dept='" + train_dept + '\'' +
                ", train_position='" + train_position + '\'' +
                ", train_begin=" + train_begin +
                ", train_end=" + train_end +
                ", train_address='" + train_address + '\'' +
                '}';
    }
}
