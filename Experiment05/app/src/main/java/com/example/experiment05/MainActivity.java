package com.example.experiment05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name;
    CheckBox music, game;
    RadioButton male, female;
    Button proceed, clear;
    RadioGroup radioGroup;
    String c1, c2, g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.etName);
        music = findViewById(R.id.checkMusic);
        game = findViewById(R.id.checkGaming);
        male = findViewById(R.id.radioMale);
        female = findViewById(R.id.radioFemale);
        proceed = findViewById(R.id.btnProceed);
        clear = findViewById(R.id.btnCancel);
        radioGroup = findViewById(R.id.radioGroup);

        if(radioGroup != null){
            radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int i) {
                    if(R.id.radioFemale == i){
                        g = female.getText().toString();
                    }else{
                        g = male.getText().toString();
                    }
                }
            });
        }
        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = name.getText().toString();

                // CheckBox selection
                if(music.isChecked()) {
                    c1 = music.getText().toString();
                }else if(game.isChecked()) {
                    c2 = game.getText().toString();
                }

                // Toast
                Toast.makeText(MainActivity.this, "You Name is : " + n , Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "You selected your hobbies as : " + c1 + " and " + c2, Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "You selected your gender as : " + g, Toast.LENGTH_SHORT).show();
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name.setText("");
                music.setChecked(false);
                game.setChecked(false);
                male.setChecked(false);
                female.setChecked(false);
            }
        });
    }
}

