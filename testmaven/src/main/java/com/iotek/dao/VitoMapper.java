package com.iotek.dao;

import com.iotek.modle.Vito;

import java.util.List;

/**
 * Created by 13765 on 2018/4/23.
 */
public interface VitoMapper {
    void addV(Vito vito);
    Vito getV(Vito vito);
    void updateV(Vito vito);
    List<Vito> getVito(Vito vito);
}
