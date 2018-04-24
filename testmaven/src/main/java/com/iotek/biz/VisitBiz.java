package com.iotek.biz;

import com.iotek.modle.Visit;

import java.util.List;

/**
 * Created by 13765 on 2018/4/23.
 */
public interface VisitBiz {
    void addVisit(Visit visit);
    List<Visit> getV(Visit visit);
}
