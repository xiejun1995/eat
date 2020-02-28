package cn.kgc.eat.mapper;

import cn.kgc.eat.pojo.EatGreens;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface EatGreensMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eat_greens
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    /**
     * @author 齐宏伟
     * @desc 删除菜品信息（后台）
     * @date 2020/2/26
     */
    int deleteByPrimaryKey(Long greensId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eat_greens
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    int insert(EatGreens record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eat_greens
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    /**
     * @author 齐宏伟
     * @desc 添加菜品信息（后台）
     * @date 2020/2/26
     */
    int insertSelective(EatGreens eatGreens);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eat_greens
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    /**
     * @author 齐宏伟
     * @desc 根据id查询菜品信息（后台）
     * @date 2020/2/26
     */
    EatGreens selectByPrimaryKey(Long greensId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eat_greens
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    /**
     * @author 齐宏伟
     * @desc 修改菜品信息（后台）
     * @date 2020/2/26
     */
    int updateByPrimaryKeySelective(EatGreens eatGreens);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eat_greens
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    int updateByPrimaryKey(EatGreens record);

    /**
     * @author 齐宏伟
     * @desc 根据菜品名称，价格，区域，分类查询菜品信息（后台）
     * @date 2020/2/25
     */
    public List<EatGreens> getGreensList(@Param("GREENS_NAME") String GREENS_NAME,
                                         @Param("GREENS_PRICE")BigDecimal GREENS_PRICE,
                                         @Param("CUISINE_NAME")String CUISINE_NAME,
                                         @Param("GREENS_ADDRESS")String GREENS_ADDRESS);

    /**
     * @author 齐宏伟
     * @desc 根据商家id查询菜品（前台）
     * @date 2020/2/25
     */
    public List<EatGreens> getGreensListByMerchantId(@Param("MERCHANT_SECURITY_ID") Integer MERCHANT_SECURITY_ID);

}