package cn.kgc.eat.mapper;

import cn.kgc.eat.pojo.EatSecurity;

public interface EatSecurityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eat_security
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    int deleteByPrimaryKey(Integer securityId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eat_security
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    int insert(EatSecurity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eat_security
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    int insertSelective(EatSecurity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eat_security
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    EatSecurity selectByPrimaryKey(Integer securityId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eat_security
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    int updateByPrimaryKeySelective(EatSecurity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eat_security
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    int updateByPrimaryKey(EatSecurity record);
}