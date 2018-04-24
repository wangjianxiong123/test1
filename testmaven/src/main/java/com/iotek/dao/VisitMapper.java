package com.iotek.dao;

import com.iotek.modle.Visit;

import java.util.List;

/**
 * Created by 13765 on 2018/4/23.
 */
public interface VisitMapper {
    void addVisit(Visit visit);
    List<Visit> getV(Visit visit);

}
