package com.example.floatpointbutton;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
public class MainActivity extends AppCompatActivity {
    FloatingActionButton f1,f2,f3,f4,f5,f6,f7,f8;
    int count=0;
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        f1 = (FloatingActionButton) findViewById(R.id.exp);
        f2 = (FloatingActionButton) findViewById(R.id.call);
        f3 = (FloatingActionButton) findViewById(R.id.edit);
        f4 = (FloatingActionButton) findViewById(R.id.floatingActionButton);
        f5 = (FloatingActionButton) findViewById(R.id.floatingActionButton2);
        f6 =(FloatingActionButton) findViewById(R.id.floatingActionButton3);
        f7 = (FloatingActionButton) findViewById(R.id.floatingActionButton4);
        f8 = (FloatingActionButton) findViewById(R.id.floatingActionButton5);
        f1.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                if(count==0) {
                    f4.setVisibility(View.VISIBLE);
                    f5.setVisibility(View.VISIBLE);
                    f2.setVisibility(View.VISIBLE); count =
                            1;
                }else{
                    f2.setVisibility(View.INVISIBLE);
                    f4.setVisibility(View.INVISIBLE);
                    f5.setVisibility(View.INVISIBLE);
                    f3.setVisibility(View.INVISIBLE);
                    f6.setVisibility(View.INVISIBLE);
                    f7.setVisibility(View.INVISIBLE);
                    f8.setVisibility(View.INVISIBLE);
                    count=0;
                }
            } });
        f2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                f3.setVisibility(View.VISIBLE);

                f6.setVisibility(View.VISIBLE);


                f7.setVisibility(View.VISIBLE);

                f8.setVisibility(View.VISIBLE); } });
        f4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f3.setVisibility(View.VISIBLE);
                f6.setVisibility(View.VISIBLE);
                f7.setVisibility(View.VISIBLE);
                f8.setVisibility(View.VISIBLE);
            }
        }); f5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                f3.setVisibility(View.VISIBLE);
                f6.setVisibility(View.VISIBLE);
                f7.setVisibility(View.VISIBLE);
                f8.setVisibility(View.VISIBLE);
            }
        });
    }
}