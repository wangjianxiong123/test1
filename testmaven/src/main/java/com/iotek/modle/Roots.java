package com.iotek.modle;

/**
 * Created by 13765 on 2018/4/20.
 */
public class Roots {
    public int root_id;
    private String root_name;
    private String root_pass;

    public Roots() {
    }

    public int getRoot_id() {
        return root_id;
    }

    public void setRoot_id(int root_id) {
        this.root_id = root_id;
    }

    public String getRoot_name() {
        return root_name;
    }

    public void setRoot_name(String root_name) {
        this.root_name = root_name;
    }

    public String getRoot_pass() {
        return root_pass;
    }

    public void setRoot_pass(String root_pass) {
        this.root_pass = root_pass;
    }

    @Override
    public String toString() {
        return "Roots{" +
                "root_id=" + root_id +
                ", root_name='" + root_name + '\'' +
                ", root_pass='" + root_pass + '\'' +
                '}';
    }
}
