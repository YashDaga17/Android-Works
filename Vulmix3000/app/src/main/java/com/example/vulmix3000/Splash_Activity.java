package com.example.vulmix3000;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;

public class Splash_Activity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    setContentView(R.layout.splash_layout);

        this.getSupportActionBar().hide();

    getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

    Thread td = new Thread() {
        public void run() {
            try {
                sleep(5000);
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                Intent intent = new Intent(Splash_Activity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }
    };td.start();
}
}
