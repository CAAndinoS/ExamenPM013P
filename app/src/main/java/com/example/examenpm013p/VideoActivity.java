package com.example.examenpm013p;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.VideoView;

import com.bumptech.glide.Glide;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.storage.StorageReference;

public class VideoActivity extends AppCompatActivity {
    VideoView videoViewVideo;
    String selectedUserVideoUrl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        videoViewVideo = findViewById(R.id.videoViewVideo);

        // Obtener los datos del usuario seleccionado enviados desde ListActivity
        Intent intent = getIntent();

        selectedUserVideoUrl = intent.getStringExtra("selected_user_video_url");

        // cargar el video desde la URL usando el método setVideoURI()
        videoViewVideo.setVideoURI(Uri.parse(selectedUserVideoUrl));
        videoViewVideo.requestFocus();
        videoViewVideo.start();
    }
}