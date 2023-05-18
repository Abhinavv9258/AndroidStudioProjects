package com.example.dialogbox

import android.app.AlertDialog
import android.app.Dialog
import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lateinit var btn:Button
        lateinit var btn2:Button
        var builder=AlertDialog.Builder(this)
       val progressDialog = ProgressDialog(this)

        btn=findViewById(R.id.click)
        btn2=findViewById(R.id.progress)
        btn.setOnClickListener{
            builder.setTitle("AlertBox")
            builder.setMessage("Are you sure you want to exit")
            builder.setPositiveButton("yes"){dialog,which->
                Toast.makeText(this,"Thanks for using ",Toast.LENGTH_SHORT).show()

                finish()
        }
            builder.setNegativeButton("No"){dialog,which->
                Toast.makeText(this,"Activity Resume",Toast.LENGTH_SHORT).show()
            }
            builder.show()
        }
        btn2.setOnClickListener{
            progressDialog.setTitle("Wait for response")
            progressDialog.setMessage("Just a moment")
            progressDialog.show()
        }
    }
}