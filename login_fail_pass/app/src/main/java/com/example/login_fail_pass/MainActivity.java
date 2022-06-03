package com.example.login_fail_pass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button button, button1;
        EditText user,password;

         button = findViewById(R.id.login);
         button1 = findViewById(R.id.clear);
         user =  findViewById(R.id.userid);
        password =  findViewById(R.id.pass);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user.getText().toString().equals("vit") & password.getText().toString().equals("vit2022"))
                {
                    Toast.makeText(getApplicationContext(),"login successful",Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(getApplicationContext(),"login failed",Toast.LENGTH_LONG).show();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user.setText("");
                password.setText("");
            }
        });
    }


}