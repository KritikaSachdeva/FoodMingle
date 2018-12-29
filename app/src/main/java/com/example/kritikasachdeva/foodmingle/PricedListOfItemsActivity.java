package com.example.kritikasachdeva.foodmingle;



import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class PricedListOfItemsActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton h1,h2,h3,h4,h5,h6,h7,h8,h9,h10;
    ImageButton a1,a2,a3,a4,a5,a6,a7,a8,a9,a10;

    android.support.v7.widget.Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_priced_list_of_items);


        h1=findViewById(R.id.h1);
        h2=findViewById(R.id.h2);
        h3=findViewById(R.id.h3);
        h4=findViewById(R.id.h4);
        h5=findViewById(R.id.h5);
        h6=findViewById(R.id.h6);
        h7=findViewById(R.id.h7);
        h8=findViewById(R.id.h8);
        h9=findViewById(R.id.h9);
        h10=findViewById(R.id.h10);
        a1=findViewById(R.id.a1);
        a2=findViewById(R.id.a2);
        a3=findViewById(R.id.a3);
        a4=findViewById(R.id.a4);
        a5=findViewById(R.id.a5);
        a6=findViewById(R.id.a6);
        a7=findViewById(R.id.a7);
        a8=findViewById(R.id.a8);
        a9=findViewById(R.id.a9);
        a10=findViewById(R.id.a10);



        h1.setOnClickListener(this);
        h2.setOnClickListener(this);
        h3.setOnClickListener(this);
        h4.setOnClickListener(this);
        h5.setOnClickListener(this);
        h6.setOnClickListener(this);
        h7.setOnClickListener(this);
        h8.setOnClickListener(this);
        h9.setOnClickListener(this);
        h10.setOnClickListener(this);
        a1.setOnClickListener(this);
        a2.setOnClickListener(this);
        a3.setOnClickListener(this);
        a4.setOnClickListener(this);
        a5.setOnClickListener(this);
        a6.setOnClickListener(this);
        a7.setOnClickListener(this);
        a8.setOnClickListener(this);
        a9.setOnClickListener(this);
        a10.setOnClickListener(this);


    }



    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onClick(View v) {
        int id=v.getId();
        switch(id){
            case R.id.h1:
                h1.setImageDrawable(getDrawable(R.drawable.ic_favorite_red_500_24dp));
                break;
            case R.id.h2:
                h2.setImageDrawable(getDrawable(R.drawable.ic_favorite_red_500_24dp));
                break;
            case R.id.h3:
                h3.setImageDrawable(getDrawable(R.drawable.ic_favorite_red_500_24dp));
                break;
            case R.id.h4:
                h4.setImageDrawable(getDrawable(R.drawable.ic_favorite_red_500_24dp));
                break;
            case R.id.h5:
                h5.setImageDrawable(getDrawable(R.drawable.ic_favorite_red_500_24dp));
                break;
            case R.id.h6:
                h6.setImageDrawable(getDrawable(R.drawable.ic_favorite_red_500_24dp));
                break;
            case R.id.h7:
                h7.setImageDrawable(getDrawable(R.drawable.ic_favorite_red_500_24dp));
                break;
            case R.id.h8:
                h8.setImageDrawable(getDrawable(R.drawable.ic_favorite_red_500_24dp));
                break;
            case R.id.h9:
                h9.setImageDrawable(getDrawable(R.drawable.ic_favorite_red_500_24dp));
                break;
            case R.id.h10:
                h10.setImageDrawable(getDrawable(R.drawable.ic_favorite_red_500_24dp));
                break;
            case R.id.a1:
                AlertDialog.Builder dialog=new AlertDialog.Builder(this);
                dialog.setTitle("Add Qunatity");
                final EditText input=new EditText(this);
                LinearLayout.LayoutParams lp=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
                input.setLayoutParams(lp);
                input.setHint("Enter Quantity");
                final String text=input.getText().toString();
                dialog.setView(input);
                dialog.setCancelable(true);
                dialog.setPositiveButton("Proceed", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent=new Intent(getApplicationContext(),DetailActivity.class);
                        intent.putExtra("Text", text);
                        startActivity(intent);
                    }
                });
                AlertDialog dialog1=dialog.create();
                dialog1.show();

                break;

            case R.id.a2:
                AlertDialog.Builder dialog3=new AlertDialog.Builder(this);
                dialog3.setTitle("Add Qunatity");
                final EditText input1=new EditText(this);
                LinearLayout.LayoutParams lp1=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
                input1.setLayoutParams(lp1);
                input1.setHint("Enter Quantity");
                final String text1=input1.getText().toString();
                dialog3.setView(input1);
                dialog3.setCancelable(true);
                dialog3.setPositiveButton("Proceed", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent=new Intent(getApplicationContext(),Detail2Activity.class);
                        intent.putExtra("Text1", text1);
                        startActivity(intent);
                    }
                });
                AlertDialog dialog4=dialog3.create();
                dialog4.show();

                break;

            case R.id.a3:
                AlertDialog.Builder dialog5=new AlertDialog.Builder(this);
                dialog5.setTitle("Add Qunatity");
                final EditText input2=new EditText(this);
                LinearLayout.LayoutParams lp2=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
                input2.setLayoutParams(lp2);
                input2.setHint("Enter Quantity");
                final String text2=input2.getText().toString();
                dialog5.setView(input2);
                dialog5.setCancelable(true);
                dialog5.setPositiveButton("Proceed", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent=new Intent(getApplicationContext(),Detail3Activity.class);
                        intent.putExtra("Text1", text2);
                        startActivity(intent);
                    }
                });
                AlertDialog dialog6=dialog5.create();
                dialog6.show();

                break;



        }




    }
}

