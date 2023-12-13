package com.example.mypersonalinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Picture extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture);
        //Add a listener to the button to take you to the temp converter
        Button btnHome2 = (Button) findViewById(R.id.btnHome2);
        btnHome2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goHome();
            }

        });
    }

    private void goHome(){
        Intent intent = new Intent( Picture.this, MainActivity.class);
        this.startActivity(intent);
    }
}