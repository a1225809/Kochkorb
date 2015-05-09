package com.example.seraycetin.kochkorb;

import java.util.ArrayList;

/**
 * Created by Seray Cetin on 29.04.2015.
 */
public class Rezept {
    private String name;
    private int id;
    private double zeit;
    private String zubereitung;
    private ArrayList<String> zutaten = new ArrayList<>();
    private int bewertung;

    public Rezept(String name, int id, double zeit, String zubereitung, ArrayList<String> zutaten, int bewertung) {
        this.name = name;
        this.id = id;
        this.zeit = zeit;
        this.zubereitung = zubereitung;
        this.zutaten = zutaten;
        this.bewertung = bewertung;
    }

    // Getter and Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getZeit() {
        return zeit;
    }

    public void setZeit(double zeit) {
        this.zeit = zeit;
    }

    public String getZubereitung() {
        return zubereitung;
    }

    public void setZubereitung(String zubereitung) {
        this.zubereitung = zubereitung;
    }

    public ArrayList<String> getZutaten() {
        return zutaten;
    }

    public void setZutaten(ArrayList<String> zutaten) {
        this.zutaten = zutaten;
    }

    public int getBewertung() {
        return bewertung;
    }

    public void setBewertung(int bewertung) {
        this.bewertung = bewertung;
    }
}
