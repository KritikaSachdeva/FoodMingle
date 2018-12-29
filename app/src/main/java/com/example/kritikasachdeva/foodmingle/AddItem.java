package com.example.kritikasachdeva.foodmingle;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddItem extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        // Get reference of widgets from XML layout
        final ListView lv = (ListView) findViewById(R.id.lv);
        final Button btn = (Button) findViewById(R.id.btn);

        // Initializing a new String Array
        String[] fooditem = new String[]{
                "Roti",
                "Rice"
        };
        String[] price = new String[] {
                "30","80"
        };

        // Create a List from String Array elements
        final List<String> food_list = new ArrayList<String>(Arrays.asList(fooditem));

        // Create an ArrayAdapter from List
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, food_list);

        // DataBind ListView with items from ArrayAdapter
        lv.setAdapter(arrayAdapter);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add new Items to List
                food_list.add("Shahi Paneer");
                food_list.add("Daal");
                /*
                    notifyDataSetChanged ()
                        Notifies the attached observers that the underlying
                        data has been changed and any View reflecting the
                        data set should refresh itself.
                 */
                arrayAdapter.notifyDataSetChanged();
            }
        });
    }
}