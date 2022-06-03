package com.example.covidapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
public class second_main extends AppCompatActivity {
    TextView name,place,ano;
    TextView sym,dia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_page);
        name=findViewById(R.id.editTextTextPersonName);
        place=findViewById(R.id.editTextTextPersonName2);
        ano=findViewById(R.id.editTextTextPersonName3);
        sym=findViewById(R.id.textView8);
        dia=findViewById(R.id.textView10);
        Intent intent=getIntent();
        Bundle b=intent.getExtras();
        name.setText(b.getString("name"));
        place.setText(b.getString("place"));
        ano.setText(String.valueOf(b.getInt("aadhar",0)));
        sym.setText(b.getString("sym"));
        dia.setText(b.getString("dia"));
    }
}
