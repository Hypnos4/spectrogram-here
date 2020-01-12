package net.galmiza.android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import net.galmiza.android.spectrogram.R;


public class ActivityConnexion extends AppCompatActivity {

    private EditText identifiant;
    private EditText password;
    private ImageButton imgbtn;
    private Button login;
    private TextView info;
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion);

        identifiant = (EditText)findViewById(R.id.id);
        password = (EditText)findViewById(R.id.mdp);
        login = (Button)findViewById(R.id.buttonConnect);
        info = (TextView)findViewById(R.id.textView5);
        imgbtn = (ImageButton)findViewById(R.id.imageButtonRetour3);



        info.setText("Tentatives restantes: 5");
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (identifiant.getText().toString().equals("admin") && password.getText().toString().equals("1234")) {
                    Intent intent = new Intent(ActivityConnexion.this, Main2Activity.class);
                    startActivity(intent);
                } else {
                    counter--;

                    info.setText("Tentatives restantes: " + String.valueOf(counter));
                    if (counter == 0) {
                        login.setEnabled(false);
                    }
                }
            }
        });


        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ActivityConnexion.this, Activity_Accueil.class);
                startActivity(i);

            }
        });


    }


}
