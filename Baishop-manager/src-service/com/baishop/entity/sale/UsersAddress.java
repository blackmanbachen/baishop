package com.baishop.entity.sale;

import java.io.Serializable;
import java.util.Date;

public class UsersAddress implements Serializable {
    
	private static final long serialVersionUID = 6698840373815216090L;

	/**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_users_address.address_id
     *
     * @ibatorgenerated Sun Oct 09 13:46:32 CST 2011
     */
    private Long addressId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_users_address.user_id
     *
     * @ibatorgenerated Sun Oct 09 13:46:32 CST 2011
     */
    private Long userId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_users_address.consignee
     *
     * @ibatorgenerated Sun Oct 09 13:46:32 CST 2011
     */
    private String consignee;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_users_address.email
     *
     * @ibatorgenerated Sun Oct 09 13:46:32 CST 2011
     */
    private String email;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_users_address.country
     *
     * @ibatorgenerated Sun Oct 09 13:46:32 CST 2011
     */
    private Integer country;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_users_address.province
     *
     * @ibatorgenerated Sun Oct 09 13:46:32 CST 2011
     */
    private Integer province;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_users_address.city
     *
     * @ibatorgenerated Sun Oct 09 13:46:32 CST 2011
     */
    private Integer city;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_users_address.district
     *
     * @ibatorgenerated Sun Oct 09 13:46:32 CST 2011
     */
    private Integer district;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_users_address.address
     *
     * @ibatorgenerated Sun Oct 09 13:46:32 CST 2011
     */
    private String address;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_users_address.zipcode
     *
     * @ibatorgenerated Sun Oct 09 13:46:32 CST 2011
     */
    private String zipcode;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_users_address.mobile
     *
     * @ibatorgenerated Sun Oct 09 13:46:32 CST 2011
     */
    private String mobile;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_users_address.telephone
     *
     * @ibatorgenerated Sun Oct 09 13:46:32 CST 2011
     */
    private String telephone;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_users_address.best_time
     *
     * @ibatorgenerated Sun Oct 09 13:46:32 CST 2011
     */
    private Date bestTime;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_users_address.address_id
     *
     * @return the value of bai_users_address.address_id
     *
     * @ibatorgenerated Sun Oct 09 13:46:32 CST 2011
     */
    public Long getAddressId() {
        return addressId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_users_address.address_id
     *
     * @param addressId the value for bai_users_address.address_id
     *
     * @ibatorgenerated Sun Oct 09 13:46:32 CST 2011
     */
    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_users_address.user_id
     *
     * @return the value of bai_users_address.user_id
     *
     * @ibatorgenerated Sun Oct 09 13:46:32 CST 2011
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_users_address.user_id
     *
     * @param userId the value for bai_users_address.user_id
     *
     * @ibatorgenerated Sun Oct 09 13:46:32 CST 2011
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_users_address.consignee
     *
     * @return the value of bai_users_address.consignee
     *
     * @ibatorgenerated Sun Oct 09 13:46:32 CST 2011
     */
    public String getConsignee() {
        return consignee;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_users_address.consignee
     *
     * @param consignee the value for bai_users_address.consignee
     *
     * @ibatorgenerated Sun Oct 09 13:46:32 CST 2011
     */
    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_users_address.email
     *
     * @return the value of bai_users_address.email
     *
     * @ibatorgenerated Sun Oct 09 13:46:32 CST 2011
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_users_address.email
     *
     * @param email the value for bai_users_address.email
     *
     * @ibatorgenerated Sun Oct 09 13:46:32 CST 2011
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_users_address.country
     *
     * @return the value of bai_users_address.country
     *
     * @ibatorgenerated Sun Oct 09 13:46:32 CST 2011
     */
    public Integer getCountry() {
        return country;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_users_address.country
     *
     * @param country the value for bai_users_address.country
     *
     * @ibatorgenerated Sun Oct 09 13:46:32 CST 2011
     */
    public void setCountry(Integer country) {
        this.country = country;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_users_address.province
     *
     * @return the value of bai_users_address.province
     *
     * @ibatorgenerated Sun Oct 09 13:46:32 CST 2011
     */
    public Integer getProvince() {
        return province;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_users_address.province
     *
     * @param province the value for bai_users_address.province
     *
     * @ibatorgenerated Sun Oct 09 13:46:32 CST 2011
     */
    public void setProvince(Integer province) {
        this.province = province;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_users_address.city
     *
     * @return the value of bai_users_address.city
     *
     * @ibatorgenerated Sun Oct 09 13:46:32 CST 2011
     */
    public Integer getCity() {
        return city;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_users_address.city
     *
     * @param city the value for bai_users_address.city
     *
     * @ibatorgenerated Sun Oct 09 13:46:32 CST 2011
     */
    public void setCity(Integer city) {
        this.city = city;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_users_address.district
     *
     * @return the value of bai_users_address.district
     *
     * @ibatorgenerated Sun Oct 09 13:46:32 CST 2011
     */
    public Integer getDistrict() {
        return district;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_users_address.district
     *
     * @param district the value for bai_users_address.district
     *
     * @ibatorgenerated Sun Oct 09 13:46:32 CST 2011
     */
    public void setDistrict(Integer district) {
        this.district = district;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_users_address.address
     *
     * @return the value of bai_users_address.address
     *
     * @ibatorgenerated Sun Oct 09 13:46:32 CST 2011
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_users_address.address
     *
     * @param address the value for bai_users_address.address
     *
     * @ibatorgenerated Sun Oct 09 13:46:32 CST 2011
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_users_address.zipcode
     *
     * @return the value of bai_users_address.zipcode
     *
     * @ibatorgenerated Sun Oct 09 13:46:32 CST 2011
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_users_address.zipcode
     *
     * @param zipcode the value for bai_users_address.zipcode
     *
     * @ibatorgenerated Sun Oct 09 13:46:32 CST 2011
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_users_address.mobile
     *
     * @return the value of bai_users_address.mobile
     *
     * @ibatorgenerated Sun Oct 09 13:46:32 CST 2011
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_users_address.mobile
     *
     * @param mobile the value for bai_users_address.mobile
     *
     * @ibatorgenerated Sun Oct 09 13:46:32 CST 2011
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_users_address.telephone
     *
     * @return the value of bai_users_address.telephone
     *
     * @ibatorgenerated Sun Oct 09 13:46:32 CST 2011
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_users_address.telephone
     *
     * @param telephone the value for bai_users_address.telephone
     *
     * @ibatorgenerated Sun Oct 09 13:46:32 CST 2011
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_users_address.best_time
     *
     * @return the value of bai_users_address.best_time
     *
     * @ibatorgenerated Sun Oct 09 13:46:32 CST 2011
     */
    public Date getBestTime() {
        return bestTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_users_address.best_time
     *
     * @param bestTime the value for bai_users_address.best_time
     *
     * @ibatorgenerated Sun Oct 09 13:46:32 CST 2011
     */
    public void setBestTime(Date bestTime) {
        this.bestTime = bestTime;
    }
}