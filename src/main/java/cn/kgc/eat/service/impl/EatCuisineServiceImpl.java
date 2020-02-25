package cn.kgc.eat.service.impl;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.kgc.eat.mapper.EatCuisineMapper;
import cn.kgc.eat.service.EatCuisineService;
@Service
public class EatCuisineServiceImpl implements EatCuisineService{
    @Resource
    private EatCuisineMapper EatCuisineMapper;

}