package com.example.mypersonalinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Experience extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experience);

        //Add a listener to the button to take you to the temp converter
        Button btnHome1 = (Button) findViewById(R.id.btnHome1);
        btnHome1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goHome();
            }

        });
    }

    private void goHome(){
        Intent intent = new Intent( Experience.this, MainActivity.class);
        this.startActivity(intent);
    }
}