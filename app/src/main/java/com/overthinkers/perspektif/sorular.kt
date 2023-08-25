package com.overthinkers.perspektif

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.sorular.*

class sorular : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.decorView.systemUiVisibility=View.SYSTEM_UI_FLAG_FULLSCREEN or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY or View.SYSTEM_UI_FLAG_LAYOUT_STABLE or  View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_FULLSCREEN
        setContentView(R.layout.sorular)
    }

    fun soru_bir(view: View)
    {
        val intent=Intent(applicationContext,soru_1::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.anim, R.anim.anim2)
        finish()
    }

    fun soru_iki(view: View)
    {
        var sharedPreferences = getSharedPreferences("kayitlar", Context.MODE_PRIVATE)
        var cevap=sharedPreferences.getString("cevapkaydi2","hata")
        if (cevap=="doğru")
        {
            val intent=Intent(applicationContext,soru_2::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.anim, R.anim.anim2)
            finish()
        }
        else
        {
            Toast.makeText(this, "Henüz 1. soruyu cevaplamadın ki!", Toast.LENGTH_LONG).show()
        }
    }

    fun soru_uc(view: View)
    {
        var sharedPreferences = getSharedPreferences("kayitlar", Context.MODE_PRIVATE)
        var cevap=sharedPreferences.getString("cevapkaydi2","hata")
        if (cevap=="doğru")
        {
            val intent=Intent(applicationContext,soru_3::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.anim, R.anim.anim2)
            finish()
        }
        else
        {
            Toast.makeText(this, "Henüz 2. soruyu cevaplamadın ki!", Toast.LENGTH_LONG).show()
        }
    }

    fun geri(view: View)
    {
        geri2.animate().apply {
            duration=150
            alpha(0f)}.withEndAction {
            geri2.animate().apply {
                duration=150
                alpha(1f)}}
        onBackPressed()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.anim3, R.anim.anim4)
        finish()
    }
}