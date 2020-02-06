package com.example.mrpotatohead

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun addParts(view: View) {
        val img = when(view){
            arms -> armyarms
            ears -> earyears
            hat -> hattyhat
            nose -> noseynose
            glasses -> glassyglasses
            eyes -> eyeyeyes
            shoes -> shoeyshoes
            eyebrows -> browybrows
            mouth -> mouthymouth
            else -> stacheystache
        }
        if (img.isVisible){
            img.visibility = View.INVISIBLE
        } else {
            img.visibility = View.VISIBLE
        }
    }

}
