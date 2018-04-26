package com.iotek.biz;

import com.iotek.dao.EmployMapper;
import com.iotek.modle.Employ;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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

    @Override
    public List<Employ> getEmpName(Employ employ) {
        return employMapper.getEmpName(employ);
    }

    @Override
    public void addEmp(Employ employ) {
        employMapper.addEmp(employ);
    }

    @Override
    public Employ getByNamePhone(Employ employ) {
        return employMapper.getByNamePhone(employ);
    }

    @Override
    public void updateEmp(Employ employ) {
        employMapper.updateEmp(employ);
    }
}
