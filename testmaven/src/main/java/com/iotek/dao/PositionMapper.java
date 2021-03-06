package com.iotek.dao;

import com.iotek.modle.Position;

import java.util.List;

/**
 * Created by 13765 on 2018/4/24.
 */
public interface PositionMapper {
    void deletePos(Position position);
    void updatePos(Position position);
    List<Position> getAll();
    void addPos(Position position);
    void deletePosition(Position position);
    List<Position> getDept(Position position);
    Position getName(Position position);
    Position getPosition(Position position);
}
