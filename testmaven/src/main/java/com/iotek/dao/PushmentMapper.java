package com.iotek.dao;

import com.iotek.modle.Pushiments;

import java.util.List;

/**
 * Created by 13765 on 2018/4/27.
 */
public interface PushmentMapper {
    void addPush(Pushiments pushiments);
    void updatePush(Pushiments pushiments);
    void deletePush(Pushiments pushiments);
    List<Pushiments> getAll();
    List<Pushiments> getByEmp(Pushiments pushiments);
}
