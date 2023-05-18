package com.example.sendsms;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import android.Manifest;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText contact, message;
    Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contact=findViewById(R.id.etContact);
        message=findViewById(R.id.etMessage);
        send=findViewById(R.id.btnSend);

//        for user permission
        ActivityCompat.requestPermissions(MainActivity.this,new String[]
                {Manifest.permission.SEND_SMS,Manifest.permission.RECEIVE_SMS,Manifest.permission.READ_SMS},
                PackageManager.PERMISSION_GRANTED);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n=contact.getText().toString().trim();
                String msg=message.getText().toString();
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                PendingIntent pi = PendingIntent.getActivity(getApplicationContext(),0,i,0);

                SmsManager manager = SmsManager.getDefault();
                manager.sendTextMessage(n,null,msg,pi,null);
                Toast.makeText(MainActivity.this, "Message has been sent to : " + n, Toast.LENGTH_SHORT).show();

            }
        });

    }
}