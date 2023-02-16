package com.example.sudoku69;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartingMenu extends AppCompatActivity {


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting_menu);

        Button b1 = findViewById(R.id.buton);
        Button b2 = findViewById(R.id.midbut);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Activity1();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Activity2();
            }
        });
    }






    public void Activity1(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

    public void Activity2(){
        Intent intent = new Intent(this, MediumDIff.class);
        startActivity(intent);

    }

}