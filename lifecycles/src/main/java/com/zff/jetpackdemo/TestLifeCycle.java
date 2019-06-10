package com.zff.jetpackdemo;


import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

/**
 * @ProjectName: JetpackDemo
 * @Package: com.zff.jetpackdemo
 * @ClassName: TestLifeCycle
 * @Description: java类作用描述
 * @Author: Jeffray
 * @CreateDate: 2019/6/4 17:12
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/6/4 17:12
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class TestLifeCycle implements LifecycleObserver {
    public static final String TAG = "TestLifeCycle";

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate(){
        Log.e(TAG,"onCreate");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart(){
        Log.e(TAG,"onStart");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume(){
        Log.e(TAG,"onResume");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause(){
        Log.e(TAG,"onPause");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(){
        Log.e(TAG,"onStop");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(){
        Log.e(TAG,"onDestroy");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    public void onAny(){
        Log.e(TAG,"onAny");
    }

}
