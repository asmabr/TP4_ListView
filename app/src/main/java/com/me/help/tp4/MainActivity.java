package com.me.help.tp4;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView1);

        String[] pays = { "France", "Tunisie", "Maroc", "Turquie", "Italie",
                "Serbie","Allemagne","Suisse","Egypte","Australie","Algerie"  };


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, pays);


        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                String itemValue = (String) listView
                        .getItemAtPosition(position);


                Toast.makeText(
                        getApplicationContext(),
                        "Pays:"
                                + itemValue, Toast.LENGTH_LONG).show();

            }

        });

    }

}
