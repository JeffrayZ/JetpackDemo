package com.zff.room.room;

import android.content.Context;

import androidx.room.Room;
import androidx.room.RxRoom;

import com.zff.room.database.AppDataBase;

import org.sqlite.core.DB;

/**
 * @ProjectName: JetpackDemo
 * @Package: com.zff.room.room
 * @ClassName: DBInstance
 * @Description: Room初始化 每一次初始化数据库对象都需要消费较大的资源，因此可以通过单例的方式，实现一个进程中公用一个数据库对象。
 * @Author: Jeffray
 * @CreateDate: 2019/6/5 16:40
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/6/5 16:40
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class DBInstance {
    private static final String DB_NAME = "room_test";
    private static volatile AppDataBase appDataBase;
    public static AppDataBase getInstance(Context context){
        if(appDataBase==null){
            synchronized (DBInstance.class){
                if(appDataBase==null){
                    return Room.databaseBuilder(context,AppDataBase.class, DB_NAME)
                            .build();
                }
            }
        }
        return appDataBase;
    }
}
