package com.overthinkers.perspektif

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.appcompat.app.AppCompatDelegate
import kotlinx.android.synthetic.main.acilis.*

class acilis : AppCompatActivity()
{
    private val splashScreen=3500
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        window.decorView.systemUiVisibility=View.SYSTEM_UI_FLAG_FULLSCREEN or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY or View.SYSTEM_UI_FLAG_LAYOUT_STABLE or  View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_FULLSCREEN
        setContentView(R.layout.acilis)
        var sharedPreferences = getSharedPreferences("systemodu", MODE_PRIVATE)
        var renk=sharedPreferences.getString("renk","hata")
        if (renk== "acik")
        {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            sharedPreferences.edit().putString("renk","acik").apply()
        }
        else
        {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            sharedPreferences.edit().putString("renk","koyu").apply()
        }
        var ses=sharedPreferences.getString("ses","hata")
        if (ses!="kapali")
        {
            sharedPreferences.edit().putString("ses","acik").apply()
        }
        acilisharfi.animate().apply {
            duration=0
            alpha(0f)}.withEndAction {
            acilisharfi.animate().apply {
                duration=500
                alpha(1f)}
        }.start()
        eharfi.animate().apply {
            duration=0
            alpha(0f)}.withEndAction {
            eharfi.animate().apply {
                duration=500
                alpha(1f)}.startDelay=500
        }.start()
        rharfi.animate().apply {
            duration=0
            alpha(0f)}.withEndAction {
            rharfi.animate().apply {
                duration=500
                alpha(1f)}.startDelay=750
        }.start()
        sharfi.animate().apply {
            duration=0
            alpha(0f)}.withEndAction {
            sharfi.animate().apply {
                duration=500
                alpha(1f)}.startDelay=1000
        }.start()
        p2harfi.animate().apply {
            duration=0
            alpha(0f)}.withEndAction {
            p2harfi.animate().apply {
                duration=500
                alpha(1f)}.startDelay=1250
        }.start()
        e2harfi.animate().apply {
            duration=0
            alpha(0f)}.withEndAction {
            e2harfi.animate().apply {
                duration=500
                alpha(1f)}.startDelay=1500
        }.start()
        kharfi.animate().apply {
            duration=0
            alpha(0f)}.withEndAction {
            kharfi.animate().apply {
                duration=500
                alpha(1f)}.startDelay=1750
        }.start()
        tharfi.animate().apply {
            duration=0
            alpha(0f)}.withEndAction {
            tharfi.animate().apply {
                duration=500
                alpha(1f)}.startDelay=2000
        }.start()
        iharfi.animate().apply {
            duration=0
            alpha(0f)}.withEndAction {
            iharfi.animate().apply {
                duration=500
                alpha(1f)}.startDelay=2250
        }.start()
        fharfi.animate().apply {
            duration=0
            alpha(0f)}.withEndAction {
            fharfi.animate().apply {
                duration=500
                alpha(1f)}.startDelay=2500
        }.start()
        Handler().postDelayed({
            val intent=Intent(this,ana_sayfa::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.anim, R.anim.anim2)
            finish()
        },splashScreen.toLong())
    }
}