package com.example.kritikasachdeva.foodmingle;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class Detail3Activity extends AppCompatActivity implements View.OnClickListener {
    TextView txt1;
    Intent intent;
    Button b;
    int id;
    ImageView share;
    ImageView feedback;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail3);

        txt1=findViewById(R.id.txt1);
        b=findViewById(R.id.po);
        share=findViewById(R.id.share);
        feedback=findViewById(R.id.feedback);
        intent=getIntent();

        String text=intent.getStringExtra("Text2");

        txt1.setText("3");

        b.setOnClickListener(this);
        share.setOnClickListener(this);
        feedback.setOnClickListener(this);





    }

    @Override
    public void onClick(View v) {
        id = v.getId();

        switch (id) {

            case R.id.po:
                if(ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED){
                    call("9999999999");
                }else{
                    String permissions[]={Manifest.permission.CALL_PHONE};
                    ActivityCompat.requestPermissions(this,permissions,1);
                }

                break;

            case R.id.share:

                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT," This app lets you to reuse your left over food by either donating it or buying it from nearby places, you can download the app from https://www.google.co.in/ ");
                startActivity(intent);
                break;

            case R.id.feedback:
                Intent intent1=new Intent();
                intent1.setAction(Intent.ACTION_SENDTO);
                Uri uri=Uri.parse("mailto:guptatannu.34@gmail.com");
                intent1.setData(uri);
                startActivity(intent1);
                break;
        }
    }



    public void call(String phone){
        Intent intent=new Intent();
        intent.setAction(intent.ACTION_CALL);
        Uri uri=Uri.parse("tel:"+phone);
        intent.setData(uri);
        startActivity(intent);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(requestCode == 1){
            int callGrantResult = grantResults[0];
            if(callGrantResult == PackageManager.PERMISSION_GRANTED){
                call("997111111111");
            }
            else {
                Toast.makeText(this,"Grant permission",Toast.LENGTH_LONG).show();
            }
        }
    }
}






