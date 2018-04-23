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
    public List<Job> getAll() {
        return jobMapper.getAll();
    }
}
