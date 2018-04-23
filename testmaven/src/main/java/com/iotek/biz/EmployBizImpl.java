package com.iotek.biz;

import com.iotek.dao.EmployMapper;
import com.iotek.modle.Employ;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 13765 on 2018/4/20.
 */
@Service
public class EmployBizImpl implements EmployBiz {
    @Resource
    private EmployMapper employMapper;
    @Override
    public Employ getE(Employ employ) {
        return employMapper.getE(employ);
    }
}
