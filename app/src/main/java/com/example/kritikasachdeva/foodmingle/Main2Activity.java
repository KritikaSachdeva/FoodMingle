package com.example.kritikasachdeva.foodmingle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    Button btn,next;
    EditText edit1;
    TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txt1=(TextView)findViewById(R.id.textView);
        btn=(Button)findViewById(R.id.button);
        next=(Button)findViewById(R.id.next);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                edit1=(EditText)findViewById(R.id.edittext);
                String result=edit1.getText().toString();
                Log.d("TAG",result);

                Toast.makeText(getApplicationContext(), "Address Saved!",
                        Toast.LENGTH_LONG).show();


            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {


                Intent myIntent = new Intent(Main2Activity.this, FoodType.class);

                Main2Activity.this.startActivity(myIntent);

            }
        });




    }
}
