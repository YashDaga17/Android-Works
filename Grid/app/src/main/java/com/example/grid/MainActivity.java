package com.example.grid;

import android.os.Bundle;
import android.widget.GridView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    GridView coursesGV;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        coursesGV = findViewById(R.id.idGVcourses);
        ArrayList<courselist> courseModelArrayList = new ArrayList<courselist>();
        courseModelArrayList.add(new courselist("DSA", R.drawable.img_1));
        courseModelArrayList.add(new courselist("JAVA", R.drawable.img));
        courseModelArrayList.add(new courselist("Math", R.drawable.img_2));
        courseModelArrayList.add(new courselist("JAVA", R.drawable.img));
        courseModelArrayList.add(new courselist("Math", R.drawable.img_2));
        courseModelArrayList.add(new courselist("DSA", R.drawable.img_1));
        course adapter = new course(this, courseModelArrayList);
        coursesGV.setAdapter(adapter);
    }
}