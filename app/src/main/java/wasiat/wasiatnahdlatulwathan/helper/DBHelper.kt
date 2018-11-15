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
                "('0', 'Karena Setia Menjunjung Perintah', 'Karena Setia Menjunjung Perintah, Menghidupkan Quran menghidupkan Sunnah," +
                " Banyak terhulur butiran hikmah, Falhamdullah wasysyukurkah', '1')," +
                "('1', 'Setelah Berazam Ke Rumah Sendiri', 'Setelah Berazam Ke Rumah Sendiri, Rumah Haqiqi bukan majazi," +
                "Banyak bantuan Ilahi Rabbi, Ke Khdam Selaparang Rinjani', '1')," +
                "('2', 'Datu Bersama Ayahandanya', 'Datu Bersama Ayahandanya, Limpahkan takluk dan kumbakarna," +
                " Sapu jagat dan sebagainya, Bukti rinjani dan Gadjah Mada', '1')," +
                "('3', 'Guci sengenger berlambang rapi', 'Guci sengenger berlambang rapi, Naga dan ayam sapi kelinci," +
                " Hikmat berlongas sangat berarti, Tunjukkan tanda kebesaran Ilahi', '0')," +
                "('4' , 'Kelinci lari kebawah beringin', 'Kelinci lari kebawah beringin, Ditertawai kelinci sepenuh angin," +
                " Ayam berkokok naga dipimpin, Obat mujarab hikmat Ilahi', '0')," +
                "('5', 'Mustika insane hikmatnya tinggi', 'Mustika insane hikmatnya tinggi, Dan alat tabligh lampu dan guci," +
                " Qarurah hikmat memproduksi, Obat mujarat hikmat Ilahi', '0')," +
                "('6', 'Pusaka Rabi’ah bernama “bayu”', 'Pusaka Rabi’ah bernama “bayu”, Dipusakakan pada yang maju," +
                " Aktif berjuang siap selalu, Tahan uji seribu satu', '0')," +
                "('7', 'Pusaka Pejanggik mudah tibanya', 'Pusaka Pejanggik mudah tibanya, Tidak disangka sultan wasithnya," +
                " Ghaib Al-Jazair bertanda mata, Dan Kali Musa pun beri tanda', '0')," +
                "('8', 'Sayid Abdullah shahib ayahanda', 'Sayid Abdullah shahib ayahanda, Di perang Bali Congah-Peraya," +
                " Limpahkan pula batu berguna, Sambil memberi nasihat cinta', '0')," +
                "('9', 'DEWI mengirim sebuah kelapa', 'DEWI mengirim sebuah kelapa, Tinggi pohonnya lima ribu depa," +
                " Batu keliling tugasnya menjaga, Pulau Lombok selama-lamanya', '0')," +
                "('10', 'Dapat dipinjam sehari semalam', 'Dapat dipinjam sehari semalam, Setelah itu kembali menyelam," +
                " Berkeliling terus siang dan malam, Semoga barakat tetap tergenggam', '0')," +
                "('11', 'Pohon kelapa di alam hikmah', 'Pohon kelapa di alam hikmah, Tidak berada di kebun dan sawah" +
                " Dipetik oleh petugas hadlrah, Syaid Khalidi pemberi isyarah', '0')," +
                "('12', 'Sangat ajaibnya pengambilan batu', 'Sangat ajaibnya pengambilan batu, Ia berpindah kesana kesitu," +
                " Ngembalikannya secara tertentu, Diterimakan di atas perahu', '0')," +
                "('13', 'Di Sasak ini banyaklah masih', 'Di Sasak ini banyaklah masih, Pusaka lama ditempat tersisih," +
                " Lobar Loteng ditempat tersisih, Di Lotim penuh dijaga patih', '0')," +
                "('14', 'Hamba yang khusus sering bertemu', 'Hamba yang khusus sering bertemu, Di tempat yang memang sudah tertentu" +
                " Karena mereka mendapat restu, Dengan mudahnya membuka pintu', '0')," +
                "('15', 'Maulana Malik banyak berjasa', 'Maulana Malik banyak berjasa, Meberi bantuan hiburan nyata," +
                " Terima kasih berjuta-juta, Wasysyukurulahu Abadan abada', '0')," +
                "('16', 'Makhluk jinak aktif beraksi', 'Makhluk jinak aktif beraksi, Ke Kalimantan dan Sulawesi," +
                " Ke NTT Sumatera dan Bali, Bahkan ke Sabang sampai Meraoke', '0')," +
                "('17', 'Malahan sampai keluar negeri', 'Malahan sampai keluar negeri, Seperti Makkah Mesir Magrabi," +
                " Amerika Rusia Jepang Itali, Dengan hikmat Ilahi Rabbi', '0')," +
                "('18', 'Pandai memakai seluruh bahasa', 'Pandai memakai seluruh bahasa, Yang nyata berlaku dalam dunia," +
                " Ia tak perlu berhadapan muka, Cukup hanya ke arah mereka', '0')," +
                "('19', 'Sering memakai seribu satu', 'Sering memakai seribu satu, Wajahnya terang di sana di situ," +
                " Mengajak Ummat kejalan yang satu, Hikmah Ilahi pelimpah restu', '0' )"

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
            val selectData: String = "SELECT * FROM "+ DBHelper.tableName + " WHERE judul LIKE '%"+text+"%'"
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