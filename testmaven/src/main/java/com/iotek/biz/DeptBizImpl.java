package com.iotek.biz;

import com.iotek.dao.DeptMapper;
import com.iotek.modle.Dept;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 13765 on 2018/4/23.
 */
@Service
public class DeptBizImpl implements DeptBiz {
    @Resource
    private DeptMapper deptMapper;
    @Override
    public void addD(Dept dept) {
        deptMapper.addD(dept);
    }
}
