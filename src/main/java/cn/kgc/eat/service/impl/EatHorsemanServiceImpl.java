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
    private EatHorsemanMapper EatHorsemanMapper;


    @Override
    public int insertSelective(EatHorseman record) {
        int i = this.EatHorsemanMapper.insertSelective(record);
        return i;
    }

    @Override
    public List<EatHorseman> selectHoresmanByNameOrPhone(String horsemanName, String horsemanPhone) {
        List<EatHorseman> horsemanList = this.EatHorsemanMapper.selectHoresmanByNameOrPhone(horsemanName,horsemanPhone);
        return horsemanList;
    }

    @Override
    public List<EatHorseman> selectHoresmanAll() {
        List<EatHorseman> horsemanList = this.EatHorsemanMapper.selectHoresmanAll();
        return horsemanList;
    }

    @Override
    public EatHorseman selectByPrimaryKey(String horsemanPhone) {
        EatHorseman eatHorseman = this.EatHorsemanMapper.selectByPrimaryKey(horsemanPhone);
        return eatHorseman;
    }

    @Override
    public int updateByPrimaryKeySelective(EatHorseman record) {
        int i = this.EatHorsemanMapper.updateByPrimaryKeySelective(record);
        return i;
    }

    @Override
    public int deleteByPrimaryKey(String horsemanPhone) {
        int i = this.EatHorsemanMapper.deleteByPrimaryKey(horsemanPhone);
        return i;
    }

    @Override
    public int updateByPhone(String horsemanName) {
        int i = this.EatHorsemanMapper.updateByPhone(horsemanName);
        return i;
    }

    @Override
    public int updateByPrimaryKey(String horsemanPhone) {
        int i = this.EatHorsemanMapper.updateByPrimaryKey(horsemanPhone);
        System.out.println("-------------services-------"+horsemanPhone);
        return i;
    }
}