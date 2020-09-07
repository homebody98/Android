package com.example.myintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private long backPressedTime = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //백버튼 2번 앱 종료 기능
    @Override
    public void onBackPressed() {
        long curTime = System.currentTimeMillis();
        if(curTime - backPressedTime < 2000){
            finish();
        }else{
            backPressedTime = curTime;
            Toast.makeText(MainActivity.this,"뒤로가기를 누르면 앱이 종료됩니다.",Toast.LENGTH_SHORT).show();
        }
    }
}