package com.raykibul.androidbasic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buttonTutorial,toastButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonTutorial=findViewById(R.id.button_tutorial);
        toastButton =findViewById(R.id.toastButton);

        buttonTutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                buttonTutorial.setText("Mutton");

            }
        });

        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this,"Toast Button clicked",Toast.LENGTH_SHORT).show();
            }
        });






    }
}