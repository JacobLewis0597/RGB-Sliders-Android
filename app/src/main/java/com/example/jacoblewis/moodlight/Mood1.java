package com.example.jacoblewis.moodlight;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class Mood1 extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener{

    private TextView txtColor, txtRGB;
    private int red, green, blue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood1);

        txtColor = (TextView) findViewById(R.id.textViewColor);
        txtRGB = (TextView) findViewById(R.id.textViewRGB);

        SeekBar seekBarR = (SeekBar) findViewById(R.id.seekBarR);
        SeekBar seekBarG = (SeekBar) findViewById(R.id.seekBarG);
        SeekBar seekBarB = (SeekBar) findViewById(R.id.seekBarB);

        seekBarR.setOnSeekBarChangeListener(this);
        seekBarG.setOnSeekBarChangeListener(this);
        seekBarB.setOnSeekBarChangeListener(this);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int position, boolean fromUser) {
        int id = seekBar.getId();

        if (id == R.id.seekBarR)
            red = position;
        else if (id == R.id.seekBarG)
            green = position;
        else if (id == R.id.seekBarB)
            blue = position;

        txtRGB.setText("rgb(" + red + "," + green + "," + blue + ")");
        txtColor.setBackgroundColor(Color.rgb(red, green, blue));
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }







