package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.navigation.fragment.NavHostFragment

class LoginScreenFragment : Fragment() {


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
        return inflater.inflate(R.layout.fragment_login_screen, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lateinit  var next:CardView
        val navController=NavHostFragment.findNavController(this)
        next=view.findViewById(R.id.next)
      next.setOnClickListener{
          navController.navigate(R.id.action_loginScreenFragment_to_otpScreenFragment)
      }

    }
}
//private  fun  isValid(phoneNumber:String):Boolean
//{
//    va
//    val reg="^[0-9]{10}$"
//    return reg.matches(reg)
//
//}