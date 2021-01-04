package com.example.fp.atasan

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fp.R
import kotlinx.android.synthetic.main.fragment_atasan.*
import kotlinx.android.synthetic.main.fragment_atasan.view.*

class Frag_atasan: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_atasan,container,false)
        val testData = createDataAtasan()
        root.rv_atasan.layoutManager = LinearLayoutManager(context)
        root.rv_atasan.setHasFixedSize(true)
        root.rv_atasan.adapter = AtasanAdapter(testData,{
            AtasanItem: DataAtasan -> AtasanItemClicked(AtasanItem)
        })
        return root
    }

    private fun AtasanItemClicked(atasan: DataAtasan) {
        val showDetailActivity = Intent(context,DetailAtasan::class.java)
        showDetailActivity.putExtra(Intent.EXTRA_SPLIT_NAME, atasan.AtasanPhoto.toString())
        showDetailActivity.putExtra(Intent.EXTRA_COMPONENT_NAME,atasan.AtasanNama.toString())
        showDetailActivity.putExtra(Intent.EXTRA_TEMPLATE,atasan.AtasanHarga.toString())
        showDetailActivity.putExtra(Intent.EXTRA_EXCLUDE_COMPONENTS,atasan.AtasanDeskripsi.toString())
        showDetailActivity.putExtra(Intent.EXTRA_REFERRER_NAME,atasan.AtasanLink.toString())
        showDetailActivity.putExtra(Intent.EXTRA_PACKAGE_NAME,atasan.AtasanChat.toString())
        startActivity(showDetailActivity)
    }

    private fun createDataAtasan(): List<DataAtasan> {
        val partList = ArrayList<DataAtasan>()
        partList.add(
            DataAtasan(R.drawable.baju1,
        "L'more Plaid Ribbon Blouse",
        "- Material Polyster\n" +
                "- Lengan 7/8\n" +
                "- Terdapat 1 buah kancing dibagian belakang\n" +
                "- Terdapat model belahan di samping dengan aksen pita",
        "Rp 189.500",
        "081939284446",
        "https://www.zalora.co.id/l-more-plaid-ribbon-blouse-blue-2613709.html")
        )
        partList.add(
            DataAtasan(R.drawable.baju2,
                "X8 Savanna Blouses",
                "- Blouse motif garis dengan desain minimalis\n" +
                        "- Warna biru\n" +
                        "- Kerah V\n" +
                        "- Unlined\n" +
                        "- Regular fit\n" +
                        "- Kancing depan\n" +
                        "- Material katun tidak transparan, ringan, dan tidak stretch",
                "Rp 179.950",
                "081939284446",
                "https://www.zalora.co.id/x8-savanna-blouses-blue-1883794.html")
        )
        partList.add(
            DataAtasan(R.drawable.baju3,
                "Love, Bonito Raemonia Lace Flutter Sleeve Top",
                "-Bahan tidak elastis\n" +
                        "-Kantung samping fungsional\n" +
                        "-Dibuat dengan print khusus Love, Bonito\n" +
                        "-Ritsleting dengan kaitan tersembunyi di bagian belakang\n" +
                        "-Terbuat dari poliester",
                "Rp 399.000",
                "081939284446",
                "https://www.zalora.co.id/love-bonito-raemonia-lace-flutter-sleeve-top-red-2473564.html")
        )
        partList.add(
            DataAtasan(R.drawable.baju4,
                "Berrybenka Label Sophie Kayana Wrap Top",
                "Atasan dengan model menarik yang cocok kamu padankan dengan celana slim fit",
                "Rp 149.000",
                "081939284446",
                "https://www.zalora.co.id/berrybenka-label-sophie-kayana-wrap-top-terracotta-red-2365459.html")
        )
        partList.add(
            DataAtasan(R.drawable.baju5,
                "Neumor Rubber sleeve brocade",
                "- Material Brokat\n" +
                        "- Terdapat 1 kancing dibagian belakang\n" +
                        "- Lengan 3/4 dengan model ujung karet",
                "Rp 398.400",
                "081939284446",
                "https://www.zalora.co.id/neumor-rubber-sleeve-brocade-green-2630102.html")
        )
        partList.add(
            DataAtasan(R.drawable.baju6,
                "Puricia Tawnia",
                "- Kemeja desain round hem untuk basic look\n" +
                        "- Warna khaki (cokelat)\n" +
                        "- Detail kerah\n" +
                        "- Unlined\n" +
                        "- Regular fit\n" +
                        "- Kancing depan\n" +
                        "- Material katun tidak transparan, ringan dan tidak stretch",
                "Rp 299.940",
                "081939284446",
                "https://www.zalora.co.id/puricia-tawnia-brown-2578991.html")
        )
        partList.add(
            DataAtasan(R.drawable.baju7,
                "Jacquard Block Fit & Flare Dress",
                "- Colour blocked floral jacquard fit and flare dress\n" +
                        "- Mandarin collar\n" +
                        "- Flared fit\n" +
                        "- Back zip fastening\n" +
                        "- Polyblend",
                "Rp 412.900",
                "081939284446",
                "https://www.zalora.co.id/zalora-occasion-jacquard-block-fit-flare-dress-green-2499295.html")
        )
        partList.add(
                DataAtasan(R.drawable.baju8,
                    "Mini Dress Kasual Collar Neckline",
                    "- Mini dress dengan warna solid\n" +
                            "- Short sleeves dress\n" +
                            "- Kerah lapel\n" +
                            "- Self tie belt\n" +
                            "- Design kasual and elegant look\n" +
                            "- Regular fit\n" +
                            "- Unlined",
                    "Rp 416.000",
                    "081939284446",
                    "https://www.zalora.co.id/evernoon-mini-dress-kasual-lengan-pendek-collar-neckline-baju-wanita-regular-fit-maroon-red-2283019.html")
                )
        partList.add(
            DataAtasan(R.drawable.baju9,
                "FAME Fitted Dress",
                "- Mini dress bernuansa feminin dengan tampilan classic elegant\n" +
                        "- Warna krem\n" +
                        "- Kerah bulat\n" +
                        "- Regular fit\n" +
                        "- Resleting belakang\n" +
                        "- Detail tali ikat\n" +
                        "- Material satin kombinasi tidak transparan, ringan dan tidak stretch",
                "Rp 344.900",
                "081939284446",
                "https://www.zalora.co.id/fame-fitted-dress-beige-2561561.html")
        )
        partList.add(
            DataAtasan(R.drawable.baju10,
                "A & D Ms1418 Vin Dress",
                "- Dress\n" +
                        "- Bahan Katun\n" +
                        "- Detail tali Depan\n" +
                        "- Model Menggunakn Size M\n" +
                        "- Loose Fit",
                "Rp 220.000",
                "081939284446",
                "https://www.zalora.co.id/a-d-a-d-ms1418-vin-dress-multi-2588627.html")
        )
    return partList
    }
}