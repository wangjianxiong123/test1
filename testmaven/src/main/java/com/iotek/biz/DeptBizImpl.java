package com.iotek.biz;

import com.iotek.dao.DeptMapper;
import com.iotek.modle.Dept;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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

    @Override
    public List<Dept> getAll() {
        return deptMapper.getAll();
    }

    @Override
    public void deleteDept(Dept dept) {
        deptMapper.deleteDept(dept);
    }

    @Override
    public void updateDept(Dept dept) {
        deptMapper.updateDept(dept);
    }

    @Override
    public Dept getOne(Dept dept) {
        return deptMapper.getOne(dept);
    }

    @Override
    public Dept getOneId(Dept dept) {
        return deptMapper.getOneId(dept);
    }
}
