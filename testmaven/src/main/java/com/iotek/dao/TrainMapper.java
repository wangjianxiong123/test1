package com.iotek.dao;

import com.iotek.modle.Train;

import java.util.List;

/**
 * Created by 13765 on 2018/4/25.
 */
public interface TrainMapper {
    Train getByDept(Train train);
    Train getByPosition(Train train);
    List<Train> getAll();
    void addTrain(Train train);
    void updateTrain(Train train);
    void deleteTrain(Train train);
    Train getDeptPosition(Train train);
}
