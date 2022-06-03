package com.example.lab_9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1,b2;
    EditText t1,t2;
    private String shname="yash";
    int function, function2;
    int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button) findViewById(R.id.button);
        b2=(Button) findViewById(R.id.button2);

        t1=(EditText) findViewById(R.id.text1);
        t2=(EditText) findViewById(R.id.text2);

        final SharedPreferences sharedPreferences = getSharedPreferences(shname,MODE_PRIVATE);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               SharedPreferences.Editor speditor=sharedPreferences.edit();
               speditor.putString("Username",t1.getText().toString());
               speditor.putString("Password",t2.getText().toString());
               speditor.apply();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                SharedPreferences prefs = getSharedPreferences(shname, MODE_PRIVATE);
//                String Username = prefs.getString("2", "No name defined");
//                int Password = prefs.getInt("9", 9);

                String temp= t1.getText().toString();
                int finalValue=Integer.parseInt(temp);
                function = finalValue*finalValue+5;

                String temp2= t2.getText().toString();
                int finalValue2=Integer.parseInt(temp2);
                function2 = (finalValue2-5)/finalValue2;

                if(finalValue==function2){
                    Context context = getApplicationContext();
                    CharSequence text = "Log-In Successful";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                else{
                    Context context = getApplicationContext();
                    CharSequence text = "Log-In Failed Try Again";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                }

            }
        });

    }
}