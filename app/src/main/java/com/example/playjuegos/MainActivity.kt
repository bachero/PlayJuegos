package com.example.playjuegos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val player = findViewById(R.id.newPlayer) as Button
        player.setOnClickListener { lanzarNewPlayer() }

    }

    fun lanzarNewPlayer(){
        val i = Intent(this, NewPlayer::class.java)
        startActivity(i)
    }

}