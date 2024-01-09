package com.example.designproject_eei4369;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class videoGallery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_video_gallery);
        setContentView(R.layout.activity_video_gallery);

        // First Video
        VideoView videoView = findViewById(R.id.videoView1);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.knuckles);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView .setMediaController(mediaController);

        //Second video
        VideoView videoView1 = findViewById(R.id.videoView2);
        videoView1.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.kallebokka);

        MediaController mediaController1 = new MediaController(this);
        mediaController1.setAnchorView(videoView1);
        videoView1.setMediaController(mediaController1);

        //Third Video
        VideoView videoView2 = findViewById(R.id.videoView3);
        videoView2.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.d);

        MediaController mediaController2 = new MediaController(this);
        mediaController2.setAnchorView(videoView2);
        videoView2.setMediaController(mediaController2);
        //Fourth Video
        VideoView videoView3 = findViewById(R.id.videoView4);
        videoView3.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.b);
        MediaController mediaController3 = new MediaController(this);
        mediaController3.setAnchorView(videoView3);
        videoView3.setMediaController(mediaController3);

        //Fifth Video
        VideoView videoView4 = findViewById(R.id.videoView5);
        videoView4.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.s);

        MediaController mediaController4 = new MediaController(this);
        mediaController4.setAnchorView(videoView4);
        videoView4.setMediaController(mediaController4);

        //sixth Video
        VideoView videoView5 = findViewById(R.id.videoView6);
        videoView5.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.m);

        MediaController mediaController5 = new MediaController(this);
        mediaController5.setAnchorView(videoView5);
        videoView5.setMediaController(mediaController5);
        //seventh Video
        VideoView videoView6 = findViewById(R.id.videoView7);
        videoView6.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.a);
        MediaController mediaController6 = new MediaController(this);
        mediaController6.setAnchorView(videoView6);
        videoView6.setMediaController(mediaController6);
        //Eight Video
        VideoView videoView7 = findViewById(R.id.videoView8);
        videoView7.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.h);
        MediaController mediaController7 = new MediaController(this);
        mediaController7.setAnchorView(videoView7);
        videoView7.setMediaController(mediaController7);
    }
}