package com.fihriyasmine.hellotoast_linearlayout;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        Button buttonToast = findViewById(R.id.buttonToast);
        Button buttonIncrement = findViewById(R.id.buttonIncrement);

        // Afficher un Toast lorsque le bouton Toast est cliqué
        buttonToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Toast button clicked!", Toast.LENGTH_SHORT).show();
            }
        });

        // Incrémenter le compteur et mettre à jour le TextView
        buttonIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                textView.setText(String.valueOf(count));
            }
        });

        Button initialiser = findViewById(R.id.initialiser);

        initialiser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=0;
                textView.setText(String.valueOf(count));
            }
        });
    }
}
