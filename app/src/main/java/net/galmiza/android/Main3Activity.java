package net.galmiza.android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.support.v7.app.AppCompatActivity;

import net.galmiza.android.spectrogram.R;


public class Main3Activity extends AppCompatActivity {

    ImageButton imgbtn;
    ImageButton btnVoyelle;
    ImageButton btnSons;
    ImageButton btnSyllabe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progres);

        imgbtn = (ImageButton)findViewById(R.id.imageButton3);
        btnVoyelle = (ImageButton)findViewById(R.id.imageButtonvoyelle);


        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main3Activity.this, Main2Activity.class);
                startActivity(i);

            }
        });

        btnVoyelle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main3Activity.this, ActivityVoyelles.class);
                startActivity(i);

            }
        });
    }
}
