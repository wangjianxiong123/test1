package com.iotek.dao;

import com.iotek.modle.Employ;

import java.util.List;

/**
 * Created by 13765 on 2018/4/20.
 */
public interface EmployMapper {
    Employ getE(Employ employ);
    List<Employ> getEmpName(Employ employ);
    void addEmp(Employ employ);
    Employ getByNamePhone(Employ employ);

}
