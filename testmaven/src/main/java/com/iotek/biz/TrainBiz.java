package com.iotek.biz;

import com.iotek.modle.Train;

import java.util.List;

/**
 * Created by 13765 on 2018/4/25.
 */
public interface TrainBiz {
    Train getByDept(Train train);
    Train getByPosition(Train train);
    void addTrain(Train train);
    void updateTrain(Train train);
    void deleteTrain(Train train);
    List<Train> getAll();
    Train getDeptPosition(Train train);
}
