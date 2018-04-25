package com.iotek.modle;

import java.lang.ref.PhantomReference;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by 13765 on 2018/4/23.
 */
public class Vito {
    private int vito_id;
    private String vito_name;
    private int vito_age;
    private String vito_phone;
    private String vito_email;
    private int vito_vis_id;//招聘id ,job_id
    private String vito_sex;
    private String vito_school;
    private int vito_state;
    private Set<Job> jobs=new HashSet<>();
    public Vito() {
    }

    public Vito(String vito_name, int vito_age, String vito_phone, String vito_email) {
        this.vito_name = vito_name;
        this.vito_age = vito_age;
        this.vito_phone = vito_phone;
        this.vito_email = vito_email;
    }

    public int getVito_id() {
        return vito_id;
    }

    public void setVito_id(int vito_id) {
        this.vito_id = vito_id;
    }

    public String getVito_name() {
        return vito_name;
    }

    public void setVito_name(String vito_name) {
        this.vito_name = vito_name;
    }

    public int getVito_age() {
        return vito_age;
    }

    public void setVito_age(int vito_age) {
        this.vito_age = vito_age;
    }

    public String getVito_phone() {
        return vito_phone;
    }

    public void setVito_phone(String vito_phone) {
        this.vito_phone = vito_phone;
    }

    public String getVito_email() {
        return vito_email;
    }

    public void setVito_email(String vito_email) {
        this.vito_email = vito_email;
    }

    public int getVito_vis_id() {
        return vito_vis_id;
    }

    public void setVito_vis_id(int vito_vis_id) {
        this.vito_vis_id = vito_vis_id;
    }

    public String getVito_sex() {
        return vito_sex;
    }

    public void setVito_sex(String vito_sex) {
        this.vito_sex = vito_sex;
    }

    public String getVito_school() {
        return vito_school;
    }

    public void setVito_school(String vito_school) {
        this.vito_school = vito_school;
    }

    public Set<Job> getJobs() {
        return jobs;
    }

    public void setJobs(Set<Job> jobs) {
        this.jobs = jobs;
    }

    public int getVito_state() {
        return vito_state;
    }

    public void setVito_state(int vito_state) {
        this.vito_state = vito_state;
    }

    @Override
    public String toString() {
        return "Vito{" +
                "vito_id=" + vito_id +
                ", vito_name='" + vito_name + '\'' +
                ", vito_age=" + vito_age +
                ", vito_phone='" + vito_phone + '\'' +
                ", vito_email='" + vito_email + '\'' +
                ", vito_vis_id=" + vito_vis_id +
                ", vito_sex='" + vito_sex + '\'' +
                ", vito_school='" + vito_school + '\'' +
                ", vito_state=" + vito_state +
                ", jobs=" + jobs +
                '}';
    }
}
