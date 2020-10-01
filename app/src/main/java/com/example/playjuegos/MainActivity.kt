package com.example.playjuegos

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val player = findViewById(R.id.newPlayer) as Button
        player.setOnClickListener { lanzarNewPlayer() }

        val titulo = findViewById(R.id.titulo) as TextView
        titulo.setTypeface(Typeface.createFromAsset(assets, "Chicken Quiche.ttf"))


        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

    }

    fun lanzarNewPlayer(){
        val i = Intent(this, NewPlayer::class.java)
        startActivity(i)
    }

    fun lanzarGeneros(){
        val i = Intent(this, Genero::class.java)
        startActivity(i)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.getItemId()) {
            (R.id.action_search) ->{lanzarGeneros()
            return true}
            (R.id.action_add) -> {return true}
            else -> {return super.onOptionsItemSelected(item)} }
    }

}