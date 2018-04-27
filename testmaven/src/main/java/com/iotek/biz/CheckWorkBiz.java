package com.iotek.biz;

import com.iotek.modle.CheckWork;

/**
 * Created by 13765 on 2018/4/27.
 */
public interface CheckWorkBiz {
    void addCheck(com.iotek.modle.CheckWork checkWork);
    void updateCheck(com.iotek.modle.CheckWork checkWork);
    CheckWork getByDate(CheckWork checkWork);
    CheckWork getById(CheckWork checkWork);
}
