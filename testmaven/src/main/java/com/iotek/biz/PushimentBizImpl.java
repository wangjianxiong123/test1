package com.iotek.biz;

import com.iotek.dao.PushmentMapper;
import com.iotek.modle.Pushiments;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 13765 on 2018/4/27.
 */
@Service
public class PushimentBizImpl implements PushimentBiz {
    @Resource
    private PushmentMapper pushmentMapper;
    @Override
    public void addPush(Pushiments pushiments) {
        pushmentMapper.addPush(pushiments);
    }

    @Override
    public void updatePush(Pushiments pushiments) {
        pushmentMapper.updatePush(pushiments);
    }

    @Override
    public void deletePush(Pushiments pushiments) {
        pushmentMapper.deletePush(pushiments);
    }

    @Override
    public List<Pushiments> getAll() {
        return pushmentMapper.getAll();
    }

    @Override
    public List<Pushiments> getByEmp(Pushiments pushiments) {
        return pushmentMapper.getByEmp(pushiments);
    }
}
