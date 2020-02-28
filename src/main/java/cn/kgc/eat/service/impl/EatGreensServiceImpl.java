package cn.kgc.eat.service.impl;
import cn.kgc.eat.pojo.EatGreens;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.kgc.eat.mapper.EatGreensMapper;
import cn.kgc.eat.service.EatGreensService;

import java.util.List;

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
    /**
     * 删除菜品信息
     * @姚天祥 set 2020-02-27 09:00
     */
    @Override
    public int deleteById(Integer greensId) {
        int i = this.EatGreensMapper.deleteById(greensId);
        return i;
    }
    /**
     * 查询所有菜品
     * @姚天祥 set 2020-02-27 10:00
     */
    @Override
    public List<EatGreens> selectAll(String greensName) {
        List<EatGreens> eatGreensList = this.EatGreensMapper.selectAll(greensName);
        return eatGreensList;
    }
    /**
     * 查看菜品详情
     * @姚天祥 set 2020-02-27 11:00
     */
    @Override
    public EatGreens findGreensById(String greensId) {
        EatGreens eatGreens = this.EatGreensMapper.findGreensById(greensId);
        return eatGreens;
    }

    /**
     * 修改菜品详情
     * @姚天祥 set 2020-02-27 11:00
     */
    @Override
    public int updateGreensById(EatGreens eatGreens) {
        int i = this.EatGreensMapper.updateGreensById(eatGreens);
        return i;
    }
}