package com.example.kritikasachdeva.foodmingle;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class NPricedListOfItemsActivity extends AppCompatActivity implements View.OnClickListener{

    CardView c1,c2,c3,c4,c5,c6;
    android.support.v7.widget.Toolbar toolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_npriced_list_of_items);
        c1=findViewById(R.id.c1);
        c2=findViewById(R.id.c2);
        c3=findViewById(R.id.c3);
        c4=findViewById(R.id.c4);
        c5=findViewById(R.id.c5);
        c6=findViewById(R.id.c6);


        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
        c3.setOnClickListener(this);
        c4.setOnClickListener(this);
        c5.setOnClickListener(this);
        c6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.c1:

                Intent intent=new Intent(this,Detail3Activity.class);
                startActivity(intent);


                break;

            case R.id.c2:


                break;

            case R.id.c3:

                Intent intent1=new Intent(this,DetailActivity.class);
                startActivity(intent1);
                break;

            case R.id.c4:

                Intent intent2=new Intent(this,Detail2Activity.class);
                startActivity(intent2);
                break;


            case R.id.c5:
                break;

            case R.id.c6:
                break;

        }

    }
}
