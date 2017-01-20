package com.example.liujianhui.gohappy.main.widget;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.liujianhui.gohappy.R;
import com.example.liujianhui.gohappy.base.BaseActivity;
import com.example.liujianhui.gohappy.util.crashlog.CrashLog;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends BaseActivity {

    @InjectView(R.id.btn_bugly)
    Button btnBugly;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);

        btnBugly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CrashLog crashLog = null;
                Toast.makeText(MainActivity.this, crashLog.content, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
