package com.example.ejercicio2;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageButton image1,image2,image3,image4,image5,image6,image7,image8,image9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image1 = findViewById(R.id.imagen1);
        image2 = findViewById(R.id.imagen2);
        image3 = findViewById(R.id.imagen3);
        image4 = findViewById(R.id.imagen4);
        image5 = findViewById(R.id.imagen5);
        image6 = findViewById(R.id.imagen6);
        image7 = findViewById(R.id.imagen7);
        image8 = findViewById(R.id.imagen8);
        image9 = findViewById(R.id.imagen9);

        image1.setOnClickListener(this);
        image2.setOnClickListener(this);
        image3.setOnClickListener(this);
        image4.setOnClickListener(this);
        image5.setOnClickListener(this);
        image6.setOnClickListener(this);
        image7.setOnClickListener(this);
        image8.setOnClickListener(this);
        image9.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        int[] ListaImages = {R.drawable.icon,R.drawable.icon2,R.drawable.icon3,R.drawable.icon4,R.drawable.icon5};

        switch (v.getId()){
            case R.id.imagen1:
                image1.setImageDrawable(getResources().getDrawable(ListaImages[(int)Math.floor(Math.random()*4)]));
                break;
            case R.id.imagen2:
                image2.setImageDrawable(getResources().getDrawable(ListaImages[(int)Math.floor(Math.random()*4)]));
                break;
            case R.id.imagen3:
                image3.setImageDrawable(getResources().getDrawable(ListaImages[(int)Math.floor(Math.random()*4)]));
                break;
            case R.id.imagen4:
                image4.setImageDrawable(getResources().getDrawable(ListaImages[(int)Math.floor(Math.random()*4)]));
                break;
            case R.id.imagen5:
                image5.setImageDrawable(getResources().getDrawable(ListaImages[(int)Math.floor(Math.random()*4)]));
                break;
            case R.id.imagen6:
                image6.setImageDrawable(getResources().getDrawable(ListaImages[(int)Math.floor(Math.random()*4)]));
                break;
            case R.id.imagen7:
                image7.setImageDrawable(getResources().getDrawable(ListaImages[(int)Math.floor(Math.random()*4)]));
                break;
            case R.id.imagen8:
                image8.setImageDrawable(getResources().getDrawable(ListaImages[(int)Math.floor(Math.random()*4)]));
                break;
            case R.id.imagen9:
                image9.setImageDrawable(getResources().getDrawable(ListaImages[(int)Math.floor(Math.random()*4)]));
                break;
        }

    }
}
