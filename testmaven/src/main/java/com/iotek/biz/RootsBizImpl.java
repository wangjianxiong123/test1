package com.iotek.biz;

import com.iotek.dao.RootMapper;
import com.iotek.modle.Roots;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 13765 on 2018/4/20.
 */
@Service
public class RootsBizImpl implements RootsBiz {
    @Resource
    private RootMapper rootMapper;
    @Override
    public Roots getR(Roots roots) {
        return rootMapper.getR(roots);
    }
}
