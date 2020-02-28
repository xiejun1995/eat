package cn.kgc.eat.service.impl;
import cn.kgc.eat.pojo.EatHorseman;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.kgc.eat.mapper.EatHorsemanMapper;
import cn.kgc.eat.service.EatHorsemanService;

import java.util.List;

@Service
public class EatHorsemanServiceImpl implements EatHorsemanService{
    @Resource
    private EatHorsemanMapper eatHorsemanMapper;

    @Override
    public int insertSelective(EatHorseman record) {
        return eatHorsemanMapper.insertSelective(record);
    }

    @Override
    public List<EatHorseman> selectHoresmanByNameOrPhone(EatHorseman eatHorseman) {
        return eatHorsemanMapper.selectHoresmanByNameOrPhone(eatHorseman);
    }

    @Override
    public List<EatHorseman> selectHoresmanAll() {
        return eatHorsemanMapper.selectHoresmanAll();
    }

    @Override
    public EatHorseman selectByPrimaryKey(String horsemanPhone) {
        return eatHorsemanMapper.selectByPrimaryKey(horsemanPhone);
    }

    @Override
    public int updateByPrimaryKeySelective(EatHorseman record) {
        return eatHorsemanMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(String horsemanPhone) {
        return eatHorsemanMapper.deleteByPrimaryKey(horsemanPhone);
    }

    @Override
    public int updateByPhone(EatHorseman eatHorseman) {
        return eatHorsemanMapper.updateByPhone(eatHorseman);
    }

    @Override
    public int updateByPrimaryKey(String horsemanPhone) {
        return eatHorsemanMapper.updateByPrimaryKey(horsemanPhone);
    }
}