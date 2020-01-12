package net.galmiza.android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import net.galmiza.android.spectrogram.R;


public class ActivityVoyelles extends AppCompatActivity {

    ImageButton imgbtnRetour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voyelles);

        imgbtnRetour = (ImageButton)findViewById(R.id.imageButton6);

        imgbtnRetour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ActivityVoyelles.this, Main3Activity.class);
                startActivity(i);

            }
        });
    }
}
