package cn.kgc.eat.service;

import cn.kgc.eat.pojo.EatMerchant;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EatMerchantService{
    /**
     * @author 齐宏伟
     * @desc 根据商家名称、电话号码查询商家信息（后台）
     * @date 2020/2/24
     */
    public List<EatMerchant> getMerchantListByName(@Param("MERCHANT_NAME") String MERCHANT_NAME,
                                                   @Param("MERCHANT_PHONE") String MERCHANT_PHONE);
    /**
     * @author 齐宏伟
     * @desc 管理员添加商家信息（后台）
     * @date 2020/2/24
     */
    public int insertSelective(EatMerchant eatMerchant);

    /**
     * @author 齐宏伟
     * @desc 根据商家id查询商家信息（后台）
     * @date 2020/2/24
     */
    public EatMerchant getEatMerchantById(Integer merchantId);

    /**
     * @author 齐宏伟
     * @desc 管理员根据商家id修改商家信息（后台）
     * @date 2020/2/24
     */
    int updateByPrimaryKeySelective(EatMerchant record);

    /**
     * @author 齐宏伟
     * @desc 管理员删除商家信息（后台）
     * @date 2020/2/24
     */
    public int deleteByPrimaryKey(Integer merchantId);
    /**
     * 根据ID查询商家详细信息
     * @姚天祥 set 2020-02-24 08:30
     */
    EatMerchant findMetByid(Integer merchantId);

    /**
     * 根据商家名称、地址查询商家信息列表
     * @姚天祥 set 2020-02-24 09:30
     */
    List<EatMerchant> selectMerByNameAddressGreensN(String merchantName,String merchantAddress);

    /**
     * 根据菜品名称查询商家信息
     * @姚天祥 set 2020-02-24 09:30
     */
    List<EatMerchant> selectMerByName(String greensName);

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