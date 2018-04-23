package com.iotek.modle;

/**
 * Created by 13765 on 2018/4/23.
 */
public class Srecord {
    private int rec_id;
    private int rec_visto_id;
    private int rec_job_id;

    public Srecord() {
    }

    public int getRec_id() {
        return rec_id;
    }

    public void setRec_id(int rec_id) {
        this.rec_id = rec_id;
    }

    public int getRec_visto_id() {
        return rec_visto_id;
    }

    public void setRec_visto_id(int rec_visto_id) {
        this.rec_visto_id = rec_visto_id;
    }

    public int getRec_job_id() {
        return rec_job_id;
    }

    public void setRec_job_id(int rec_job_id) {
        this.rec_job_id = rec_job_id;
    }

    @Override
    public String toString() {
        return "Srecord{" +
                "rec_id=" + rec_id +
                ", rec_visto_id=" + rec_visto_id +
                ", rec_job_id=" + rec_job_id +
                '}';
    }
}
