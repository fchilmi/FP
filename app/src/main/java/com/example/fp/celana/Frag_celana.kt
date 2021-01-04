package com.example.fp.celana

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fp.R
import kotlinx.android.synthetic.main.fragment_celana.view.*

class Frag_celana : Fragment() {
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_celana,container,false)
        val testData = createDataCelana()
        root.rv_celana.layoutManager = LinearLayoutManager(context)
        root.rv_celana.setHasFixedSize(true)
        root.rv_celana.adapter = CelanaAdapter(testData,{
            CelanaItem: DataCelana -> CelanaItemClicked(CelanaItem)
        })
        return root
    }

    private fun CelanaItemClicked(celana: DataCelana) {
        val showDetailActivity = Intent(context, DetailCelana::class.java)
        showDetailActivity.putExtra(Intent.EXTRA_SPLIT_NAME, celana.CelanaPhoto.toString())
        showDetailActivity.putExtra(Intent.EXTRA_COMPONENT_NAME,celana.CelanaNama.toString())
        showDetailActivity.putExtra(Intent.EXTRA_TEMPLATE,celana.CelanaHarga.toString())
        showDetailActivity.putExtra(Intent.EXTRA_EXCLUDE_COMPONENTS,celana.CelanaDeskripsi.toString())
        showDetailActivity.putExtra(Intent.EXTRA_REFERRER_NAME,celana.CelanaLink.toString())
        showDetailActivity.putExtra(Intent.EXTRA_PACKAGE_NAME,celana.CelanaChat.toString())
        startActivity(showDetailActivity)
    }

    private fun createDataCelana(): List<DataCelana> {
        val partList = ArrayList<DataCelana>()
        partList.add(
                DataCelana(R.drawable.celana1,
                        "Korz Ethnic Cullotes",
                        "- Kulot midi bernuansa ethnic dengan detail motif bunga\n" +
                                "- Warna beige\n" +
                                "- Mid rise\n" +
                                "- Unlined\n" +
                                "- Regular fit\n" +
                                "- 2 kantong samping\n" +
                                "- Karet pinggang elastis\n" +
                                "- Material poliester tidak transparan, ringan, dan stretchable",
                        "Rp 528.000",
                        "081939284446",
                        "https://www.zalora.co.id/korz-ethnic-cullotes-beige-2115678.html")
        )
        partList.add(
                DataCelana(R.drawable.celana2,
                        "Hush Puppies Orly",
                        "- Celana detail wrinkle texture yang nyaman untuk daily look\n" +
                                "- Warna beige\n" +
                                "- Mid rise\n" +
                                "- Unlined\n" +
                                "- Regular fit\n" +
                                "- Karet pinggang elastis dan tali depan\n" +
                                "- Material poliester tidak transparan dan ringan",
                        "Rp 359.400",
                        "081939284446",
                        "https://www.zalora.co.id/hush-puppies-orly-beige-2492194.html")
        )
        partList.add(
                DataCelana(R.drawable.celana3,
                        "LLACES CLOTHING Wide Culotte",
                        "- Celana kulot desain all black dengan detail lipit\n" +
                                "- Warna hitam\n" +
                                "- Mid rise\n" +
                                "- Unlined\n" +
                                "- Regular fit\n" +
                                "- Resleting belakang\n" +
                                "- Karet pinggang elastis\n" +
                                "- Material poliester tidak transparan, ringan, dan tidak stretch",
                        "Rp 199.950",
                        "081939284446",
                        "https://www.zalora.co.id/llaces-clothing-wide-culotte-black-2271335.html")
        )
        partList.add(
                DataCelana(R.drawable.celana4,
                        "Sophie Mayya Button Pants Khaki",
                        "-Celana yang simple cocok dipadankan dengan berbagai macam atasan serta sepatu favoritmu!",
                        "Rp 149.000",
                        "081939284446",
                        "https://www.zalora.co.id/berrybenka-label-sophie-mayya-button-pants-khaki-white-2426584.html")
        )
        partList.add(
                DataCelana(R.drawable.celana5,
                        "Logo Jeans Femmue",
                        "- Celana santai bermotif garis untuk kesan basic timeless\n" +
                                "- Kombinasi warna navy dan putih\n" +
                                "- Mid rise\n" +
                                "- Unlined\n" +
                                "- Regular fit\n" +
                                "- Karet pinggang elastis dan tali depan\n" +
                                "- Material denim tidak transparan dan ringan",
                        "Rp 279.930",
                        "081939284446",
                        "https://www.zalora.co.id/logo-jeans-femmue-navy-2556086.html")
        )
        partList.add(
                DataCelana(R.drawable.celana6,
                        "High Waist Flare Pants with Slits",
                        "- Celana detail all over print untuk effortless summer style\n" +
                                "- Kombinasi warna biru dan merah\n" +
                                "- High rise\n" +
                                "- Regular fit\n" +
                                "- Resleting dan kancing depan\n" +
                                "- Detail 2 kantong\n" +
                                "- Material poliester tidak transparan, ringan, dan tidak stretch",
                        "Rp 178.900",
                        "081939284446",
                        "https://www.zalora.co.id/zalora-high-waist-flare-pants-with-slits-red-blue-2140912.html")
        )
        partList.add(
                DataCelana(R.drawable.celana7,
                        "Elastic Waist Culotte Jeans in Blue",
                        "- celana jeans kulot\n" +
                                "- saku depan dan belakang\n" +
                                "- tali serut pada pinggang dalam\n" +
                                "- karet pada pinggang belakang\n" +
                                "- kancing & sleting\n" +
                                "- regular fit",
                        "Rp 379.900",
                        "081939284446",
                        "https://www.zalora.co.id/mky-clothing-elastic-waist-culotte-jeans-in-blue-blue-2621164.html")
        )
        partList.add(
                DataCelana(R.drawable.celana8,
                        "Cuff Detail Culotte",
                        "- Cuffed hem culottes\n" +
                                "- High rise\n" +
                                "- Regular fit\n" +
                                "- Hook and zip fastening\n" +
                                "- Side pockets\n" +
                                "- Modal",
                        "Rp 499.000",
                        "081939284446",
                        "https://www.zalora.co.id/origin-by-zalora-cuff-detail-culotte-made-from-tencel-green-2494933.html")
        )
        partList.add(
                DataCelana(R.drawable.celana9,
                        "Zahara Blooming Pants",
                        "- Poliester\n" +
                                "- Hitam\n" +
                                "- Kantong depan\n" +
                                "- Karet pinggang\n" +
                                "- Regular fit",
                        "Rp 219.000",
                        "081939284446",
                        "https://www.zalora.co.id/magnificents-ladies-zahara-blooming-pants-black-1166138.html")
        )
        partList.add(
                DataCelana(R.drawable.celana10,
                        "Yatniel Tailored Peg Leg Pants",
                        "-Bahan tidak elastis\n" +
                                "-Kantung samping fungsional\n" +
                                "-Ritsleting dengan kaitan tersembunyi di bagian belakang\n" +
                                "-Terbuat dari poliester",
                        "Rp 599.000",
                        "081939284446",
                        "https://www.zalora.co.id/love-bonito-yatniel-tailored-peg-leg-pants-beige-2573416.html")
        )
        return partList
    }
}