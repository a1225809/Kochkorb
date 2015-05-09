package com.example.seraycetin.kochkorb;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Seray Cetin on 29.04.2015.
 */
public class Obst extends MainActivity implements View.OnClickListener {

    private Button btn_back;
    private Button btn_weiter;

    private Datenbank db = new Datenbank();
    private ArrayList<String> zutatenListe = db.getSelectedZutaten();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.obst);

        btn_back = (Button)findViewById(R.id.button_auswahl);
        btn_weiter = (Button)findViewById(R.id.button_weiter);

        btn_back.setOnClickListener(this);
        btn_weiter.setOnClickListener(this);

        zutatenListe = ((Datenbank) this.getApplication()).getSelectedZutaten();

        CheckBox cb1 = (CheckBox)findViewById(R.id.checkBox1);
        CheckBox cb2 = (CheckBox)findViewById(R.id.checkBox2);
        CheckBox cb3 = (CheckBox)findViewById(R.id.checkBox3);
        CheckBox cb4 = (CheckBox)findViewById(R.id.checkBox4);
        CheckBox cb5 = (CheckBox)findViewById(R.id.checkBox5);
        CheckBox cb6 = (CheckBox)findViewById(R.id.checkBox6);
        CheckBox cb7 = (CheckBox)findViewById(R.id.checkBox7);

        if(zutatenListe.contains(cb1.getText().toString())) cb1.setChecked(true);
        if(zutatenListe.contains(cb2.getText().toString())) cb2.setChecked(true);
        if(zutatenListe.contains(cb3.getText().toString())) cb3.setChecked(true);
        if(zutatenListe.contains(cb4.getText().toString())) cb4.setChecked(true);
        if(zutatenListe.contains(cb5.getText().toString())) cb5.setChecked(true);
        if(zutatenListe.contains(cb6.getText().toString())) cb6.setChecked(true);
        if(zutatenListe.contains(cb7.getText().toString())) cb7.setChecked(true);
    }

    public void onClick(View v) {
        if(v == btn_back){
            onClickCheckbox(v);
            zutatenListe = ((Datenbank) this.getApplication()).getSelectedZutaten();

            CheckBox cb1 = (CheckBox)findViewById(R.id.checkBox1);
            CheckBox cb2 = (CheckBox)findViewById(R.id.checkBox2);
            CheckBox cb3 = (CheckBox)findViewById(R.id.checkBox3);
            CheckBox cb4 = (CheckBox)findViewById(R.id.checkBox4);
            CheckBox cb5 = (CheckBox)findViewById(R.id.checkBox5);
            CheckBox cb6 = (CheckBox)findViewById(R.id.checkBox6);
            CheckBox cb7 = (CheckBox)findViewById(R.id.checkBox7);

            if(cb1.isChecked()){
                if(!zutatenListe.contains(cb1.getText().toString())) {
                    zutatenListe.add(cb1.getText().toString());
                    ((Datenbank) this.getApplication()).setSelectedZutaten(zutatenListe);
                    zutatenListe = ((Datenbank) this.getApplication()).getSelectedZutaten();
                }
            }
            else{
                if(zutatenListe.contains(cb1.getText().toString())) {
                    zutatenListe.remove(cb1.getText().toString());
                    ((Datenbank) this.getApplication()).setSelectedZutaten(zutatenListe);
                    zutatenListe = ((Datenbank) this.getApplication()).getSelectedZutaten();
                }
            }
            if(cb2.isChecked()){
                if(!zutatenListe.contains(cb2.getText().toString())) {
                    zutatenListe.add(cb2.getText().toString());
                    ((Datenbank) this.getApplication()).setSelectedZutaten(zutatenListe);
                    zutatenListe = ((Datenbank) this.getApplication()).getSelectedZutaten();
                }
            }
            else{
                if(zutatenListe.contains(cb2.getText().toString())) {
                    zutatenListe.remove(cb2.getText().toString());
                    ((Datenbank) this.getApplication()).setSelectedZutaten(zutatenListe);
                    zutatenListe = ((Datenbank) this.getApplication()).getSelectedZutaten();
                }
            }
            if(cb3.isChecked()){
                if(!zutatenListe.contains(cb3.getText().toString())) {
                    zutatenListe.add(cb3.getText().toString());
                    ((Datenbank) this.getApplication()).setSelectedZutaten(zutatenListe);
                    zutatenListe = ((Datenbank) this.getApplication()).getSelectedZutaten();
                }
            }
            else{
                if(zutatenListe.contains(cb3.getText().toString())) {
                    zutatenListe.remove(cb3.getText().toString());
                    ((Datenbank) this.getApplication()).setSelectedZutaten(zutatenListe);
                    zutatenListe = ((Datenbank) this.getApplication()).getSelectedZutaten();
                }
            }
            if(cb4.isChecked()){
                if(!zutatenListe.contains(cb4.getText().toString())) {
                    zutatenListe.add(cb4.getText().toString());
                    ((Datenbank) this.getApplication()).setSelectedZutaten(zutatenListe);
                    zutatenListe = ((Datenbank) this.getApplication()).getSelectedZutaten();
                }
            }
            else{
                if(zutatenListe.contains(cb4.getText().toString())) {
                    zutatenListe.remove(cb4.getText().toString());
                    ((Datenbank) this.getApplication()).setSelectedZutaten(zutatenListe);
                    zutatenListe = ((Datenbank) this.getApplication()).getSelectedZutaten();
                }
            }
            if(cb5.isChecked()){
                if(!zutatenListe.contains(cb5.getText().toString())) {
                    zutatenListe.add(cb5.getText().toString());
                    ((Datenbank) this.getApplication()).setSelectedZutaten(zutatenListe);
                    zutatenListe = ((Datenbank) this.getApplication()).getSelectedZutaten();
                }
            }
            else{
                if(zutatenListe.contains(cb5.getText().toString())) {
                    zutatenListe.remove(cb5.getText().toString());
                    ((Datenbank) this.getApplication()).setSelectedZutaten(zutatenListe);
                    zutatenListe = ((Datenbank) this.getApplication()).getSelectedZutaten();
                }
            }
            if(cb6.isChecked()){
                if(!zutatenListe.contains(cb6.getText().toString())) {
                    zutatenListe.add(cb6.getText().toString());
                    ((Datenbank) this.getApplication()).setSelectedZutaten(zutatenListe);
                    zutatenListe = ((Datenbank) this.getApplication()).getSelectedZutaten();
                }
            }
            else{
                if(zutatenListe.contains(cb6.getText().toString())) {
                    zutatenListe.remove(cb6.getText().toString());
                    ((Datenbank) this.getApplication()).setSelectedZutaten(zutatenListe);
                    zutatenListe = ((Datenbank) this.getApplication()).getSelectedZutaten();
                }
            }
            if(cb7.isChecked()){
                if(!zutatenListe.contains(cb7.getText().toString())) {
                    zutatenListe.add(cb7.getText().toString());
                    ((Datenbank) this.getApplication()).setSelectedZutaten(zutatenListe);
                    zutatenListe = ((Datenbank) this.getApplication()).getSelectedZutaten();
                }
            }
            else{
                if(zutatenListe.contains(cb7.getText().toString())) {
                    zutatenListe.remove(cb7.getText().toString());
                    ((Datenbank) this.getApplication()).setSelectedZutaten(zutatenListe);
                    zutatenListe = ((Datenbank) this.getApplication()).getSelectedZutaten();
                }
            }
            finish();
        }
        if(v == btn_weiter){
            Intent intent = new Intent(getApplicationContext(), Auswahl.class);
            startActivity(intent);
        }
    }

    public void onClickCheckbox(View v){

    }

}
