package com.example.fp.rok

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fp.R
import kotlinx.android.synthetic.main.fragment_rok.view.*

class Frag_rok: Fragment() {
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_rok,container,false)
        val testData = createDataRok()
        root.rv_rok.layoutManager = LinearLayoutManager(context)
        root.rv_rok.setHasFixedSize(true)
        root.rv_rok.adapter = RokAdapter(testData,{
            RokItem: DataRok -> RokItemClicked(RokItem)
        })
        return root
    }

    private fun RokItemClicked(rok: DataRok) {
        val showDetailActivity = Intent(context, DetailRok::class.java)
        showDetailActivity.putExtra(Intent.EXTRA_SPLIT_NAME, rok.RokPhoto.toString())
        showDetailActivity.putExtra(Intent.EXTRA_COMPONENT_NAME,rok.RokNama.toString())
        showDetailActivity.putExtra(Intent.EXTRA_TEMPLATE,rok.RokHarga.toString())
        showDetailActivity.putExtra(Intent.EXTRA_EXCLUDE_COMPONENTS,rok.RokDeskripsi.toString())
        showDetailActivity.putExtra(Intent.EXTRA_REFERRER_NAME,rok.RokLink.toString())
        showDetailActivity.putExtra(Intent.EXTRA_PACKAGE_NAME,rok.RokChat.toString())
        startActivity(showDetailActivity)
    }

    private fun createDataRok(): List<DataRok> {
        val partList = ArrayList<DataRok>()
        partList.add(
                DataRok(R.drawable.rok1,
                        "Everit",
                        "- Sweatshirt detail patch ikonik untuk effortless street style\n" +
                                "- Warna navy\n" +
                                "- Kerah bulat\n" +
                                "- Unlined\n" +
                                "- Regular fit\n" +
                                "- Material katun tidak transparan, ringan, dan tidak stretch",
                        "Rp 299.400",
                        "081939284446",
                        "https://www.zalora.co.id/hush-puppies-everit-navy-2360125.html")
        )
        partList.add(
                DataRok(R.drawable.rok2,
                        "Asymmetrical Jumper",
                        "- Jumper dengan desain asimetris yang modern dan edgy\n" +
                                "- Warna abu-abu\n" +
                                "- Detail hoodie dengan tali serut\n" +
                                "- Unlined\n" +
                                "- Regular fit\n" +
                                "- Detail kangaroo pocket\n" +
                                "- Material katun tidak transparan, ringan dan tidak stretch",
                        "Rp 785.000",
                        "081939284446",
                        "https://www.zalora.co.id/oline-workrobe-asymmetrical-jumper-grey-2617706.html")
        )
        partList.add(
                DataRok(R.drawable.rok3,
                        "Loose Sweater",
                        "- Loose Sweater\n" +
                                "- Long Sleeve\n" +
                                "- Color-Blocking Detail\n" +
                                "- Buttons On The Lower Front Body\n" +
                                "- Loose Fit\n" +
                                "- Color: Navy\n" +
                                "- Material: Finegauge",
                        "Rp 258.480",
                        "081939284446",
                        "https://www.zalora.co.id/et-cetera-loose-sweater-navy-2614901.html")
        )
        partList.add(
                DataRok(R.drawable.rok4,
                        "Flanel Hoody Sweater in Pink",
                        "- sweater dengan hoody\n" +
                                "- dengan tali hoody\n" +
                                "- hoody bahan fleece\n" +
                                "- badan bahan flanel motif kotak-kotak\n" +
                                "- regular fit",
                        "Rp 263.920",
                        "081939284446",
                        "https://www.zalora.co.id/mky-clothing-flanel-hoody-sweater-in-pink-pink-2632728.html")
        )
        partList.add(
                DataRok(R.drawable.rok5,
                        "Yuki CAMEL",
                        "- 3/4 Sleeve\n" +
                                "- Front Button\n" +
                                "- Batwing\n" +
                                "- Hoodie",
                        "Rp 299.900",
                        "081939284446",
                        "https://www.zalora.co.id/minimal-yuki-camel-brown-2566938.html")
        )
        partList.add(
                DataRok(R.drawable.rok6,
                        "Poncho With Hoodie Sweater",
                        "- Poncho Sweater With Hoodies\n" +
                                "- Matching Cullotes Available\n" +
                                "- Soft Touch Fabric\n" +
                                "- Loose Fit\n" +
                                "- Material: Finegauge",
                        "Rp 359.000",
                        "081939284446",
                        "https://www.zalora.co.id/et-cetera-poncho-with-hoodie-sweater-brown-2592597.html")
        )
        partList.add(
                DataRok(R.drawable.rok7,
                        "Openwork Knit Sweater",
                        "- Solid tone knitted pullover sweatshirt\n" +
                                "- Sizing runs one size larger\n" +
                                "- Unlined\n" +
                                "- Round neckline\n" +
                                "- Regular fit\n" +
                                "- Polyamide blend",
                        "Rp 599.000",
                        "081939284446",
                        "https://www.zalora.co.id/mango-openwork-knit-sweater-beige-2582319.html")
        )
        partList.add(
                DataRok(R.drawable.rok8,
                        "ADALIA Outer Hoodie",
                        "- Casual outer dengan detail tali serut bergaya chic\n" +
                                "- Warna abu-abu\n" +
                                "- Detail hoodie\n" +
                                "- Unlined, tidak termasuk inner\n" +
                                "- Regular fit\n" +
                                "- Material katun tidak transparan, ringan dan tidak stretch",
                        "Rp Rp 214.950",
                        "081939284446",
                        "https://www.zalora.co.id/point-one-adalia-outer-hoodie-grey-2275815.html")
        )
        partList.add(
                DataRok(R.drawable.rok9,
                        "Line Turtleneck Sweater",
                        "- sweater lengan pendek\n" +
                                "- turtle-neck\n" +
                                "- detail pola geometri\n" +
                                "- katun rajut\n" +
                                "- oversized",
                        "Rp 239.900",
                        "081939284446",
                        "https://www.zalora.co.id/mky-clothing-line-turtleneck-sweater-in-grey-grey-2105979.html")
        )
        partList.add(
                DataRok(R.drawable.rok10,
                        "Oversized Jacquard Woven Knit Sweater",
                        "- Sweater bermotif garis dengan aksen kerut pada pinggang\n" +
                                "- Warna brick (cokelat kemerahan)\n" +
                                "- Kerah bulat\n" +
                                "- Unlined\n" +
                                "- Regular fit\n" +
                                "- Material acrylic tidak transparan dan ringan",
                        "Rp 539.000",
                        "081939284446",
                        "https://www.zalora.co.id/trendyol-oversized-jacquard-woven-knit-sweater-red-2629544.html")
        )
        return partList
    }
}