package com.example.designproject_eei4369;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.VideoView;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ActionBar actionBar =getSupportActionBar();
       if (actionBar != null){
           actionBar.hide();
       }
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        VideoView videoView =findViewById (R.id.videoView);
        videoView.setVideoPath("android.resource://"+getPackageName() + "/" + R.raw.splash);
        videoView.start();


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(splash.this,LoginActivity.class );
                startActivity(intent);
                finish();
            }
        }, 7000);
    }
}
