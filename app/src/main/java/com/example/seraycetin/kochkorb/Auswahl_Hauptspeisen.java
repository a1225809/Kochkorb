package com.example.seraycetin.kochkorb;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import org.json.JSONArray;

import java.util.ArrayList;

/**
 * Created by Bernhard Lechl  on 01.05.2015.
 */
public class Auswahl_Hauptspeisen extends MainActivity implements View.OnClickListener {

    ArrayList<String> zutatenvonrezept = new ArrayList<String>();
    private ArrayList<String> zutatenListe = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.auswahl_hauptspeisen);

        JSONArray test = new JSONArray();

        // Hier kommt ein Zugriff auf unsere Datenbank mit der Anfrage nach einem JSONArr (alle Rezepte), welches in eine ArrayList<String> mit dem Namen "zutatenvonrezept" gespeichert wird - darin sind alle darin benutzten Zutaten enthalten

        zutatenListe = ((Datenbank) this.getApplication()).getSelectedZutaten();

        for(int i = 0; i<test.length();i++){
            // hier werden die einzelnen passenden Rezepte, die mit einem Filter angepasst werden, dynamisch auf der auswahl_vorspeisen.xml seite angezeigt - dies wird in Meilenstein 4 realisiert.
        }

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
        /*if (v == btn_back) {
            finish();
        }
    */

    }
}