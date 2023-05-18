package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.cardview.widget.CardView

class OtpScreenFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_otp_screen, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lateinit var box1:EditText
        lateinit var box2:EditText
        lateinit var box3:EditText
        lateinit var box4:EditText
        lateinit var box5:EditText
        lateinit var box6:EditText
        lateinit var submit:CardView

        box1=view.findViewById(R.id.box1)
        box2=view.findViewById(R.id.box2)
        box3=view.findViewById(R.id.box3)
        box4=view.findViewById(R.id.box4)
        box5=view.findViewById(R.id.box5)
        box6=view.findViewById(R.id.box6)
        box1.background=resources.getDrawable(R.drawable.otp_bg)
        box1.addTextChangedListener(object:TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                box1.requestFocus()
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if(box1.text.length==1)
                {
                    box2.requestFocus()
                    box2.background=resources.getDrawable(R.drawable.otp_bg)
                }
            }

            override fun afterTextChanged(p0: Editable?) {
                box1.background=null
            }

        })
        box2.addTextChangedListener(object:TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if(box2.text.length==1)
                {
                    box3.requestFocus()
                    box3.background=resources.getDrawable(R.drawable.otp_bg)
                }
            }

            override fun afterTextChanged(p0: Editable?) {
                    if(box2.text.length==0)
                    {
                        box1.requestFocus()
                        box1.background=resources.getDrawable(R.drawable.otp_bg)
                    }
                box2.background=null
            }

        })
        box3.addTextChangedListener(object:TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if(box3.text.length==1)
                {
                    box4.requestFocus()
                    box4.background=resources.getDrawable(R.drawable.otp_bg)
                }
            }

            override fun afterTextChanged(p0: Editable?) {
                if(box3.text.length==0)
                {
                    box2.requestFocus()
                    box2.background=resources.getDrawable(R.drawable.otp_bg)
                }
                box3.background=null
            }

        })
        box4.addTextChangedListener(object:TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if(box4.text.length==1)
                {
                    box5.requestFocus()
                    box5.background=resources.getDrawable(R.drawable.otp_bg)
                }
            }

            override fun afterTextChanged(p0: Editable?) {
                if(box4.text.length==0)
                {
                    box3.requestFocus()
                    box3.background=resources.getDrawable(R.drawable.otp_bg)
                }
                box4.background=null
            }

        })
        box5.addTextChangedListener(object:TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if(box5.text.length==1)
                {
                    box6.requestFocus()
                    box6.background=resources.getDrawable(R.drawable.otp_bg)
                }
            }

            override fun afterTextChanged(p0: Editable?) {
                if(box5.text.length==0)
                {
                    box4.requestFocus()
                    box4.background=resources.getDrawable(R.drawable.otp_bg)
                }
                box5.background=null
            }

        })
        box6.addTextChangedListener(object:TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                    box6.background=resources.getDrawable(R.drawable.otp_bg)

            }

            override fun afterTextChanged(p0: Editable?) {
                if(box6.text.length==0)
                {
                    box5.requestFocus()
                    box5.background=resources.getDrawable(R.drawable.otp_bg)
                }
                box5.background=null
            }

        })
        submit=view.findViewById(R.id.submit)
        submit.setOnClickListener{
           val intent= Intent(requireContext(), ZomatoHomeScreen::class.java)
            startActivity(intent)
        }



    }

}