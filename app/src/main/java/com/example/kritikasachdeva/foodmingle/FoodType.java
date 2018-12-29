package com.example.kritikasachdeva.foodmingle;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FoodType extends AppCompatActivity {
    TextView head;
    Button b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_type);

        head=(TextView) findViewById(R.id.text1);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent myIntent = new Intent(FoodType.this, AddItem.class);

                FoodType.this.startActivity(myIntent);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent myIntent = new Intent(FoodType.this, AddItem.class);

                FoodType.this.startActivity(myIntent);

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent myIntent = new Intent(FoodType.this, AddItem.class);

                FoodType.this.startActivity(myIntent);

            }
        });

    }
}
