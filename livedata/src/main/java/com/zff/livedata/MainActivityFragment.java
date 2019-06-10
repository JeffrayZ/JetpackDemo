package com.zff.livedata;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private TextView tvContent;
    private TextView tvName;
    private Button btnRandom;
    private NameViewModel viewModel;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewModel = ViewModelProviders.of(this, ViewModelProvider.AndroidViewModelFactory.getInstance(MainApplication.getInstance())).get(NameViewModel.class);
        viewModel.getContent().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                tvContent.setText(s);
            }
        });

        viewModel.getStudent().observe(this, new Observer<StudentBean>() {
            @Override
            public void onChanged(StudentBean studentBean) {
                tvName.setText(studentBean.getName());
            }
        });

        tvContent = view.findViewById(R.id.tv_content);
        tvName = view.findViewById(R.id.tv_name);
        btnRandom = view.findViewById(R.id.btn_random);

        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.getContent().setValue("内容:" + getStringRandom(6));
                StudentBean sb = new StudentBean();
                sb.setGender("男");
                sb.setName("姓名:" + getStringRandom(6));
                viewModel.getStudent().setValue(sb);
            }
        });
    }

    // 生成随机数字和字母,
    public String getStringRandom(int length) {

        String val = "";
        Random random = new Random();

        //参数length，表示生成几位随机数
        for(int i = 0; i < length; i++) {

            String charOrNum = random.nextInt(2) % 2 == 0 ? "char" : "num";
            //输出字母还是数字
            if( "char".equalsIgnoreCase(charOrNum) ) {
                //输出是大写字母还是小写字母
                int temp = random.nextInt(2) % 2 == 0 ? 65 : 97;
                val += (char)(random.nextInt(26) + temp);
            } else if( "num".equalsIgnoreCase(charOrNum) ) {
                val += String.valueOf(random.nextInt(10));
            }
        }
        return val;
    }
}
