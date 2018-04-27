package com.iotek.dao;

import com.iotek.modle.CheckWork;

/**
 * Created by 13765 on 2018/4/27.
 */
public interface CheckWorkMapper {
    void addCheck(CheckWork checkWork);
    void updateCheck(CheckWork checkWork);
    CheckWork getByDate(CheckWork checkWork);
    CheckWork getById(CheckWork checkWork);
}
