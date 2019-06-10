package com.zff.livedata;

import android.app.Application;

/**
 * @ProjectName: JetpackDemo
 * @Package: com.zff.livedata
 * @ClassName: MainApplication
 * @Description: java类作用描述
 * @Author: Jeffray
 * @CreateDate: 2019/6/4 18:27
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/6/4 18:27
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class MainApplication extends Application {
    private static final Application application = new MainApplication();
    public static Application getInstance(){
        return application;
    }
}
