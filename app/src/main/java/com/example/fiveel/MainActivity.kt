package com.example.fiveel

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.SystemClock
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible
import kotlin.random.Random
import android.widget.Chronometer
import com.example.fiveel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.chronometer.base = SystemClock.elapsedRealtime()
        binding.chronometer.start()
        imgPlayer = findViewById(R.id.playerIM)
        bot = findViewById(R.id.botIM)
        ress = findViewById(R.id.resultation)
        resulttext = findViewById(R.id.Rezult)
        Wont=findViewById(R.id.wwintxt)
        Loset=findViewById(R.id.losetxt)
        Game1=findViewById(R.id.Game)
        img=findViewById(R.id.IM)
        img.setImageResource(R.drawable.ddd)
        chron=findViewById(R.id.chronometer)
    }
    lateinit var imgPlayer: ImageView
    lateinit var chron:TextView
    lateinit var img: ImageView
    lateinit var bot: ImageView
    lateinit var ress: ImageView
    lateinit var resulttext: TextView
    lateinit var Wont: TextView
    lateinit var Loset: TextView
    lateinit var Game1: Button
    var player:Int=0
    var botNum=0
    var start=1
    var end=5
    var win=0
    var lose=0
    fun Stoun(view: View) {
        player = 1
        imgPlayer.setImageResource(R.drawable.rockk)
        bot.setImageResource(R.drawable.booot)
        Game1.isEnabled=true
    }
    fun Scissors(view: View) {
        player = 2
        imgPlayer.setImageResource(R.drawable.nogn)
        bot.setImageResource(R.drawable.booot)
        Game1.isEnabled=true
    }

    fun Paper(view: View) {
        player = 3
        imgPlayer.setImageResource(R.drawable.paper)
        bot.setImageResource(R.drawable.booot)
        Game1.isEnabled=true
    }
    fun lizard(view: View) {
        player = 4
        imgPlayer.setImageResource(R.drawable.ysher)
        bot.setImageResource(R.drawable.booot)
        Game1.isEnabled=true
    }

    fun Spok(view: View) {
        player = 5
        imgPlayer.setImageResource(R.drawable.spok)
        bot.setImageResource(R.drawable.booot)
        Game1.isEnabled=true
    }
    fun Game(view: View){
        Game1.isEnabled=false
        when(player==0){
            true -> resulttext.text = "Пожалуйста выбирите 1 из 5 вариантов"
            else ->{
                botNum = start + (Math.random() * end).toInt()
                when(player){
                    1->imgPlayer.setImageResource(R.drawable.rockk)
                    2->imgPlayer.setImageResource(R.drawable.nogn)
                    3->imgPlayer.setImageResource(R.drawable.paper)
                    4->imgPlayer.setImageResource(R.drawable.ysher)
                    5->imgPlayer.setImageResource(R.drawable.spok)
                }
                when(botNum){
                    1->bot.setImageResource(R.drawable.rockk)
                    2->bot.setImageResource(R.drawable.nogn)
                    3->bot.setImageResource(R.drawable.paper)
                    4->bot.setImageResource(R.drawable.ysher)
                    5->bot.setImageResource(R.drawable.spok) }
                check() }
        }
        Wont.text=win.toString()
        Loset.text=lose.toString() }
    private fun Won(){
        win++;
        ress.setImageResource(R.drawable.win)
    }
    private fun lose(){
        lose++;
        ress.setImageResource(R.drawable.over)
    }
    private fun check() {
        when (player) {
            1 -> when (botNum) {
                5, 3 -> lose()
                2, 4 -> Won()
                1 -> ress.setImageResource(R.drawable.nt)
            }
            2 -> when (botNum) {
                4, 3 -> Won()
                1, 5 -> lose()
                2 -> ress.setImageResource(R.drawable.nt)
            }
            3 -> when (botNum) {
                5, 1 -> Won()
                4, 2 -> lose()
                3 -> ress.setImageResource(R.drawable.nt)
            }
            4 -> when (botNum) {
                1, 2 -> lose()
                3, 5 -> Won()
                4 -> ress.setImageResource(R.drawable.nt)
            }
            5 -> when (botNum) {
                3, 4 -> lose()
                2, 1 -> Won()
                5 -> ress.setImageResource(R.drawable.nt)
            }
        }

    }
}










