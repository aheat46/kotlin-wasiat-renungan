package wasiat.wasiatnahdlatulwathan.helper

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class Data: AppCompatActivity() {

    var query : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('181', 'Kalua guru membuang muridnya, Tidak terputus pertaliannya," +
//                " Dan sebaliknya putus jadinya, Ini menurut fawa “fuqaha”', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('182', 'Guru Agama pilih yang mursyid nyata, Yang tetap utuh sambungan pipanya," +
//                " Jangan yang putus sambungan gurunya, Agar tak nyesal kemudian harinya', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('183', 'Guru Agama imam ke syurga, Perlu dipilih wajib dijaga," +
//                " Silsilah yang putus tidak berguna, Dunia akhirat dlalan-mubina (sub)', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('184', 'Tuntutlah ilmu sebanyak mungkin, Sampai mendapat gelar muflihin," +
//                " Gelar dunia perlu dijalin, Dengan ajaran Rabbul’Alamin', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('185', 'Dunia belaka tak ada artinya, Bila akhirat dibelakanginya," +
//                " Semua makhluk kembali kesana, Baik dan buruk ternyata padanya', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('186', 'Jaga baiklah gelar Ananda, Agar ananda jangan ternoda," +
//                " Pergunakan teguh selama-lamanya, Untuk agama untuk negara', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('187', 'Syeikh Azzami telah berkata :, “Banyak sekali kulihat nyata," +
//                " Bahwa agama banyak ternoda, Oleh orang bergelar dunia”', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('188', 'Sangat benar Fatwa Syekh Azzam, Dapat terbukti siang dan malam," +
//                " Tidak sedikit iman tenggelam, Di lautan hawa nafsu jahannam (sub)', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('189', 'Kalau iman seorang tidak di dalam, Politik juangnya hanya menghantam," +
//                " Asalkan dunia dan fulus digenggam, Tidak peduli taqwanya tenggelam', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('190', 'Penuh dunia buktinya nyata, Disaksikan oleh seluruh mata," +
//                " Bahwa mereka bertuhankan hawanya, Tidak bertuhan kepada tuhannya', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('191', 'Wahai anakku yang kucintai, Serah dirimu kepada ilahi," +
//                " Jangan anakku menggantungkan diri, Kepada makhluk pemain jani', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('192', 'Orang munafik tidak perduli, Melanggar janji seribu kali," +
//                " Karena lidahnya tidak bertali, Lari kekanan lari kekiri (sub)', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('193', 'Ingatlah nanda da’wahnya Anbiya’, Da’wah Ulama da’wah Auliya’," +
//                " Menentang ajaran para Asyqiya’, Agar ummat menjadi Atqiya’', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('194', 'Wajib dicontoh jejak mereka, Berjuang LILLAHI semata-mata," +
//                " Membeli iman membela taqwa, Menentang iblis maklar neraka', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('195', 'Bahwa iblis dua macamnya, Yakni syaitan dan manusia," +
//                " Yang paling bahaya iblis kedua, Karena lidahnya sangat berbisa (sub)', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('196', 'Dekatkan dirimu kepada tuhan, Jauhkan dari pembela syaitan," +
//                " Amar-Ma’ruf wajib tegakkan, Nahi-Munkar tetap aktifkan', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('197', 'Abu As-Suhud da’wahnya kontan, Mengetuk hati dengan spontan," +
//                " Tidak melesat dari dugaan, Membantu roda Nahdlatul Wathan', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('198', 'Berkelana terus kedaerah-daerah, Bersama khadami menjunjung perintah," +
//                " Dengan dua ribu dan dua wajah, Membela iman membela syari’ah', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('199', 'Haruslah Nahdliyun syukur seribu, Ke Abu As-Suhud pahlawan jitu," +
//                " Iman taqwa di Ka’bah bersatu, Semoga Allah tetap merestu', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('200', 'Imran siap dengan kilat anginnya, Secepat kilat kemana perginya," +
//                " Menjunjung perintah sepenuh ta’atnya, Fattah Badawi merestuinya', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('201', 'Berkelana ikhlas malam dan hari, Serta imannya mengabdikan diri," +
//                " Ratusan ribu kilo dalam sehari, Di masjid Jami’ tempat kompromi', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('202', 'Duplikat Ngampel dan Kalijaga, Berlaku lebih tiga bulan nyata," +
//                " Memancar sinar di  Nusantara, Menghidupkan Iman bersinar Taqwa', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('203', 'Dua puluh enam dibagi dua, Pastinya tiga belas merata," +
//                " Pertujuh menit seribu dan asa, Rahasianya ‘Indahuta’ala', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('204', 'Memang tuhan yang maha kuasa, Mengatur alam-Nya sepanjang masa," +
//                " Tak ada mustahil untuk selama, Bila tuhan menghendakinya', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('205', 'Sangat sempena tempat bertemu, Di Hira’ tempat turunnya Wahyu," +
//                " Ia menjelma di tempat itu, Maulana Al-Malik mendapat restu', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('206', 'Di salah satu warta berita, Tak pernah diberi kepada siapa," +
//                " Laakin oleh karena cintanya, Kepada penerus di limpahkannya', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('207', 'Sungguh besarlah jasa seorang, Yang zhahir batinnya untuk berjuang," +
//                " Memimpin ummat ke jalan yang terang, Adil makmur kebenaran gemilang (sub)', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('208', 'Sayid Saggaf memasang kaca, Tembok keramat luar biasa," +
//                " Siapa memanah kembali padanya, Ciptaan tuhan yang maha kuasa', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('209', 'Pecut akhirat keliling dunia, Di dalam tempo sekejap mata," +
//                " Orang mu’minin menadahkan do’a, Membantu iman membantu taqwa', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('210', 'As-Saggaf memang banyak berjasa, Pada An-Nahdilyin dimana-mana," +
//                " Bantuan moril dapat dirasa, Bantuan materiil dipandang mata', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('211', 'Lenga hitam di padang sahara, Sangu pejuang di purbakala," +
//                " Sayid maliki melimpahkannya, Ummu Qudsiah merestuinya', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('212', 'Thariqat Hizib Nahdlatul Wathan, Disambut luas desa dan dasan," +
//                " Semua ‘astik mendo’akan’ ikhwan, Menadahkan tangan kepada Tuhan', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('213', 'Sering sekali hizib nan jaya, Menjadi mahar putri setia," +
//                " Disertahkan oleh pemuda kita, Mengharap berkahnya sepanjang zaman', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('214', 'Wirid An-nur berkumandang terus, Untuk mereka yang masih tulus," +
//                " Memuja-muji Ilahi-Quddus, Semoga Tuhan menghidupkan nufus', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('215', 'Wirid Fash dan Do’a Pusaka, Wirid Khusus dan Sumber Rezqinya," +
//                " Diijahkan pada waktunya, Semoga Allah memberikannya', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('216', 'Banyak sekali mubassyirat nyata, Disampaikan oleh Pewirid kita," +
//                " Sungguh iklas tak ada bandingnya, Membawa ummat ke jalan yang nyata (sbu)', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('217', 'Ayahanda tabligh di malam sunyi, Hadapi lautan makhluk insani," +
//                " Agar tersebar ajaran ilahi, Di nusantara dan luar negeri', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('218', 'Tabligh dibuka sepanjang malam, Dengan luasnya luar dan dalam," +
//                " Agar ummat jangan tenggelam, Berkat rahmat pencipta alam', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('219', 'Memang da’wah iman yang murni, Di waktu nafahaat Rabbul’Izzati," +
//                " Membawa ummat ikhlas sejati, Aktif mengetuk Babul jannati', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('220', 'Ayuhai Iman ayuhai Taqwa, Ayuhai islam ayuhai Agama," +
//                " Ayuhai Ihsan ayuhai Saudara, MA’ASHSHODIQIN ABADAN ABADA', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('221', 'Allahu Akbar Yang Maha Kuasa, Limpahkan ni’mat setiap masa," +
//                " Sehingga hamba-Nya tidak merasa, Akan ni’mat yang luar biasa', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('222', 'Justru itu marilah kita, Tetap bersyukur tetap berdo’a," +
//                " Agar tetaplah terpelihara, Segala ni’mat selama-lamanya', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('223', 'Janganlah lalai janganlah lupa, Sekalipun nanda menjadi “Bapa”," +
//                " Sumber ni’mat perlu dijaga, Selama hidup di alam fana', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('224', 'Tak pandai bersyukur kepada Tuhan, Orang yang tidak mensyukuri insan," +
//                " Karena Tuhan menjadikan wathan, Dan menjadikan Nahdlatul Wathan', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('225', 'Anakku kalian kuamanatkan :, “Membela teguh Nahdlatul Wathan," +
//                " Kompak utuh sepanjang zaman, Iman taqwa diperjuangkan”', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('226', 'Sekian Wasiat Renungan Masa, Pengalamanku sekian lama," +
//                " Khususnya setelah bersandiwara, Berpesta pora di Nusantara', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('227', 'Di akhir abad ke-Empat Belas, Sampai masuknya ke Lima Belas," +
//                " Ayahda berdiam renungkan nafas, Akhirnya mendapat ilham nan jelas', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('228', 'Ilahi Rabbi Yang Maha Kuasa, Limpahkan taupiq hidayat dan ridla," +
//                " Kepada hambaMu maan Nahdliyina, Jadikan semua hamba muttaqiina', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('229', 'Tuangkan langsung hujan barakat, Dari Auliya’Ahlun Nafahaat," +
//                " Kepada Nahdliyin serta Nahdliyat, Dunia akhirat mendapat syafa’at', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('230', 'Tegakkan Sasak setegak Rinjani, Membela iman membela diri," +
//                " Tegak utuh ikhlas berani, Tidak tertawan ajaran iblisi', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('231', 'Aamin Ilahi ya Rabbal’Alamin, Aamin ya Karim Akramal-akramin," +
//                " Aamin ya Rahman Arhamar-rahimin, Aamin fastajib bi Thaahal-Amin', '0' )"
//        db.execSQL(query)
//
//        query = "INSERT INTO "+ DBHelper.tableName +" VALUES " +
//                "('232', 'Falhamdulillahi Rabbil’Alamin, Wasysyukrulahu minnan Nahdliyin," +
//                " Shalat salam Li Sayyidil Mursalin, Waaalihi washahbihi ajma’in', '0' )"
//        db.execSQL(query)
//
//        // 63, 83, 181, 206

    }
}