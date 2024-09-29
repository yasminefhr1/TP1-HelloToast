package com.fihriYasmine.hellotoast;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int compteur =0;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textView);
        Button btnToast = findViewById(R.id.buttonToast);
        Button btnIncrement = findViewById(R.id.buttonIncrement);
        Button initialiser = findViewById(R.id.initialiser);

        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Hello Toast" ,Toast.LENGTH_LONG).show();
            }
        });

        btnIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compteur++;
                textView.setText(String.valueOf(compteur));
            }
        });

        initialiser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compteur=0;
                textView.setText(String.valueOf(compteur));
            }
        });
    }
}