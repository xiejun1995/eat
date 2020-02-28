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
    private EatMerchantMapper eatMerchantMapper;

    /**
     * @author 齐宏伟
     * @desc 根据商家名称、电话号码查询商家信息（后台）
     * @date 2020/2/24
     */
    public List<EatMerchant> getMerchantListByName(@Param("MERCHANT_NAME") String MERCHANT_NAME,
                                                   @Param("MERCHANT_PHONE") String MERCHANT_PHONE) {
        List<EatMerchant> list = eatMerchantMapper.getMerchantListByName(MERCHANT_NAME,MERCHANT_PHONE);
        return list;
    }


    /**
     * @author 齐宏伟
     * @desc 管理员添加商家信息（后台）
     * @date 2020/2/24
     */
    public int insertSelective(EatMerchant eatMerchant) {
        int count = eatMerchantMapper.insertSelective(eatMerchant);
        return count;
    }


    /**
     * @author 齐宏伟
     * @desc 根据商家id查询商家信息（后台）
     * @date 2020/2/24
     */
    public EatMerchant getEatMerchantById(Integer merchantId) {
        EatMerchant eatMerchant = eatMerchantMapper.selectByPrimaryKey(merchantId);
        return eatMerchant;
    }

    /**
     * @author 齐宏伟
     * @desc 管理员根据商家id修改商家信息（后台）
     * @date 2020/2/24
     */
    public int updateByPrimaryKeySelective(EatMerchant record) {
       int count = eatMerchantMapper.updateByPrimaryKeySelective(record);
        return count;
    }

    /**
     * @author 齐宏伟
     * @desc 管理员删除商家信息（后台）
     * @date 2020/2/24
     */
    public int deleteByPrimaryKey(Integer merchantId) {
        int count = eatMerchantMapper.deleteByPrimaryKey(merchantId);
        return count;
    }

    @Override
    public EatMerchant findMetByid(Integer merchantId) {
        return eatMerchantMapper.findMetByid(merchantId);
    }

    @Override
    public List<EatMerchant> selectMerByNameAddressGreensN(String merchantName, String merchantAddress) {
        return eatMerchantMapper.selectMerByNameAddressGreensN(merchantName,merchantAddress);
    }

    @Override
    public List<EatMerchant> selectMerByName(String greensName) {
        return eatMerchantMapper.selectMerByName(greensName);
    }

    @Override
    public List<EatMerchant> selectAll() {
        return eatMerchantMapper.selectAll();
    }

    @Override
    public int updateById(EatMerchant eatMerchant) {
        return eatMerchantMapper.updateById(eatMerchant);
    }
}