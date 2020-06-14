package com.haripriya.e_kindergarten

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_colors_click.*
import java.util.*

class ColorsClickActivity : AppCompatActivity(), TextToSpeech.OnInitListener {

    var tts: TextToSpeech? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_colors_click)
        tts = TextToSpeech(this, this)
        red.setOnClickListener{
            red.text=getString(R.string.red)
            tts!!.speak(red.text, TextToSpeech.QUEUE_FLUSH, null,"")
            red.postDelayed({
                red.text=" "

            },3000)
        }
        green.setOnClickListener{
            green.text=getString(R.string.green)
            tts!!.speak(green.text, TextToSpeech.QUEUE_FLUSH, null,"")
            green.postDelayed({
                green.text=" "

            },3000)
        }
        yellow.setOnClickListener{
            yellow.text=getString(R.string.yellow)
            tts!!.speak(yellow.text, TextToSpeech.QUEUE_FLUSH, null,"")
            yellow.postDelayed({
                yellow.text=" "
            },3000)
        }
        white.setOnClickListener{
            white.text=getString(R.string.white)
            tts!!.speak(white.text, TextToSpeech.QUEUE_FLUSH, null,"")
            white.postDelayed({
                white.text=" "
            },3000)
        }
        black.setOnClickListener{
            black.text=getString(R.string.black)
            tts!!.speak(black.text, TextToSpeech.QUEUE_FLUSH, null,"")
            black.postDelayed({
                black.text=" "
            },3000)
        }
        blue.setOnClickListener{
            blue.text=getString(R.string.blue)
            tts!!.speak(blue.text, TextToSpeech.QUEUE_FLUSH, null,"")
            blue.postDelayed({
                blue.text=" "
            },3000)
        }
        maroon.setOnClickListener{
            maroon.text=getString(R.string.maroon)
            tts!!.speak(maroon.text, TextToSpeech.QUEUE_FLUSH, null,"")
            maroon.postDelayed({
                maroon.text=" "
            },3000)
        }
        grey.setOnClickListener{
            grey.text=getString(R.string.grey)
            tts!!.speak(grey.text, TextToSpeech.QUEUE_FLUSH, null,"")
            grey.postDelayed({
                grey.text=" "
            },3000)
        }
        orange.setOnClickListener{
            orange.text=getString(R.string.orange)
            tts!!.speak(orange.text, TextToSpeech.QUEUE_FLUSH, null,"")
            orange.postDelayed({
                orange.text=" "
            },3000)
        }

    }

    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS) {
            // set US English as language for tts
            val result = tts!!.setLanguage(Locale.US)

            if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                Log.e("TTS","The Language specified is not supported!")
            }
        } else {
            Log.e("TTS", "Initilization Failed!")
        }
    }
    public override fun onDestroy() {
        // Shutdown TTS
        if (tts != null) {
            tts!!.stop()
            tts!!.shutdown()
        }
        super.onDestroy()
    }
}
