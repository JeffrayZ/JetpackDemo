package com.zff.room.bean;

import androidx.room.ColumnInfo;

/**
 * @ProjectName: JetpackDemo
 * @Package: com.zff.room
 * @ClassName: Address
 * @Description: java类作用描述
 * @Author: Jeffray
 * @CreateDate: 2019/6/5 16:09
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/6/5 16:09
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Address {
    private String street;
    private String state;
    private String city;
    @ColumnInfo(name = "post_code")
    private int postCode;

    public Address() {
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }
}
