package cn.kgc.eat.mapper;

import cn.kgc.eat.pojo.EatRole;

public interface EatRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eat_role
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    int deleteByPrimaryKey(Integer roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eat_role
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    int insert(EatRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eat_role
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    int insertSelective(EatRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eat_role
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    EatRole selectByPrimaryKey(Integer roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eat_role
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    int updateByPrimaryKeySelective(EatRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eat_role
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    int updateByPrimaryKey(EatRole record);
}