package com.example.seraycetin.kochkorb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    private Button btn_obst;
    private Button btn_gemuese;
    private Button btn_fleisch;
    private Button btn_teigwaren;
    private Button btn_auswahl;
    //private Datenbank db = new Datenbank();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_obst = (Button)findViewById(R.id.button_obst);
        btn_gemuese = (Button)findViewById(R.id.button_gemuese);
        btn_fleisch = (Button) findViewById(R.id.button_fleisch);
        btn_teigwaren = (Button) findViewById(R.id.button_teigwaren);
        btn_auswahl = (Button) findViewById(R.id.button_auswahl);


        btn_obst.setOnClickListener(this);
        btn_gemuese.setOnClickListener(this);
        btn_fleisch.setOnClickListener(this);
        btn_teigwaren.setOnClickListener(this);
        btn_auswahl.setOnClickListener(this);

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
        if (v == btn_obst) {
            Intent intent= new Intent(getApplicationContext(), Obst.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(intent);
        }
        if (v == btn_gemuese) {
            Intent intent = new Intent(getApplicationContext(), Gemuese.class);
            startActivity(intent);
        }
        if (v == btn_fleisch) {
            Intent intent = new Intent(getApplicationContext(), Fleisch.class);
            startActivity(intent);
        }
        if (v == btn_teigwaren) {
            Intent intent = new Intent(getApplicationContext(), Teigwaren.class);
            startActivity(intent);
        }
        if (v == btn_auswahl) {
            Intent intent = new Intent(getApplicationContext(), Auswahl.class);
            startActivity(intent);
        }
    }
}
