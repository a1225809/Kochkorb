package com.example.seraycetin.kochkorb;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Seray Cetin on 28.04.2015.
 */
public class Test extends MainActivity implements View.OnClickListener{
    private Button btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);

        btn_back = (Button)findViewById(R.id.button);
        btn_back.setOnClickListener(this);
    }

    public void onClick(View v) {
        if(v == btn_back){
            // finish() zeigt, wenn eine Activity abgeschlossen ist
            finish();
        }
    }

}
