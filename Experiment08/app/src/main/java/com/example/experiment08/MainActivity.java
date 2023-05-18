package com.example.experiment08;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button sendBtn,gotoNext;
    EditText name;
    MyBroadcastReceiver receiver = new MyBroadcastReceiver();
    IntentFilter inf = new IntentFilter();
    protected void onPause() {
        super.onPause();
        unregisterReceiver(receiver);
    }
    protected void onResume() {
        super.onResume();
        registerReceiver(receiver, inf);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendBtn=findViewById(R.id.submitBtn);
        gotoNext=findViewById(R.id.gotoNext);
        name=findViewById(R.id.etName);
        inf.addAction(Intent.ACTION_POWER_CONNECTED);
        inf.addAction(Intent.ACTION_POWER_DISCONNECTED);
        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n= name.getText().toString();
                Intent i=new Intent(getApplicationContext(),MainActivity2.class);
                i.putExtra("Name",n);
                startActivity(i);
            }
        });
        gotoNext.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i=new Intent(getApplicationContext(),MainActivity3.class);
                startActivity(i);
            }
        });
    }
}