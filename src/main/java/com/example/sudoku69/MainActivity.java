package com.example.sudoku69;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.graphics.Color;

import com.example.sudoku69.R.color;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    Switch switcher;
    boolean nightMODE;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    TextView timer;
    TextView cheker;




    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timer = findViewById(R.id.timer);
        cheker = findViewById(R.id.Cheker);

        new CountDownTimer(120000, 1000){
            @Override
            public  void onTick(long millisUnitFinished){

                int minutes = (int) (millisUnitFinished / 1000) / 60;
                int seconds = (int) (millisUnitFinished / 1000) % 60;

                String timeleft = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);

                timer.setText("Time left: " + timeleft);


            }

            @Override
            public void onFinish(){

                timer.setText("Time is over!!");
                cheker.setText("You lost\uD83D\uDE14");
            }
        }.start();




        switcher = findViewById(R.id.switch2);
        sharedPreferences = getSharedPreferences("MODE", Context.MODE_PRIVATE);
        nightMODE = sharedPreferences.getBoolean("night", false);



        if(nightMODE){
            switcher.setChecked(true);
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        }

        switcher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nightMODE){
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                    editor = sharedPreferences.edit();
                    editor.putBoolean("night", false);

                }
                else{
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                    editor = sharedPreferences.edit();
                    editor.putBoolean("night", true);

                }
                editor.apply();
            }
        });



        Button reset = findViewById(R.id.restart);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recreate();
            }
        });




        Button b1 = findViewById(R.id.button122);
        Button b2 = findViewById(R.id.button123);
        Button b3 = findViewById(R.id.button124);
        Button b4 = findViewById(R.id.button125);
        Button b5 = findViewById(R.id.button126);
        Button b6 = findViewById(R.id.button127);
        Button b7 = findViewById(R.id.button128);
        Button b8 = findViewById(R.id.button129);
        Button b9 = findViewById(R.id.button130);

        Button b010 = findViewById(R.id.button134);
        Button b011 = findViewById(R.id.button144);
        Button b012 = findViewById(R.id.button168);
        Button b013 = findViewById(R.id.button175);
        Button b014 = findViewById(R.id.button176);
        Button b015 = findViewById(R.id.button177);
        Button b016 = findViewById(R.id.button178);
        Button b017 = findViewById(R.id.button179);
        Button b018 = findViewById(R.id.button145);

        Button b019 = findViewById(R.id.button135);
        Button b020 = findViewById(R.id.button162);
        Button b021 = findViewById(R.id.button169);
        Button b022 = findViewById(R.id.button180);
        Button b023 = findViewById(R.id.button181);
        Button b024 = findViewById(R.id.button182);
        Button b025 = findViewById(R.id.button183);
        Button b026 = findViewById(R.id.button184);
        Button b027 = findViewById(R.id.button146);

        Button b028 = findViewById(R.id.button136);
        Button b029 = findViewById(R.id.button163);
        Button b030 = findViewById(R.id.button170);
        Button b031 = findViewById(R.id.button185);
        Button b032 = findViewById(R.id.button186);
        Button b033 = findViewById(R.id.button187);
        Button b034 = findViewById(R.id.button188);
        Button b035 = findViewById(R.id.button189);
        Button b036 = findViewById(R.id.button147);

        Button b037 = findViewById(R.id.button137);
        Button b038 = findViewById(R.id.button164);
        Button b039 = findViewById(R.id.button171);
        Button b040 = findViewById(R.id.button190);
        Button b041 = findViewById(R.id.button191);
        Button b042 = findViewById(R.id.button192);
        Button b043 = findViewById(R.id.button193);
        Button b044 = findViewById(R.id.button194);
        Button b045 = findViewById(R.id.button148);

        Button b046 = findViewById(R.id.button138);
        Button b047 = findViewById(R.id.button165);
        Button b048 = findViewById(R.id.button172);
        Button b049 = findViewById(R.id.button195);
        Button b050 = findViewById(R.id.button196);
        Button b051 = findViewById(R.id.button201);
        Button b052 = findViewById(R.id.button202);
        Button b053 = findViewById(R.id.button203);
        Button b054 = findViewById(R.id.button149);

        Button b055 = findViewById(R.id.button139);
        Button b056 = findViewById(R.id.button166);
        Button b057 = findViewById(R.id.button173);
        Button b058 = findViewById(R.id.button197);
        Button b059 = findViewById(R.id.button198);
        Button b060 = findViewById(R.id.button204);
        Button b061 = findViewById(R.id.button206);
        Button b062 = findViewById(R.id.button207);
        Button b063 = findViewById(R.id.button150);

        Button b064 = findViewById(R.id.button140);
        Button b065 = findViewById(R.id.button167);
        Button b066 = findViewById(R.id.button174);
        Button b067 = findViewById(R.id.button199);
        Button b068 = findViewById(R.id.button200);
        Button b069 = findViewById(R.id.button205);
        Button b070 = findViewById(R.id.button208);
        Button b071 = findViewById(R.id.button209);
        Button b072 = findViewById(R.id.button151);

        Button b073 = findViewById(R.id.button142);
        Button b074 = findViewById(R.id.button153);
        Button b075 = findViewById(R.id.button154);
        Button b076 = findViewById(R.id.button155);
        Button b077 = findViewById(R.id.button156);
        Button b078 = findViewById(R.id.button157);
        Button b079 = findViewById(R.id.button158);
        Button b080 = findViewById(R.id.button159);
        Button b081 = findViewById(R.id.button152);



        //Butonite za vyvejdane
        Button button1 = (Button) findViewById(R.id.oneButton);
        String buttonTextFor1 = button1.getText().toString();

        Button button2 = (Button) findViewById(R.id.twoButton);
        String buttonTextFor2 = button2.getText().toString();

        Button button3 = (Button) findViewById(R.id.threeButton);
        String buttonTextFor3 = button3.getText().toString();

        Button button4 = (Button) findViewById(R.id.fourButton);
        String buttonTextFor4 = button4.getText().toString();

        Button button5 = (Button) findViewById(R.id.fiveButton);
        String buttonTextFor5 = button5.getText().toString();

        Button button6 = (Button) findViewById(R.id.sixButton);
        String buttonTextFor6 = button6.getText().toString();

        Button button7 = (Button) findViewById(R.id.sevenButton);
        String buttonTextFor7 = button7.getText().toString();

        Button button8 = (Button) findViewById(R.id.eightButton);
        String buttonTextFor8 = button8.getText().toString();

        Button button9 = (Button) findViewById(R.id.nineButton);
        String buttonTextFor9 = button9.getText().toString();

        Button bdelete = (Button) findViewById(R.id.deleteButton2);



        Button hint = (Button) findViewById(R.id.hint);

        final int[] counter = {0};

        hint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(counter[0] == 0){
                    b046.setText("8");
                    b046.setTextColor(getApplication().getResources().getColor(color.teal_200));
                    counter[0]++;
                }
                else if(counter[0] == 1){
                    b011.setText("9");
                    b011.setTextColor(Color.rgb(0, 160, 0));
                    counter[0]++;

                }
                else if(counter[0] == 2){
                    b044.setText("8");
                    b044.setTextColor(getApplication().getResources().getColor(color.teal_200));
                    counter[0]++;
                }
            }
        });


        Button done = (Button) findViewById(R.id.done);




        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b011.getText() != "9" || b015.getText() != "2" || b025.getText() != "2" || b046.getText() != "8" || b040.getText() != "5" || b044.getText() != "8" || b065.getText() != "6" || b060.getText() != "8" || b063.getText() != "5"){
                    cheker.setText("Wrong");
                    cheker.setTextColor(Color.RED);
                }
                else{
                    cheker.setText("Correct\uD83D\uDC4D");
                    cheker.setTextColor(Color.GREEN);
                }
            }
        });




        b1.setOnClickListener(v02 -> {

            b1.clearComposingText();
            b1.getText();
            button1.setOnClickListener(v12 -> b1.setText("1"));
            button2.setOnClickListener(v13 -> b1.setText("2"));
            button3.setOnClickListener(v14 -> b1.setText("3"));
            button4.setOnClickListener(v15 -> b1.setText("4"));
            button5.setOnClickListener(v16 -> b1.setText("5"));
            button6.setOnClickListener(v17 -> b1.setText("6"));
            button7.setOnClickListener(v18 -> b1.setText("7"));
            button8.setOnClickListener(v19 -> b1.setText("8"));
            button9.setOnClickListener(v20 -> b1.setText("9"));
            bdelete.setOnClickListener(v21 -> b1.setText(" "));



        });


        b2.setOnClickListener(v02 -> {

            b2.clearComposingText();
            b2.getText();
            button1.setOnClickListener(v12 -> b2.setText("1"));
            button2.setOnClickListener(v13 -> b2.setText("2"));
            button3.setOnClickListener(v14 -> b2.setText("3"));
            button4.setOnClickListener(v15 -> b2.setText("4"));
            button5.setOnClickListener(v16 -> b2.setText("5"));
            button6.setOnClickListener(v17 -> b2.setText("6"));
            button7.setOnClickListener(v18 -> b2.setText("7"));
            button8.setOnClickListener(v19 -> b2.setText("8"));
            button9.setOnClickListener(v20 -> b2.setText("9"));
            bdelete.setOnClickListener(v21 -> b2.setText(" "));



        });

        b3.setOnClickListener(v02 -> {
            Toast toast = Toast.makeText(this, "Already filled", Toast.LENGTH_LONG);
            if(!b3.getText().toString().equals(" ")){
                toast.show();
            }
            else{
                b3.clearComposingText();
                b3.getText();
                button1.setOnClickListener(v12 -> b3.setText("1"));
                button2.setOnClickListener(v13 -> b3.setText("2"));
                button3.setOnClickListener(v14 -> b3.setText("3"));
                button4.setOnClickListener(v15 -> b3.setText("4"));
                button5.setOnClickListener(v16 -> b3.setText("5"));
                button6.setOnClickListener(v17 -> b3.setText("6"));
                button7.setOnClickListener(v18 -> b3.setText("7"));
                button8.setOnClickListener(v19 -> b3.setText("8"));
                button9.setOnClickListener(v20 -> b3.setText("9"));
                bdelete.setOnClickListener(v21 -> b3.setText(" "));
            }


        });

        b4.setOnClickListener(v02 -> {

            b4.clearComposingText();
            b4.getText();
            button1.setOnClickListener(v12 -> b4.setText("1"));
            button2.setOnClickListener(v13 -> b4.setText("2"));
            button3.setOnClickListener(v14 -> b4.setText("3"));
            button4.setOnClickListener(v15 -> b4.setText("4"));
            button5.setOnClickListener(v16 -> b4.setText("5"));
            button6.setOnClickListener(v17 -> b4.setText("6"));
            button7.setOnClickListener(v18 -> b4.setText("7"));
            button8.setOnClickListener(v19 -> b4.setText("8"));
            button9.setOnClickListener(v20 -> b4.setText("9"));
            bdelete.setOnClickListener(v21 -> b4.setText(" "));



        });

        b5.setOnClickListener(v02 -> {

            b5.clearComposingText();
            b5.getText();
            button1.setOnClickListener(v12 -> b5.setText("1"));
            button2.setOnClickListener(v13 -> b5.setText("2"));
            button3.setOnClickListener(v14 -> b5.setText("3"));
            button4.setOnClickListener(v15 -> b5.setText("4"));
            button5.setOnClickListener(v16 -> b5.setText("5"));
            button6.setOnClickListener(v17 -> b5.setText("6"));
            button7.setOnClickListener(v18 -> b5.setText("7"));
            button8.setOnClickListener(v19 -> b5.setText("8"));
            button9.setOnClickListener(v20 -> b5.setText("9"));
            bdelete.setOnClickListener(v21 -> b5.setText(" "));



        });

        b6.setOnClickListener(v02 -> {

            b6.clearComposingText();
            b6.getText();
            button1.setOnClickListener(v12 -> b6.setText("1"));
            button2.setOnClickListener(v13 -> b6.setText("2"));
            button3.setOnClickListener(v14 -> b6.setText("3"));
            button4.setOnClickListener(v15 -> b6.setText("4"));
            button5.setOnClickListener(v16 -> b6.setText("5"));
            button6.setOnClickListener(v17 -> b6.setText("6"));
            button7.setOnClickListener(v18 -> b6.setText("7"));
            button8.setOnClickListener(v19 -> b6.setText("8"));
            button9.setOnClickListener(v20 -> b6.setText("9"));
            bdelete.setOnClickListener(v21 -> b6.setText(" "));



        });

        b7.setOnClickListener(v02 -> {
            Toast toast = Toast.makeText(this, "Already filled", Toast.LENGTH_LONG);
            if(!b7.getText().toString().equals(" ")){
                toast.show();
            }
            else{
                b7.clearComposingText();
                b7.getText();
                button1.setOnClickListener(v12 -> b7.setText("1"));
                button2.setOnClickListener(v13 -> b7.setText("2"));
                button3.setOnClickListener(v14 -> b7.setText("3"));
                button4.setOnClickListener(v15 -> b7.setText("4"));
                button5.setOnClickListener(v16 -> b7.setText("5"));
                button6.setOnClickListener(v17 -> b7.setText("6"));
                button7.setOnClickListener(v18 -> b7.setText("7"));
                button8.setOnClickListener(v19 -> b7.setText("8"));
                button9.setOnClickListener(v20 -> b7.setText("9"));
                bdelete.setOnClickListener(v21 -> b7.setText(" "));
            }


        });

        b8.setOnClickListener(v02 -> {

            b8.clearComposingText();
            b8.getText();
            button1.setOnClickListener(v12 -> b8.setText("1"));
            button2.setOnClickListener(v13 -> b8.setText("2"));
            button3.setOnClickListener(v14 -> b8.setText("3"));
            button4.setOnClickListener(v15 -> b8.setText("4"));
            button5.setOnClickListener(v16 -> b8.setText("5"));
            button6.setOnClickListener(v17 -> b8.setText("6"));
            button7.setOnClickListener(v18 -> b8.setText("7"));
            button8.setOnClickListener(v19 -> b8.setText("8"));
            button9.setOnClickListener(v20 -> b8.setText("9"));
            bdelete.setOnClickListener(v21 -> b8.setText(" "));



        });

        b9.setOnClickListener(v02 -> {

            b9.clearComposingText();
            b9.getText();
            button1.setOnClickListener(v12 -> b9.setText("1"));
            button2.setOnClickListener(v13 -> b9.setText("2"));
            button3.setOnClickListener(v14 -> b9.setText("3"));
            button4.setOnClickListener(v15 -> b9.setText("4"));
            button5.setOnClickListener(v16 -> b9.setText("5"));
            button6.setOnClickListener(v17 -> b9.setText("6"));
            button7.setOnClickListener(v18 -> b9.setText("7"));
            button8.setOnClickListener(v19 -> b9.setText("8"));
            button9.setOnClickListener(v20 -> b9.setText("9"));
            bdelete.setOnClickListener(v21 -> b9.setText(" "));



        });

        b010.setOnClickListener(v02 -> {

            b010.clearComposingText();
            b010.getText();
            button1.setOnClickListener(v12 -> b010.setText("1"));
            button2.setOnClickListener(v13 -> b010.setText("2"));
            button3.setOnClickListener(v14 -> b010.setText("3"));
            button4.setOnClickListener(v15 -> b010.setText("4"));
            button5.setOnClickListener(v16 -> b010.setText("5"));
            button6.setOnClickListener(v17 -> b010.setText("6"));
            button7.setOnClickListener(v18 -> b010.setText("7"));
            button8.setOnClickListener(v19 -> b010.setText("8"));
            button9.setOnClickListener(v20 -> b010.setText("9"));
            bdelete.setOnClickListener(v21 -> b010.setText(" "));



        });

        b011.setOnClickListener(v02 -> {

            b011.clearComposingText();
            b011.getText();
            button1.setOnClickListener(v12 -> b011.setText("1"));
            button2.setOnClickListener(v13 -> b011.setText("2"));
            button3.setOnClickListener(v14 -> b011.setText("3"));
            button4.setOnClickListener(v15 -> b011.setText("4"));
            button5.setOnClickListener(v16 -> b011.setText("5"));
            button6.setOnClickListener(v17 -> b011.setText("6"));
            button7.setOnClickListener(v18 -> b011.setText("7"));
            button8.setOnClickListener(v19 -> b011.setText("8"));
            button9.setOnClickListener(v20 -> b011.setText("9"));
            bdelete.setOnClickListener(v21 -> b011.setText(" "));



        });

        b012.setOnClickListener(v02 -> {

            b012.clearComposingText();
            b012.getText();
            button1.setOnClickListener(v12 -> b012.setText("1"));
            button2.setOnClickListener(v13 -> b012.setText("2"));
            button3.setOnClickListener(v14 -> b012.setText("3"));
            button4.setOnClickListener(v15 -> b012.setText("4"));
            button5.setOnClickListener(v16 -> b012.setText("5"));
            button6.setOnClickListener(v17 -> b012.setText("6"));
            button7.setOnClickListener(v18 -> b012.setText("7"));
            button8.setOnClickListener(v19 -> b012.setText("8"));
            button9.setOnClickListener(v20 -> b012.setText("9"));
            bdelete.setOnClickListener(v21 -> b012.setText(" "));



        });

        b013.setOnClickListener(v02 -> {
            Toast toast = Toast.makeText(this, "Already filled", Toast.LENGTH_LONG);
            if(!b013.getText().toString().equals(" ")){
                toast.show();
            }
            else{
                b013.clearComposingText();
                b013.getText();
                button1.setOnClickListener(v12 -> b013.setText("1"));
                button2.setOnClickListener(v13 -> b013.setText("2"));
                button3.setOnClickListener(v14 -> b013.setText("3"));
                button4.setOnClickListener(v15 -> b013.setText("4"));
                button5.setOnClickListener(v16 -> b013.setText("5"));
                button6.setOnClickListener(v17 -> b013.setText("6"));
                button7.setOnClickListener(v18 -> b013.setText("7"));
                button8.setOnClickListener(v19 -> b013.setText("8"));
                button9.setOnClickListener(v20 -> b013.setText("9"));
                bdelete.setOnClickListener(v21 -> b013.setText(" "));
            }


        });

        b014.setOnClickListener(v02 -> {

            b014.clearComposingText();
            b014.getText();
            button1.setOnClickListener(v12 -> b014.setText("1"));
            button2.setOnClickListener(v13 -> b014.setText("2"));
            button3.setOnClickListener(v14 -> b014.setText("3"));
            button4.setOnClickListener(v15 -> b014.setText("4"));
            button5.setOnClickListener(v16 -> b014.setText("5"));
            button6.setOnClickListener(v17 -> b014.setText("6"));
            button7.setOnClickListener(v18 -> b014.setText("7"));
            button8.setOnClickListener(v19 -> b014.setText("8"));
            button9.setOnClickListener(v20 -> b014.setText("9"));
            bdelete.setOnClickListener(v21 -> b014.setText(" "));



        });


        b015.setOnClickListener(v02 -> {

                b015.clearComposingText();
                b015.getText();
                button1.setOnClickListener(v12 -> b015.setText("1"));
                button2.setOnClickListener(v13 -> b015.setText("2"));
                button3.setOnClickListener(v14 -> b015.setText("3"));
                button4.setOnClickListener(v15 -> b015.setText("4"));
                button5.setOnClickListener(v16 -> b015.setText("5"));
                button6.setOnClickListener(v17 -> b015.setText("6"));
                button7.setOnClickListener(v18 -> b015.setText("7"));
                button8.setOnClickListener(v19 -> b015.setText("8"));
                button9.setOnClickListener(v20 -> b015.setText("9"));
                bdelete.setOnClickListener(v21 -> b015.setText(" "));



        });

        b016.setOnClickListener(v02 -> {

            b016.clearComposingText();
            b016.getText();
            button1.setOnClickListener(v12 -> b016.setText("1"));
            button2.setOnClickListener(v13 -> b016.setText("2"));
            button3.setOnClickListener(v14 -> b016.setText("3"));
            button4.setOnClickListener(v15 -> b016.setText("4"));
            button5.setOnClickListener(v16 -> b016.setText("5"));
            button6.setOnClickListener(v17 -> b016.setText("6"));
            button7.setOnClickListener(v18 -> b016.setText("7"));
            button8.setOnClickListener(v19 -> b016.setText("8"));
            button9.setOnClickListener(v20 -> b016.setText("9"));
            bdelete.setOnClickListener(v21 -> b016.setText(" "));



        });


        b017.setOnClickListener(v02 -> {

            b017.clearComposingText();
            b017.getText();
            button1.setOnClickListener(v12 -> b017.setText("1"));
            button2.setOnClickListener(v13 -> b017.setText("2"));
            button3.setOnClickListener(v14 -> b017.setText("3"));
            button4.setOnClickListener(v15 -> b017.setText("4"));
            button5.setOnClickListener(v16 -> b017.setText("5"));
            button6.setOnClickListener(v17 -> b017.setText("6"));
            button7.setOnClickListener(v18 -> b017.setText("7"));
            button8.setOnClickListener(v19 -> b017.setText("8"));
            button9.setOnClickListener(v20 -> b017.setText("9"));
            bdelete.setOnClickListener(v21 -> b017.setText(" "));



        });

        b018.setOnClickListener(v02 -> {

            b018.clearComposingText();
            b018.getText();
            button1.setOnClickListener(v12 -> b018.setText("1"));
            button2.setOnClickListener(v13 -> b018.setText("2"));
            button3.setOnClickListener(v14 -> b018.setText("3"));
            button4.setOnClickListener(v15 -> b018.setText("4"));
            button5.setOnClickListener(v16 -> b018.setText("5"));
            button6.setOnClickListener(v17 -> b018.setText("6"));
            button7.setOnClickListener(v18 -> b018.setText("7"));
            button8.setOnClickListener(v19 -> b018.setText("8"));
            button9.setOnClickListener(v20 -> b018.setText("9"));
            bdelete.setOnClickListener(v21 -> b018.setText(" "));



        });


        b019.setOnClickListener(v02 -> {
            Toast toast = Toast.makeText(this, "Already filled", Toast.LENGTH_LONG);
            if(!b019.getText().toString().equals(" ")){
                toast.show();
            }
            else{
                b019.clearComposingText();
                b019.getText();
                button1.setOnClickListener(v12 -> b019.setText("1"));
                button2.setOnClickListener(v13 -> b019.setText("2"));
                button3.setOnClickListener(v14 -> b019.setText("3"));
                button4.setOnClickListener(v15 -> b019.setText("4"));
                button5.setOnClickListener(v16 -> b019.setText("5"));
                button6.setOnClickListener(v17 -> b019.setText("6"));
                button7.setOnClickListener(v18 -> b019.setText("7"));
                button8.setOnClickListener(v19 -> b019.setText("8"));
                button9.setOnClickListener(v20 -> b019.setText("9"));
                bdelete.setOnClickListener(v21 -> b019.setText(" "));
            }


        });

        b020.setOnClickListener(v02 -> {

            b020.clearComposingText();
            b020.getText();
            button1.setOnClickListener(v12 -> b020.setText("1"));
            button2.setOnClickListener(v13 -> b020.setText("2"));
            button3.setOnClickListener(v14 -> b020.setText("3"));
            button4.setOnClickListener(v15 -> b020.setText("4"));
            button5.setOnClickListener(v16 -> b020.setText("5"));
            button6.setOnClickListener(v17 -> b020.setText("6"));
            button7.setOnClickListener(v18 -> b020.setText("7"));
            button8.setOnClickListener(v19 -> b020.setText("8"));
            button9.setOnClickListener(v20 -> b020.setText("9"));
            bdelete.setOnClickListener(v21 -> b020.setText(" "));



        });

        b021.setOnClickListener(v02 -> {

            b021.clearComposingText();
            b021.getText();
            button1.setOnClickListener(v12 -> b021.setText("1"));
            button2.setOnClickListener(v13 -> b021.setText("2"));
            button3.setOnClickListener(v14 -> b021.setText("3"));
            button4.setOnClickListener(v15 -> b021.setText("4"));
            button5.setOnClickListener(v16 -> b021.setText("5"));
            button6.setOnClickListener(v17 -> b021.setText("6"));
            button7.setOnClickListener(v18 -> b021.setText("7"));
            button8.setOnClickListener(v19 -> b021.setText("8"));
            button9.setOnClickListener(v20 -> b021.setText("9"));
            bdelete.setOnClickListener(v21 -> b021.setText(" "));



        });

        b022.setOnClickListener(v02 -> {

            b022.clearComposingText();
            b022.getText();
            button1.setOnClickListener(v12 -> b022.setText("1"));
            button2.setOnClickListener(v13 -> b022.setText("2"));
            button3.setOnClickListener(v14 -> b022.setText("3"));
            button4.setOnClickListener(v15 -> b022.setText("4"));
            button5.setOnClickListener(v16 -> b022.setText("5"));
            button6.setOnClickListener(v17 -> b022.setText("6"));
            button7.setOnClickListener(v18 -> b022.setText("7"));
            button8.setOnClickListener(v19 -> b022.setText("8"));
            button9.setOnClickListener(v20 -> b022.setText("9"));
            bdelete.setOnClickListener(v21 -> b022.setText(" "));




        });

        b023.setOnClickListener(v02 -> {
            Toast toast = Toast.makeText(this, "Already filled", Toast.LENGTH_LONG);
            if(!b023.getText().toString().equals(" ")){
                toast.show();
            }
            else{
                b023.clearComposingText();
                b023.getText();
                button1.setOnClickListener(v12 -> b023.setText("1"));
                button2.setOnClickListener(v13 -> b023.setText("2"));
                button3.setOnClickListener(v14 -> b023.setText("3"));
                button4.setOnClickListener(v15 -> b023.setText("4"));
                button5.setOnClickListener(v16 -> b023.setText("5"));
                button6.setOnClickListener(v17 -> b023.setText("6"));
                button7.setOnClickListener(v18 -> b023.setText("7"));
                button8.setOnClickListener(v19 -> b023.setText("8"));
                button9.setOnClickListener(v20 -> b023.setText("9"));
                bdelete.setOnClickListener(v21 -> b023.setText(" "));

            }


        });

        b024.setOnClickListener(v02 -> {

            b024.clearComposingText();
            b024.getText();
            button1.setOnClickListener(v12 -> b024.setText("1"));
            button2.setOnClickListener(v13 -> b024.setText("2"));
            button3.setOnClickListener(v14 -> b024.setText("3"));
            button4.setOnClickListener(v15 -> b024.setText("4"));
            button5.setOnClickListener(v16 -> b024.setText("5"));
            button6.setOnClickListener(v17 -> b024.setText("6"));
            button7.setOnClickListener(v18 -> b024.setText("7"));
            button8.setOnClickListener(v19 -> b024.setText("8"));
            button9.setOnClickListener(v20 -> b024.setText("9"));
            bdelete.setOnClickListener(v21 -> b024.setText(" "));




        });

        b025.setOnClickListener(v02 -> {

            b025.clearComposingText();
            b025.getText();
            button1.setOnClickListener(v12 -> b025.setText("1"));
            button2.setOnClickListener(v13 -> b025.setText("2"));
            button3.setOnClickListener(v14 -> b025.setText("3"));
            button4.setOnClickListener(v15 -> b025.setText("4"));
            button5.setOnClickListener(v16 -> b025.setText("5"));
            button6.setOnClickListener(v17 -> b025.setText("6"));
            button7.setOnClickListener(v18 -> b025.setText("7"));
            button8.setOnClickListener(v19 -> b025.setText("8"));
            button9.setOnClickListener(v20 -> b025.setText("9"));
            bdelete.setOnClickListener(v21 -> b025.setText(" "));




        });

        b026.setOnClickListener(v02 -> {

            b026.clearComposingText();
            b026.getText();
            button1.setOnClickListener(v12 -> b026.setText("1"));
            button2.setOnClickListener(v13 -> b026.setText("2"));
            button3.setOnClickListener(v14 -> b026.setText("3"));
            button4.setOnClickListener(v15 -> b026.setText("4"));
            button5.setOnClickListener(v16 -> b026.setText("5"));
            button6.setOnClickListener(v17 -> b026.setText("6"));
            button7.setOnClickListener(v18 -> b026.setText("7"));
            button8.setOnClickListener(v19 -> b026.setText("8"));
            button9.setOnClickListener(v20 -> b026.setText("9"));
            bdelete.setOnClickListener(v21 -> b026.setText(" "));




        });

        b027.setOnClickListener(v02 -> {
            Toast toast = Toast.makeText(this, "Already filled", Toast.LENGTH_LONG);
            if(!b027.getText().toString().equals(" ")){
                toast.show();
            }
            else{
                b027.clearComposingText();
                b027.getText();
                button1.setOnClickListener(v12 -> b027.setText("1"));
                button2.setOnClickListener(v13 -> b027.setText("2"));
                button3.setOnClickListener(v14 -> b027.setText("3"));
                button4.setOnClickListener(v15 -> b027.setText("4"));
                button5.setOnClickListener(v16 -> b027.setText("5"));
                button6.setOnClickListener(v17 -> b027.setText("6"));
                button7.setOnClickListener(v18 -> b027.setText("7"));
                button8.setOnClickListener(v19 -> b027.setText("8"));
                button9.setOnClickListener(v20 -> b027.setText("9"));
                bdelete.setOnClickListener(v21 -> b027.setText(" "));

            }


        });

        b028.setOnClickListener(v02 -> {

            b028.clearComposingText();
            b028.getText();
            button1.setOnClickListener(v12 -> b028.setText("1"));
            button2.setOnClickListener(v13 -> b028.setText("2"));
            button3.setOnClickListener(v14 -> b028.setText("3"));
            button4.setOnClickListener(v15 -> b028.setText("4"));
            button5.setOnClickListener(v16 -> b028.setText("5"));
            button6.setOnClickListener(v17 -> b028.setText("6"));
            button7.setOnClickListener(v18 -> b028.setText("7"));
            button8.setOnClickListener(v19 -> b028.setText("8"));
            button9.setOnClickListener(v20 -> b028.setText("9"));
            bdelete.setOnClickListener(v21 -> b028.setText(" "));




        });

        b029.setOnClickListener(v02 -> {
            Toast toast = Toast.makeText(this, "Already filled", Toast.LENGTH_LONG);
            if(!b029.getText().toString().equals(" ")){
                toast.show();
            }
            else{
                b029.clearComposingText();
                b029.getText();
                button1.setOnClickListener(v12 -> b029.setText("1"));
                button2.setOnClickListener(v13 -> b029.setText("2"));
                button3.setOnClickListener(v14 -> b029.setText("3"));
                button4.setOnClickListener(v15 -> b029.setText("4"));
                button5.setOnClickListener(v16 -> b029.setText("5"));
                button6.setOnClickListener(v17 -> b029.setText("6"));
                button7.setOnClickListener(v18 -> b029.setText("7"));
                button8.setOnClickListener(v19 -> b029.setText("8"));
                button9.setOnClickListener(v20 -> b029.setText("9"));
                bdelete.setOnClickListener(v21 -> b029.setText(" "));

            }


        });

        b030.setOnClickListener(v02 -> {

            b030.clearComposingText();
            b030.getText();
            button1.setOnClickListener(v12 -> b030.setText("1"));
            button2.setOnClickListener(v13 -> b030.setText("2"));
            button3.setOnClickListener(v14 -> b030.setText("3"));
            button4.setOnClickListener(v15 -> b030.setText("4"));
            button5.setOnClickListener(v16 -> b030.setText("5"));
            button6.setOnClickListener(v17 -> b030.setText("6"));
            button7.setOnClickListener(v18 -> b030.setText("7"));
            button8.setOnClickListener(v19 -> b030.setText("8"));
            button9.setOnClickListener(v20 -> b030.setText("9"));
            bdelete.setOnClickListener(v21 -> b030.setText(" "));




        });

        b031.setOnClickListener(v02 -> {
            Toast toast = Toast.makeText(this, "Already filled", Toast.LENGTH_LONG);
            if(!b031.getText().toString().equals(" ")){
                toast.show();
            }
            else{
                b031.clearComposingText();
                b031.getText();
                button1.setOnClickListener(v12 -> b031.setText("1"));
                button2.setOnClickListener(v13 -> b031.setText("2"));
                button3.setOnClickListener(v14 -> b031.setText("3"));
                button4.setOnClickListener(v15 -> b031.setText("4"));
                button5.setOnClickListener(v16 -> b031.setText("5"));
                button6.setOnClickListener(v17 -> b031.setText("6"));
                button7.setOnClickListener(v18 -> b031.setText("7"));
                button8.setOnClickListener(v19 -> b031.setText("8"));
                button9.setOnClickListener(v20 -> b031.setText("9"));
                bdelete.setOnClickListener(v21 -> b031.setText(" "));

            }


        });


        b032.setOnClickListener(v02 -> {

            b032.clearComposingText();
            b032.getText();
            button1.setOnClickListener(v12 -> b032.setText("1"));
            button2.setOnClickListener(v13 -> b032.setText("2"));
            button3.setOnClickListener(v14 -> b032.setText("3"));
            button4.setOnClickListener(v15 -> b032.setText("4"));
            button5.setOnClickListener(v16 -> b032.setText("5"));
            button6.setOnClickListener(v17 -> b032.setText("6"));
            button7.setOnClickListener(v18 -> b032.setText("7"));
            button8.setOnClickListener(v19 -> b032.setText("8"));
            button9.setOnClickListener(v20 -> b032.setText("9"));
            bdelete.setOnClickListener(v21 -> b032.setText(" "));




        });

        b033.setOnClickListener(v02 -> {
            Toast toast = Toast.makeText(this, "Already filled", Toast.LENGTH_LONG);
            if(!b033.getText().toString().equals(" ")){
                toast.show();
            }
            else{
                b033.clearComposingText();
                b033.getText();
                button1.setOnClickListener(v12 -> b033.setText("1"));
                button2.setOnClickListener(v13 -> b033.setText("2"));
                button3.setOnClickListener(v14 -> b033.setText("3"));
                button4.setOnClickListener(v15 -> b033.setText("4"));
                button5.setOnClickListener(v16 -> b033.setText("5"));
                button6.setOnClickListener(v17 -> b033.setText("6"));
                button7.setOnClickListener(v18 -> b033.setText("7"));
                button8.setOnClickListener(v19 -> b033.setText("8"));
                button9.setOnClickListener(v20 -> b033.setText("9"));
                bdelete.setOnClickListener(v21 -> b033.setText(" "));

            }


        });

        b034.setOnClickListener(v02 -> {

            b034.clearComposingText();
            b034.getText();
            button1.setOnClickListener(v12 -> b034.setText("1"));
            button2.setOnClickListener(v13 -> b034.setText("2"));
            button3.setOnClickListener(v14 -> b034.setText("3"));
            button4.setOnClickListener(v15 -> b034.setText("4"));
            button5.setOnClickListener(v16 -> b034.setText("5"));
            button6.setOnClickListener(v17 -> b034.setText("6"));
            button7.setOnClickListener(v18 -> b034.setText("7"));
            button8.setOnClickListener(v19 -> b034.setText("8"));
            button9.setOnClickListener(v20 -> b034.setText("9"));
            bdelete.setOnClickListener(v21 -> b034.setText(" "));




        });

        b035.setOnClickListener(v02 -> {
            Toast toast = Toast.makeText(this, "Already filled", Toast.LENGTH_LONG);
            if(!b035.getText().toString().equals(" ")){
                toast.show();
            }
            else{
                b035.clearComposingText();
                b035.getText();
                button1.setOnClickListener(v12 -> b035.setText("1"));
                button2.setOnClickListener(v13 -> b035.setText("2"));
                button3.setOnClickListener(v14 -> b035.setText("3"));
                button4.setOnClickListener(v15 -> b035.setText("4"));
                button5.setOnClickListener(v16 -> b035.setText("5"));
                button6.setOnClickListener(v17 -> b035.setText("6"));
                button7.setOnClickListener(v18 -> b035.setText("7"));
                button8.setOnClickListener(v19 -> b035.setText("8"));
                button9.setOnClickListener(v20 -> b035.setText("9"));
                bdelete.setOnClickListener(v21 -> b035.setText(" "));

            }


        });

        b036.setOnClickListener(v02 -> {

            b036.clearComposingText();
            b036.getText();
            button1.setOnClickListener(v12 -> b036.setText("1"));
            button2.setOnClickListener(v13 -> b036.setText("2"));
            button3.setOnClickListener(v14 -> b036.setText("3"));
            button4.setOnClickListener(v15 -> b036.setText("4"));
            button5.setOnClickListener(v16 -> b036.setText("5"));
            button6.setOnClickListener(v17 -> b036.setText("6"));
            button7.setOnClickListener(v18 -> b036.setText("7"));
            button8.setOnClickListener(v19 -> b036.setText("8"));
            button9.setOnClickListener(v20 -> b036.setText("9"));
            bdelete.setOnClickListener(v21 -> b036.setText(" "));




        });

        b037.setOnClickListener(v02 -> {

            b037.clearComposingText();
            b037.getText();
            button1.setOnClickListener(v12 -> b037.setText("1"));
            button2.setOnClickListener(v13 -> b037.setText("2"));
            button3.setOnClickListener(v14 -> b037.setText("3"));
            button4.setOnClickListener(v15 -> b037.setText("4"));
            button5.setOnClickListener(v16 -> b037.setText("5"));
            button6.setOnClickListener(v17 -> b037.setText("6"));
            button7.setOnClickListener(v18 -> b037.setText("7"));
            button8.setOnClickListener(v19 -> b037.setText("8"));
            button9.setOnClickListener(v20 -> b037.setText("9"));
            bdelete.setOnClickListener(v21 -> b037.setText(" "));




        });

        b038.setOnClickListener(v02 -> {

            b038.clearComposingText();
            b038.getText();
            button1.setOnClickListener(v12 -> b038.setText("1"));
            button2.setOnClickListener(v13 -> b038.setText("2"));
            button3.setOnClickListener(v14 -> b038.setText("3"));
            button4.setOnClickListener(v15 -> b038.setText("4"));
            button5.setOnClickListener(v16 -> b038.setText("5"));
            button6.setOnClickListener(v17 -> b038.setText("6"));
            button7.setOnClickListener(v18 -> b038.setText("7"));
            button8.setOnClickListener(v19 -> b038.setText("8"));
            button9.setOnClickListener(v20 -> b038.setText("9"));
            bdelete.setOnClickListener(v21 -> b038.setText(" "));




        });


        b039.setOnClickListener(v02 -> {
            Toast toast = Toast.makeText(this, "Already filled", Toast.LENGTH_LONG);
            if(!b039.getText().toString().equals(" ")){
                toast.show();
            }
            else{
                b039.clearComposingText();
                b039.getText();
                button1.setOnClickListener(v12 -> b039.setText("1"));
                button2.setOnClickListener(v13 -> b039.setText("2"));
                button3.setOnClickListener(v14 -> b039.setText("3"));
                button4.setOnClickListener(v15 -> b039.setText("4"));
                button5.setOnClickListener(v16 -> b039.setText("5"));
                button6.setOnClickListener(v17 -> b039.setText("6"));
                button7.setOnClickListener(v18 -> b039.setText("7"));
                button8.setOnClickListener(v19 -> b039.setText("8"));
                button9.setOnClickListener(v20 -> b039.setText("9"));
                bdelete.setOnClickListener(v21 -> b039.setText(" "));

            }


        });

        b040.setOnClickListener(v02 -> {

            b040.clearComposingText();
            b040.getText();
            button1.setOnClickListener(v12 -> b040.setText("1"));
            button2.setOnClickListener(v13 -> b040.setText("2"));
            button3.setOnClickListener(v14 -> b040.setText("3"));
            button4.setOnClickListener(v15 -> b040.setText("4"));
            button5.setOnClickListener(v16 -> b040.setText("5"));
            button6.setOnClickListener(v17 -> b040.setText("6"));
            button7.setOnClickListener(v18 -> b040.setText("7"));
            button8.setOnClickListener(v19 -> b040.setText("8"));
            button9.setOnClickListener(v20 -> b040.setText("9"));
            bdelete.setOnClickListener(v21 -> b040.setText(" "));




        });

        b041.setOnClickListener(v02 -> {

            b041.clearComposingText();
            b041.getText();
            button1.setOnClickListener(v12 -> b041.setText("1"));
            button2.setOnClickListener(v13 -> b041.setText("2"));
            button3.setOnClickListener(v14 -> b041.setText("3"));
            button4.setOnClickListener(v15 -> b041.setText("4"));
            button5.setOnClickListener(v16 -> b041.setText("5"));
            button6.setOnClickListener(v17 -> b041.setText("6"));
            button7.setOnClickListener(v18 -> b041.setText("7"));
            button8.setOnClickListener(v19 -> b041.setText("8"));
            button9.setOnClickListener(v20 -> b041.setText("9"));
            bdelete.setOnClickListener(v21 -> b041.setText(" "));




        });

        b042.setOnClickListener(v02 -> {

            b042.clearComposingText();
            b042.getText();
            button1.setOnClickListener(v12 -> b042.setText("1"));
            button2.setOnClickListener(v13 -> b042.setText("2"));
            button3.setOnClickListener(v14 -> b042.setText("3"));
            button4.setOnClickListener(v15 -> b042.setText("4"));
            button5.setOnClickListener(v16 -> b042.setText("5"));
            button6.setOnClickListener(v17 -> b042.setText("6"));
            button7.setOnClickListener(v18 -> b042.setText("7"));
            button8.setOnClickListener(v19 -> b042.setText("8"));
            button9.setOnClickListener(v20 -> b042.setText("9"));
            bdelete.setOnClickListener(v21 -> b042.setText(" "));




        });

        b043.setOnClickListener(v02 -> {
            Toast toast = Toast.makeText(this, "Already filled", Toast.LENGTH_LONG);
            if(!b043.getText().toString().equals(" ")){
                toast.show();
            }
            else{
                b043.clearComposingText();
                b043.getText();
                button1.setOnClickListener(v12 -> b043.setText("1"));
                button2.setOnClickListener(v13 -> b043.setText("2"));
                button3.setOnClickListener(v14 -> b043.setText("3"));
                button4.setOnClickListener(v15 -> b043.setText("4"));
                button5.setOnClickListener(v16 -> b043.setText("5"));
                button6.setOnClickListener(v17 -> b043.setText("6"));
                button7.setOnClickListener(v18 -> b043.setText("7"));
                button8.setOnClickListener(v19 -> b043.setText("8"));
                button9.setOnClickListener(v20 -> b043.setText("9"));
                bdelete.setOnClickListener(v21 -> b043.setText(" "));

            }


        });


        b044.setOnClickListener(v02 -> {

            b044.clearComposingText();
            b044.getText();
            button1.setOnClickListener(v12 -> b044.setText("1"));
            button2.setOnClickListener(v13 -> b044.setText("2"));
            button3.setOnClickListener(v14 -> b044.setText("3"));
            button4.setOnClickListener(v15 -> b044.setText("4"));
            button5.setOnClickListener(v16 -> b044.setText("5"));
            button6.setOnClickListener(v17 -> b044.setText("6"));
            button7.setOnClickListener(v18 -> b044.setText("7"));
            button8.setOnClickListener(v19 -> b044.setText("8"));
            button9.setOnClickListener(v20 -> b044.setText("9"));
            bdelete.setOnClickListener(v21 -> b044.setText(" "));




        });

        b045.setOnClickListener(v02 -> {

            b045.clearComposingText();
            b045.getText();
            button1.setOnClickListener(v12 -> b045.setText("1"));
            button2.setOnClickListener(v13 -> b045.setText("2"));
            button3.setOnClickListener(v14 -> b045.setText("3"));
            button4.setOnClickListener(v15 -> b045.setText("4"));
            button5.setOnClickListener(v16 -> b045.setText("5"));
            button6.setOnClickListener(v17 -> b045.setText("6"));
            button7.setOnClickListener(v18 -> b045.setText("7"));
            button8.setOnClickListener(v19 -> b045.setText("8"));
            button9.setOnClickListener(v20 -> b045.setText("9"));
            bdelete.setOnClickListener(v21 -> b045.setText(" "));




        });

        b046.setOnClickListener(v02 -> {

            b046.clearComposingText();
            b046.getText();
            button1.setOnClickListener(v12 -> b046.setText("1"));
            button2.setOnClickListener(v13 -> b046.setText("2"));
            button3.setOnClickListener(v14 -> b046.setText("3"));
            button4.setOnClickListener(v15 -> b046.setText("4"));
            button5.setOnClickListener(v16 -> b046.setText("5"));
            button6.setOnClickListener(v17 -> b046.setText("6"));
            button7.setOnClickListener(v18 -> b046.setText("7"));
            button8.setOnClickListener(v19 -> b046.setText("8"));
            button9.setOnClickListener(v20 -> b046.setText("9"));
            bdelete.setOnClickListener(v21 -> b046.setText(" "));




        });

        b047.setOnClickListener(v02 -> {
            Toast toast = Toast.makeText(this, "Already filled", Toast.LENGTH_LONG);
            if(!b047.getText().toString().equals(" ")){
                toast.show();
            }
            else{
                b047.clearComposingText();
                b047.getText();
                button1.setOnClickListener(v12 -> b047.setText("1"));
                button2.setOnClickListener(v13 -> b047.setText("2"));
                button3.setOnClickListener(v14 -> b047.setText("3"));
                button4.setOnClickListener(v15 -> b047.setText("4"));
                button5.setOnClickListener(v16 -> b047.setText("5"));
                button6.setOnClickListener(v17 -> b047.setText("6"));
                button7.setOnClickListener(v18 -> b047.setText("7"));
                button8.setOnClickListener(v19 -> b047.setText("8"));
                button9.setOnClickListener(v20 -> b047.setText("9"));
                bdelete.setOnClickListener(v21 -> b047.setText(" "));

            }


        });

        b048.setOnClickListener(v02 -> {

            b048.clearComposingText();
            b048.getText();
            button1.setOnClickListener(v12 -> b048.setText("1"));
            button2.setOnClickListener(v13 -> b048.setText("2"));
            button3.setOnClickListener(v14 -> b048.setText("3"));
            button4.setOnClickListener(v15 -> b048.setText("4"));
            button5.setOnClickListener(v16 -> b048.setText("5"));
            button6.setOnClickListener(v17 -> b048.setText("6"));
            button7.setOnClickListener(v18 -> b048.setText("7"));
            button8.setOnClickListener(v19 -> b048.setText("8"));
            button9.setOnClickListener(v20 -> b048.setText("9"));
            bdelete.setOnClickListener(v21 -> b048.setText(" "));




        });


        b049.setOnClickListener(v02 -> {
            Toast toast = Toast.makeText(this, "Already filled", Toast.LENGTH_LONG);
            if(!b049.getText().toString().equals(" ")){
                toast.show();
            }
            else{
                b049.clearComposingText();
                b049.getText();
                button1.setOnClickListener(v12 -> b049.setText("1"));
                button2.setOnClickListener(v13 -> b049.setText("2"));
                button3.setOnClickListener(v14 -> b049.setText("3"));
                button4.setOnClickListener(v15 -> b049.setText("4"));
                button5.setOnClickListener(v16 -> b049.setText("5"));
                button6.setOnClickListener(v17 -> b049.setText("6"));
                button7.setOnClickListener(v18 -> b049.setText("7"));
                button8.setOnClickListener(v19 -> b049.setText("8"));
                button9.setOnClickListener(v20 -> b049.setText("9"));
                bdelete.setOnClickListener(v21 -> b049.setText(" "));

            }


        });

        b050.setOnClickListener(v02 -> {

            b050.clearComposingText();
            b050.getText();
            button1.setOnClickListener(v12 -> b050.setText("1"));
            button2.setOnClickListener(v13 -> b050.setText("2"));
            button3.setOnClickListener(v14 -> b050.setText("3"));
            button4.setOnClickListener(v15 -> b050.setText("4"));
            button5.setOnClickListener(v16 -> b050.setText("5"));
            button6.setOnClickListener(v17 -> b050.setText("6"));
            button7.setOnClickListener(v18 -> b050.setText("7"));
            button8.setOnClickListener(v19 -> b050.setText("8"));
            button9.setOnClickListener(v20 -> b050.setText("9"));
            bdelete.setOnClickListener(v21 -> b050.setText(" "));




        });

        b051.setOnClickListener(v02 -> {
            Toast toast = Toast.makeText(this, "Already filled", Toast.LENGTH_LONG);
            if(!b051.getText().toString().equals(" ")){
                toast.show();
            }
            else{
                b051.clearComposingText();
                b051.getText();
                button1.setOnClickListener(v12 -> b051.setText("1"));
                button2.setOnClickListener(v13 -> b051.setText("2"));
                button3.setOnClickListener(v14 -> b051.setText("3"));
                button4.setOnClickListener(v15 -> b051.setText("4"));
                button5.setOnClickListener(v16 -> b051.setText("5"));
                button6.setOnClickListener(v17 -> b051.setText("6"));
                button7.setOnClickListener(v18 -> b051.setText("7"));
                button8.setOnClickListener(v19 -> b051.setText("8"));
                button9.setOnClickListener(v20 -> b051.setText("9"));
                bdelete.setOnClickListener(v21 -> b051.setText(" "));

            }


        });

        b052.setOnClickListener(v02 -> {

            b052.clearComposingText();
            b052.getText();
            button1.setOnClickListener(v12 -> b052.setText("1"));
            button2.setOnClickListener(v13 -> b052.setText("2"));
            button3.setOnClickListener(v14 -> b052.setText("3"));
            button4.setOnClickListener(v15 -> b052.setText("4"));
            button5.setOnClickListener(v16 -> b052.setText("5"));
            button6.setOnClickListener(v17 -> b052.setText("6"));
            button7.setOnClickListener(v18 -> b052.setText("7"));
            button8.setOnClickListener(v19 -> b052.setText("8"));
            button9.setOnClickListener(v20 -> b052.setText("9"));
            bdelete.setOnClickListener(v21 -> b052.setText(" "));




        });

        b053.setOnClickListener(v02 -> {
            Toast toast = Toast.makeText(this, "Already filled", Toast.LENGTH_LONG);
            if(!b053.getText().toString().equals(" ")){
                toast.show();
            }
            else{
                b053.clearComposingText();
                b053.getText();
                button1.setOnClickListener(v12 -> b053.setText("1"));
                button2.setOnClickListener(v13 -> b053.setText("2"));
                button3.setOnClickListener(v14 -> b053.setText("3"));
                button4.setOnClickListener(v15 -> b053.setText("4"));
                button5.setOnClickListener(v16 -> b053.setText("5"));
                button6.setOnClickListener(v17 -> b053.setText("6"));
                button7.setOnClickListener(v18 -> b053.setText("7"));
                button8.setOnClickListener(v19 -> b053.setText("8"));
                button9.setOnClickListener(v20 -> b053.setText("9"));
                bdelete.setOnClickListener(v21 -> b053.setText(" "));

            }


        });


        b054.setOnClickListener(v02 -> {

            b054.clearComposingText();
            b054.getText();
            button1.setOnClickListener(v12 -> b054.setText("1"));
            button2.setOnClickListener(v13 -> b054.setText("2"));
            button3.setOnClickListener(v14 -> b054.setText("3"));
            button4.setOnClickListener(v15 -> b054.setText("4"));
            button5.setOnClickListener(v16 -> b054.setText("5"));
            button6.setOnClickListener(v17 -> b054.setText("6"));
            button7.setOnClickListener(v18 -> b054.setText("7"));
            button8.setOnClickListener(v19 -> b054.setText("8"));
            button9.setOnClickListener(v20 -> b054.setText("9"));
            bdelete.setOnClickListener(v21 -> b054.setText(" "));




        });

        b055.setOnClickListener(v02 -> {
            Toast toast = Toast.makeText(this, "Already filled", Toast.LENGTH_LONG);
            if(!b055.getText().toString().equals(" ")){
                toast.show();
            }
            else{
                b055.clearComposingText();
                b055.getText();
                button1.setOnClickListener(v12 -> b055.setText("1"));
                button2.setOnClickListener(v13 -> b055.setText("2"));
                button3.setOnClickListener(v14 -> b055.setText("3"));
                button4.setOnClickListener(v15 -> b055.setText("4"));
                button5.setOnClickListener(v16 -> b055.setText("5"));
                button6.setOnClickListener(v17 -> b055.setText("6"));
                button7.setOnClickListener(v18 -> b055.setText("7"));
                button8.setOnClickListener(v19 -> b055.setText("8"));
                button9.setOnClickListener(v20 -> b055.setText("9"));
                bdelete.setOnClickListener(v21 -> b055.setText(" "));

            }


        });


        b056.setOnClickListener(v02 -> {

            b056.clearComposingText();
            b056.getText();
            button1.setOnClickListener(v12 -> b056.setText("1"));
            button2.setOnClickListener(v13 -> b056.setText("2"));
            button3.setOnClickListener(v14 -> b056.setText("3"));
            button4.setOnClickListener(v15 -> b056.setText("4"));
            button5.setOnClickListener(v16 -> b056.setText("5"));
            button6.setOnClickListener(v17 -> b056.setText("6"));
            button7.setOnClickListener(v18 -> b056.setText("7"));
            button8.setOnClickListener(v19 -> b056.setText("8"));
            button9.setOnClickListener(v20 -> b056.setText("9"));
            bdelete.setOnClickListener(v21 -> b056.setText(" "));




        });


        b057.setOnClickListener(v02 -> {

            b057.clearComposingText();
            b057.getText();
            button1.setOnClickListener(v12 -> b057.setText("1"));
            button2.setOnClickListener(v13 -> b057.setText("2"));
            button3.setOnClickListener(v14 -> b057.setText("3"));
            button4.setOnClickListener(v15 -> b057.setText("4"));
            button5.setOnClickListener(v16 -> b057.setText("5"));
            button6.setOnClickListener(v17 -> b057.setText("6"));
            button7.setOnClickListener(v18 -> b057.setText("7"));
            button8.setOnClickListener(v19 -> b057.setText("8"));
            button9.setOnClickListener(v20 -> b057.setText("9"));
            bdelete.setOnClickListener(v21 -> b057.setText(" "));




        });


        b058.setOnClickListener(v02 -> {

            b058.clearComposingText();
            b058.getText();
            button1.setOnClickListener(v12 -> b058.setText("1"));
            button2.setOnClickListener(v13 -> b058.setText("2"));
            button3.setOnClickListener(v14 -> b058.setText("3"));
            button4.setOnClickListener(v15 -> b058.setText("4"));
            button5.setOnClickListener(v16 -> b058.setText("5"));
            button6.setOnClickListener(v17 -> b058.setText("6"));
            button7.setOnClickListener(v18 -> b058.setText("7"));
            button8.setOnClickListener(v19 -> b058.setText("8"));
            button9.setOnClickListener(v20 -> b058.setText("9"));
            bdelete.setOnClickListener(v21 -> b058.setText(" "));




        });


        b059.setOnClickListener(v02 -> {
            Toast toast = Toast.makeText(this, "Already filled", Toast.LENGTH_LONG);
            if(!b059.getText().toString().equals(" ")){
                toast.show();
            }
            else{
                b055.clearComposingText();
                b055.getText();
                button1.setOnClickListener(v12 -> b059.setText("1"));
                button2.setOnClickListener(v13 -> b059.setText("2"));
                button3.setOnClickListener(v14 -> b059.setText("3"));
                button4.setOnClickListener(v15 -> b059.setText("4"));
                button5.setOnClickListener(v16 -> b059.setText("5"));
                button6.setOnClickListener(v17 -> b059.setText("6"));
                button7.setOnClickListener(v18 -> b059.setText("7"));
                button8.setOnClickListener(v19 -> b059.setText("8"));
                button9.setOnClickListener(v20 -> b059.setText("9"));
                bdelete.setOnClickListener(v21 -> b059.setText(" "));

            }


        });

        b060.setOnClickListener(v02 -> {

            b060.clearComposingText();
            b060.getText();
            button1.setOnClickListener(v12 -> b060.setText("1"));
            button2.setOnClickListener(v13 -> b060.setText("2"));
            button3.setOnClickListener(v14 -> b060.setText("3"));
            button4.setOnClickListener(v15 -> b060.setText("4"));
            button5.setOnClickListener(v16 -> b060.setText("5"));
            button6.setOnClickListener(v17 -> b060.setText("6"));
            button7.setOnClickListener(v18 -> b060.setText("7"));
            button8.setOnClickListener(v19 -> b060.setText("8"));
            button9.setOnClickListener(v20 -> b060.setText("9"));
            bdelete.setOnClickListener(v21 -> b060.setText(" "));




        });


        b061.setOnClickListener(v02 -> {

            b061.clearComposingText();
            b061.getText();
            button1.setOnClickListener(v12 -> b061.setText("1"));
            button2.setOnClickListener(v13 -> b061.setText("2"));
            button3.setOnClickListener(v14 -> b061.setText("3"));
            button4.setOnClickListener(v15 -> b061.setText("4"));
            button5.setOnClickListener(v16 -> b061.setText("5"));
            button6.setOnClickListener(v17 -> b061.setText("6"));
            button7.setOnClickListener(v18 -> b061.setText("7"));
            button8.setOnClickListener(v19 -> b061.setText("8"));
            button9.setOnClickListener(v20 -> b061.setText("9"));
            bdelete.setOnClickListener(v21 -> b061.setText(" "));




        });


        b062.setOnClickListener(v02 -> {

            b062.clearComposingText();
            b062.getText();
            button1.setOnClickListener(v12 -> b062.setText("1"));
            button2.setOnClickListener(v13 -> b062.setText("2"));
            button3.setOnClickListener(v14 -> b062.setText("3"));
            button4.setOnClickListener(v15 -> b062.setText("4"));
            button5.setOnClickListener(v16 -> b062.setText("5"));
            button6.setOnClickListener(v17 -> b062.setText("6"));
            button7.setOnClickListener(v18 -> b062.setText("7"));
            button8.setOnClickListener(v19 -> b062.setText("8"));
            button9.setOnClickListener(v20 -> b062.setText("9"));
            bdelete.setOnClickListener(v21 -> b062.setText(" "));




        });


        b063.setOnClickListener(v02 -> {

                b063.clearComposingText();
                b063.getText();
                button1.setOnClickListener(v12 -> b063.setText("1"));
                button2.setOnClickListener(v13 -> b063.setText("2"));
                button3.setOnClickListener(v14 -> b063.setText("3"));
                button4.setOnClickListener(v15 -> b063.setText("4"));
                button5.setOnClickListener(v16 -> b063.setText("5"));
                button6.setOnClickListener(v17 -> b063.setText("6"));
                button7.setOnClickListener(v18 -> b063.setText("7"));
                button8.setOnClickListener(v19 -> b063.setText("8"));
                button9.setOnClickListener(v20 -> b063.setText("9"));
                bdelete.setOnClickListener(v21 -> b063.setText(" "));




        });

        b064.setOnClickListener(v02 -> {

            b064.clearComposingText();
            b064.getText();
            button1.setOnClickListener(v12 -> b064.setText("1"));
            button2.setOnClickListener(v13 -> b064.setText("2"));
            button3.setOnClickListener(v14 -> b064.setText("3"));
            button4.setOnClickListener(v15 -> b064.setText("4"));
            button5.setOnClickListener(v16 -> b064.setText("5"));
            button6.setOnClickListener(v17 -> b064.setText("6"));
            button7.setOnClickListener(v18 -> b064.setText("7"));
            button8.setOnClickListener(v19 -> b064.setText("8"));
            button9.setOnClickListener(v20 -> b064.setText("9"));
            bdelete.setOnClickListener(v21 -> b064.setText(" "));




        });

        b065.setOnClickListener(v02 -> {

            b065.clearComposingText();
            b065.getText();
            button1.setOnClickListener(v12 -> b065.setText("1"));
            button2.setOnClickListener(v13 -> b065.setText("2"));
            button3.setOnClickListener(v14 -> b065.setText("3"));
            button4.setOnClickListener(v15 -> b065.setText("4"));
            button5.setOnClickListener(v16 -> b065.setText("5"));
            button6.setOnClickListener(v17 -> b065.setText("6"));
            button7.setOnClickListener(v18 -> b065.setText("7"));
            button8.setOnClickListener(v19 -> b065.setText("8"));
            button9.setOnClickListener(v20 -> b065.setText("9"));
            bdelete.setOnClickListener(v21 -> b065.setText(" "));




        });

        b066.setOnClickListener(v02 -> {

            b066.clearComposingText();
            b066.getText();
            button1.setOnClickListener(v12 -> b066.setText("1"));
            button2.setOnClickListener(v13 -> b066.setText("2"));
            button3.setOnClickListener(v14 -> b066.setText("3"));
            button4.setOnClickListener(v15 -> b066.setText("4"));
            button5.setOnClickListener(v16 -> b066.setText("5"));
            button6.setOnClickListener(v17 -> b066.setText("6"));
            button7.setOnClickListener(v18 -> b066.setText("7"));
            button8.setOnClickListener(v19 -> b066.setText("8"));
            button9.setOnClickListener(v20 -> b066.setText("9"));
            bdelete.setOnClickListener(v21 -> b066.setText(" "));




        });


        b067.setOnClickListener(v02 -> {
            Toast toast = Toast.makeText(this, "Already filled", Toast.LENGTH_LONG);
            if(!b067.getText().toString().equals(" ")){
                toast.show();
            }
            else{
                b067.clearComposingText();
                b067.getText();
                button1.setOnClickListener(v12 -> b067.setText("1"));
                button2.setOnClickListener(v13 -> b067.setText("2"));
                button3.setOnClickListener(v14 -> b067.setText("3"));
                button4.setOnClickListener(v15 -> b067.setText("4"));
                button5.setOnClickListener(v16 -> b067.setText("5"));
                button6.setOnClickListener(v17 -> b067.setText("6"));
                button7.setOnClickListener(v18 -> b067.setText("7"));
                button8.setOnClickListener(v19 -> b067.setText("8"));
                button9.setOnClickListener(v20 -> b067.setText("9"));
                bdelete.setOnClickListener(v21 -> b067.setText(" "));

            }


        });

        b068.setOnClickListener(v02 -> {

            b068.clearComposingText();
            b068.getText();
            button1.setOnClickListener(v12 -> b068.setText("1"));
            button2.setOnClickListener(v13 -> b068.setText("2"));
            button3.setOnClickListener(v14 -> b068.setText("3"));
            button4.setOnClickListener(v15 -> b068.setText("4"));
            button5.setOnClickListener(v16 -> b068.setText("5"));
            button6.setOnClickListener(v17 -> b068.setText("6"));
            button7.setOnClickListener(v18 -> b068.setText("7"));
            button8.setOnClickListener(v19 -> b068.setText("8"));
            button9.setOnClickListener(v20 -> b068.setText("9"));
            bdelete.setOnClickListener(v21 -> b068.setText(" "));




        });

        b069.setOnClickListener(v02 -> {
            Toast toast = Toast.makeText(this, "Already filled", Toast.LENGTH_LONG);
            if(!b069.getText().toString().equals(" ")){
                toast.show();
            }
            else{
                b067.clearComposingText();
                b067.getText();
                button1.setOnClickListener(v12 -> b069.setText("1"));
                button2.setOnClickListener(v13 -> b069.setText("2"));
                button3.setOnClickListener(v14 -> b069.setText("3"));
                button4.setOnClickListener(v15 -> b069.setText("4"));
                button5.setOnClickListener(v16 -> b069.setText("5"));
                button6.setOnClickListener(v17 -> b069.setText("6"));
                button7.setOnClickListener(v18 -> b069.setText("7"));
                button8.setOnClickListener(v19 -> b069.setText("8"));
                button9.setOnClickListener(v20 -> b069.setText("9"));
                bdelete.setOnClickListener(v21 -> b069.setText(" "));

            }


        });


        b070.setOnClickListener(v02 -> {

            b070.clearComposingText();
            b070.getText();
            button1.setOnClickListener(v12 -> b070.setText("1"));
            button2.setOnClickListener(v13 -> b070.setText("2"));
            button3.setOnClickListener(v14 -> b070.setText("3"));
            button4.setOnClickListener(v15 -> b070.setText("4"));
            button5.setOnClickListener(v16 -> b070.setText("5"));
            button6.setOnClickListener(v17 -> b070.setText("6"));
            button7.setOnClickListener(v18 -> b070.setText("7"));
            button8.setOnClickListener(v19 -> b070.setText("8"));
            button9.setOnClickListener(v20 -> b070.setText("9"));
            bdelete.setOnClickListener(v21 -> b070.setText(" "));




        });

        b071.setOnClickListener(v02 -> {

            b071.clearComposingText();
            b071.getText();
            button1.setOnClickListener(v12 -> b071.setText("1"));
            button2.setOnClickListener(v13 -> b071.setText("2"));
            button3.setOnClickListener(v14 -> b071.setText("3"));
            button4.setOnClickListener(v15 -> b071.setText("4"));
            button5.setOnClickListener(v16 -> b071.setText("5"));
            button6.setOnClickListener(v17 -> b071.setText("6"));
            button7.setOnClickListener(v18 -> b071.setText("7"));
            button8.setOnClickListener(v19 -> b071.setText("8"));
            button9.setOnClickListener(v20 -> b071.setText("9"));
            bdelete.setOnClickListener(v21 -> b071.setText(" "));




        });


        b072.setOnClickListener(v02 -> {

            b072.clearComposingText();
            b072.getText();
            button1.setOnClickListener(v12 -> b072.setText("1"));
            button2.setOnClickListener(v13 -> b072.setText("2"));
            button3.setOnClickListener(v14 -> b072.setText("3"));
            button4.setOnClickListener(v15 -> b072.setText("4"));
            button5.setOnClickListener(v16 -> b072.setText("5"));
            button6.setOnClickListener(v17 -> b072.setText("6"));
            button7.setOnClickListener(v18 -> b072.setText("7"));
            button8.setOnClickListener(v19 -> b072.setText("8"));
            button9.setOnClickListener(v20 -> b072.setText("9"));
            bdelete.setOnClickListener(v21 -> b072.setText(" "));




        });


        b073.setOnClickListener(v02 -> {

            b073.clearComposingText();
            b073.getText();
            button1.setOnClickListener(v12 -> b073.setText("1"));
            button2.setOnClickListener(v13 -> b073.setText("2"));
            button3.setOnClickListener(v14 -> b073.setText("3"));
            button4.setOnClickListener(v15 -> b073.setText("4"));
            button5.setOnClickListener(v16 -> b073.setText("5"));
            button6.setOnClickListener(v17 -> b073.setText("6"));
            button7.setOnClickListener(v18 -> b073.setText("7"));
            button8.setOnClickListener(v19 -> b073.setText("8"));
            button9.setOnClickListener(v20 -> b073.setText("9"));
            bdelete.setOnClickListener(v21 -> b073.setText(" "));




        });


        b074.setOnClickListener(v02 -> {

            b074.clearComposingText();
            b074.getText();
            button1.setOnClickListener(v12 -> b074.setText("1"));
            button2.setOnClickListener(v13 -> b074.setText("2"));
            button3.setOnClickListener(v14 -> b074.setText("3"));
            button4.setOnClickListener(v15 -> b074.setText("4"));
            button5.setOnClickListener(v16 -> b074.setText("5"));
            button6.setOnClickListener(v17 -> b074.setText("6"));
            button7.setOnClickListener(v18 -> b074.setText("7"));
            button8.setOnClickListener(v19 -> b074.setText("8"));
            button9.setOnClickListener(v20 -> b074.setText("9"));
            bdelete.setOnClickListener(v21 -> b074.setText(" "));




        });


        b075.setOnClickListener(v02 -> {
            Toast toast = Toast.makeText(this, "Already filled", Toast.LENGTH_LONG);
            if(!b075.getText().toString().equals(" ")){
                toast.show();
            }
            else{
                b075.clearComposingText();
                b075.getText();
                button1.setOnClickListener(v12 -> b075.setText("1"));
                button2.setOnClickListener(v13 -> b075.setText("2"));
                button3.setOnClickListener(v14 -> b075.setText("3"));
                button4.setOnClickListener(v15 -> b075.setText("4"));
                button5.setOnClickListener(v16 -> b075.setText("5"));
                button6.setOnClickListener(v17 -> b075.setText("6"));
                button7.setOnClickListener(v18 -> b075.setText("7"));
                button8.setOnClickListener(v19 -> b075.setText("8"));
                button9.setOnClickListener(v20 -> b075.setText("9"));
                bdelete.setOnClickListener(v21 -> b075.setText(" "));

            }


        });


        b076.setOnClickListener(v02 -> {

            b076.clearComposingText();
            b076.getText();
            button1.setOnClickListener(v12 -> b076.setText("1"));
            button2.setOnClickListener(v13 -> b076.setText("2"));
            button3.setOnClickListener(v14 -> b076.setText("3"));
            button4.setOnClickListener(v15 -> b076.setText("4"));
            button5.setOnClickListener(v16 -> b076.setText("5"));
            button6.setOnClickListener(v17 -> b076.setText("6"));
            button7.setOnClickListener(v18 -> b076.setText("7"));
            button8.setOnClickListener(v19 -> b076.setText("8"));
            button9.setOnClickListener(v20 -> b076.setText("9"));
            bdelete.setOnClickListener(v21 -> b076.setText(" "));




        });

        b077.setOnClickListener(v02 -> {

            b077.clearComposingText();
            b077.getText();
            button1.setOnClickListener(v12 -> b077.setText("1"));
            button2.setOnClickListener(v13 -> b077.setText("2"));
            button3.setOnClickListener(v14 -> b077.setText("3"));
            button4.setOnClickListener(v15 -> b077.setText("4"));
            button5.setOnClickListener(v16 -> b077.setText("5"));
            button6.setOnClickListener(v17 -> b077.setText("6"));
            button7.setOnClickListener(v18 -> b077.setText("7"));
            button8.setOnClickListener(v19 -> b077.setText("8"));
            button9.setOnClickListener(v20 -> b077.setText("9"));
            bdelete.setOnClickListener(v21 -> b077.setText(" "));




        });


        b078.setOnClickListener(v02 -> {

            b078.clearComposingText();
            b078.getText();
            button1.setOnClickListener(v12 -> b078.setText("1"));
            button2.setOnClickListener(v13 -> b078.setText("2"));
            button3.setOnClickListener(v14 -> b078.setText("3"));
            button4.setOnClickListener(v15 -> b078.setText("4"));
            button5.setOnClickListener(v16 -> b078.setText("5"));
            button6.setOnClickListener(v17 -> b078.setText("6"));
            button7.setOnClickListener(v18 -> b078.setText("7"));
            button8.setOnClickListener(v19 -> b078.setText("8"));
            button9.setOnClickListener(v20 -> b078.setText("9"));
            bdelete.setOnClickListener(v21 -> b078.setText(" "));




        });


        b079.setOnClickListener(v02 -> {
            Toast toast = Toast.makeText(this, "Already filled", Toast.LENGTH_LONG);
            if(!b079.getText().toString().equals(" ")){
                toast.show();
            }
            else{
                b079.clearComposingText();
                b079.getText();
                button1.setOnClickListener(v12 -> b079.setText("1"));
                button2.setOnClickListener(v13 -> b079.setText("2"));
                button3.setOnClickListener(v14 -> b079.setText("3"));
                button4.setOnClickListener(v15 -> b079.setText("4"));
                button5.setOnClickListener(v16 -> b079.setText("5"));
                button6.setOnClickListener(v17 -> b079.setText("6"));
                button7.setOnClickListener(v18 -> b079.setText("7"));
                button8.setOnClickListener(v19 -> b079.setText("8"));
                button9.setOnClickListener(v20 -> b079.setText("9"));
                bdelete.setOnClickListener(v21 -> b079.setText(" "));

            }


        });


        b080.setOnClickListener(v02 -> {

            b080.clearComposingText();
            b080.getText();
            button1.setOnClickListener(v12 -> b080.setText("1"));
            button2.setOnClickListener(v13 -> b080.setText("2"));
            button3.setOnClickListener(v14 -> b080.setText("3"));
            button4.setOnClickListener(v15 -> b080.setText("4"));
            button5.setOnClickListener(v16 -> b080.setText("5"));
            button6.setOnClickListener(v17 -> b080.setText("6"));
            button7.setOnClickListener(v18 -> b080.setText("7"));
            button8.setOnClickListener(v19 -> b080.setText("8"));
            button9.setOnClickListener(v20 -> b080.setText("9"));
            bdelete.setOnClickListener(v21 -> b080.setText(" "));




        });


        b081.setOnClickListener(v02 -> {

            b081.clearComposingText();
            b081.getText();
            button1.setOnClickListener(v12 -> b081.setText("1"));
            button2.setOnClickListener(v13 -> b081.setText("2"));
            button3.setOnClickListener(v14 -> b081.setText("3"));
            button4.setOnClickListener(v15 -> b081.setText("4"));
            button5.setOnClickListener(v16 -> b081.setText("5"));
            button6.setOnClickListener(v17 -> b081.setText("6"));
            button7.setOnClickListener(v18 -> b081.setText("7"));
            button8.setOnClickListener(v19 -> b081.setText("8"));
            button9.setOnClickListener(v20 -> b081.setText("9"));
            bdelete.setOnClickListener(v21 -> b081.setText(" "));




        });


    }
}
