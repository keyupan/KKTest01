package com.example.mytest01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.KK.util.Md5Util;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button but1 = (Button) findViewById(R.id.testButton);
        but1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(TestActivity.this,"you clicked button",Toast.LENGTH_SHORT).show();
                Toast.makeText(TestActivity.this,Md5Util.getMD5String("123"),Toast.LENGTH_SHORT).show();
            }
        });
    }
}