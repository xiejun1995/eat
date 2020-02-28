package cn.kgc.eat.pojo;

import java.math.BigDecimal;

public class EatGreens {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eat_greens.GREENS_ID
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    private Long greensId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eat_greens.GREENS_NAME
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    private String greensName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eat_greens.GREENS_PRICE
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    private BigDecimal greensPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eat_greens.GREENS_ADDRESS
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    private String greensAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eat_greens.GREENS_GRADE_ID
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    private Long greensGradeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eat_greens.GREENS_TYPE_ID
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    private Long greensTypeId;

    /**
     * @author 齐宏伟
     * @desc 数据库增加字段用户id
     * @date 2020/2/26
     */
    private int greensUserId;
    /**
     * @author 齐宏伟
     * @desc 菜品表和菜系表连接查询，需要得到菜品所属菜系名称
     * @date 2020/2/25
     */
    private int greensSecurityId;

    private String cuisineName;

    private String greensPic;

    private String greensDetails;

    public int getGreensSecurityId() {
        return greensSecurityId;
    }

    public void setGreensSecurityId(int greensSecurityId) {
        this.greensSecurityId = greensSecurityId;
    }

    public String getGreensPic() {
        return greensPic;
    }

    public void setGreensPic(String greensPic) {
        this.greensPic = greensPic;
    }

    public String getGreensDetails() {
        return greensDetails;
    }

    public void setGreensDetails(String greensDetails) {
        this.greensDetails = greensDetails;
    }

    public int getGreensUserId() {
        return greensUserId;
    }

    public void setGreensUserId(int greensUserId) {
        this.greensUserId = greensUserId;
    }

    public String getCuisineName() {
        return cuisineName;
    }

    public void setCuisineName(String cuisineName) {
        this.cuisineName = cuisineName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eat_greens.GREENS_ID
     *
     * @return the value of eat_greens.GREENS_ID
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    public Long getGreensId() {
        return greensId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eat_greens.GREENS_ID
     *
     * @param greensId the value for eat_greens.GREENS_ID
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    public void setGreensId(Long greensId) {
        this.greensId = greensId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eat_greens.GREENS_NAME
     *
     * @return the value of eat_greens.GREENS_NAME
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    public String getGreensName() {
        return greensName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eat_greens.GREENS_NAME
     *
     * @param greensName the value for eat_greens.GREENS_NAME
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    public void setGreensName(String greensName) {
        this.greensName = greensName == null ? null : greensName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eat_greens.GREENS_PRICE
     *
     * @return the value of eat_greens.GREENS_PRICE
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    public BigDecimal getGreensPrice() {
        return greensPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eat_greens.GREENS_PRICE
     *
     * @param greensPrice the value for eat_greens.GREENS_PRICE
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    public void setGreensPrice(BigDecimal greensPrice) {
        this.greensPrice = greensPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eat_greens.GREENS_ADDRESS
     *
     * @return the value of eat_greens.GREENS_ADDRESS
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    public String getGreensAddress() {
        return greensAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eat_greens.GREENS_ADDRESS
     *
     * @param greensAddress the value for eat_greens.GREENS_ADDRESS
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    public void setGreensAddress(String greensAddress) {
        this.greensAddress = greensAddress == null ? null : greensAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eat_greens.GREENS_GRADE_ID
     *
     * @return the value of eat_greens.GREENS_GRADE_ID
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    public Long getGreensGradeId() {
        return greensGradeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eat_greens.GREENS_GRADE_ID
     *
     * @param greensGradeId the value for eat_greens.GREENS_GRADE_ID
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    public void setGreensGradeId(Long greensGradeId) {
        this.greensGradeId = greensGradeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eat_greens.GREENS_TYPE_ID
     *
     * @return the value of eat_greens.GREENS_TYPE_ID
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    public Long getGreensTypeId() {
        return greensTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eat_greens.GREENS_TYPE_ID
     *
     * @param greensTypeId the value for eat_greens.GREENS_TYPE_ID
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    public void setGreensTypeId(Long greensTypeId) {
        this.greensTypeId = greensTypeId;
    }
}