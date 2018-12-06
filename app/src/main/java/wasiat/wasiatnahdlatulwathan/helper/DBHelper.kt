package wasiat.wasiatnahdlatulwathan.helper

import android.annotation.SuppressLint
import android.content.Context
import android.database.Cursor
import android.database.SQLException
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.support.v7.widget.RecyclerView
import android.widget.ListView
import wasiat.wasiatnahdlatulwathan.adapter.CardAdapterWasiat
import wasiat.wasiatnahdlatulwathan.model.DataModel

/**
 * Created by aheat on 7/3/18.
 */
class DBHelper : SQLiteOpenHelper {


    var context: Context? = null


    companion object {
        var dbName = "Wasiat.db"
        var dbVersion = 7
        val tableName = "table_wasiat"
    }


    constructor(context: Context) : super(context, dbName, null, dbVersion) {
        this.context = context
    }

    override fun onCreate(db: SQLiteDatabase) {
        var query = "CREATE TABLE IF NOT EXISTS " + tableName + " (_id INTEGER PRIMARY KEY AUTOINCREMENT, judul TEXT, isi TEXT, status INTEGER );"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('0', 'Karena Setia Menjunjung Perintah, Menghidupkan Quran menghidupkan Sunnah," +
                " Banyak terhulur butiran hikmah, Falhamdullah wasysyukurkah', '1')"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('1', 'Setelah Berazam Ke Rumah Sendiri, Rumah Haqiqi bukan majazi," +
                "Banyak bantuan Ilahi Rabbi, Ke Khdam Selaparang Rinjani', '1')"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('2', 'Datu Bersama Ayahandanya, Limpahkan takluk dan kumbakarna," +
                " Sapu jagat dan sebagainya, Bukti rinjani dan Gadjah Mada', '1')"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('3', 'Guci sengenger berlambang rapi, Naga dan ayam sapi kelinci," +
                " Hikmat berlongas sangat berarti, Tunjukkan tanda kebesaran Ilahi', '0')"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('4' , 'Kelinci lari kebawah beringin, Ditertawai kelinci sepenuh angin," +
                " Ayam berkokok naga dipimpin, Obat mujarab hikmat Ilahi', '0')"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('5', 'Mustika insane hikmatnya tinggi, Dan alat tabligh lampu dan guci," +
                " Qarurah hikmat memproduksi, Obat mujarat hikmat Ilahi', '0')"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('6', 'Pusaka Rabi’ah bernama “bayu”', 'Pusaka Rabi’ah bernama “bayu”, Dipusakakan pada yang maju," +
                " Aktif berjuang siap selalu, Tahan uji seribu satu', '0')"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('7', 'Pusaka Pejanggik mudah tibanya, Tidak disangka sultan wasithnya," +
                " Ghaib Al-Jazair bertanda mata, Dan Kali Musa pun beri tanda', '0')"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('8', 'Sayid Abdullah shahib ayahanda, Di perang Bali Congah-Peraya," +
                " Limpahkan pula batu berguna, Sambil memberi nasihat cinta', '0')"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('9', 'DEWI mengirim sebuah kelapa, Tinggi pohonnya lima ribu depa," +
                " Batu keliling tugasnya menjaga, Pulau Lombok selama-lamanya', '0')"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('10', 'Dapat dipinjam sehari semalam, Setelah itu kembali menyelam," +
                " Berkeliling terus siang dan malam, Semoga barakat tetap tergenggam', '0')"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('11', 'Pohon kelapa di alam hikmah, Tidak berada di kebun dan sawah" +
                " Dipetik oleh petugas hadlrah, Syaid Khalidi pemberi isyarah', '0')"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('12', 'Sangat ajaibnya pengambilan batu, Ia berpindah kesana kesitu," +
                " Ngembalikannya secara tertentu, Diterimakan di atas perahu', '0')"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('13', 'Di Sasak ini banyaklah masih, Pusaka lama ditempat tersisih," +
                " Lobar Loteng ditempat tersisih, Di Lotim penuh dijaga patih', '0')"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('14', 'Hamba yang khusus sering bertemu, Di tempat yang memang sudah tertentu" +
                " Karena mereka mendapat restu, Dengan mudahnya membuka pintu', '0')"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('15', 'Maulana Malik banyak berjasa, Meberi bantuan hiburan nyata," +
                " Terima kasih berjuta-juta, Wasysyukurulahu Abadan abada', '0')"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('16', 'Makhluk jinak aktif beraksi, Ke Kalimantan dan Sulawesi," +
                " Ke NTT Sumatera dan Bali, Bahkan ke Sabang sampai Meraoke', '0')"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('17', 'Malahan sampai keluar negeri, Seperti Makkah Mesir Magrabi," +
                " Amerika Rusia Jepang Itali, Dengan hikmat Ilahi Rabbi', '0')"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('18', 'Pandai memakai seluruh bahasa', 'Pandai memakai seluruh bahasa, Yang nyata berlaku dalam dunia," +
                " Ia tak perlu berhadapan muka, Cukup hanya ke arah mereka', '0')"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('19', 'Sering memakai seribu satu, Wajahnya terang di sana di situ," +
                " Mengajak Ummat kejalan yang satu, Hikmah Ilahi pelimpah restu', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('20', 'Sunan mulia limpahkan hadyah, Setelah terbuka pintunya Ka’bah," +
                " Ambar nyawa harumnya megah, Batu himpitan menambah hikmah (sub)', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('21', 'Setelah Anbar ninggalkan Semeru, Gunung bergoncang di saat itu," +
                " Akhirnya keluar lahar melulu, Hampir terganggu cemara siwu', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('22', 'Memang hebat upacaranya, Jarang terjadi sepanjang masa," +
                " Bila Allah yang Maha Kuasa, Hendaki suatu pastilah nyata', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('23', 'Pulau Meringkik mencatat sejarah, Mencukupi himpitan hajarul Hajarul Ka’bah," +
                " Di Geresik hanya diberi setengah, Memang Tuhanlah mengatur hikmah', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('24', 'Wali Songo Malik Ibrahim', 'Wali Songo Malik Ibrahim, Sentral da’wahnya pernah bermukim," +
                " Beberapa waktu dipengkores intim, Suku Sasak Islamnya Salim', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('25', 'Di sana-sini berangsur-angsur, Di Lombok Tengah dan Lombok Timur," +
                " Rasyid di barat sampai terkubur, Pada akhirnya NW mengatur (sub)', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('26', 'Kalau nanda memang beryakin, Tak sampai hati meninggalkan Zainuddin," +
                " Maulana Hasan do’akan T a m k i n, Dalam kitabnya “Almustarsyidin”', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('27', 'Malahan Maulana banyak bersurat, Disamping tersurat banyak tersirat," +
                " Mutiara hikmah penuh isyarat, Lahir batinya membawa hikmat', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('28', 'Rasyid berkata di satu malam, Lombok serambi Masjidil-Haram," +
                " Sejak dibangun bernafaskan Islam, Oleh putera sulthanul Iman', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('29', 'Bahwa di Lombok sebelum ini, Paham animis anutan asli," +
                " Sewaktu-waktu didatangi da’i, Akhirnya lahir Sultan Rinjani (sub)', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('30', 'Makhluk yang putih ratusan nyata, Dipimpin oleh yang paling tua," +
                " Di kendaru Gerung Rasyid ngaturnya, Kabir Akbar penjelmaan Aqsha', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('31', 'Sungguh ajaib bukan kepalang, Berabad-abad tak hancur hilang," +
                " Di bawah hikmat yang gilang gemilang, Pilihan Allah di Selaparang', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('32', 'Banyak sekali pandai membaca, Tapi takpandai mengkaji yang nyata," +
                " Kitab yang gundul dibaca nyata, Di kitab berbaris hatinya buta', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('33', 'Pulau sasak kecil sekali, Tapi gunungnya besar dan tinggi," +
                " Kalau orang pandai mengkaji, Pastilah sujud seribu kali', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('34', 'Kabir Akbar Arabi Mina, Khadami rasyid nyebarkan agama," +
                " Mamiq Milasih nama samarannya, Supaya Sasak cepat nerima', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('35', 'Memang hebatlah Mamiq Milasih, Jarak jauh pun dapat melihat," +
                " Dapat menolong dapat meraih, Asalkan niat suci dan bersih', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('36', 'Sungguh besarlah bantuah patih, Turut berjuang siap melatih," +
                " Semoga Allah Yang Maha Pengasih, Limpahkan asuh asah dan asih', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('37', 'Di liang Petang di Moyohulu, Tujuh mubalig bermakam di situ," +
                " Penyebar Islam zaman dahulu, Awal terbuka daerah Dompu', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('38', 'Yaitu : Ali Patah Badawi, Dan Harun Zain Abu Bakar Husni," +
                " Dan Firdaus “Imran Aalu Syahabi”, “Amir Hajjaj Muhammad Ali Akbari” (sub)', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('38', 'Telepon sentral di alam bebas, Sambung-menyambung tidak terbatas," +
                " Ke kanan kiri bawah dan atas, Sampaikan berita kontan dan puas', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('40', 'Telepon hikmat dan berguna, Mendapat khabar pada waktunya," +
                " Dan tidak perlu ada kabelnya, Cukup ditempel pada temboknya (sub)', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('41', 'Penebang jasmani Sang Selaparang, Bikinannya aneh bukan kepalang," +
                " Cerminkan bangkitnya semua orang, Dari lahadnya untuk ditimbang', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('42', 'Subhanallah Yang Maha Agung, Pencipta alam yang tak terhitung," +
                " Ajib dan gharib sambung-menyambung, Akal imani tidaklah bingung (sub)', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('43', 'Negara kita berpancasila, Berketuhanan Yang Maha Esa," +
                " Ummat Islam paling setia, Tegakkan sila yang paling utama', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('44', 'Yang Maha Esa adalah satu, Mustahil berbilang mustahil berpadu," +
                " Dengan dalil Qur’an yang satu, Surat Al-Ikhlas tepatnya jitu (sub)', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('45', 'Bantuan Tuhan Yang Maha Esa, Di waktu HULTAH sangat terasa," +
                " Ratusan ribu berlipat ganda, Banjiri Pancor setiap masa', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('46', 'Syetan iblis terpukul mundur, Usaha mereka terbakar hancur," +
                " Dengan bantuan Alhayyu Syakur, Dibimbing oleh pembimbing jujur', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('47', 'Dan dengan keramat Maulana Alhasan, Pembimbing utama Nahdlatul Wathan," +
                " Sepanjang masa Maulana do’akan, Agar selamat sepanjang zaman', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('48', 'Ternyata maqbul do’a Maulana, Setiap saat dapat dirasa," +
                " Sehingga kita berasa lega, Meskipun masih belum sempurna', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('49', 'Marilah kita bersama do’akan, Pembimbing kita Maulana Alhasan," +
                " Semoga hidup jiwa kalian, Mendayung bahtera Nahdlatul Wathan (sub)', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('50', 'Ummat muhtadin selalu ziarah, Di NWDI induk madrasah," +
                " Secara dharirah dan ruhaniyah, Membawa berkat dan sinar Ka’bah', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('51', 'Berbondong-bondong berfirqah-firqah, Setiap waktu setiap saat," +
                " Banjiri Pancor menuju madrasah, Seakan menuju ke kota Ka’bah', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('52', 'Pembela dunia serempak mengepung, Terus menerus tidak terhitung," +
                " Segala cara bergunung-gunung, Akhirnya mereka termenung bingung', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('53', 'Pembela akhirat tampil ke depan, Membuka jalan Nahdlatul Wathan," +
                " Ikut berjuang dalam barisan, Keridhaan Tuhan pokok tujuan', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('54', 'Nahdlatul Wathan berjalan terus, Siang dan malam tidak terputus," +
                " Meskipun dahsyat gelombang arus, Dalam lindungan Ilahi Al-Quddus (sub)', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('55', 'Banyaklah orang tersesat jalan, Mengaku diri Nahdlatul Wathan," +
                " Padahal dia di luar barisan, Tidak menurut garis pimpinan', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('56', 'Memang begini caranya syetan, Mendekte insan membuang iman," +
                " Takperdulikan ajaran Tuhan, Asal mendapat kursi dan umpan', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('57', 'Bahwa PB adalah satu, Bukannya dua bukannya telu," +
                " Atas pimpinan PB yang satu, Dewan mustasyar pemberi restu', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('58', 'Di akhir zaman banyak berbohong, Setiap detik beromong kosong," +
                " Tutur katanya kosong melompong, Karena inginnya jadi “pemborong”', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('59', 'Terkadang ingin merebut dunia, Jadi kepala jadi pemuka," +
                " Jadi kemudi jadi utama, Hingga menendang prinsip agama', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('60', 'Memang banyaklah simodel begitu, Selalu ada setiap waktu," +
                " Di saat mengejar fulus dan bangku, Karena imannya memang di situ', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('61', 'Ucapan Raksasa di zaman dahulu, “Mambun Wong Anak Manusia Bejulu”," +
                " Raksasa moderen teriak selalu, “Mambun uang dan kursi perlu”', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('62', 'Auliya`ullah berkata selalu, Zaman sekarang maupun dahulu," +
                " “Iman taqwa hidupkan olehmu, Kumudian baru mencari sangu”', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('63', 'karena insan dijadikan tuhan, Mengabdikan diri sepanjang zaman," +
                " Bukan pokoknya bersihkan iman', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('64', 'janganlah heran janganlah bingung, Jangan terkejut jangan termenung," +
                " Segala nasib sudah tergulung, Dalam “iradat” yang maha agung', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('65', 'Marilah kita syukur seribu, Setiap detik setiap waktu," +
                " Karena kita tidak begitu, Semoga allah tetap merestu (sub)', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('66', 'Kita berada di abad  final, Di abad “Yahin” sudah terkenal," +
                " Iman taqwa jangan dijual, Jangan digadai pada “sang dajjal”', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('67', 'Hidupkan iman hidupkan taqwa, Agar hiduplah semua jiwa," +
                " Cinta teguh pada agama, Cinta kokoh pada negara', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('68', 'Sangat durhaka seorang hamba, Menjual iman melelang taqwa," +
                " Membuang diri dan ibu bapa, Mengejar bayangan kursi dunia', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('69', 'Berikan andilmu kepada islam, Di abad bangkitnya seluruh umam," +
                " Iman taqwa jadikan imam, Menghadap ka`bah masjidil haram', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('70', 'Di surat taubat rabbul alamin, Memanggil semua kaum mu`minin," +
                " Supaya benar jadi muttaqin, “harus bersatu dengan shadiqin”', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('71', 'Maha benar allah pada firmanNya, Pada garisNya kepada hamba-Nya," +
                " Harus dijunjung oleh semua, Agar selamat selama-lamanya', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('72', 'Ingatlah kita akan kembali, Mengadap tuhan rabbul ‘Izzati," +
                " Menyampaikan laporan amal sendiri, Seluruh makhluk menjadi saksi', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('73', 'Para Auliya’ memanjatkan do’a, Membantu mereka yang hidup jiwa," +
                " Membela iman membela taqwa, Tidak tertawan harta dan tahta', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('74', '“Maliki Rasyid Saggaf dan Burhan, Kutbi Ibrahim Maulana Al-Hasan," +
                " Kali Musa dan Abdullah Sulthan, Al-Jaziri ma’a jumlatil ikhwan”', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('75', 'Junjungan alam telah bersabda :, “Sunguh celaka si budak harta”," +
                " Umat Islam di mana berada, Asalnya satu dan bersaudara, '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('76', 'Wajib kompak membela agama, Agama Allah Yang Maha Esa," +
                " Yang paling mulia yang paling taqwa, Yang paling tegak membela agama', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('77', 'Agama bukan sekedar ibadah, Puasa sembahyang di atas sajadah," +
                " Tapi agama mencakup aqidah, Mencakup Syari’ah mencakup hukumah', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('78', 'Agama itu syari’at Tuhan, Diamanatkan ke banil-insan," +
                " Untuk dijunjung sepanjang zaman, Agar terhindar godaan syetan', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('79', 'Syetan menggoda terus-menerus, Siang dan malam tidak terputus," +
                " Agar insani terputus terus, Dari tuhannya Yang Maha Quddus', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('80', 'Iman Islam Ihsan bertiga, Harus dibela bersama-sama," +
                " Selama roh dikandung rangka, Karena ialah rukun agama (sub)', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('81', 'Orang sekarang gila mentebur, Rijalulghaib harus diturut," +
                " Walau penyebar Harut wa Marut, Wahai inilah I’tiqad bangkrut', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('82', 'Qur’an hadits landasan kita, Bukan petunjuk bake’ belata," +
                " Ataupun ceceta ramalan belaka, I’tiqad suci harus dijaga', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('83', 'Rijalulghaib utusan Quddus, Hanya meyuruh berbuat bagus," +
                " Aau mebisik secara halus, Agar insani selalu tulus', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('84', 'Rijalulghaib tidak mengajar, Supaya orang berkurang-ajar," +
                " Yang suka menyuruh kerjakan mungkar, Rijalul’aib Dajjalul-mungkar', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('85', 'Rijalul’aib syaitan terla’nat, Membisikkan orang agar khianat," +
                " Rijalulghaib membawa rahmat, Agar insani patuh dan ta’at', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('86', 'Harus bedakan ghaib dan ‘aib, Pemimpin ‘ibadat Rijalulghaib," +
                " Pengajak ma’siat Rijalul’aib, Tepat namanya Dajjalul’aib', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('87', 'Jangalah nanda sampai keliru, Antara bumi dan langit biru," +
                " Kalau seorang gilanya terlalu, Haruut wa Maruut imamnya selalu', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('88', 'Wahai ananda hidupkan taqwa, Matikan syaitan matikan hawa," +
                " Karena taqwa pembuka syurga, Syaitan dan hawa pintu neraka (sub)', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('89', 'Wahai anakku janganlah lilus, Cahaya imanmu nyalakan terus," +
                " Jangan padamkan latanran fulus, Berkat hilang hubungan putus', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('90', 'Coba ingatlah riwayat a’immah, Diberi fulus dijanji wahifah," +
                " Mereka menolak demi aqidah, seujung rambut tidak menyerah', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('91', 'Banyaklah orang takut ziarah, Pada gurunya dikala musibah," +
                " Takutlah piring cangkirnya pecah, Atau digeser atau dimarah', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('92', 'Atau dilihat atau dicatat, Atau dinganggu turunkan pangkat," +
                " Karena atasan terlalu ketat, Selalau mengancam dengan memecat', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('93', 'Masyaa’ Allah wa innaa illaah…., Seakan fir’aun kembali bertingkah," +
                " Fir’aun modern beraksi megah, Mengancam orang berbuat ibadah', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('94', 'Malahan ada yang takut HULTAH, Tidak berani tampakkan wajah," +
                " Terkadang datang tapi gelisah, Padahal dia ustadz-ustadzah', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('95', 'Ya subhanallah ajib bin heran, Seakan meraka terputus iman," +
                " Karena lupanya kepada tuhan, Yang telah menjamin di dalam Qur’an', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('96', 'Kalua diserahkan kepada mereka, Memimpin agama atau negara," +
                " Maka qiamatlah agama kita, Sebelum qiamat nusa dan bangsa', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('97', 'Wahai anakku yang telah mengaji, Jaga teguhlah jiwa santri," +
                " Siddiq amanah ikhlas berani, Berjuang terus liwati Rinjani', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('98', 'Kalua anakda berjiwa Rinjani, Pastilah tegak sepanjang hari," +
                " Tidak berubah tidak ampibi, Walupun dijanji ranjang dan kursi', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('99', 'Di selaparang syukurlah ada, Orang yang tegak tampakkan dada," +
                " Membela agama membela negara, Tidak tertawan rayuan harta (sub)', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('100', 'Bani Isra’il sebab jatuhnya, Hasad takabur sogokan dan riba," +
                " Tadinya mereka paling utama, Akhirnya maghdlub mal’un abada', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('101', 'Orang yang turut jejak mereka, Jadi durhaka terkadang gila," +
                " Dhabhir bathinnya siksa menyiksa, Di akhirat kelak umpan neraka', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('102', 'Banyaklah orang menyerang guru, Memperalat atasan seribu satu," +
                " Aktif menyerang aktif memburu, Dhahir batinnya penuh cemburu', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('103', 'Terkadang menjual jiwa raganya, Menjual taqwa menjual imannnya," +
                " Itu terjadi karena gilanya, Ditawan syaitan dan hawa nafsunya', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('104', 'Terkadang ada juga berkata, Kami berbuat sebab terpaksa," +
                " Ekonommi kami sepi taka ada, Keroncongan perut fikiran buta', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('105', 'Terkadang ada juga mengaku, Bahwa meraka digadai di situ," +
                " Itulah sebabnya meraka itu, Menjadi budak menjadi penyapu', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('106', 'Sayang sekali hidupnya semua, Jar-majrurnya dunia belaka," +
                " Mereka lupa ayat “Rizquha”, Dan lupa pula ayat “MAKHRAJA”', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('107', 'Adam dan Hawa dilarang Allah, Mendekati pohon yakni “ASYSYAJARAH”," +
                " “LAATAQRABAA” larangan Allah, Setelah dilanggar jatuh ke bawah', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('108', 'MAN TAABA TAABALLAHU ‘ALAIHI, Orang yang taubat dikasihani," +
                " Limpahkan rahmat maghfirah abadi, Oleh tuhan Rabbul ‘Izzati', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('109', 'Ayuhai nanda perbaikilah iman, Luruskan I’tiqad kepada tuhan," +
                " Jangan nanda tersesat jalan, Ninggalkan Sunnah membuang Qur’an', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('110', 'Banyaklah orang idenya piring, Siang dan malam berputar keliling," +
                " Hanya membela kursi dan piring, Tidak membela pemberi piring', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('111', 'Pecah piring tidaklah soal, Karena piring banyak dijual," +
                " Asalkan hidup iman dan akal, Tuhan menjamin rizqi yang halal', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('112', 'Dalam politik bermain curang, Ke kiri kanan aktif menendang," +
                " Sehingga tak segan membayar hutang, Dengan NW nya pada seorang', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('113', 'Bila nanda memang berhutang, Janganlah NW yang harus dilelang," +
                " NW bukan milik seorang, Tak boleh pakai membayar hutang', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('114', 'NW alat penegeak iman, Penegak taqwa ajaran Tuhan," +
                " Bukan alat mencari makan, Mencari kursi melelang iman', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('115', 'Bukan benda diperjual-belikan, Dan bukan alat menjadi topengan," +
                " Berpura-pura memebela tuhan, Padahal membela makan dan makan (sub)', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('116', 'Manusia ihklas ada tandanya, Tetap berjuang dengan setia," +
                " Dimana saja meraka berada, Tidak tergantung menjadi pemuka', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('117', '“Contohnya Khalid dipecat Umar, Di perang Yarmuk sedang berkobar," +
                " Jiwa beliau bertambah besar, Bertambah ikhlas berjuang sabar', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('118', 'Bila seorang kehilangan akhlak, Dhahir batinnya suka memberak," +
                " Ibu bapaknya dipandang budak, Bila tak dapat emas dan perak', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('119', 'Melantur kiri melantur kanan, Membuka rahasia pada luaran," +
                " Organisasi dipermainkan, Seakan meraka tidak bertuhan', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('120', 'Memang begitulah cara sang musang, Waktu bertatap berkaji bertiang," +
                " Bila di luar berhaya memetang, Semua orang diajak menendang (sub)', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('121', 'Nahdlatul Wathan modal utama, Bagi NTB dan sasak semua," +
                " Karena lahirnya di zaman belanda, Sebagai madrasah sumber agama', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('122', 'Perlu dijaga bersmaa-sama, Selaku andil utama kita," +
                " Tegakkan iman tegakkan taqwa, “Di negara merdeka berpancasila”', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('123', 'Janganlah nanda mau diajak, Ikut serta merusak Sasak," +
                " Jangan terkena pepatak Sasak, “Dengan Sasak girang gerasak”', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('124', 'Sasak yang tulen nasionalisnya, Selalu dituduh sukuisme-nya," +
                " Sungguh penunduhla sukuisme buta, Penuh buktinya disini disana', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('125', 'NTB mengharap pemerataan, Keadilan sejati dan kebenaran," +
                " Agar meratalah kemakmuran, Ditanah-air ciptaan Tuhan', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('126', 'Hidup seorang harus diukur, Dengan imannya taqwa nan mujur," +
                " Bila seorang ta’at dan jujur, Hidup matinya di dalam ujur', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('127', 'Si keranjingan gila politik, Lupa dirinya kejungking-balik," +
                " Iman taqwanya hilang geritik, Na’udzuillah mimma hunalik (sub)', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('128', '“Kompak utuh bersatu haluan, Istiqomah ikhlas kepada Tuhan”," +
                " Itu amanat Maulana Al-Hasan, Kepada Warga Nahdlatul Wathan', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('129', 'Bagi yang tunduk pada nasihat, Memegang teguh pada amanat," +
                " Memegang teguh pada wasiat, Zhahir batinnya penuh barakat (sub)', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('130', 'Janganlah nanda lupa daratan, Karena mendapat kursi jabatan," +
                " Kursi Ananda diberikan tuhan, Lantaran jasa Nahdlatul Wathan', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('131', 'Insan mulia yang pandai bersyukur, Dan sebaliknya mereka yang kufur," +
                " Si ingkar ni’mat sepanjang duhur, Padahal ia langganan kubur', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('132', 'Sayanglah ananda lama mengaji, Di NWDI dan NBDI," +
                " Di Pancor Bermi di sana-sini, Asuhan HAMZANWADI sendiri', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('133', 'Tetapi banyak melupakan diri, Tidak lagi berjiwa santri," +
                " Karena tertawan “Sambal-Terasi”, Sampai lupakan “rumah sendiri”', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('134', 'Kalua orang berjiwa basi, Hanya mengejar bayangan kursi," +
                " Tidak peduli tuntuan ilahi, Selalu menendang Ayat Al-Kursi', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('135', 'Banyak sekali bilangan pencinta, Di kala senang berpesta-pora," +
                " Di kala ayahda dalam derita, Banyak yang lari tanpa berita', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('136', 'Melanggar bai’at melanggar sumpah, Melanggar iqrar melanggar perintah," +
                " Tidak peduli hubungan musnah, Tidak peduli Qur’an dan Sunnah', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('137', 'Tidak perduli dan tidak perduli, Apapun terjadi di dalam diri," +
                " Asalkan puas nafsu dan hati, Membela golongan membela family', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('138', 'Dan tidak sedikit bertambah mata, Hingga menjadi mata-mata dunia," +
                " Dari gilanya menghimpun dunia, Zhahir bathinnya buta dan buta', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('139', 'Ini namanya fanatik buta, Fanatik tuli seribu juta," +
                " Tidak melihat bukti yang nyata, Tidak mendengar dalil agama', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('140', 'Khianat sumpah khianat bai’at, Sangat bahaya dunia akhirat," +
                " Banyak terbukti banyak terlihat, “Imannya mati taqwanya melarat” (sub)', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('141', 'Ajibnya terkadang di Partai Islam, Berpura-pura membela Islam," +
                " Aktif keliling siang dan malam, Membela diri melupakan islam', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('142', 'Memang banyak simodel begitu, Diputar oleh makhluk tertentu," +
                " Akhirnya buta tuli dan bisu, Ingatlah hanya perut dan bangku', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('143', 'Inilah model insan sekarang, Rupanya tepatlah ulasan orang," +
                " “Bangkahulu bukan semarang, Lain dahulu lain sekarang”', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('144', 'Ayahda bersyukur seribu satu, Sejak belajar di Makkah dahulu," +
                " Sampai sekarang mendapat restu, Karena hubungan hidup selalu', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('145', 'Memang berkata tak dapat dibeli, Dengan mas intan sebesar Rinjani," +
                " Berkat itu rahasia ilahi, Dialamatkan ke insan yang murni', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('146', 'Justru haruslah menjaga hati, Mengikhlaskannya ke Rabbul ‘Izzati," +
                " Karena ia raja sejati, Bagi seluruh anggota insani', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('147', 'Wahai anakku sucikan hatimu, Dalam hatimulah rahasiamu," +
                " Rahasia hatimu pada dirimu, Karena itu hatimu', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('148', 'Teguhkan hatimu kepada Tuhan, Hidupkan taqwa hidupkan iman," +
                " Jangalah nakku takut bayangan, Dan kadal geresek ditepi jalan', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('149', 'Kosongkan dirimu di kala ibadah, Menghadap qiblat menghadap Ka’bah," +
                " Duduk bersimpah di atas sajadah, Mohon mendapat husnul-khatimah', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('150', 'Nabi sembahyang setelah hijrah, Bersama Yahudi kesatu arah," +
                " Ahkirnya Tuhan turunkah perintah, Harus kembali menghadap Ka’bah, '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('151', 'Karena kafir tak pandai bersyukur, Penuh khuyala’ hasad takabbur," +
                " Tidak hiraukan teman dan batur, Semau-maunya berpolitik catur', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('152', 'Pencipta alam telah gambarkan, Hati kafirkan sepanjang zaman," +
                " Bahwa merreka tak ridla Abadan, Di dalam firmanNya yaitu “WALAN” (sub)', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('153', 'Banyaklah orang memasuki NW, Tujuan pokoknya kursi pegawai," +
                " Tidak berfikir hidupkan NW, Iman taqwanya berpagi-sore', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('154', 'Dan bila melesat kaki kursinya, Lebar mulutnya mencela NW nya," +
                " PB dituduh sangat kakunya, Dewan mustasyar dinafikannya', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('155', 'Tuduhan begini lantaran gilanya, Kepada kursi dan harta benda," +
                " Kepada dunia semata-mata, Bukan berdasar iman taqwanya', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('156', 'Kalua abituren bebuat begitu, Sungguh celaka seribu satu," +
                " Dhahir batinnnya menjadi peluru, Melempar PB melempar Guru', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('157', 'Orang yang ta’at pada gurunya, Dituduh mengkultus oleh mereka," +
                " Tuduhan buta kareana jahilnya, Jahil murabba di Hadits Nabinya', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('158', 'Na’uzibuillah dari mereka, Yang hanya mengaku dirinya dirinya," +
                " Semua orang dinafikannya, Bila tak dapat ditunggang olehnya', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('159', 'Janganlah nanda bermain “carmuk”, Karena carmuk sifat si beruk," +
                " Dunia akhirat menjadi ambruk, Iman melayang taqwapun remuk', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('160', 'Bila nanda mencari muka, Janganlah cari di manusia," +
                " Tapi carilah di Rabbul-Baraya, Dengan iman dan amal taqwa', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('161', 'Kalau nanda memang setia, Pasti selalu siap siaga," +
                " Membantu ayahda membela agama, Di “Bulan Bintang Bersinar Lima”', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('162', 'Kalau nanda mengingat diri, Waktu belajar sehari-hari," +
                " Di NWDI dan NBDI, Pasti membela organisasi', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('163', 'Bila nanda memang beruntung, Tidaklah gampang menjadi bingung," +
                " Diserang fitnah di gawe dan warung, Jangan mendengar suara burung', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('164', 'Janganlah nanda dibikin bubur, Oleh pemain politik catur," +
                " Diperalat untuk melawan batur, Sehingga ukhuwah hancur dan lebur', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('165', 'Banyak sekali berlidah madu, Barhati pahit bagai empedu," +
                " Berpolitik : “membelah bambu”, Tujuannya ummat jangan bersatu', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('166', 'Sasak tak sadar rencana beruang, Mendekati bola untuk ditendang," +
                " Menjaga gawang sekedar lambang, “Habis manis sepah dibuang”', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('167', 'Politik satu ditambah Satu, Ditambah satu sama dengan satu," +
                " Dilancarkan oleh golongan tertentu, Membela nfasu membela hantu', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('168', 'Wahai anakku kompak bersatu, Jangalah terpikat bujukan hantu," +
                " Bersilat lidah setiap waktu, Dibalik udang batu di situ', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('169', 'Kalua nanda di timpa batu, Apa artinya udang beribu?," +
                " Kalua akhirat tertutup pintu, Apa artinya senang duniamu', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('170', 'Guru agama khusunya Ulama’, Atau Auliya’ atau Ashifiya’," +
                " Pembawa kunci di alamfana’, Pembuka pintu di alam baqa’', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('171', 'Itulah sebabnya penghulu nabi, Menyuruh murid setia bakti," +
                " Agar ilmunya berkatnya pasti, Dunia Akhirat Ridla Ilahi', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('172', 'Orang yang bakti kepada guru, Mendapat faidah hikmat yang baru," +
                " Tidak terduga lebih dahulu, Memang Allah Pemberi selalu', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('173', 'Kalau tak tampak semasih hayatnya, Akan tampaklah setelah pindahnya," +
                " Banyak terbukti sepanjang masa, Sebab baiknya sambungan pipanya', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('174', 'Kalau durhaka kepada Guru, Hatinya kecil selalu terburu," +
                " Akhlaknya rusak jasmaninya pilu, Terkadang hidupnya haram melulu', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('175', 'Aktif mengajak melawan Guru, Hawa nafsunya buru-memburu," +
                " Di banyak soal selalu keliru, Terkadang matinnya tidak menentu', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('176', '‘Ulama’ Tashawuf pernah berkata, Dengan jelasnya membuka fakta," +
                " Si gila pengaruh perusak agama, Ia selalu menjilat dunia', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('177', 'Sang doyan dunia membabi buta, Merusak dunia merusak semua," +
                " Tidak perduli ibu-bapaknya, Tidak perduli pada gurunya', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('178', 'Dahlan Ihkan telah berkata, Di kitab “Sirajuth Thalibiina : “," +
                " Murid durhaka pada gurunya, Tidak terhapus dosa lengahnya”', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('179', 'Ibnu As-Subki pun telah menaqal, Di kitab Thabaqat yang sangat terkenal," +
                " Fatwa tersebut memang dinaqal, Dari jawaban Imam ‘Busahal', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('180', 'Murid yang putus dari gurunya, Berarti rusak pipa ilmunya," +
                " Hilang terbakar sari ilmunya, Dibar syaitan dan hawa nafsunya, '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('181', 'Kalua guru membuang muridnya, Tidak terputus pertaliannya," +
                " Dan sebaliknya putus jadinya, Ini menurut fawa “fuqaha”', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('182', 'Guru Agama pilih yang mursyid nyata, Yang tetap utuh sambungan pipanya," +
                " Jangan yang putus sambungan gurunya, Agar tak nyesal kemudian harinya', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('183', 'Guru Agama imam ke syurga, Perlu dipilih wajib dijaga," +
                " Silsilah yang putus tidak berguna, Dunia akhirat dlalan-mubina (sub)', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('184', 'Tuntutlah ilmu sebanyak mungkin, Sampai mendapat gelar muflihin," +
                " Gelar dunia perlu dijalin, Dengan ajaran Rabbul’Alamin', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('185', 'Dunia belaka tak ada artinya, Bila akhirat dibelakanginya," +
                " Semua makhluk kembali kesana, Baik dan buruk ternyata padanya', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('186', 'Jaga baiklah gelar Ananda, Agar ananda jangan ternoda," +
                " Pergunakan teguh selama-lamanya, Untuk agama untuk negara', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('187', 'Syeikh Azzami telah berkata :, “Banyak sekali kulihat nyata," +
                " Bahwa agama banyak ternoda, Oleh orang bergelar dunia”', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('188', 'Sangat benar Fatwa Syekh Azzam, Dapat terbukti siang dan malam," +
                " Tidak sedikit iman tenggelam, Di lautan hawa nafsu jahannam (sub)', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('189', 'Kalau iman seorang tidak di dalam, Politik juangnya hanya menghantam," +
                " Asalkan dunia dan fulus digenggam, Tidak peduli taqwanya tenggelam', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('190', 'Penuh dunia buktinya nyata, Disaksikan oleh seluruh mata," +
                " Bahwa mereka bertuhankan hawanya, Tidak bertuhan kepada tuhannya', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('191', 'Wahai anakku yang kucintai, Serah dirimu kepada ilahi," +
                " Jangan anakku menggantungkan diri, Kepada makhluk pemain jani', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('192', 'Orang munafik tidak perduli, Melanggar janji seribu kali," +
                " Karena lidahnya tidak bertali, Lari kekanan lari kekiri (sub)', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('193', 'Ingatlah nanda da’wahnya Anbiya’, Da’wah Ulama da’wah Auliya’," +
                " Menentang ajaran para Asyqiya’, Agar ummat menjadi Atqiya’', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('194', 'Wajib dicontoh jejak mereka, Berjuang LILLAHI semata-mata," +
                " Membeli iman membela taqwa, Menentang iblis maklar neraka', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('195', 'Bahwa iblis dua macamnya, Yakni syaitan dan manusia," +
                " Yang paling bahaya iblis kedua, Karena lidahnya sangat berbisa (sub)', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('196', 'Dekatkan dirimu kepada tuhan, Jauhkan dari pembela syaitan," +
                " Amar-Ma’ruf wajib tegakkan, Nahi-Munkar tetap aktifkan', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('197', 'Abu As-Suhud da’wahnya kontan, Mengetuk hati dengan spontan," +
                " Tidak melesat dari dugaan, Membantu roda Nahdlatul Wathan', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('198', 'Berkelana terus kedaerah-daerah, Bersama khadami menjunjung perintah," +
                " Dengan dua ribu dan dua wajah, Membela iman membela syari’ah', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('199', 'Haruslah Nahdliyun syukur seribu, Ke Abu As-Suhud pahlawan jitu," +
                " Iman taqwa di Ka’bah bersatu, Semoga Allah tetap merestu', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('200', 'Imran siap dengan kilat anginnya, Secepat kilat kemana perginya," +
                " Menjunjung perintah sepenuh ta’atnya, Fattah Badawi merestuinya', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('201', 'Berkelana ikhlas malam dan hari, Serta imannya mengabdikan diri," +
                " Ratusan ribu kilo dalam sehari, Di masjid Jami’ tempat kompromi', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('202', 'Duplikat Ngampel dan Kalijaga, Berlaku lebih tiga bulan nyata," +
                " Memancar sinar di  Nusantara, Menghidupkan Iman bersinar Taqwa', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('203', 'Dua puluh enam dibagi dua, Pastinya tiga belas merata," +
                " Pertujuh menit seribu dan asa, Rahasianya ‘Indahuta’ala', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('204', 'Memang tuhan yang maha kuasa, Mengatur alam-Nya sepanjang masa," +
                " Tak ada mustahil untuk selama, Bila tuhan menghendakinya', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('205', 'Sangat sempena tempat bertemu, Di Hira’ tempat turunnya Wahyu," +
                " Ia menjelma di tempat itu, Maulana Al-Malik mendapat restu', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('206', 'Di salah satu warta berita, Tak pernah diberi kepada siapa," +
                " Laakin oleh karena cintanya, Kepada penerus di limpahkannya', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('207', 'Sungguh besarlah jasa seorang, Yang zhahir batinnya untuk berjuang," +
                " Memimpin ummat ke jalan yang terang, Adil makmur kebenaran gemilang (sub)', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('208', 'Sayid Saggaf memasang kaca, Tembok keramat luar biasa," +
                " Siapa memanah kembali padanya, Ciptaan tuhan yang maha kuasa', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('209', 'Pecut akhirat keliling dunia, Di dalam tempo sekejap mata," +
                " Orang mu’minin menadahkan do’a, Membantu iman membantu taqwa', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('210', 'As-Saggaf memang banyak berjasa, Pada An-Nahdilyin dimana-mana," +
                " Bantuan moril dapat dirasa, Bantuan materiil dipandang mata', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('211', 'Lenga hitam di padang sahara, Sangu pejuang di purbakala," +
                " Sayid maliki melimpahkannya, Ummu Qudsiah merestuinya', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('212', 'Thariqat Hizib Nahdlatul Wathan, Disambut luas desa dan dasan," +
                " Semua ‘astik mendo’akan’ ikhwan, Menadahkan tangan kepada Tuhan', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('213', 'Sering sekali hizib nan jaya, Menjadi mahar putri setia," +
                " Disertahkan oleh pemuda kita, Mengharap berkahnya sepanjang zaman', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('214', 'Wirid An-nur berkumandang terus, Untuk mereka yang masih tulus," +
                " Memuja-muji Ilahi-Quddus, Semoga Tuhan menghidupkan nufus', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('215', 'Wirid Fash dan Do’a Pusaka, Wirid Khusus dan Sumber Rezqinya," +
                " Diijahkan pada waktunya, Semoga Allah memberikannya', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('216', 'Banyak sekali mubassyirat nyata, Disampaikan oleh Pewirid kita," +
                " Sungguh iklas tak ada bandingnya, Membawa ummat ke jalan yang nyata (sbu)', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('217', 'Ayahanda tabligh di malam sunyi, Hadapi lautan makhluk insani," +
                " Agar tersebar ajaran ilahi, Di nusantara dan luar negeri', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('218', 'Tabligh dibuka sepanjang malam, Dengan luasnya luar dan dalam," +
                " Agar ummat jangan tenggelam, Berkat rahmat pencipta alam', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('219', 'Memang da’wah iman yang murni, Di waktu nafahaat Rabbul’Izzati," +
                " Membawa ummat ikhlas sejati, Aktif mengetuk Babul jannati', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('220', 'Ayuhai Iman ayuhai Taqwa, Ayuhai islam ayuhai Agama," +
                " Ayuhai Ihsan ayuhai Saudara, MA’ASHSHODIQIN ABADAN ABADA', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('221', 'Allahu Akbar Yang Maha Kuasa, Limpahkan ni’mat setiap masa," +
                " Sehingga hamba-Nya tidak merasa, Akan ni’mat yang luar biasa', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('222', 'Justru itu marilah kita, Tetap bersyukur tetap berdo’a," +
                " Agar tetaplah terpelihara, Segala ni’mat selama-lamanya', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('223', 'Janganlah lalai janganlah lupa, Sekalipun nanda menjadi “Bapa”," +
                " Sumber ni’mat perlu dijaga, Selama hidup di alam fana', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('224', 'Tak pandai bersyukur kepada Tuhan, Orang yang tidak mensyukuri insan," +
                " Karena Tuhan menjadikan wathan, Dan menjadikan Nahdlatul Wathan', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('225', 'Anakku kalian kuamanatkan :, “Membela teguh Nahdlatul Wathan," +
                " Kompak utuh sepanjang zaman, Iman taqwa diperjuangkan”', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('226', 'Sekian Wasiat Renungan Masa, Pengalamanku sekian lama," +
                " Khususnya setelah bersandiwara, Berpesta pora di Nusantara', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('227', 'Di akhir abad ke-Empat Belas, Sampai masuknya ke Lima Belas," +
                " Ayahda berdiam renungkan nafas, Akhirnya mendapat ilham nan jelas', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('228', 'Ilahi Rabbi Yang Maha Kuasa, Limpahkan taupiq hidayat dan ridla," +
                " Kepada hambaMu maan Nahdliyina, Jadikan semua hamba muttaqiina', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('229', 'Tuangkan langsung hujan barakat, Dari Auliya’Ahlun Nafahaat," +
                " Kepada Nahdliyin serta Nahdliyat, Dunia akhirat mendapat syafa’at', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('230', 'Tegakkan Sasak setegak Rinjani, Membela iman membela diri," +
                " Tegak utuh ikhlas berani, Tidak tertawan ajaran iblisi', '0' )"
        db.execSQL(query)

        query = "INSERT INTO "+ tableName +" VALUES " +
                "('231', 'Aamin Ilahi ya Rabbal’Alamin, Aamin ya Karim Akramal-akramin," +
                " Aamin ya Rahman Arhamar-rahimin, Aamin fastajib bi Thaahal-Amin', '0' )"
        db.execSQL(query)

        // 63, 83, 181, 206
        query = "INSERT INTO "+ tableName +" VALUES " +
                "('232', 'Falhamdulillahi Rabbil’Alamin, Wasysyukrulahu minnan Nahdliyin," +
                " Shalat salam Li Sayyidil Mursalin, Waaalihi washahbihi ajma’in', '0' )"
        db.execSQL(query)

    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS " + tableName)
        onCreate(db)
    }

    @SuppressLint("Recycle")
    fun getData(): List<DataModel> {


        val modelList: MutableList<DataModel> = mutableListOf()
        val query = "SELECT * FROM " + tableName

        val db = this.writableDatabase
        val cursor: Cursor = db.rawQuery(query, null)

        if (cursor.moveToFirst()) {
            do {
                val model = DataModel()
                model.setId(cursor.getInt(0))
                model.setTitles(cursor.getString(1))
                model.setContents(cursor.getString(2))
                model.setStatus(cursor.getInt(3))
                modelList.add(model)
            } while (cursor.moveToNext())

        }

        return modelList

    }

    fun getBookmark(): List<DataModel> {

        val modelList: MutableList<DataModel> = mutableListOf()
        val query = "SELECT * FROM "+ tableName +" WHERE status = 1"

        val db = this.writableDatabase
        val cursor: Cursor = db.rawQuery(query, null)

        if (cursor.moveToFirst()) {
            do {
                val model = DataModel()
                model.setId(cursor.getInt(0))
                model.setTitles(cursor.getString(1))
                model.setContents(cursor.getString(2))
                model.setStatus(cursor.getInt(3))
                modelList.add(model)
            }while (cursor.moveToNext())
        }

        return modelList
    }

    fun checkBookmark(position: Int): Int {

        val db = this.writableDatabase
        var status = 0

        val query = "SELECT status FROM "+ tableName + " WHERE _id = "+ position
        val cursor: Cursor = db.rawQuery(query, null)

        if (cursor.moveToFirst()) {
            status = cursor.getInt(cursor.getColumnIndex("status"))
        }

        return status

    }

    fun addBookmark(position: Int) {
        val db = this.writableDatabase
        val query = "UPDATE "+ tableName +" set status = " + 1 + " WHERE _id = " + position
        db!!.execSQL(query)
    }

    fun removeBookmark(position: Int) {
        val db = this.writableDatabase
        val query = "UPDATE "+ tableName +" set status = " + 0 + " WHERE _id = " + position
        db!!.execSQL(query)
    }

    fun dataRetreive(text: String): Cursor {
        val db = this.writableDatabase

        var cursor: Cursor?
        val projections = arrayOf("_id", "judul")

        if (text != null && text.length > 0) {
            val selectData: String = "SELECT * FROM "+ tableName + " WHERE judul LIKE '%"+text+"%'"
            cursor = db.rawQuery(selectData, null)
            return cursor
        }

        cursor = db.query(tableName, projections, null, null, null, null, null)

        return cursor

    }

    fun openDB() {

        try {
            val db = this.writableDatabase
        } catch (e: SQLException) {
            e.printStackTrace()
        }
    }

    fun closeDB() {

        try {
            val db = this.close()
        } catch (e: SQLException) {
            e.printStackTrace()
        }
    }


}