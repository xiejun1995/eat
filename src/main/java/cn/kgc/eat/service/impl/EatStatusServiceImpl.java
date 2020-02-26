package cn.kgc.eat.service.impl;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.kgc.eat.mapper.EatStatusMapper;
import cn.kgc.eat.service.EatStatusService;
@Service
public class EatStatusServiceImpl implements EatStatusService{
    @Resource
    private EatStatusMapper EatStatusMapper;

}