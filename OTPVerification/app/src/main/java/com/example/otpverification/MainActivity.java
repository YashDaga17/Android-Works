package com.example.otpverification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText enternumber;
    Button getotpbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         enternumber = findViewById(R.id.inoutid);
         getotpbutton = findViewById(R.id.buttonongetotp);

         getotpbutton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                  if (!enternumber.getText().toString().trim().isEmpty()){
                      if((enternumber.getText().toString().trim()).length()==10){
                          Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                          intent.putExtra("mobile",enternumber.getText().toString());
                          startActivity(intent);

                      }else{
                          Toast.makeText(MainActivity.this, "Please enter correct Number ", Toast.LENGTH_LONG);
                      }
                  }else{
                      Toast.makeText(MainActivity.this,"Enter Mobile Number", Toast.LENGTH_SHORT).show();
                  }
             }
         });
    }
}