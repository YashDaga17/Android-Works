package com.example.operation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText a, b, res;
    Button add, sub, multi, div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a = findViewById(R.id.num1);
        b = findViewById(R.id.num2);
        res = findViewById(R.id.result);
        add = findViewById(R.id.addition);
        sub = findViewById(R.id.subtraction);
        multi = findViewById(R.id.multiplication);
        div = findViewById(R.id.division);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int c = Integer.parseInt(a.getText().toString());
                int d = Integer.parseInt(b.getText().toString());
                int temp = c+d;
                res.setText(String.valueOf(temp));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int c = Integer.parseInt(a.getText().toString());
                int d = Integer.parseInt(b.getText().toString());
                int temp = c-d;
                res.setText(String.valueOf(temp));
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int c = Integer.parseInt(a.getText().toString());
                int d = Integer.parseInt(b.getText().toString());
                int temp = c*d;
                res.setText(String.valueOf(temp));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int c = Integer.parseInt(a.getText().toString());
                int d = Integer.parseInt(b.getText().toString());
                int temp = c/d;
                res.setText(String.valueOf(temp));
            }
        });
    }
}