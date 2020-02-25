package cn.kgc.eat.service.impl;
import cn.kgc.eat.pojo.EatMerchant;
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
     * 根据ID查询商家详细信息
     * @姚天祥 set 2020-02-24 08:30
     */
    @Override
    public EatMerchant findMetByid(Integer merchantId) {
        EatMerchant eatMerchant = this.EatMerchantMapper.findMetByid(merchantId);
        return eatMerchant;
    }
    /**
     * 根据商家名称、地址查询商家信息列表
     * @姚天祥 set 2020-02-24 09:30
     */
    @Override
    public List<EatMerchant> selectMerByNameAddressGreensN(String merchantName,String merchantAddress) {
        List<EatMerchant> eatMerchantList= this.EatMerchantMapper.selectMerByNameAddressGreensN(merchantName,merchantAddress);
        return eatMerchantList;
    }
    /**
     * 根据菜品名称查询商家信息
     * 姚天祥 set 2020-02-24 09:30
     */
    @Override
    public List<EatMerchant> selectMerByName(String greensName) {
        List<EatMerchant> eatMerchantList = this.EatMerchantMapper.selectMerByName(greensName);
        System.out.println(eatMerchantList.toString());
        return eatMerchantList;
    }
    /**
     * 查询所有商家信息列表
     * 姚天祥 set 2020-02-24 09:30
     */
    @Override
    public List<EatMerchant> selectAll() {
        List<EatMerchant> eatMerchantList = this.EatMerchantMapper.selectAll();
        return eatMerchantList;
    }

    /**
     * 修改商家信息
     * @姚天祥 set 2020-02-24 10:30
     */
    @Override
    public int updateById(EatMerchant eatMerchant) {
        int i = this.EatMerchantMapper.updateById(eatMerchant);
        return i;
    }
}