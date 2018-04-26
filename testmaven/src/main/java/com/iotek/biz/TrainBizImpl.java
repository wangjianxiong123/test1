package com.iotek.biz;

import com.iotek.dao.TrainMapper;
import com.iotek.modle.Train;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 13765 on 2018/4/25.
 */
@Service
public class TrainBizImpl implements TrainBiz {
    @Resource
    private TrainMapper trainMapper;
    @Override
    public Train getByDept(Train train) {
        return trainMapper.getByDept(train);
    }

    @Override
    public Train getByPosition(Train train) {
        return trainMapper.getByPosition(train);
    }

    @Override
    public void addTrain(Train train) {
        trainMapper.addTrain(train);
    }

    @Override
    public void updateTrain(Train train) {
        trainMapper.updateTrain(train);
    }

    @Override
    public void deleteTrain(Train train) {
        trainMapper.deleteTrain(train);
    }

    @Override
    public List<Train> getAll() {
        return trainMapper.getAll();
    }

    @Override
    public Train getDeptPosition(Train train) {
        return trainMapper.getDeptPosition(train);
    }
}
