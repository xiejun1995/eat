package cn.kgc.eat.service.impl;
import cn.kgc.eat.pojo.EatMerchant;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.kgc.eat.mapper.EatMerchantMapper;
import cn.kgc.eat.service.EatMerchantService;

import java.util.List;

@Service
public class EatMerchantServiceImpl implements EatMerchantService{
    @Resource
    private EatMerchantMapper EatMerchantMapper;

    /**
     * @author 齐宏伟
     * @desc 根据商家名称、电话号码查询商家信息（后台）
     * @date 2020/2/24
     */
    public List<EatMerchant> getMerchantListByName(@Param("MERCHANT_NAME") String MERCHANT_NAME,
                                                   @Param("MERCHANT_PHONE") String MERCHANT_PHONE) {
        List<EatMerchant> list = EatMerchantMapper.getMerchantListByName(MERCHANT_NAME,MERCHANT_PHONE);
        return list;
    }


    /**
     * @author 齐宏伟
     * @desc 管理员添加商家信息（后台）
     * @date 2020/2/24
     */
    public int insertSelective(EatMerchant eatMerchant) {
        int count = EatMerchantMapper.insertSelective(eatMerchant);
        return count;
    }


    /**
     * @author 齐宏伟
     * @desc 根据商家id查询商家信息（后台）
     * @date 2020/2/24
     */
    public EatMerchant getEatMerchantById(Integer merchantId) {
        EatMerchant eatMerchant = EatMerchantMapper.selectByPrimaryKey(merchantId);
        return eatMerchant;
    }

    /**
     * @author 齐宏伟
     * @desc 管理员根据商家id修改商家信息（后台）
     * @date 2020/2/24
     */
    public int updateByPrimaryKeySelective(EatMerchant record) {
       int count = EatMerchantMapper.updateByPrimaryKeySelective(record);
        return count;
    }

    /**
     * @author 齐宏伟
     * @desc 管理员删除商家信息（后台）
     * @date 2020/2/24
     */
    public int deleteByPrimaryKey(Integer merchantId) {
        int count = EatMerchantMapper.deleteByPrimaryKey(merchantId);
        return count;
    }
}