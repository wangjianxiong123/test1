package com.iotek.biz;

import com.iotek.dao.JobMapper;
import com.iotek.modle.Job;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 13765 on 2018/4/23.
 */
@Service
public class JobBizImpl implements JobBiz {
    @Resource
    private JobMapper jobMapper;
    @Override
    public List<Job> getAllD(Job job) {
        return jobMapper.getAllD(job);
    }

    @Override
    public void addG(Job job) {
        jobMapper.addG(job);
    }

    @Override
    public void deleteG(Job job) {
        jobMapper.deleteG(job);
    }

    @Override
    public void updateG(Job job) {
        jobMapper.updateG(job);
    }

    @Override
    public Job getG(Job job) {
        return jobMapper.getG(job);
    }

    @Override
    public void updateJob(Job job) {
        jobMapper.updateJob(job);
    }
}
