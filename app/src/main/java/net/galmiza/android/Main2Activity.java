package net.galmiza.android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import net.galmiza.android.spectrogram.R;


public class Main2Activity extends AppCompatActivity {

    ImageButton imgbtn;
    Button btnProgres;
    Button btnDessiner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.choix);
        imgbtn = (ImageButton)findViewById(R.id.imageButtonR);
        btnProgres = (Button)findViewById(R.id.buttonVoirProgres);
        btnDessiner = (Button)findViewById(R.id.buttonDessiner);

        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main2Activity.this, Activity_Accueil.class);
                startActivity(i);

            }
        });

        btnProgres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(i);

            }
        });

        btnDessiner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main2Activity.this, ActivityDessiner.class);
                startActivity(i);

            }
        });
    }
}
