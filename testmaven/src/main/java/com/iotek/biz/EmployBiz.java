package com.iotek.biz;

import com.iotek.modle.Employ;

import java.util.List;

/**
 * Created by 13765 on 2018/4/20.
 */
public interface EmployBiz {
    Employ getE(Employ employ);
    List<Employ> getEmpName(Employ employ);
    void addEmp(Employ employ);
    Employ getByNamePhone(Employ employ);
}
