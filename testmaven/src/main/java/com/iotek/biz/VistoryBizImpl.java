package com.iotek.biz;

import com.iotek.dao.VistoryMapper;
import com.iotek.modle.Vistory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 13765 on 2018/4/20.
 */
@Service
public class VistoryBizImpl implements VistoryBiz {
    @Resource
    private VistoryMapper vistoryMapper;
    @Override
    public Vistory getV(Vistory vistory) {
        return vistoryMapper.getV(vistory);
    }

    @Override
    public Vistory getN(Vistory vistory) {
        return vistoryMapper.getN(vistory);
    }

    @Override
    public void addV(Vistory vistory) {
        vistoryMapper.addV(vistory);
    }
}
