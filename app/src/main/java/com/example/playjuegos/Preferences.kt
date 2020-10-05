package com.example.playjuegos

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.RatingBar
import android.widget.SeekBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class Preferences: AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.preferences)


        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        val sb = findViewById(R.id.seekBar1) as SeekBar
        val rb = findViewById(R.id.ratingBar1) as RatingBar

        rb.onRatingBarChangeListener = RatingBar.OnRatingBarChangeListener{ ratingBar, rating, fromUser ->
                sb.progress = rating.toInt()
            }

        sb.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                rb.rating = progress.toFloat()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })

        val fab : FloatingActionButton = findViewById(R.id.floatingActionButton2)
        fab.setOnClickListener{Toast.makeText(getApplicationContext(), rb.rating.toString(), Toast.LENGTH_LONG).show()}


    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

}