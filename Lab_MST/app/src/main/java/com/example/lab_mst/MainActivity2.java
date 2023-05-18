package com.example.lab_mst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity {
    Button prev;
    TextView displayName, displayAge, displaySubject;
    Intent n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        prev=findViewById(R.id.btnPrev);
        displayAge=findViewById(R.id.dAge);
        displayName=findViewById(R.id.dName);
        displaySubject=findViewById(R.id.dSubject);
        n=getIntent();
        String receiveName = n.getStringExtra("Name");
        displayName.setText(receiveName);

        String receiveAge = n.getStringExtra("Age");
        displayAge.setText(receiveAge);

        String receiveSubject = n.getStringExtra("Subject");
        displaySubject.setText(receiveSubject);

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}

