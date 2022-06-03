package com.example.lab_10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText id,nam,dept;
    TextView tv;
    Button save,load,update,delete;
     Dbcon dbc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nam=findViewById(R.id.editTextT1);
        id=findViewById(R.id.editTextT2);
        dept=findViewById(R.id.editTextT3);
        save=findViewById(R.id.button2);
        load=findViewById(R.id.button3);
        update=findViewById(R.id.button4);
        delete=findViewById(R.id.button5);
        tv=findViewById(R.id.textView1);
        dbc=new Dbcon(this);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean result=dbc.insert(id.getText().toString(),nam.getText().toString(), dept.getText().toString() );
                if(result==true)
                {Toast.makeText(getApplicationContext(),"data inserted",Toast.LENGTH_LONG).show();}
                else
                {Toast.makeText(getApplicationContext(),"data not inserted",Toast.LENGTH_LONG).show();}
            }
        });
        load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor result=dbc.getData();
                if(result.getCount()==0)
                    return ;
                StringBuilder sb=new StringBuilder();
                tv.setText("");
                while(result.moveToNext())
                {
                    sb.append("Name:"+result.getString(0)+"\n");
                    sb.append("id:"+result.getString(1)+"\n");
                    sb.append("Dept:"+result.getString(2)+"\n");

                }
                tv.setText(sb);

            }
        });

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbc.update(id.getText().toString(),nam.getText().toString(), dept.getText().toString());
                Toast.makeText(getApplicationContext(), "data updated", Toast.LENGTH_LONG).show();

            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbc.delete();
                Toast.makeText(getApplicationContext(), "data deleted", Toast.LENGTH_LONG).show();

            }
        });

    }
}

