package com.overthinkers.perspektif

import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Switch
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import kotlinx.android.synthetic.main.ana_sayfa.*


class ana_sayfa : AppCompatActivity()
{
    fun bargoster()
    {
        var sharedPreferences3 = getSharedPreferences("kayitlar", Context.MODE_PRIVATE)
        var cevap1=sharedPreferences3.getString("cevapkaydi1","hata")
        var cevap2=sharedPreferences3.getString("cevapkaydi2","hata")
        var cevap3=sharedPreferences3.getString("cevapkaydi3","hata")
        bar1.animate().apply {
            if (cevap1=="doğru")
            {
                duration=200
                alpha(1f)
                bar1.setText("A")
            }
            else
            {
                duration=0
                alpha(0f)
            }
        }
        bar2.animate().apply {
            if (cevap2=="doğru")
            {
                duration=200
                alpha(1f)
                bar2.setText("C")
            }
            else
            {
                duration=0
                alpha(0f)
            }
        }
        bar3.animate().apply {
            if (cevap3=="doğru")
            {
                duration=200
                alpha(1f)
                bar3.setText("D")
            }
            else
            {
                duration=0
                alpha(0f)
            }
        }
        bar4.animate().apply {
            duration=0
            alpha(0f)}
        bar5.animate().apply {
            duration=0
            alpha(0f)}
        bar6.animate().apply {
            duration=0
            alpha(0f)}
        bar7.animate().apply {
            duration=0
            alpha(0f)}
        bar8.animate().apply {
            duration=0
            alpha(0f)}
        bar9.animate().apply {
            duration=0
            alpha(0f)}
        bar10.animate().apply {
            duration=0
            alpha(0f)}
        bar11.animate().apply {
            duration=0
            alpha(0f)}
        bar12.animate().apply {
            duration=0
            alpha(0f)}
        bar13.animate().apply {
            duration=0
            alpha(0f)}
        bar14.animate().apply {
            duration=0
            alpha(0f)}
        bar15.animate().apply {
            duration=0
            alpha(0f)}
        bar16.animate().apply {
            duration=0
            alpha(0f)}
        bar17.animate().apply {
            duration=0
            alpha(0f)}
        bar18.animate().apply {
            duration=0
            alpha(0f)}
        bar19.animate().apply {
            duration=0
            alpha(0f)}
        bar20.animate().apply {
            duration=0
            alpha(0f)}
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.decorView.systemUiVisibility=View.SYSTEM_UI_FLAG_FULLSCREEN or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY or View.SYSTEM_UI_FLAG_LAYOUT_STABLE or  View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_FULLSCREEN
        setContentView(R.layout.ana_sayfa)
        var sharedPreferences0 = getSharedPreferences("ipuclari", Context.MODE_PRIVATE)
        var kredisayisison=sharedPreferences0.getInt("kredi",0)
        kreditext2.setText(kredisayisison.toString())
        var sharedPreferences2 = getSharedPreferences("girisler", Context.MODE_PRIVATE)
        var ana_sayfa=sharedPreferences2.getString("ana_sayfa","hata")
        if (ana_sayfa!="girildi")
        {
            //Toast.makeText(this, "Hoşgeldin, zorlanmaya hazır mısın?", Toast.LENGTH_LONG).show()
            sharedPreferences2.edit().putString("ana_sayfa","girildi").apply()
        }
        else
        {
            //Toast.makeText(this, "Yeniden merhaba", Toast.LENGTH_LONG).show()
        }

        var sharedPreferences4 = getSharedPreferences("systemodu", Context.MODE_PRIVATE)
        var renk=sharedPreferences4.getString("renk","hata")
        if (renk== "koyu")
        {
            renkbuton.setBackgroundResource(R.drawable.acik)
        }
        else if (renk=="acik")
        {
            renkbuton.setBackgroundResource(R.drawable.koyu)
        }
        var ses=sharedPreferences4.getString("ses","hata")
        if (ses=="acik")
        {
            sesbuton.setBackgroundResource(R.drawable.ses_acik)
        }
        else if (ses=="kapali")
        {
            sesbuton.setBackgroundResource(R.drawable.ses_kapali)
        }
        bargoster()
    }

    fun oyna (view: View)
    {
        play.animate().apply {
            play.setBackgroundResource(R.drawable.oyna2)
            duration=250
            alpha(1f)

        }.withEndAction{
            play.animate().apply {
                play.setBackgroundResource(R.drawable.oyna)
            }.start()
        }
        var sharedPreferences3 = getSharedPreferences("kayitlar", Context.MODE_PRIVATE)
        var goster=sharedPreferences3.getString("sonsoru","hata")
        if (goster=="2")
        {
            val intent = Intent(applicationContext, soru_2::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.anim, R.anim.anim2)
        }
        else if (goster=="3")
        {
            val intent = Intent(applicationContext, soru_3::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.anim, R.anim.anim2)
        }
        else
        {
            val intent = Intent(applicationContext, soru_1::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.anim, R.anim.anim2)
        }
    }

    fun sorular(view: View)
    {
        sorular.animate().apply {
            duration=150
            alpha(0f)}.withEndAction {
            sorular.animate().apply {
                duration=150
                alpha(1f)}}
        val intent = Intent(applicationContext, com.overthinkers.perspektif.sorular::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.anim3, R.anim.anim4)
    }

    override fun onRestart() {
        super.onRestart()
        bargoster()
    }

    fun geri(view: View)
    {
        cikis.animate().apply {
            duration=150
            alpha(0f)}.withEndAction {
            cikis.animate().apply {
                duration=150
                alpha(1f)}}
        finish()
    }

    fun renkbutonu(view: View)
    {
        var sharedPreferences = getSharedPreferences("systemodu", Context.MODE_PRIVATE)
        var renk = sharedPreferences.getString("renk", "hata")
        if (renk == "acik")
        {
            renkbuton.animate().apply {
                duration=150
                alpha(0f)}.withEndAction {
                renkbuton.setBackgroundResource(R.drawable.acik)
                renkbuton.animate().apply {
                    duration=150
                    alpha(1f)}}
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            sharedPreferences.edit().putString("renk", "koyu").apply()
        }
        else if (renk == "koyu")
        {
            renkbuton.animate().apply {
                duration=150
                alpha(0f)}.withEndAction {
                renkbuton.setBackgroundResource(R.drawable.koyu)
                renkbuton.animate().apply {
                    duration=150
                    alpha(1f)}}
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            sharedPreferences.edit().putString("renk", "acik").apply()
        }
    }

    fun sesbutonu(view: View)
    {
        var sharedPreferences = getSharedPreferences("systemodu", Context.MODE_PRIVATE)
        var ses = sharedPreferences.getString("ses", "hata")
        if (ses == "acik")
        {
            sesbuton.animate().apply {
                duration=150
                alpha(0f)}.withEndAction {
                sesbuton.setBackgroundResource(R.drawable.ses_kapali)
                sesbuton.animate().apply {
                    duration=150
                    alpha(1f)}}
            sharedPreferences.edit().putString("ses", "kapali").apply()
        }
        else if (ses == "kapali")
        {
            sesbuton.animate().apply {
                duration=150
                alpha(0f)}.withEndAction {
                sesbuton.setBackgroundResource(R.drawable.ses_acik)
                sesbuton.animate().apply {
                    duration=150
                    alpha(1f)}}
            sharedPreferences.edit().putString("ses", "acik").apply()
        }
    }
}
