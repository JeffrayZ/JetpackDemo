package com.zff.room.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.zff.room.bean.User;
import com.zff.room.dao.UserDao;

/**
 * @ProjectName: JetpackDemo
 * @Package: com.zff.room.database
 * @ClassName: AppDataBase
 * @Description: 数据库持久化
 * @Author: Jeffray
 * @CreateDate: 2019/6/5 16:38
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/6/5 16:38
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Database(entities = {User.class},version = 1,exportSchema = false)
public abstract class AppDataBase extends RoomDatabase {
    public abstract UserDao getUserDao();
}
