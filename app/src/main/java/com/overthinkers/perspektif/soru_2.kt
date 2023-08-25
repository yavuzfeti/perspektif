package com.overthinkers.perspektif

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.soru_2.*

class soru_2 : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        window.decorView.systemUiVisibility=View.SYSTEM_UI_FLAG_FULLSCREEN or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY or View.SYSTEM_UI_FLAG_LAYOUT_STABLE or  View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_FULLSCREEN
        setContentView(R.layout.soru_2)
        var sharedPreferences = getSharedPreferences("girisler", Context.MODE_PRIVATE)
        var sayfa2=sharedPreferences.getString("sayfa2","hata")
        if (sayfa2!="girildi")
        {
            //Toast.makeText(this, "Gayet başarılı, Tebrikler", Toast.LENGTH_LONG).show()
            sharedPreferences.edit().putString("sayfa2","girildi").apply()
        }
    }

    fun ipucu_sayfasi(view: View)
    {
        ipucu_butonu2.animate().apply {
            duration=150
            alpha(0f)}.withEndAction {
            ipucu_butonu2.animate().apply {
                duration=150
                alpha(1f)}}
        val girildi="2"
        val intent=Intent(applicationContext,ipuclari::class.java)
        intent.putExtra("yollananVeri",girildi)
        startActivity(intent)
        overridePendingTransition(R.anim.anim7, R.anim.anim8)
    }
    fun onceki (view: View)
    {
        onceki1.animate().apply {
            duration=150
            alpha(0f)}.withEndAction {
            onceki1.animate().apply {
                duration=150
                alpha(1f)}}
        val intent= Intent(applicationContext, soru_1::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.anim5, R.anim.anim6)
        finish()
    }

    fun sonraki(view: View)
    {
        sonraki2.animate().apply {
            duration=150
            alpha(0f)}.withEndAction {
            sonraki2.animate().apply {
                duration=150
                alpha(1f)}}
        var sharedPreferences3 = getSharedPreferences("kayitlar", Context.MODE_PRIVATE)
        var goster=sharedPreferences3.getString("cevapkaydi2","hata")
        if (goster== "doğru")
        {
            val intent = Intent(applicationContext, soru_3::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.anim3, R.anim.anim4)
            finish()
        }
        else
        {
            Toast.makeText(this, "Henüz 2. soruyu cevaplamadın ki!", Toast.LENGTH_LONG).show()
        }
    }

    fun sorular(view: View)
    {
        sorlar2.animate().apply {
            duration=150
            alpha(0f)}.withEndAction {
            sorlar2.animate().apply {
                duration=150
                alpha(1f)}}
        val intent = Intent(applicationContext, sorular::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.anim5, R.anim.anim6)
    }

    fun geri(view: View)
    {
        geri4.animate().apply {
            duration=150
            alpha(0f)}.withEndAction {
            geri4.animate().apply {
                duration=150
                alpha(1f)}}
        onBackPressed()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(applicationContext, ana_sayfa::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.anim, R.anim.anim2)
        finish()
    }





    //KLAVYE
    //değişken kısım

    val ilkmetin=""

    fun son()
    {
        if (cevaptext.text=="BİŞEY")
        {
            cevaptext.setText("DOĞRU!")
            var sharedPreferences4 = getSharedPreferences("kayitlar", Context.MODE_PRIVATE)
            var cevap2=sharedPreferences4.getString("cevapkaydi2","hata")
            if (cevap2!="doğru")
            {
                var sharedPreferences0 = getSharedPreferences("ipuclari", Context.MODE_PRIVATE)
                var kredisayisiilk=sharedPreferences0.getInt("kredi",0)
                sharedPreferences0.edit().putInt("kredi",kredisayisiilk+30).apply()
            }
            var sharedPreferences3 = getSharedPreferences("kayitlar", Context.MODE_PRIVATE)
            sharedPreferences3.edit().putString("cevapkaydi2","doğru").apply()
            sharedPreferences3.edit().putString("sonsoru","3").apply()
            val intent = Intent(applicationContext, soru_3::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.anim3, R.anim.anim4)
            finish()
        }
        else if (cevaptext.length()>=20&&cevaptext.text!=ilkmetin)
        {
            cevaptext.setText("${cevaptext.text.substring(0,cevaptext.length()-1)}")
            Toast.makeText(this, "Maximum harf sınırına ulaşıldı.", Toast.LENGTH_SHORT).show()

        }
    }
    /*var klavyesesi:MediaPlayer?=null
    fun ses()
    {
        var sharedPreferences = getSharedPreferences("systemodu", Context.MODE_PRIVATE)
        var ses = sharedPreferences.getString("ses", "hata")
        if (ses=="acik")
        {
            if (klavyesesi!==null)
            {
                klavyesesi?.stop()
                klavyesesi?.reset()
                klavyesesi?.release()
                klavyesesi=null
            }
            if(klavyesesi==null)
            {
                klavyesesi=MediaPlayer.create(this,R.raw.chord)
                klavyesesi?.start()
            }
        }
    }*/
    fun sil(view: View)
    {
        //ses()
        if (cevaptext.length()>1 && cevaptext.text!=ilkmetin)
        {
            cevaptext.setText("${cevaptext.text.substring(0,cevaptext.length()-1)}")
        }
        else
        {
            cevaptext.setText(ilkmetin)
        }
    }
    fun bosluk (view: View)
    {
        //ses()
        if (cevaptext.length()>0 && cevaptext.text!=ilkmetin && cevaptext.text.substring(cevaptext.length()-1,cevaptext.length())!=" ")
        {
            cevaptext.setText("${cevaptext.text} ")
        }
        son()
    }
    fun ilk()
    {
        //ses()
        if (cevaptext.text==ilkmetin)
        {
            cevaptext.setText("")
        }
    }

    //sabit kısım

    fun a (view: View)
    {
        ilk()
        cevaptext.setText("${cevaptext.text}A")
        son()
    }
    fun b (view: View)
    {
        ilk()
        cevaptext.setText("${cevaptext.text}B")
        son()
    }
    fun c (view: View)
    {
        ilk()
        cevaptext.setText("${cevaptext.text}C")
        son()
    }
    fun c2 (view: View)
    {
        ilk()
        cevaptext.setText("${cevaptext.text}Ç")
        son()
    }
    fun d (view: View)
    {
        ilk()
        cevaptext.setText("${cevaptext.text}D")
        son()
    }
    fun e (view: View)
    {
        ilk()
        cevaptext.setText("${cevaptext.text}E")
        son()
    }
    fun f (view: View)
    {
        ilk()
        cevaptext.setText("${cevaptext.text}F")
        son()
    }
    fun g (view: View)
    {
        ilk()
        cevaptext.setText("${cevaptext.text}G")
        son()
    }
    fun g2 (view: View)
    {
        ilk()
        cevaptext.setText("${cevaptext.text}Ğ")
        son()
    }
    fun h (view: View)
    {
        ilk()
        cevaptext.setText("${cevaptext.text}H")
        son()
    }
    fun i2 (view: View)
    {
        ilk()
        cevaptext.setText("${cevaptext.text}I")
        son()
    }
    fun i (view: View)
    {
        ilk()
        cevaptext.setText("${cevaptext.text}İ")
        son()
    }
    fun j (view: View)
    {
        ilk()
        cevaptext.setText("${cevaptext.text}J")
        son()
    }
    fun k (view: View)
    {
        ilk()
        cevaptext.setText("${cevaptext.text}K")
        son()
    }
    fun l (view: View)
    {
        ilk()
        cevaptext.setText("${cevaptext.text}L")
        son()
    }
    fun m (view: View)
    {
        ilk()
        cevaptext.setText("${cevaptext.text}M")
        son()
    }
    fun n (view: View)
    {
        ilk()
        cevaptext.setText("${cevaptext.text}N")
        son()
    }
    fun o (view: View)
    {
        ilk()
        cevaptext.setText("${cevaptext.text}O")
        son()
    }
    fun o2 (view: View)
    {
        ilk()
        cevaptext.setText("${cevaptext.text}Ö")
        son()
    }
    fun p (view: View)
    {
        ilk()
        cevaptext.setText("${cevaptext.text}P")
        son()
    }
    fun q (view: View)
    {
        ilk()
        cevaptext.setText("${cevaptext.text}Q")
        son()
    }
    fun r (view: View)
    {
        ilk()
        cevaptext.setText("${cevaptext.text}R")
        son()
    }
    fun s (view: View)
    {
        ilk()
        cevaptext.setText("${cevaptext.text}S")
        son()
    }
    fun s2 (view: View)
    {
        ilk()
        cevaptext.setText("${cevaptext.text}Ş")
        son()
    }
    fun t (view: View)
    {
        ilk()
        cevaptext.setText("${cevaptext.text}T")
        son()

    }
    fun u (view: View)
    {
        ilk()
        cevaptext.setText("${cevaptext.text}U")
        son()
    }
    fun u2 (view: View)
    {
        ilk()
        cevaptext.setText("${cevaptext.text}Ü")
        son()
    }
    fun v (view: View)
    {
        ilk()
        cevaptext.setText("${cevaptext.text}V")
        son()
    }
    fun w (view: View)
    {
        ilk()
        cevaptext.setText("${cevaptext.text}W")
        son()
    }
    fun x (view: View)
    {
        ilk()
        cevaptext.setText("${cevaptext.text}X")
        son()
    }
    fun y (view: View)
    {
        ilk()
        cevaptext.setText("${cevaptext.text}Y")
        son()
    }
    fun z (view: View)
    {
        ilk()
        cevaptext.setText("${cevaptext.text}Z")
        son()
    }
}