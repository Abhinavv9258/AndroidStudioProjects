package com.example.experiment07fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button button1,button2;
    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        linearLayout = findViewById(R.id.linearlayout);
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Fragment1 firstFragment = new Fragment1();
//                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//                transaction.replace(R.id.linearlayout,firstFragment);
//                transaction.commit();
//            }
//        });

        button1.setOnClickListener(view ->{
            Fragment1 firstFragment = new Fragment1();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.linearlayout,firstFragment);
            transaction.commit();
        });
        button2.setOnClickListener(view->{
            Fragment2 secondFragment = new Fragment2();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.linearlayout,secondFragment);
            fragmentTransaction.commit();
        });
    }
}