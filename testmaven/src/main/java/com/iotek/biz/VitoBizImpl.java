package com.iotek.biz;

import com.iotek.dao.VitoMapper;
import com.iotek.modle.Vito;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 13765 on 2018/4/23.
 */
@Service
public class VitoBizImpl implements VitoBiz {
    @Resource
    private VitoMapper vitoMapper;
    @Override
    public void addV(Vito vito) {
        vitoMapper.addV(vito);
    }

    @Override
    public Vito getV(Vito vito) {
        return vitoMapper.getV(vito);
    }

    @Override
    public void updateV(Vito vito) {
        vitoMapper.updateV(vito);
    }

    @Override
    public List<Vito> getVito(Vito vito) {
        return vitoMapper.getVito(vito);
    }
}
