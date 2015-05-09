package com.example.seraycetin.kochkorb;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Bernhard Lechl  on 01.05.2015.
 */
public class Auswahl_Suppen extends MainActivity implements View.OnClickListener {

    private JSONArray suppenarr;
    ArrayList<String> zutatenvonrezept = new ArrayList<String>();
    private ArrayList<String> zutatenListe = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.auswahl_suppen);

        JSONArray test = new JSONArray();

        // Hier kommt ein Zugriff auf unsere Datenbank mit der Anfrage nach einem JSONArr (alle Rezepte), welches in eine ArrayList<String> mit dem Namen "zutatenvonrezept" gespeichert wird - darin sind alle darin benutzten Zutaten enthalten

        zutatenListe = ((Datenbank) this.getApplication()).getSelectedZutaten();

        for(int i = 0; i<test.length();i++){
            // hier werden die einzelnen passenden Rezepte, die mit einem Filter angepasst werden, dynamisch auf der auswahl_vorspeisen.xml seite angezeigt - dies wird in Meilenstein 4 realisiert.
        }

        /////////// Unter diesem Kommentar befindet sich bereits ein Prototyp der Anzeige aller verfuegbaren Rezepte - dies wird in Meilenstein 4 mit der implementierung einer Datenquelle finalisiert. /////////
        /*
        TextView v1 =(TextView) findViewById(R.id.vorspeise1);
        TextView v2 = (TextView) findViewById(R.id.vorspeise2);
        TextView v3 = (TextView) findViewById(R.id.vorspeise3);

        try {
            suppenarr = ((Datenbank) this.getApplication()).get_arr_suppen();

            String text1 = "";
            JSONObject name = suppenarr.getJSONObject(0);
            text1 = (String) name.get("name");
            Log.e("log-Tag",text1);
            v1.setText(text1);
            name = suppenarr.getJSONObject(1);
            text1 = (String) name.get("name");
            v2.setText(text1);
            name = suppenarr.getJSONObject(2);
            text1 = (String) name.get("name");
            v3.setText(text1);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        */

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