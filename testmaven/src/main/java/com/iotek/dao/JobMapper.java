package com.iotek.dao;

import com.iotek.modle.Job;

import java.util.List;

/**
 * Created by 13765 on 2018/4/23.
 */
public interface JobMapper {
    List<Job> getAllD(Job job);
    void addG(Job job);
    void deleteG(Job job);
    void updateG(Job job);
    Job getG(Job job);
    void updateJob(Job job);

}
