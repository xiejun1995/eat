package cn.kgc.eat.service;

import cn.kgc.eat.pojo.EatGreens;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface EatGreensService{
    /**
     * @author 齐宏伟
     * @desc 根据菜品名称，价格，区域，分类查询菜品信息（后台）
     * @date 2020/2/25
     */
    public List<EatGreens> getGreensList(@Param("GREENS_NAME") String GREENS_NAME,
                                         @Param("GREENS_PRICE") BigDecimal GREENS_PRICE,
                                         @Param("CUISINE_NAME") String CUISINE_NAME,
                                         @Param("GREENS_ADDRESS") String GREENS_ADDRESS);

    /**
     * @author 齐宏伟
     * @desc 添加菜品信息（后台）
     * @date 2020/2/26
     */
    public int insertSelective(EatGreens eatGreens);

    /**
     * @author 齐宏伟
     * @desc 修改菜品信息（后台）
     * @date 2020/2/26
     */
    public int updateByPrimaryKeySelective(EatGreens eatGreens);

    /**
     * @author 齐宏伟
     * @desc 根据id查询菜品信息（后台）
     * @date 2020/2/26
     */
   public EatGreens selectByPrimaryKey(Long greensId);

    /**
     * @author 齐宏伟
     * @desc 删除菜品信息（后台）
     * @date 2020/2/26
     */
    public int deleteByPrimaryKey(Long greensId);

    /**
     * @author 齐宏伟
     * @desc 根据商家id查询菜品（前台）
     * @date 2020/2/25
     */
    public List<EatGreens> getGreensListByMerchantId(@Param("MERCHANT_SECURITY_ID") Integer MERCHANT_SECURITY_ID);
    /**
     * 添加菜品信息
     * @姚天祥 set 2020-02-26 09:00
     *
     */
    int addGreens(EatGreens eatGreens);
    /**
     * 删除菜品信息
     * @姚天祥 set 2020-02-27 09:00
     */
    int deleteById(@Param("greensId")Integer greensId);
    /**
     * 查询所有菜品
     * @姚天祥 set 2020-02-27 10:00
     */
    List<EatGreens> selectAll(String greensName);
    /**
     * 查看菜品详情
     * @姚天祥 set 2020-02-27 11:00
     */
    EatGreens findGreensById(@Param("greensId")String greensId);
    /**
     * 修改菜品详情
     * @姚天祥 set 2020-02-27 11:00
     */
    int updateGreensById(EatGreens eatGreens);
}