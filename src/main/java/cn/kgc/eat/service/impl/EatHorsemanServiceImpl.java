package cn.kgc.eat.service.impl;
import cn.kgc.eat.pojo.EatHorseman;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.kgc.eat.mapper.EatHorsemanMapper;
import cn.kgc.eat.service.EatHorsemanService;

import java.util.List;

@Service
public class EatHorsemanServiceImpl implements EatHorsemanService{
    @Resource
    private EatHorsemanMapper EatHorsemanMapper;

    /**
     * 后台增加骑手
     * @姚天祥 set 2020-02-22 23:00:00
     */
    @Override
    public int insertSelective(EatHorseman record) {
        int i = this.EatHorsemanMapper.insertSelective(record);
        return i;
    }

    /**
     * 后台根据姓名或电话分页查询骑手
     * @姚天祥 set 2020-02-23 08:30
     */
    @Override
    public List<EatHorseman> selectHoresmanByNameOrPhone(EatHorseman eatHorseman) {
        List<EatHorseman> eatHorsemanList = this.EatHorsemanMapper.selectHoresmanByNameOrPhone(eatHorseman);
        System.out.println(eatHorsemanList.toString());
        System.out.println(eatHorsemanList);
        return eatHorsemanList;
    }

    /**
     * 进入后台显示骑手列表
     * @姚天祥 set 2020-02-23 08:40
     */
    @Override
    public List<EatHorseman> selectHoresmanAll() {
        List<EatHorseman> horsemanList = this.EatHorsemanMapper.selectHoresmanAll();
        return horsemanList;
    }

    /**
     * 后台修改骑手信息时查询骑手信息接口
     * @姚天祥 set 2020-02-23 12:30
     */
    @Override
    public EatHorseman selectByPrimaryKey(String horsemanPhone) {
        EatHorseman eatHorseman = this.EatHorsemanMapper.selectByPrimaryKey(horsemanPhone);
        return eatHorseman;
    }

    /**
     * 后台修改骑手信息接口
     * @姚天祥 set 2020-02-23 12:30
     */
    @Override
    public int updateByPrimaryKeySelective(EatHorseman record) {
        int i = this.EatHorsemanMapper.updateByPrimaryKeySelective(record);
        return i;
    }

    /**
     * 后台删除骑手信息接阔
     * @姚天祥 set 2020-02-23 13:00
     */
    @Override
    public int deleteByPrimaryKey(String horsemanPhone) {
        int i = this.EatHorsemanMapper.deleteByPrimaryKey(horsemanPhone);
        return i;
    }

    /**
     * 后台根据骑手电话修改骑手信息
     * @姚天祥 set 2020-02-23 16:30
     */
    @Override
    public int updateByPhone(EatHorseman eatHorseman) {
        int i =  this.EatHorsemanMapper.updateByPhone(eatHorseman);
        return i;
    }

    /**
     * 后跟根据骑手电话修改骑手信息
     * @姚天祥 set 2020-02-23 16:30
     */
    @Override
    public int updateByPrimaryKey(String horsemanPhone) {
        int i = this.EatHorsemanMapper.updateByPrimaryKey(horsemanPhone);
        System.out.println("-------------services-------"+horsemanPhone);
        return i;
    }
}