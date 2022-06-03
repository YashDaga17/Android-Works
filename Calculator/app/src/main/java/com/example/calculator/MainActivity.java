package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t1,t2;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bd,bm,bc,be,ba,bs;
    int res =0, temp=0;
    String t,r,op,a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.calculation);
        t2=findViewById(R.id.operator);
        b0=findViewById(R.id.b0);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        ba=findViewById(R.id.addition);
        bs=findViewById(R.id.subtract);
        bm=findViewById(R.id.Multiplication);
        bd=findViewById(R.id.division);
        bc=findViewById(R.id.clear);
        be=findViewById(R.id.result);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=t1.getText().toString();
                r=t+"0";
                t1.setText(r);
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=t1.getText().toString();
                r=t+"0";
                t1.setText(r);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=t1.getText().toString();
                r=t+"1";
                t1.setText(r);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=t1.getText().toString();
                r=t+"2";
                t1.setText(r);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=t1.getText().toString();
                r=t+"3";
                t1.setText(r);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=t1.getText().toString();
                r=t+"4";
                t1.setText(r);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=t1.getText().toString();
                r=t+"5";
                t1.setText(r);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=t1.getText().toString();
                r=t+"6";
                t1.setText(r);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=t1.getText().toString();
                r=t+"7";
                t1.setText(r);
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=t1.getText().toString();
                r=t+"8";
                t1.setText(r);
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=t1.getText().toString();
                r=t+"9";
                t1.setText(r);
            }
        });

        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a="+";
                t2.setText(String.valueOf(a));
                op="+";
                temp=Integer.parseInt(t1.getText().toString());
                t1.setText("");
            }
        });

        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op="-";
                temp=Integer.parseInt(t1.getText().toString());
                t1.setText("");
            }
        });

        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op="*";
                temp=Integer.parseInt(t1.getText().toString());
                t1.setText("");
            }
        });

        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op="/";
                temp=Integer.parseInt(t1.getText().toString());
                t1.setText("");
            }
        });

        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp=0;
                t1.setText("");
            }
        });

        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(op.equals("+")){
                   a="+";
                   t2.setText(String.valueOf(a));
                   res = temp + Integer.parseInt(t1.getText().toString());
                   t1.setText(String.valueOf(res));
               }

                else if(op.equals("-")){
                   a="-";
                   t2.setText(String.valueOf(a));
                   res = temp - Integer.parseInt(t1.getText().toString());
                    t1.setText(String.valueOf(res));
                }

               else if(op.equals("/")){
                   a="/";
                   t2.setText(String.valueOf(a));
                   res = temp / Integer.parseInt(t1.getText().toString());
                   t1.setText(String.valueOf(res));
               }

               else if(op.equals("*")){
                   a="x";
                   t2.setText(String.valueOf(a));
                   res = temp * Integer.parseInt(t1.getText().toString());
                   t1.setText(String.valueOf(res));
               }
            }
        });
    }
}