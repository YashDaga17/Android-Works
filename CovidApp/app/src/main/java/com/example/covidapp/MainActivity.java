package com.example.covidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name,place,ano;
    CheckBox cold,fever,nosmell,vomit;
    Button submit;
    String symptoms;
    String diagnosis;
    int aano;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_page);
        name = findViewById(R.id.editTextTextPersonName);
        place = findViewById(R.id.editTextTextPersonName2);
        ano = findViewById(R.id.editTextTextPersonName3);
        cold = findViewById(R.id.checkBox);
        fever = findViewById(R.id.checkBox2);
        nosmell = findViewById(R.id.checkBox3);
        vomit = findViewById(R.id.checkBox4);
        submit = findViewById(R.id.button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aano=Integer.parseInt(ano.getText().toString());
                if(cold.isChecked() && !fever.isChecked() &&
                        !nosmell.isChecked() && !vomit.isChecked())
                {
                    symptoms="Cold cough";
                    diagnosis="only cold";
                    Toast.makeText(getApplicationContext(),"only cold",Toast.LENGTH_SHORT).show();
                }
                if(cold.isChecked() && fever.isChecked() && !nosmell.isChecked()
                        && !vomit.isChecked())
                {
                    Toast.makeText(getApplicationContext(),"normal fever",Toast.LENGTH_SHORT).show();symptoms="Cold cough"+"\n"+"fever";
                    diagnosis="normal fever";
                }
                if(cold.isChecked() && fever.isChecked() && !nosmell.isChecked()
                        && vomit.isChecked())
                {
                    Toast.makeText(getApplicationContext(),"viral fever",Toast.LENGTH_SHORT).show();symptoms="Cold cough"+"\n"+"fever" +"\n"+"vomiting";
                    diagnosis="Viral fever";
                }
                if(cold.isChecked() && fever.isChecked() && nosmell.isChecked()
                        && vomit.isChecked())
                {
                    Toast.makeText(getApplicationContext(),"covid", Toast.LENGTH_SHORT).show();
                    symptoms="Cold cough"+"\n"+"fever" +"\n"+"vomiting"+"\n"+"no smell";
                    diagnosis="covid";
                }
//pass info to second page
                Intent intent=new
                        Intent(getApplicationContext(),second_main.class);
                Bundle b=new Bundle();
                b.putString("name",name.getText().toString());
                b.putString("place",place.getText().toString());
                b.putInt("aadhar",aano); //int
                b.putString("sym",symptoms);
                b.putString("dia",diagnosis);
                intent.putExtras(b);
                startActivity(intent);
            }
        });
    }
}

