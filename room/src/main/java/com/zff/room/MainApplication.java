package com.zff.room;

import android.app.Application;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.zff.room.room.DBInstance;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @ProjectName: JetpackDemo
 * @Package: com.zff.room
 * @ClassName: MainApplication
 * @Description: java类作用描述
 * @Author: Jeffray
 * @CreateDate: 2019/6/5 17:54
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/6/5 17:54
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder()
                .setNameFormat("demo-pool-%d").build();
        ExecutorService singleThreadPool = new ThreadPoolExecutor(1, 1,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(1024), namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());

        singleThreadPool.execute(()-> DBInstance.getInstance(getApplicationContext()));
        singleThreadPool.shutdown();
    }
}
