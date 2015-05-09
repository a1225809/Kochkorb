package com.example.seraycetin.kochkorb;

import android.app.Application;
import android.os.AsyncTask;
import android.provider.MediaStore;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * Created by Seray Cetin on 29.04.2015.
 */
public class Datenbank extends Application {





    /*String readFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            return sb.toString();
        } finally {
            br.close();
        }
    }*/

    //private String alles_string = readFile("C:\\Users\\USER\\Dropbox\\Projekt Kochkorb\\Meilenstein 3\\rezept.txt");


    private String get_rezept2() throws IOException {
        //String filePath = "C:\\Users\\USER\\Desktop\\rezept.txt";
        File filePath = new File("C:\\Users\\USER\\Dropbox\\Projekt Kochkorb\\Meilenstein 3\\rezept.txt");
        StringBuffer fileData = new StringBuffer();
        BufferedReader reader = new BufferedReader(
                new FileReader(filePath));
        char[] buf = new char[1024];
        int numRead=0;
        while((numRead=reader.read(buf)) != -1){
            String readData = String.valueOf(buf, 0, numRead);
            fileData.append(readData);
        }
        reader.close();
        Log.e("Log-Tag",fileData.toString());
        return fileData.toString();
    }

    /*String get_rezept() throws IOException {
        String alles_string2 = "";
        try {
           alles_string2 = new Scanner(new File("C:\\Users\\USER\\Dropbox\\Projekt Kochkorb\\Meilenstein 3\\rezept.txt")).useDelimiter("\\Z").next();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Log.e("Log-Tag",alles_string2);
        return alles_string2;
    }*/

    JSONArray get_arr_suppen () throws IOException {
        JSONArray arr = null;
        JSONObject alles = null;

        try {
            alles = new JSONObject(get_rezept2());
            JSONArray arr2 =(JSONArray) alles.get("vorspeisen");
            return arr2;

        } catch (JSONException e) {
            e.printStackTrace();
        }


        return arr;
    }
    JSONArray get_arr_hauptspeisen () throws IOException {
        JSONArray arr = null;
        JSONObject alles = null;

        try {
            alles = new JSONObject(get_rezept2());
            JSONArray arr2 =(JSONArray) alles.get("hauptspeisen");
            return arr2;

        } catch (JSONException e) {
            e.printStackTrace();
        }


        return arr;
    }

    JSONArray get_arr_dessert () throws IOException {
        JSONArray arr = null;
        JSONObject alles = null;

        try {
            alles = new JSONObject(get_rezept2());
            JSONArray arr2 =(JSONArray) alles.get("dessert");
            return arr2;

        } catch (JSONException e) {
            e.printStackTrace();
        }


        return arr;
    }




    //new Datenbank.JSONParse().execute();
    private ArrayList<String> selectedZutaten = new ArrayList<String>();
    private ArrayList<Rezept> rezeptListe = new ArrayList<Rezept>();

    public ArrayList<Rezept> filterByZutaten(){
        return rezeptListe;
    }

    public ArrayList<String> getSelectedZutaten() {
        return selectedZutaten;
    }

    public void setSelectedZutaten(ArrayList<String> selectedZutaten) {
        this.selectedZutaten = selectedZutaten;
    }


    /*private class JSONParse extends AsyncTask<String,String,JSONObject>{

        @Override
        protected JSONObject doInBackground(String... params) {
            String response = null;
            try {
                response = get_rezept();
            } catch (IOException e) {
                e.printStackTrace();
            }
            JSONObject obj = null;
            try {
                obj = new JSONObject(response);
            } catch (JSONException e) {
                e.printStackTrace();
                Log.e("LogTag","Das JSONObject wird nicht erstellt!");
            }
            try {
                alles_json=obj.getJSONObject("kochkorb");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if(obj != null) return obj;
            Log.e("LogTag","obj ist NULL");


            return obj;

        }

    }*/

}
