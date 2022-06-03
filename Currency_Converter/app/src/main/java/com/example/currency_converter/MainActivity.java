package com.example.currency_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button b1;
    RadioGroup rg;
    RadioButton r1,r2,r3;
    EditText e1,e2;
    TextView t1;
    String op;
    int n;
    int total;
    double res;
    String result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=findViewById(R.id.ans);

        rg=findViewById(R.id.radioGroup);
        e1=findViewById(R.id.inrs);
        b1=findViewById(R.id.convert);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedID) {

                int i = rg.getCheckedRadioButtonId();
                r1=findViewById(i);
                op=r1.getText().toString();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(op.equals("USD")){
                    n = Integer.parseInt(e1.getText().toString());
                    res = (double) n * 0.014;
                }

                else if(op.equals("EURO")){
                    n = Integer.parseInt(e1.getText().toString());
                    res = (double) n * 0.011;
                }

                else if (op.equals("YEN")){
                    n=Integer.parseInt(e1.getText().toString());
                    res = (double) n * 1.45;
                }

                result = Double.toString(res);
                t1.setText(result);
            }
        });

    }
}