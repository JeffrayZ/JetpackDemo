package com.zff.room.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.zff.room.bean.User;

import java.util.List;

/**
 * @ProjectName: JetpackDemo
 * @Package: com.zff.room.dao
 * @ClassName: UserDao
 * @Description: 数据库操作类
 * @Author: Jeffray
 * @CreateDate: 2019/6/5 16:33
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/6/5 16:33
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Dao
public interface UserDao {
    @Query("Select * from user")
    List<User> getAll();

    @Query("Select * from user Where uid In (:userIds)")
    List<User> loadAllByIds(int[] userIds);

    @Insert
    void insertAll(User... users);

    @Delete
    void delete(User... users);

    @Update
    void update(User... users);

    @Query("update user set name = :name1 where uid = :uid")
    void updateCustom(String name1, int uid);
}
