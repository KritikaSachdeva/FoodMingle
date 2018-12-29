package com.example.kritikasachdeva.foodmingle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;


public class ChooseItem extends AppCompatActivity {

    RadioButton priced;
    RadioButton npriced;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choice_row_layout);
        priced=findViewById(R.id.priced);
        npriced=findViewById(R.id.npriced);


    }

    public void onRadioButtonClicked(View view){
        // Is the button now checked?
        boolean checked=((RadioButton) view).isChecked();

        switch (view.getId()){
            case R.id.priced:
                Intent intent=new Intent(this,PricedListOfItemsActivity.class);
                startActivity(intent);
                break;

            case R.id.npriced:
                Intent intent1=new Intent(this,NPricedListOfItemsActivity.class);
                startActivity(intent1);

                break;

        }


    }

}
