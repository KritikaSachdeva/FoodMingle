package com.example.kritikasachdeva.foodmingle;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class MainActivity extends AppCompatActivity {

    ImageView buy_img, donate_img;
    Button buy_button, donate_button;
    private ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buy_img = findViewById(R.id.buy_img);
        donate_img = findViewById(R.id.donate_img);

        buy_button = findViewById(R.id.buy_button);
        donate_button = findViewById(R.id.donate_button);


        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        if (progressBar != null) {
            progressBar.setVisibility(View.GONE);
        }
    }

        public void BuyButtonClicked(View view){
         Intent bintent= new Intent(MainActivity.this, MapsActivity.class);
         startActivity(bintent);
    }

  public void DonateButtonClicked(View view){
      Intent dintent= new Intent(MainActivity.this, Main2Activity.class);
        startActivity(dintent);
    }


    // Initiating Menu XML file (menu.xml)
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.sign_in: {
                Toast.makeText(this, "Sign in Selected", Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
                return true;
            }

            default:
                return super.onOptionsItemSelected(item);
        }
    }
    }