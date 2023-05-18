package com.example.lab_mst;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name,age,subject;
    Button submit,cancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.etName);
        age=findViewById(R.id.etAge);
        subject=findViewById(R.id.etSubject);
        submit=findViewById(R.id.btnSubmit);
        cancel=findViewById(R.id.btnCancel);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n= name.getText().toString();
                String a= age.getText().toString();
                String s= subject.getText().toString();
                Intent i=new Intent(getApplicationContext(),MainActivity2.class);
                i.putExtra("Name",n);
                i.putExtra("Age",a);
                i.putExtra("Subject",s);
                startActivity(i);
            }
        });
        cancel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                name.setText("");
                age.setText("");
                subject.setText("");
            }
        });

    }
}