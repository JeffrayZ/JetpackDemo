package com.zff.room.bean;

/**
 * @ProjectName: JetpackDemo
 * @Package: com.zff.room
 * @ClassName: User
 * @Description: java类作用描述
 * @Author: Jeffray
 * @CreateDate: 2019/6/5 16:08
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/6/5 16:08
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */


import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

/**
 * @Entity ：  数据表的实体类。
 * @PrimaryKey ：  每一个实体类都需要一个唯一的标识。
 * @ColumnInfo ：  数据表中字段名称。
 * @Ignore ：  标注不需要添加到数据表中的属性。
 * @Embedded ：  实体类中引用其他实体类。
 * @ForeignKey ：  外键约束。
 */
@Entity
public class User {
    @PrimaryKey(autoGenerate = true) //autoGenerate 为true时，自增；
    private int uid;
    @ColumnInfo(name = "name")
    private String name;
    @Ignore
    private String remark;
    @Embedded
    private Address address;

    public User() {
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
