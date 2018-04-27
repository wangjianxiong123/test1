package com.iotek.biz;

import com.iotek.dao.CheckWorkMapper;
import com.iotek.modle.CheckWork;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 13765 on 2018/4/27.
 */
@Service
public class CheckWorkBizImpl implements CheckWorkBiz{
    @Resource
    private CheckWorkMapper checkWorkMapper;
    @Override
    public void addCheck(CheckWork checkWork) {
        checkWorkMapper.addCheck(checkWork);
    }

    @Override
    public void updateCheck(CheckWork checkWork) {
        checkWorkMapper.updateCheck(checkWork);
    }

    @Override
    public CheckWork getByDate(CheckWork checkWork) {
        return checkWorkMapper.getByDate(checkWork);
    }

    @Override
    public CheckWork getById(CheckWork checkWork) {
        return checkWorkMapper.getById(checkWork);
    }
}
