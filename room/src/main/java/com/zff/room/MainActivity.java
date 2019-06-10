package com.zff.room;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.zff.room.bean.User;
import com.zff.room.room.DBInstance;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i <= 4; i++) {
            User user = new User();
            user.setName("我是" + i + "号");
            user.setRemark("这是" + i + "号的描述");
            ThreadPoolManager.getInstance().execute(() -> DBInstance.getInstance(getApplicationContext()).getUserDao().insertAll(user));
        }

        ThreadPoolManager.getInstance().execute(new Runnable() {
            @Override
            public void run() {
                // 获取数据
               List<User> list = DBInstance.getInstance(getApplicationContext()).getUserDao().getAll();
            }
        });

    }
}
