package com.haripriya.e_kindergarten

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class AnimalPoolActivity : AppCompatActivity() {

    lateinit var catimage : ImageView
    lateinit var dogimage : ImageView
    lateinit var cowimage : ImageView
    lateinit var pigimage : ImageView
    lateinit var chickenimage : ImageView
    lateinit var snakeimage : ImageView
    lateinit var donkeyimage : ImageView
    lateinit var owlimage : ImageView
    lateinit var squirrelimage : ImageView
    lateinit var monkeyimage : ImageView

    lateinit var textyouclicked : TextView
    lateinit var textitemclicked : TextView

    lateinit var mediaPlayer: MediaPlayer
    private lateinit var runnable:Runnable
    private var handler: Handler = Handler()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        catimage=findViewById(R.id.cat)
        dogimage=findViewById(R.id.dog)
        cowimage=findViewById(R.id.cow)
        pigimage=findViewById(R.id.pig)
        monkeyimage=findViewById(R.id.monkey)
        chickenimage=findViewById(R.id.chicken)
        owlimage=findViewById(R.id.owl)
        donkeyimage=findViewById(R.id.donkey)
        snakeimage=findViewById(R.id.snake)
        squirrelimage=findViewById(R.id.squirrel)

        textyouclicked = findViewById(R.id.textview)
        textitemclicked = findViewById(R.id.itemclicked)

        catimage.setOnClickListener {
            makeSound(0)
        }
        dogimage.setOnClickListener {
            makeSound(1)
        }
        cowimage.setOnClickListener {
            makeSound(2)
        }
        pigimage.setOnClickListener {
            makeSound(3)
        }
        chickenimage.setOnClickListener {
            makeSound(4)
        }
        donkeyimage.setOnClickListener {
            makeSound(5)
        }
        monkeyimage.setOnClickListener {
            makeSound(6)
        }
        snakeimage.setOnClickListener {
            makeSound(7)
        }
        owlimage.setOnClickListener {
            makeSound(8)
        }
        squirrelimage.setOnClickListener {
            makeSound(9)
        }
    }

    private fun makeSound(i: Int) {
        when(i){
            0 -> {
                mediaPlayer = MediaPlayer.create(this, R.raw.catsound)
                mediaPlayer.start()
                textyouclicked.visibility= View.VISIBLE
                textitemclicked.text = getString(R.string.cat)
                textyouclicked.postDelayed({
                    textyouclicked.visibility=View.GONE

                },3000)
                textitemclicked.postDelayed({
                    textitemclicked.text=" "
                },3000)
            }
            1 ->{
                mediaPlayer = MediaPlayer.create(this, R.raw.dogsound)
                mediaPlayer.start()
                textyouclicked.visibility= View.VISIBLE
                textitemclicked.text = getString(R.string.dog)
                textyouclicked.postDelayed({
                    textyouclicked.visibility=View.GONE

                },3000)
                textitemclicked.postDelayed({
                    textitemclicked.text=" "
                },3000)
            }
            2 ->{
                mediaPlayer = MediaPlayer.create(this, R.raw.cowsound)
                mediaPlayer.start()
                textyouclicked.visibility= View.VISIBLE
                textitemclicked.text = getString(R.string.cow)
                textyouclicked.postDelayed({
                    textyouclicked.visibility=View.GONE

                },3000)
                textitemclicked.postDelayed({
                    textitemclicked.text=" "
                },3000)
            }
            3->{
                mediaPlayer = MediaPlayer.create(this, R.raw.pigsound)
                mediaPlayer.start()
                textyouclicked.visibility= View.VISIBLE
                textitemclicked.text = getString(R.string.pig)
                textyouclicked.postDelayed({
                    textyouclicked.visibility=View.GONE

                },3000)
                textitemclicked.postDelayed({
                    textitemclicked.text=" "
                },3000)
            }
            4->{
                mediaPlayer = MediaPlayer.create(this, R.raw.chickensound)
                mediaPlayer.start()
                textyouclicked.visibility= View.VISIBLE
                textitemclicked.text = getString(R.string.chicken)
                textyouclicked.postDelayed({
                    textyouclicked.visibility=View.GONE

                },3000)
                textitemclicked.postDelayed({
                    textitemclicked.text=" "
                },3000)
            }
            5->{
                mediaPlayer = MediaPlayer.create(this, R.raw.donkeysound)
                mediaPlayer.start()
                textyouclicked.visibility= View.VISIBLE
                textitemclicked.text = getString(R.string.donkey)
                textyouclicked.postDelayed({
                    textyouclicked.visibility=View.GONE

                },3000)
                textitemclicked.postDelayed({
                    textitemclicked.text=" "
                },3000)
            }
            6->{
                mediaPlayer = MediaPlayer.create(this, R.raw.monkeysound)
                mediaPlayer.start()
                textyouclicked.visibility= View.VISIBLE
                textitemclicked.text = getString(R.string.monkey)
                textyouclicked.postDelayed({
                    textyouclicked.visibility=View.GONE

                },3000)
                textitemclicked.postDelayed({
                    textitemclicked.text=" "
                },3000)
            }
            7->{
                mediaPlayer = MediaPlayer.create(this, R.raw.snakesound)
                mediaPlayer.start()
                textyouclicked.visibility= View.VISIBLE
                textitemclicked.text = getString(R.string.snake)
                textyouclicked.postDelayed({
                    textyouclicked.visibility=View.GONE

                },3000)
                textitemclicked.postDelayed({
                    textitemclicked.text=" "
                },3000)
            }
            8->{
                mediaPlayer = MediaPlayer.create(this, R.raw.owlsound)
                mediaPlayer.start()
                textyouclicked.visibility= View.VISIBLE
                textitemclicked.text = getString(R.string.owl)
                textyouclicked.postDelayed({
                    textyouclicked.visibility=View.GONE

                },3000)
                textitemclicked.postDelayed({
                    textitemclicked.text=" "
                },3000)
            }
            9->{
                mediaPlayer = MediaPlayer.create(this, R.raw.squirrelsound)
                mediaPlayer.start()
                textyouclicked.visibility= View.VISIBLE
                textitemclicked.text = getString(R.string.squirrel)
                textyouclicked.postDelayed({
                    textyouclicked.visibility=View.GONE

                },3000)
                textitemclicked.postDelayed({
                    textitemclicked.text=" "
                },3000)
            }
        }
    }
}
