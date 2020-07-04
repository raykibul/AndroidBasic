package com.raykibul.androidbasic;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity  {

    Button buttonTutorial,toastButton,editTextButton;
    Button textViewButton,snackBarButton,progressButton;
    ConstraintLayout constraintLayout;
    Button alertButton;
    RadioButton radioButton;

    ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Initialize();

        radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                Toast.makeText(MainActivity.this, "Checked", Toast.LENGTH_SHORT).show();
                 else
                    Toast.makeText(MainActivity.this, "not checked", Toast.LENGTH_SHORT).show();

            }
        });

        alertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             new  AlertDialog.Builder(MainActivity.this).
                     setTitle("Wanring!!")
                     .setMessage("THIS IS AN ALERT")
                     .setCancelable(false)
                     .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                         @Override
                         public void onClick(DialogInterface dialog, int which) {
                             dialog.dismiss();
                         }
                     })
                     .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                         @Override
                         public void onClick(DialogInterface dialog, int which) {
                           dialog.cancel();
                         }
                     })
                     .show();



            }
        });


        progressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
            }
        });

        editTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);

                startActivity(intent);

            }
        });


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

        textViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("INTENT_VALUE","TEXTVIEW");
                startActivity(intent);
            }
        });

      snackBarButton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
          Snackbar snackbar =Snackbar.make(constraintLayout,"THIS IS A SNACK",Snackbar.LENGTH_LONG);
          snackbar.show();
          }
      });
    }


    private  void  Initialize(){
        snackBarButton=findViewById(R.id.snackbarButton);
        buttonTutorial=findViewById(R.id.button_tutorial);
        toastButton =findViewById(R.id.toastButton);
        editTextButton=findViewById(R.id.editTextButton);
        textViewButton=findViewById(R.id.textViewButton);
        constraintLayout=findViewById(R.id.constraintLayout);
        progressButton=findViewById(R.id.progressButton);
        progressBar=findViewById(R.id.progressbar);
        alertButton=findViewById(R.id.alertButton);
        radioButton=findViewById(R.id.radioButton);
    }
}