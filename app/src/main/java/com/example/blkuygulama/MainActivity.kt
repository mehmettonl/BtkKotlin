package com.example.blkuygulama

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        println("merhaba kotlin")
        println("hello kotlin")
        println(11 / 2)

        //asdas

        var x = 20
        println(x * 0)
        println(x * x)
        println(56 * x)
        val z = 20


        var ornek: Long = 10
        println("ornek : " + ornek)


        //double float

        val pi = 3.14
        println(pi * 2)

        println(pi / 2)
        println(5.0 / 2.0)
        val ornekDouble = 3.0

        val sonucDouble = pi * ornekDouble
        println(sonucDouble)

        val ornekFloat: Float = 2.90f
        println(ornekFloat * 2)


        //stringler
        println("---------STRİNGLER--------")


        val benimStringim : String
        benimStringim = "Benim Stringim"

        val isim = "mehmet"
        println(isim.uppercase())

        val soyisim = "önal"
        println(isim.uppercase() + " " + soyisim)

        val yas = "30"
        val ornekDeger = "20"
        println(yas + ornekDeger)

        val benimStr= "benim stringim"
        //benimStr = "benim stringim"

        val  yasInt = yas.toInt()
        val xLong = x.toLong()
        println(xLong)
        /*soldaki değer yeni atanan değer yani yukaridaki string olan yas degiskeni int veri tipine dönüştürülüyor yas.toInt sayesinde*/

        println(yasInt * 30)

        println("---------BOOLEAN--------")
        var benimBool: Boolean = true
        benimBool = false

        println(3 < 5)
        println(3 > 5)
        println(3 == 3)

        val kullaniciYas = "35"
        println(kullaniciYas.toInt() > 18)

        //!= eşit değildir
        //&& ve
        // || veya

        println("atil" == "atil")


        //VERİ YAPILARI

        //DİZİLER

        println("---------ARRAYS--------")

        val ornek1 = "mehmet"
        val benimDizim = arrayOf(ornek1, "LN", "BİLGİSAYAR", "MEHMET", "ankara")

        println(benimDizim[0])
        println(benimDizim[1])
        println(benimDizim.last())

        benimDizim[1] = "sam"


        println(benimDizim[1])
        println(benimDizim.get(3))

        /*benimDizim[5] = "5.indeks"
        println(benimDizim[5])*/

        val numaraDizisi = arrayOf(1, 2, 3, 4, 5)
        println(numaraDizisi.get(4) * 100)

        val karisikDizi = arrayOf(10, 20, "nisa", false, true)
        println(karisikDizi.get(2))

        //LİSTELER

        println("-----------LİSTELER-------------")

        val isimListesi = arrayListOf("ÖZAL", "YILDIRIM", "ÜNİVERSİTE", "FIRIN-KAFE")

        println(isimListesi[0])
        println(isimListesi[1])
        println(isimListesi[2])

        println(isimListesi.size)
        isimListesi.add("mahmut")
        println(isimListesi.size)
        isimListesi.add("14PROMAX")
        println(isimListesi[5])

        //isimListesi.removeAt(0)
        //println(isimListesi[0])

        val numaraListesi = arrayListOf<Int>()
        val digerOrnekListe = ArrayList<Int>()

        numaraListesi.add(10)
        numaraListesi.add(20)
        numaraListesi.add(30)

        digerOrnekListe.add(40)
        digerOrnekListe.add(50)
        digerOrnekListe.add(60)

        println(numaraListesi.get(1) * digerOrnekListe.get(0))

        val karisikListe = arrayListOf(10, 3, 14, "atıl", true)
        val karisikBosListe = arrayListOf<Any>()
        karisikBosListe.add(10)
        karisikBosListe.add("mehmet")

        println(karisikBosListe.get(0))

        println("-----------SET-------------")

        val ornekDizi = arrayOf(10, 10, 10, 10, 20, 30, 40)
        println(ornekDizi.get(0))
        println(ornekDizi.get(1))


        val ornekSet = setOf(10, 10, 10, 10, 20, 30, 40, 80,)
        println(ornekSet.size)

        ornekSet.forEach {

            println(it)
        }

        val bosSetOrnegi = HashSet<String>()

        bosSetOrnegi.add("Atıl")
        bosSetOrnegi.add("Samancıoğul")
        bosSetOrnegi.add("Atıl")
        bosSetOrnegi.add("Atıl")
        bosSetOrnegi.add("Atıl")
        bosSetOrnegi.add("Atıl")
        bosSetOrnegi.add("Zeynep")

        bosSetOrnegi.forEach {
            println(it)
        }
        val ornekTekilSet = ornekDizi.toHashSet()
        ornekTekilSet.forEach {
            println(it)
        }
        println("-----------MAP-------------")

        //ANAHTAR - DEĞER EŞLEŞMESİ

        val yemekDizisi = arrayListOf("ELMA", "ARMUT", "KARPUZ")
        val kaloriDizisi = arrayListOf(100, 150, 200)
        println("${yemekDizisi.get(0)}'nın kalorisi ${kaloriDizisi.get(0)}'dür. ")
        println("${yemekDizisi.get(1)}'nın kalorisi ${kaloriDizisi.get(1)}'dir. ")
        println("${yemekDizisi.get(2)}'nın kalorisi ${kaloriDizisi.get(2)}'dür. ")

        val yemekKaloriMapi = hashMapOf<String, Int>()
        yemekKaloriMapi.put("Elma", 500)
        yemekKaloriMapi.put("Armut", 600)
        yemekKaloriMapi.put("Karpuz", 700)

        println(yemekKaloriMapi.get("Elma"))
        println(yemekKaloriMapi.get("Armut"))

        yemekKaloriMapi.put("Elma", 129)
        println(yemekKaloriMapi.get("Elma"))

        val ornekHashMap = HashMap<String, Boolean>()
        ornekHashMap.put("atıl", true)
        ornekHashMap.put("abc", false)
        println(ornekHashMap.get("atıl"))
        println(ornekHashMap.get("abc"))

        println("-----------IF-ELSE-------------")

        val skor = -80

        if (skor < 10) {
            println("kaybettiniz")
        } else if (skor >= 10 && skor < 20) {
            println("idare eder")
        } else if (skor >= 20 && skor < 30){
            println("güzel skor")
        } else {
            println("çok iyi skor")
        }
        println("------------WHEN-----------")

        val notRakam=5
        var notString=""

        when(notRakam){

            0 -> notString = "Geçersiz Not"
            1 -> notString = "Zayıf"
            2 -> notString = "Kötü"
            3 -> notString = "Orta"
            4 -> notString = "İyi"
            5 -> notString = "Pek İyi"
            else -> notString = "Böyle bir not bulunamadı"

        }

        println(notString)

        println("------------WHİLE-----------")

        var j = 0
        println("döngü başladı")
        while (j<=10){
            println(j)
            j=j+1
        }
       println("döngü bitti")

        println("------------FOR-DÖNGÜSÜ-----------")

        val baskaDizi = arrayListOf(5,10,15,20,25,30)

        println("döngü başladı")
        for (numara in baskaDizi){
            println(numara / 5 * 3)

        }
        println("döngü bitti")

        println("döngü başladı")

        for (num in 0..9) {

            println(num * 10)

        }
        println("döngü bitti")

        val benimStringDizim = arrayListOf("mmt", "ali", "veli")
        benimStringDizim.add("atıl")
        benimStringDizim.add("zeynep")
        benimStringDizim.add("atlas")

        for (kelime in benimStringDizim){
            println(kelime.uppercase())
        }

        benimStringDizim.forEach {kelime ->
            println(kelime.uppercase())


        }
    }
}