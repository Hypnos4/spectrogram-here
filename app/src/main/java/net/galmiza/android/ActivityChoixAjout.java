package net.galmiza.android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import net.galmiza.android.spectrogram.R;

public class ActivityChoixAjout extends AppCompatActivity {

    ImageButton imgbtnR , imgbtnA;
    Button btnProgres;
    Button btnDessiner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix_ajout);

        imgbtnR = (ImageButton)findViewById(R.id.imageButtonR);
        imgbtnA = (ImageButton)findViewById(R.id.imageButtonAjout);
        btnProgres = (Button)findViewById(R.id.buttonVoirProgres);
        btnDessiner = (Button)findViewById(R.id.buttonDessiner);

        imgbtnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ActivityChoixAjout.this, Activity_Accueil.class);
                startActivity(i);

            }
        });

        btnProgres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ActivityChoixAjout.this, Main3Activity.class);
                startActivity(i);

            }
        });

        btnDessiner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ActivityChoixAjout.this, ActivityDessiner.class);
                startActivity(i);

            }
        });
    }
}
