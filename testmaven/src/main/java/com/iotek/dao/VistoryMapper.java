package com.iotek.dao;

import com.iotek.modle.Vistory;

/**
 * Created by 13765 on 2018/4/20.
 */
public interface VistoryMapper {
    Vistory getV(Vistory vistory);
    Vistory getN(Vistory vistory);
    void addV(Vistory vistory);
}
