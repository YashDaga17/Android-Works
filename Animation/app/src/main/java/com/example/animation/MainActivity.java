package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageButton i1,i2;
    ImageView v1,v2;
    int a,n=100;
    Image image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_page);
        i1=findViewById(R.id.imageButton);
        v1=findViewById(R.id.imageView);
        v2=findViewById(R.id.imageView2);
        for(a=0;a<n;a++){
        }
    }
}