package com.example.seraycetin.kochkorb;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.ArrayList;

/**
 * Created by Bernhard Lechl  on 01.05.2015.
 */
public class Auswahl extends MainActivity implements View.OnClickListener {

    private Button btn_suppen;
    private Button btn_dessert;
    private Button btn_hauptspeisen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.auswahl);

        btn_suppen = (Button) findViewById(R.id.button_suppen);
        btn_hauptspeisen = (Button) findViewById(R.id.button_hauptspeise);
        btn_dessert = (Button) findViewById(R.id.button_dessert);


        btn_suppen.setOnClickListener(this);
        btn_dessert.setOnClickListener(this);
        btn_hauptspeisen.setOnClickListener(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClick(View v) {
        if (v == btn_suppen) {
            Intent intent = new Intent(getApplicationContext(), Auswahl_Suppen.class);
            startActivity(intent);
        }
        if (v == btn_dessert) {
            Intent intent = new Intent(getApplicationContext(), Auswahl_Dessert.class);
            startActivity(intent);
        }
        if (v == btn_hauptspeisen) {
            Intent intent = new Intent(getApplicationContext(), Auswahl_Hauptspeisen.class);
            startActivity(intent);
        }
    }
}
