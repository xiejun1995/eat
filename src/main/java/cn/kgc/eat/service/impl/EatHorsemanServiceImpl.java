package cn.kgc.eat.service.impl;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.kgc.eat.mapper.EatHorsemanMapper;
import cn.kgc.eat.service.EatHorsemanService;
@Service
public class EatHorsemanServiceImpl implements EatHorsemanService{
    @Resource
    private EatHorsemanMapper EatHorsemanMapper;

}