package com.haripriya.e_kindergarten

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.util.Log
import kotlinx.android.synthetic.main.activity_colors_click.*
import kotlinx.android.synthetic.main.activity_story_teller.*
import java.util.*

class StoryTellerActivity : AppCompatActivity(), TextToSpeech.OnInitListener {

    var tts: TextToSpeech? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story_teller)
        tts = TextToSpeech(this, this)
        story1.setOnClickListener{
            val text = "A mother dog and her pups lived on a farm. On the farm, there was a well. The mother dog always told her pups never to go near or play around it." +
                    "One day, one of the pups was overcome by curiosity and wondered why they weren’t allowed to go near the well. So, he decided he wanted to explore it." +
                    "He went down to the well and climbed up the wall to peek inside. In the well, he saw his reflection in the water but thought it was another dog. The little pup got angry when his reflection was imitating him, so he decided to fight it." +
                    "The little pup jumped into the well, only to find there was no dog. He began to bark and bark until the farmer came to rescue him. The pup had learned his lesson and never went back to the well again." +
                    "Moral of the story is Always listen to what elders say and don’t defy them."
            tts!!.speak(text, TextToSpeech.QUEUE_FLUSH, null,"")

        }
        story2.setOnClickListener{
            val text="One day, two friends were walking through the forest. They knew the forest was a dangerous place and that anything could happen. So, they promised to remain close to each other in case of any danger." +

                    "All of a sudden, a big bear was approaching them. One of the friends quickly climbed a nearby tree, leaving the other friend behind." +

                    "The other friend did not know how to climb, and instead, followed common sense. He laid down on the ground and remained there, breathless, pretending to be dead." +

                    "The bear approached the friend lying on the ground. The animal started to smell his ear before slowly wandering off again because bears never touch those who are dead." +

                    "Soon, the friend who hid in the tree came down. He asked his friend, “My dear friend, what secret did the bear whisper to you?” The friend replied, “The bear simply advised me never to believe a false friend." +
                    "Moral of the story is A true friend will always support and stand by you in any situation."
            tts!!.speak(text, TextToSpeech.QUEUE_FLUSH, null,"")
        }
        story3.setOnClickListener{
            val text = "A lone elephant walked through the forest, looking for friends. She soon saw a monkey and proceeded to ask, ‘Can we be friends, monkey?’" +

                    "The monkey quickly replied, ‘You are big and can’t swing on trees like I do, so I cannot be your friend.’" +

                    "Defeated, the elephant continued to search when it stumbled across a rabbit. She proceeded to ask him, ‘Can we be friends, rabbit?’" +

                    "The rabbit looked at the elephant and replied, “You are too big to fit inside my burrow. You cannot be my friend.”" +

                    "Then, the elephant continued until she met a frog. She asked, “Will you be my friend, frog?”" +

                    "The frog replied, “You are too big and heavy; you cannot jump like me. I am sorry, but you can’t be my friend.”" +

                    "The elephant continued to ask the animals she met on her way, but always received the same reply. The following day, the elephant saw all the forest animals run in fear. She stopped a bear to ask what was happening and was told the tiger was attacking all the small animals." +

                    "The elephant wanted to save the other animals, so she went to the tiger and said, “Please, sir, leave my friends alone. Do not eat them.”" +

                    "The tiger didn’t listen. He merely told the elephant to mind her own business." +

                    "Seeing no other way, the elephant kicked the tiger and scared him away. Upon hearing of the brave tale, the other animals agreed, “You are just the right size to be our friend.”" +
                    "Moral of the story is Friends come in every shape and size."
            tts!!.speak(text, TextToSpeech.QUEUE_FLUSH, null,"")
        }
        story4.setOnClickListener{
            val text = "Once upon a time, a farmer had a goose that laid one golden egg every day. The egg provided enough money for the farmer and his wife to support their daily needs. The farmer and his wife continued to be happy for a long time." +

                    "But, one day, the farmer thought to himself, “Why should we take just one egg a day? Why can’t we take them all at once and make a lot of money?” The farmer told his wife his idea, and she foolishly agreed." +

                    "Then, the next day, as the goose laid its golden egg, the farmer was quick with a sharp knife. He killed the goose and cut its stomach open, in the hopes of finding all its golden eggs. But, as he opened the stomach, the only thing he found was guts and blood." +

                    "The farmer quickly realized his foolish mistake and proceeded to cry over his lost resource. As the days went on, the farmer and his wife became poorer and poorer. How jinxed and how foolish they were." +
                    "Moral of the Story is Never act before you think."
            tts!!.speak(text, TextToSpeech.QUEUE_FLUSH, null,"")
        }

        stop.setOnClickListener{
            if (tts != null) {
                tts!!.stop()
            }
        }
    }

    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS) {
            // set US English as language for tts
            val result = tts!!.setLanguage(Locale.US)
            tts!!.setSpeechRate(0.75f)
            tts!!.setPitch(1.25f)

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
