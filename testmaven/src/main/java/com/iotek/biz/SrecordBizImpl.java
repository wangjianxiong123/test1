package com.iotek.biz;

import com.iotek.dao.SrecordMapper;
import com.iotek.modle.Srecord;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 13765 on 2018/4/23.
 */
@Service
public class SrecordBizImpl implements SrecordBiz {
    @Resource
    private SrecordMapper srecordMapper;
    @Override
    public void addS(Srecord srecord) {
        srecordMapper.addS(srecord);
    }
}
