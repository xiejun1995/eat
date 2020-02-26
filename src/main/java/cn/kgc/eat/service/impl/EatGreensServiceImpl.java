package cn.kgc.eat.service.impl;
import cn.kgc.eat.pojo.EatGreens;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.kgc.eat.mapper.EatGreensMapper;
import cn.kgc.eat.service.EatGreensService;

import java.math.BigDecimal;
import java.util.List;

@Service
public class EatGreensServiceImpl implements EatGreensService{
    @Resource
    private EatGreensMapper EatGreensMapper;

        /**
         * @author 齐宏伟
         * @desc 根据菜品名称，价格，区域，分类查询菜品信息（后台）
         * @date 2020/2/25
         */
    public List<EatGreens> getGreensList(@Param("GREENS_NAME") String GREENS_NAME,
                                         @Param("GREENS_PRICE")BigDecimal GREENS_PRICE,
                                         @Param("CUISINE_NAME")String CUISINE_NAME,
                                         @Param("GREENS_ADDRESS")String GREENS_ADDRESS) {
        List<EatGreens> list = EatGreensMapper.getGreensList( GREENS_NAME, GREENS_PRICE, CUISINE_NAME,GREENS_ADDRESS);
        return list;
    }

    /**
     * @author 齐宏伟
     * @desc 添加菜品信息（后台）
     * @date 2020/2/26
     */
    public int insertSelective(EatGreens eatGreens) {
        int count = EatGreensMapper.insertSelective(eatGreens);
        return count;
    }

    /**
     * @author 齐宏伟
     * @desc 修改菜品信息（后台）
     * @date 2020/2/26
     */
    public int updateByPrimaryKeySelective(EatGreens eatGreens) {
       int count = EatGreensMapper.updateByPrimaryKey(eatGreens);
        return count ;
    }

    /**
     * @author 齐宏伟
     * @desc 根据id查询菜品信息（后台）
     * @date 2020/2/26
     */
    public EatGreens selectByPrimaryKey(Long greensId) {
        EatGreens eatGreens = EatGreensMapper.selectByPrimaryKey(greensId);
        return eatGreens;
    }


}