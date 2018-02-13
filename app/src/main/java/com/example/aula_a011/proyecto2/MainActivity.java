package com.example.aula_a011.proyecto2;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String url1 = "http://www.programadoresperuanos.com/test_app/imagen1.jpg";
        String url2 = "http://www.programadoresperuanos.com/test_app/imagen2.jpg";
        ImageView cuadro1 = findViewById(R.id.imageView);
        ImageView cuadro2 = findViewById(R.id.imageView2);
        Context c = getApplicationContext();
        Picasso.with(c).load(url1).into(cuadro1);
        Picasso.with(c).load(url2).into(cuadro2);
    }
}
