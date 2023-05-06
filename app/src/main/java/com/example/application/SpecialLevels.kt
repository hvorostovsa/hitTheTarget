package com.example.application

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.example.application.level.bubblelevel.BubbleLevel
import com.example.application.level.StarLevel
import com.example.application.level.bubblelevel.BubbleSettings

class SpecialLevels : MyActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_special_levels)
    }

    fun onClickReturnButton(view: View) {
        startActivity(Intent(this, LevelMenu::class.java))
    }

    fun onBubbleButtonButton(view: View) {
        startActivity(Intent(this, BubbleSettings::class.java))
    }

    fun onStarButtonClick(view: View) {
        startActivity(Intent(this, StarLevel::class.java))
    }
}