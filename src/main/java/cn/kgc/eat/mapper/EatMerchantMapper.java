package cn.kgc.eat.mapper;

import cn.kgc.eat.pojo.EatMerchant;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EatMerchantMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eat_merchant
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    /**
     * @author 齐宏伟
     * @desc 管理员删除商家信息（后台）
     * @date 2020/2/24
     */
    int deleteByPrimaryKey(Integer merchantId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eat_merchant
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    int insert(EatMerchant record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eat_merchant
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    /**
     * @author 齐宏伟
     * @desc 管理员添加商家信息（后台）
     * @date 2020/2/24
     */
    int insertSelective(EatMerchant eatMerchant);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eat_merchant
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    /**
     * @author 齐宏伟
     * @desc 根据商家id查询商家信息（后台）
     * @date 2020/2/24
     */
    EatMerchant selectByPrimaryKey(Integer merchantId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eat_merchant
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    /**
     * @author 齐宏伟
     * @desc 管理员根据商家id修改商家信息（后台）
     * @date 2020/2/24
     */
    int updateByPrimaryKeySelective(EatMerchant record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eat_merchant
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    int updateByPrimaryKey(EatMerchant record);

    /**
     * @author 齐宏伟
     * @desc 管理员根据商家名称、电话号码查询商家信息（后台）
     * @date 2020/2/24
     */
    public List<EatMerchant> getMerchantListByName(@Param("MERCHANT_NAME") String MERCHANT_NAME,
                                                   @Param("MERCHANT_PHONE") String MERCHANT_PHONE);
    /**
     * 根据ID查询商家详细信息
     * @姚天祥 set 2020-02-24 08:30
     */
    EatMerchant findMetByid(@Param("merchantId")Integer merchantId);

    /**
     * 根据商家名称、地址查询商家信息列表
     * @姚天祥 set 2020-02-24 09:30
     */
    List<EatMerchant> selectMerByNameAddressGreensN(@Param("merchantName") String merchantName,@Param("merchantAddress") String merchantAddress);

    /**
     * 根据菜品名称查询商家信息
     * @姚天祥 set 2020-02-24 09:30
     */
    List<EatMerchant> selectMerByName(@Param("greensName")String greensName);

    /**
     * 查询所有商家信息列表
     * @姚天祥 set 2020-02-24 09:30
     */
    List<EatMerchant> selectAll();

    /**
     * 修改商家信息
     * @姚天祥 set 2020-02-24 10:30
     */
    int updateById(EatMerchant eatMerchant);
}