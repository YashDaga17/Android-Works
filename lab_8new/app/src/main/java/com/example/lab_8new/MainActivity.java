package com.example.lab_8new;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    String names[]={"Sam","Facebook","Google+","Twitter","Pinterest Weekly"};
    String info[]={"Weekend Adventure","James You have one new notification","Top Suggested Pages for you","Follow t mobile Samsung Mobile","Pins you will love"};
    String desc[]={"Lets go Fishing with John And others.We will..","A lot has happened on Facebook since..","Top Suggested Google+ Pages for you","James,some people you may know","Here you seen these pins yes?Pinterest"};
    String time[]={"10:42am","16:04pm","18:44pm","20:04","09:04am"};
    int images[]={R.drawable.ic_baseline_insert_emoticon_24,R.drawable.ic_baseline_person_24,R.drawable.ic_baseline_person_outline_24,R.drawable.ic_launcher_foreground,R.drawable.ic_baseline_person_outline_24};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler);
        recyclerView.setAdapter(new MyAdapter(this));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    private class MyAdapter extends RecyclerView.Adapter<MYHolder> {
        Context context;
        public MyAdapter(MainActivity mainActivity) {
            context=mainActivity;
        }
        @NonNull
        @Override
        public MYHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view= LayoutInflater.from(context).inflate(R.layout.list_view,parent,false);
            MYHolder h1=new MYHolder(view);
            return h1;
        }
        @Override
        public void onBindViewHolder(@NonNull MYHolder holder, int position) {
            holder.t1.setText(names[position]);
            holder.t2.setText(info[position]);
            holder.t3.setText(desc[position]);
            holder.t4.setText(time[position]);
            holder.img.setImageResource(images[position]);
        }
        @Override
        public int getItemCount() {
            return names.length;
        }}
    private class MYHolder extends RecyclerView.ViewHolder {
        TextView t1,t2, t3, t4;
        ImageView img;
        public MYHolder(@NonNull View itemView) {
            super(itemView);

            t1=itemView.findViewById(R.id.textView1);
            t2 = itemView.findViewById(R.id.textView2);
            t3 = itemView.findViewById(R.id.textView3);
            t4 = itemView.findViewById(R.id.editTextTime5);
            img=itemView.findViewById(R.id.imageView);
        }}
}