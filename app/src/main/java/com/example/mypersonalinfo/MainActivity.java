package com.example.mypersonalinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Add a listener to the button to take you to the temp converter
        Button btnPresentation = (Button) findViewById(R.id.btnPresentation);
        btnPresentation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goPresentation();
                                               }
                                           }

        );

        Button btnExperience = (Button) findViewById(R.id.btnExperience);
        btnExperience.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
             goExperience();

               }
                     }

        );

        Button btnPicture = (Button) findViewById(R.id.btnPicture);
        btnPicture.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View view) {
                                              goPicture();


                                        }
                                    }

        );
    }
    private void goPresentation() {
        Intent intent = new Intent( MainActivity.this, Presentation.class);
        this.startActivity(intent);
        }
    private void goExperience() {
        Intent intent = new Intent(MainActivity.this, Experience.class);
        this.startActivity(intent);
    }

    private void goPicture(){
        Intent intent = new Intent( MainActivity.this, Picture.class);
        this.startActivity(intent);

       }
}