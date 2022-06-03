package com.example.datetime;
import androidx.appcompat.app.AppCompatActivity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import java.util.Calendar;
public class MainActivity extends AppCompatActivity {
    private int[] Date1 ,Date2,Time1,Time2;
    @Override protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText et1=(EditText)findViewById(R.id.ETD1);
        final EditText et2=(EditText)findViewById(R.id.ETD2);
        final EditText et3=(EditText)findViewById(R.id.ETD3);
        final EditText et4=(EditText)findViewById(R.id.ETT1);
        final EditText et5=(EditText)findViewById(R.id.ETT2);
        final EditText et6=(EditText)findViewById(R.id.ETT3);
        Button b1=(Button)findViewById(R.id.DB1);
        Button b2=(Button)findViewById(R.id.DB2);
        Button b3=(Button)findViewById(R.id.TB1);
        Button b4=(Button)findViewById(R.id.TB2);
        Button b5=(Button)findViewById(R.id.CB);
        Date1=new int [3];
        Date2=new int [3];
        Time1=new int[2];
        Time2=new int[2];
        b1.setOnClickListener(new View.OnClickListener() {
            @Override public void
            onClick(View view) {
                date(Date1,et1);
            } }); b2.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    date(Date2,et2);
                } });
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    time(Time1,et4);
                } });
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    time(Time2,et5);
                } });
            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view)
                {
                    diff_date(et3); diff_time(et6);
                }
            }); } void date(final int[]d, final
    EditText e){ final Calendar c1 =
            Calendar.getInstance(); d[0] =
            c1.get(Calendar.YEAR); d[1] =
            c1.get(Calendar.MONTH); d[2] =
            c1.get(Calendar.DAY_OF_MONTH);
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new
                DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int
                            month, int dayOfMonth) {
                        e.setText(String.valueOf(dayOfMonth+"/"+(month+1)+"/"+year))
                        ; d[0]=dayOfMonth; d[1]=month; d[2]=year;
                    }
                },d[0],d[1],d[2]); datePickerDialog.show();
    }
    void time(final int[] t, final EditText e){ final
    Calendar c = Calendar.getInstance(); t[0] =
            c.get(Calendar.HOUR_OF_DAY); t[1] =
            c.get(Calendar.MINUTE);
// Launch Time Picker Dialog
        TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                    e.setText(String.valueOf(hourOfDay + ":" + minute));
                    t[0]=hourOfDay; t[1]=minute;
                }
                }, t[0], t[1], true);
        timePickerDialog.show();
    }
    void diff_date(final EditText e){
        e.setText(String.valueOf((Date2[0]- Date1[0])+"/"+(Date2[1]-Date1[1])+"/"+(Date2[2]-Date1[2]))); }
    void diff_time(final EditText e){
        e.setText(String.valueOf((Time2[0]- Time1[0])+":"+(Time2[1]-Time1[1])));}
}