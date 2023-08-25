package com.overthinkers.perspektif

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.ipuclari.*
import kotlin.concurrent.thread

class ipuclari : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        window.decorView.systemUiVisibility =View.SYSTEM_UI_FLAG_FULLSCREEN or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY or View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_FULLSCREEN
        setContentView(R.layout.ipuclari)
        var sharedPreferences0 = getSharedPreferences("ipuclari", Context.MODE_PRIVATE)
        var kredisayisison=sharedPreferences0.getInt("kredi",0)
        kreditext.setText(kredisayisison.toString())
        ipucuyazi.animate().apply {
            duration=0
            scaleX(0f)
            scaleY(0f)}
        ipucuyazi2.animate().apply {
            duration=0
            scaleX(0f)
            scaleY(0f)}
        ipucuyazi3.animate().apply {
            duration=0
            scaleX(0f)
            scaleY(0f)}
    }

    fun bir (view: View)
    {
        var sharedPreferences0 = getSharedPreferences("ipuclari", Context.MODE_PRIVATE)
        var kredisayisiilk=sharedPreferences0.getInt("kredi",0)
        if (kredisayisiilk>=1)
        {
            sharedPreferences0.edit().putInt("kredi", kredisayisiilk - 1).apply()
            var kredisayisison=sharedPreferences0.getInt("kredi",0)
            kreditext.setText(kredisayisison.toString())
            val intent = intent
            val alinanVeri = intent.getStringExtra("yollananVeri")
            if (alinanVeri == "1")
            {
                ipucuyazi.setBackgroundResource(R.drawable.arkaplan_en_kucuk)
                ipucuyazi.animate().apply{
                    duration=200
                    scaleX(1f)
                    scaleY(1f)}.start()
                ipucuyazi.setText("1. sorunun 1.ipucusu")
            }
            else if(alinanVeri=="2")
            {
                ipucuyazi.setBackgroundResource(R.drawable.arkaplan_en_kucuk)
                ipucuyazi.animate().apply {
                    duration=200
                    scaleX(1f)
                    scaleY(1f)}
                ipucuyazi.setText("2.sorunun 1. ipucusu")
            }
            else if(alinanVeri=="3")
            {
                ipucuyazi.setBackgroundResource(R.drawable.arkaplan_en_kucuk)
                ipucuyazi.animate().apply {
                    duration=200
                    scaleX(1f)
                    scaleY(1f)}
                ipucuyazi.setText("3.sorunun 1. ipucusu")
            }
            else
            {
                Toast.makeText(this, "hata oluştu", Toast.LENGTH_SHORT).show()
            }
        }
        else
        {
            Toast.makeText(this, "kredin yetersiz", Toast.LENGTH_SHORT).show()
        }
    }

    fun iki (view: View)
    {
        var sharedPreferences0 = getSharedPreferences("ipuclari", Context.MODE_PRIVATE)
        var kredisayisiilk=sharedPreferences0.getInt("kredi",0)
        if (kredisayisiilk>=3)
        {
            sharedPreferences0.edit().putInt("kredi", kredisayisiilk - 3).apply()
            var kredisayisison=sharedPreferences0.getInt("kredi",0)
            kreditext.setText(kredisayisison.toString())
            val intent = intent
            val alinanVeri = intent.getStringExtra("yollananVeri")
            if (alinanVeri == "1")
            {
                ipucuyazi2.setBackgroundResource(R.drawable.arkaplan_en_kucuk)
                ipucuyazi2.animate().apply {
                    duration=200
                    scaleX(1f)
                    scaleY(1f)}
                ipucuyazi2.setText("1. sorunun 2.ipucusu")
            }
            else if(alinanVeri=="2")
            {
                ipucuyazi2.setBackgroundResource(R.drawable.arkaplan_en_kucuk)
                ipucuyazi2.animate().apply {
                    duration=200
                    scaleX(1f)
                    scaleY(1f)}
                ipucuyazi2.setText("2.sorunun 2. ipucusu")
            }
            else if(alinanVeri=="3")
            {
                ipucuyazi2.setBackgroundResource(R.drawable.arkaplan_en_kucuk)
                ipucuyazi2.animate().apply {
                    duration=200
                    scaleX(1f)
                    scaleY(1f)}
                ipucuyazi2.setText("3.sorunun 2. ipucusu")
            }
            else
            {
                Toast.makeText(this, "hata oluştu", Toast.LENGTH_SHORT).show()
            }
        }
        else
        {
            Toast.makeText(this, "kredin yetersiz", Toast.LENGTH_SHORT).show()
        }
    }

    fun uc (view: View)
    {
        var sharedPreferences0 = getSharedPreferences("ipuclari", Context.MODE_PRIVATE)
        var kredisayisiilk=sharedPreferences0.getInt("kredi",0)
        if (kredisayisiilk>=6)
        {
            sharedPreferences0.edit().putInt("kredi", kredisayisiilk - 6).apply()
            var kredisayisison=sharedPreferences0.getInt("kredi",0)
            kreditext.setText(kredisayisison.toString())
            val intent = intent
            val alinanVeri = intent.getStringExtra("yollananVeri")
            if (alinanVeri == "1")
            {
                ipucuyazi3.setBackgroundResource(R.drawable.arkaplan_en_kucuk)
                ipucuyazi3.animate().apply {
                    duration=200
                    scaleX(1f)
                    scaleY(1f)}
                ipucuyazi3.setText("1. sorunun 3.ipucusu")
            }
            else if(alinanVeri=="2")
            {
                ipucuyazi3.setBackgroundResource(R.drawable.arkaplan_en_kucuk)
                ipucuyazi3.animate().apply {
                    duration=200
                    scaleX(1f)
                    scaleY(1f)}
                ipucuyazi3.setText("2.sorunun 3. ipucusu")
            }
            else if(alinanVeri=="3")
            {
                ipucuyazi3.setBackgroundResource(R.drawable.arkaplan_en_kucuk)
                ipucuyazi3.animate().apply {
                    duration=200
                    scaleX(1f)
                    scaleY(1f)}
                ipucuyazi3.setText("3.sorunun 3. ipucusu")
            }
            else
            {
                Toast.makeText(this, "hata oluştu", Toast.LENGTH_SHORT).show()
            }
        }
        else
        {
            Toast.makeText(this, "kredin yetersiz", Toast.LENGTH_SHORT).show()
        }
    }

    fun geri(view: View)
    {
        geri.animate().apply {
            duration=150
            alpha(0f)}.withEndAction {
            geri.animate().apply {
                duration=150
                alpha(1f)}}
        onBackPressed()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.anim9, R.anim.anim10)
        finish()
    }
}
