package net.galmiza.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import net.galmiza.android.spectrogram.R;
import net.galmiza.android.spectrogram.TimeView;

public class ActivityDessiner extends AppCompatActivity {
  TextView textView;
  TimeView timeView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.dessiner);

    textView = (TextView)findViewById(R.id.textview_time_header);
    timeView = (TimeView)findViewById(R.id.time_view);

  }
}