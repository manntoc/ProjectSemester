package com.example.projectsemester.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.example.projectsemester.R
import com.example.projectsemester.adapter.AdapterProduk
import com.example.projectsemester.model.Produk
import com.inyongtisto.tutorial.adapter.AdapterSlider
import kotlinx.android.synthetic.main.fragment_home.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {

    lateinit var slider : ViewPager
    lateinit var Produk : RecyclerView
    lateinit var ProdukTerlaris : RecyclerView
    lateinit var ProdukPopuler : RecyclerView

    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view : View =  inflater.inflate(R.layout.fragment_home, container, false)

        slider = view.findViewById(R.id.slider)
        Produk = view.findViewById(R.id.produk)
        ProdukTerlaris = view.findViewById(R.id.Terlaris)
        ProdukPopuler = view.findViewById(R.id.Populer)

        val arraySlider = arrayListOf<Int>()
        arraySlider.add(R.drawable.slide1)
        arraySlider.add(R.drawable.slide2)
        arraySlider.add(R.drawable.slide3)

        val adapterSlider = AdapterSlider(arraySlider, activity)
        slider.adapter = adapterSlider

        val layoutManager = LinearLayoutManager(activity)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL

        val layoutManager2 = LinearLayoutManager(activity)
        layoutManager2.orientation = LinearLayoutManager.HORIZONTAL

        val layoutManager3 = LinearLayoutManager(activity)
        layoutManager3.orientation = LinearLayoutManager.HORIZONTAL

        Produk.adapter = AdapterProduk(arrayProduk)
        Produk.layoutManager = layoutManager

        ProdukTerlaris.adapter = AdapterProduk(arrayTerlaris)
        ProdukTerlaris.layoutManager = layoutManager2

        ProdukPopuler.adapter = AdapterProduk(arrayPopuler)
        ProdukPopuler.layoutManager = layoutManager3


        // Inflate the layout for this fragment
        return view
    }

    val arrayProduk : ArrayList<Produk>get(){

        val  array = ArrayList<Produk>()
        val p1 = Produk()
        p1.nama = "Tas Gunung"
        p1.harga = "500.000"
        p1.gambar = R.drawable.tas1

        val p2 = Produk()
        p2.nama = "Tas Nongkrong"
        p2.harga = "500.000"
        p2.gambar = R.drawable.tas2

        val p3 = Produk()
        p3.nama = "Tas Sekolah"
        p3.harga = "500.000"
        p3.gambar = R.drawable.tas3

        array.add(p1)
        array.add(p2)
        array.add(p3)

        return array
    }

    val arrayTerlaris : ArrayList<Produk>get(){

        val  array = ArrayList<Produk>()
        val p1 = Produk()
        p1.nama = "Tas Gunung"
        p1.harga = "500.000"
        p1.gambar = R.drawable.tas4

        val p2 = Produk()
        p2.nama = "Tas Nongkrong"
        p2.harga = "500.000"
        p2.gambar = R.drawable.tas5

        val p3 = Produk()
        p3.nama = "Tas Sekolah"
        p3.harga = "500.000"
        p3.gambar = R.drawable.tas6

        array.add(p1)
        array.add(p2)
        array.add(p3)

        return array
    }

    val arrayPopuler : ArrayList<Produk>get(){

        val  array = ArrayList<Produk>()
        val p1 = Produk()
        p1.nama = "Tas Gunung"
        p1.harga = "500.000"
        p1.gambar = R.drawable.tas7

        val p2 = Produk()
        p2.nama = "Tas Nongkrong"
        p2.harga = "500.000"
        p2.gambar = R.drawable.tas8

        val p3 = Produk()
        p3.nama = "Tas Sekolah"
        p3.harga = "500.000"
        p3.gambar = R.drawable.tas9

        array.add(p1)
        array.add(p2)
        array.add(p3)

        return array
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}