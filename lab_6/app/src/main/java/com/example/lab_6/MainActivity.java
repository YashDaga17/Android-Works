package com.example.lab_6;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity{
    private final View[] qtyContainers = new View[3];
    private final Button[] increaseButtons = new Button[3];
    private final Button[] decreaseButtons = new Button[3];
    private final Button[] addButtons = new Button[3];
    private final TextView[] qtyTextViews = new TextView[3];
    private final int[] quantities = {0,0,0};
    @Override
    protected void onCreate(@Nullable Bundle
                                    savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        qtyContainers[0] = findViewById(R.id.qty_container1);
        qtyContainers[1] = findViewById(R.id.qty_container2);
        qtyContainers[2] = findViewById(R.id.qty_container3);
        increaseButtons[0] =
                findViewById(R.id.increaseButton1);
        increaseButtons[1] =
                findViewById(R.id.increaseButton2);
        increaseButtons[2] =
                findViewById(R.id.increaseButton3);
        decreaseButtons[0] =
                findViewById(R.id.decreaseButton1);
        decreaseButtons[1] =
                findViewById(R.id.decreaseButton2);
        decreaseButtons[2] =
                findViewById(R.id.decreaseButton3);
        addButtons[0] = findViewById(R.id.addButton1);
        addButtons[1] = findViewById(R.id.addButton2);
        addButtons[2] = findViewById(R.id.addButton3);
        qtyTextViews[0] = findViewById(R.id.qty_textView1);
        qtyTextViews[1] = findViewById(R.id.qty_textView2);
        qtyTextViews[2] = findViewById(R.id.qty_textView3);
//add click listeners to the addButtons
        for (int i = 0; i < addButtons.length; i++) {
            int finalI = i;
            addButtons[i].setOnClickListener(new View.OnClickListener() {
                                                         @Override
                                                         public void onClick(View v) {
                                                             showQtyContainer(finalI);
                                                         }
                                                     });
        }
    }
    private void showQtyContainer(int position) {
        quantities[position] = 1;
        qtyTextViews[position].setText(String.valueOf(quantities[position]));
        addButtons[position].setVisibility(View.INVISIBLE);
        qtyContainers[position].setVisibility(View.VISIBLE);
        increaseButtons[position].setOnClickListener(new View.OnClickListener() {
                                                                 @Override
                                                                 public void onClick(View v) {
//increase button increases the quantity of the item at position index
                                                                     quantities[position] += 1;
                                                                     qtyTextViews[position].setText(String.valueOf(quantities[position]));
                                                                 }
                                                             });
        decreaseButtons[position].setOnClickListener(new View.OnClickListener() {
                                                                 @Override
                                                                 public void onClick(View v) {
//decrease button decreases the quantity of the item at position index
                                                                     quantities[position] -= 1;
                                                                     qtyTextViews[position].setText(String.valueOf(quantities[position]));
//if the quantity gets 0 at any point
                                                                     if(quantities[position] <= 0){
//the add button is made visible and quantity container is made invisible
                                                                         quantities[position] = 0;
                                                                         addButtons[position].setVisibility(View.VISIBLE);
                                                                         qtyContainers[position].setVisibility(View.INVISIBLE);
                                                                     }
                                                                 }
                                                             });
    }
}