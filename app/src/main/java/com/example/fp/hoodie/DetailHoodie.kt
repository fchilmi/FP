package com.example.fp.hoodie

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fp.R
import kotlinx.android.synthetic.main.detail_hoodie.*

class DetailHoodie: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_hoodie)

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
        HoodiePhoto.setImageResource(photo!!)
        nama_hoodie.text = nama
        deskripsi_hoodie.text = deskripsi
        hargaHoodie.text = harga
        link_hoodie.text = link
        btnChat.setOnClickListener{
            call(chat)
        }
        link_hoodie.setOnClickListener{
            openWeb(link)
        }
    }

    private fun openWeb(url: String?) {
        val showWebActivity = Intent(this, WebHoodie::class.java)
        showWebActivity.putExtra(Intent.ACTION_VIEW, url)
        startActivity(showWebActivity)
    }
    private fun call (number: String?) {
        val callThis = Intent(Intent.ACTION_DIAL)
        callThis.setData(Uri.parse("tel:"+ number))
        startActivity(callThis)
    }

}