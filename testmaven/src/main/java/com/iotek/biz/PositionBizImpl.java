package com.iotek.biz;

import com.iotek.dao.PositionMapper;
import com.iotek.modle.Position;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 13765 on 2018/4/24.
 */
@Service
public class PositionBizImpl implements PositionBiz {
    @Resource
    private PositionMapper positionMapper;
    @Override
    public void deletePos(Position position) {
        positionMapper.deletePos(position);
    }

    @Override
    public void updatePos(Position position) {
        positionMapper.updatePos(position);
    }

    @Override
    public List<Position> getAll() {
        return positionMapper.getAll();
    }

    @Override
    public void addPos(Position position) {
        positionMapper.addPos(position);
    }

    @Override
    public void deletePosition(Position position) {
        positionMapper.deletePosition(position);
    }

    @Override
    public List<Position> getDept(Position position) {
        return positionMapper.getDept(position);
    }

    @Override
    public Position getName(Position position) {
        return positionMapper.getName(position);
    }

    @Override
    public Position getPosition(Position position) {
        return positionMapper.getPosition(position);
    }
}
