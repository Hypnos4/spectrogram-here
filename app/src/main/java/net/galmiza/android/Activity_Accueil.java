package net.galmiza.android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import net.galmiza.android.spectrogram.R;

public class Activity_Accueil extends AppCompatActivity {

    Button btn;
    Button btn2;
    Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn = (Button)findViewById(R.id.button2);
        btn2 = (Button)findViewById(R.id.buttonModeFamille);
        btn3 = (Button)findViewById(R.id.buttonInvite);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activity_Accueil.this, ActivityDessiner.class);
                startActivity(i);

            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activity_Accueil.this, ActivityConnexion.class);
                startActivity(i);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activity_Accueil.this,ActivityConnexion.class);
                startActivity(i);

            }
        });


    }
}
