package com.example.iot_store;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1,b2;
    EditText e1,e2,e3;
    TextView t1;
    int n1, n2, n3;
    int total;
    String res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Toast.makeText(this,"Welcome to IOT Store",Toast.LENGTH_LONG);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=findViewById(R.id.editarduinounit);
        e2=findViewById(R.id.editwifi);
        e3=findViewById(R.id.editblue);

        b1=findViewById(R.id.submit);
        b2=findViewById(R.id.clear);

        t1=findViewById(R.id.editpayable);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                n1 = Integer.parseInt(e1.getText().toString());
                n2 = Integer.parseInt(e2.getText().toString());
                n3 = Integer.parseInt(e3.getText().toString());

                total = (n1*500) + (n2*250) + (n3*200);
                res=Double.toString(total);

                t1.setText(res);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                e1.setText("");
                e2.setText("");
                e3.setText("");
                t1.setText("");
            }
        });
    }
}