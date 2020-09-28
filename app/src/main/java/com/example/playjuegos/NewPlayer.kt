package com.example.playjuegos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar

class NewPlayer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.newplayer)


        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.getItemId()) {
            (R.id.action_search) -> {return true}
            (R.id.action_add) -> {return true}
            else -> {return super.onOptionsItemSelected(item)} }
    }
}