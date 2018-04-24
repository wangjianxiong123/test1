package com.iotek.dao;

import com.iotek.modle.Dept;

import java.util.List;

/**
 * Created by 13765 on 2018/4/23.
 */
public interface DeptMapper {
    void addD(Dept dept);
    List<Dept> getAll();
    void deleteDept(Dept dept);
    void updateDept(Dept dept);
    Dept getOne(Dept dept);
    Dept getOneId(Dept dept);
}
