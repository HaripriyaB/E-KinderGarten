package com.haripriya.e_kindergarten

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        animalpool.setOnClickListener{
            startActivity(Intent(this,AnimalPoolActivity::class.java))
        }
        colorsclick.setOnClickListener{
            startActivity(Intent(this,ColorsClickActivity::class.java))
        }
        storyteller.setOnClickListener{
            startActivity(Intent(this,StoryTellerActivity::class.java))
        }
    }
}
