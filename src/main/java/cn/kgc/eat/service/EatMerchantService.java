package cn.kgc.eat.service;

import cn.kgc.eat.pojo.EatMerchant;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EatMerchantService{
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