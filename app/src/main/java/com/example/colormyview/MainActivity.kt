package com.example.colormyview

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> = listOf(Box_one_text, Box_two_text, Box_three_text,
            Box_four_text, Box_five_text, Constraint_layout,
            Red_button, Yellow_button, Green_button)

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }
    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.Constraint_layout -> view.setBackgroundColor(Color.DKGRAY)
            R.id.Box_two_text -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.Box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.Box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.Box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            //Boxes using custom colors for background
            R.id.Red_button -> Box_three_text.setBackgroundResource(R.color.my_red)
            R.id.Yellow_button -> Box_four_text.setBackgroundResource(R.color.my_yellow)
            R.id.Green_button -> Box_five_text.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
