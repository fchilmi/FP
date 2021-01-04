package com.example.fp.atasan

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fp.R
import kotlinx.android.synthetic.main.detail_atasan.*

class DetailAtasan: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_atasan)

        var intentThatStartThisActivity = intent
        if (intentThatStartThisActivity.hasExtra(Intent.EXTRA_COMPONENT_NAME)){
            putData(intentThatStartThisActivity)
        }
    }

    private fun putData(intentThatStartedThisActivity: Intent) {
        var photo = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_SPLIT_NAME)?.toInt()
        var nama = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_COMPONENT_NAME)
        var deskripsi= intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_EXCLUDE_COMPONENTS)
        var harga = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
        var chat = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_PACKAGE_NAME)
        var link = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_REFERRER_NAME)
        AtasanPhoto.setImageResource(photo!!)
        nama_atasan.text = nama
        deskripsi_atasan.text = deskripsi
        hargaAtasan.text = harga
        link_atasan.text = link
        btnChat.setOnClickListener{
            call(chat)
        }
        link_atasan.setOnClickListener{
            openWeb(link)
        }
    }

    private fun openWeb(url: String?) {
        val showWebActivity = Intent(this, WebAtasan::class.java)
        showWebActivity.putExtra(Intent.ACTION_WEB_SEARCH, url)
        startActivity(showWebActivity)
    }
    private fun call (number: String?) {
        val callThis = Intent(Intent.ACTION_DIAL)
        callThis.setData(Uri.parse("tel:"+ number))
        startActivity(callThis)
    }

}
