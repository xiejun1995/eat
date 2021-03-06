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
    private EatGreensMapper eatGreensMapper;

        /**
         * @author 齐宏伟
         * @desc 根据菜品名称，价格，区域，分类查询菜品信息（后台）
         * @date 2020/2/25
         */
    public List<EatGreens> getGreensList(@Param("GREENS_NAME") String GREENS_NAME,
                                         @Param("GREENS_PRICE")BigDecimal GREENS_PRICE,
                                         @Param("CUISINE_NAME")String CUISINE_NAME,
                                         @Param("GREENS_ADDRESS")String GREENS_ADDRESS) {
        List<EatGreens> list = eatGreensMapper.getGreensList( GREENS_NAME, GREENS_PRICE, CUISINE_NAME,GREENS_ADDRESS);
        return list;
    }

    /**
     * @author 齐宏伟
     * @desc 添加菜品信息（后台）
     * @date 2020/2/26
     */
    public int insertSelective(EatGreens eatGreens) {
        int count = eatGreensMapper.insertSelective(eatGreens);
        return count;
    }

    /**
     * @author 齐宏伟
     * @desc 修改菜品信息（后台）
     * @date 2020/2/26
     */
    public int updateByPrimaryKeySelective(EatGreens eatGreens) {
       int count = eatGreensMapper.updateByPrimaryKey(eatGreens);
        return count ;
    }

    /**
     * @author 齐宏伟
     * @desc 根据id查询菜品信息（后台）
     * @date 2020/2/26
     */
    public EatGreens selectByPrimaryKey(Long greensId) {
        EatGreens eatGreens = eatGreensMapper.selectByPrimaryKey(greensId);
        return eatGreens;
    }

    /**
     * @author 齐宏伟
     * @desc 删除菜品信息（后台）
     * @date 2020/2/26
     */
    public int deleteByPrimaryKey(Long greensId) {
       int count = eatGreensMapper.deleteByPrimaryKey(greensId);
        return count;
    }

    /**
     * @author 齐宏伟
     * @desc 根据商家id查询菜品（前台）
     * @date 2020/2/25
     */
    public List<EatGreens> getGreensListByMerchantId(Integer MERCHANT_SECURITY_ID) {
        List<EatGreens> list = eatGreensMapper.getGreensListByMerchantId(MERCHANT_SECURITY_ID);
        return list;
    }

    @Override
    public int addGreens(EatGreens eatGreens) {
        return eatGreensMapper.addGreens(eatGreens);
    }

    @Override
    public int deleteById(Integer greensId) {
        return eatGreensMapper.deleteById(greensId);
    }

    @Override
    public List<EatGreens> selectAll(String greensName) {
        return eatGreensMapper.selectAll(greensName);
    }

    @Override
    public EatGreens findGreensById(String greensId) {
        return eatGreensMapper.findGreensById(greensId);
    }

    @Override
    public int updateGreensById(EatGreens eatGreens) {
        return eatGreensMapper.updateGreensById(eatGreens);
    }


}