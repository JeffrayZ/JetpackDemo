package com.zff.livedata;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * @ProjectName: JetpackDemo
 * @Package: com.zff.livedata
 * @ClassName: NameViewModel
 * @Description: java类作用描述
 * @Author: Jeffray
 * @CreateDate: 2019/6/4 17:58
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/6/4 17:58
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class NameViewModel extends AndroidViewModel {
    private MutableLiveData<String> content;
    private MutableLiveData<StudentBean> student;

    public NameViewModel(@NonNull Application application) {
        super(application);
    }

    public MutableLiveData<StudentBean> getStudent() {
        if(student == null){
            student = new MutableLiveData<>();
        }
        return student;
    }

    public MutableLiveData<String> getContent() {
        if(content == null){
            content = new MutableLiveData<>();
        }
        return content;
    }
}
