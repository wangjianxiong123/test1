package com.iotek.biz;

import com.iotek.dao.VisitMapper;
import com.iotek.modle.Visit;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 13765 on 2018/4/23.
 */
@Service
public class VisitBizImpl implements VisitBiz {
    @Resource
    private VisitMapper visitMapper;
    @Override
    public void addVisit(Visit visit) {
        visitMapper.addVisit(visit);
    }

    @Override
    public List<Visit> getV(Visit visit) {
        return visitMapper.getV(visit);
    }
}
