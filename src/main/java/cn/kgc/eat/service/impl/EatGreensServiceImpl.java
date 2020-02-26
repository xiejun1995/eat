package cn.kgc.eat.service.impl;
import cn.kgc.eat.pojo.EatGreens;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.kgc.eat.mapper.EatGreensMapper;
import cn.kgc.eat.service.EatGreensService;
@Service
public class EatGreensServiceImpl implements EatGreensService{
    @Resource
    private EatGreensMapper EatGreensMapper;

    /**
     * 添加菜品信息
     * @姚天祥 set 2020-02-26 09:00
     *
     */
    @Override
    public int addGreens(EatGreens eatGreens) {
        int i = this.EatGreensMapper.addGreens(eatGreens);
        return i;
    }
}