package wasiat.wasiatnahdlatulwathan.helper

import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import wasiat.wasiatnahdlatulwathan.model.DataWasiat

/**
 * Created by aheat on 7/3/18.
 */
class DBHelper : SQLiteOpenHelper {

    var context: Context? = null

    companion object {
        var dbName: String = ""
        var dbVersion: Int = 1
        val tableName = "table_wasiat"
        val id = "id"
        val title = "title"
        val content = "content"
        val status = "status"
    }


    constructor(context: Context): super(context, dbName, null, dbVersion) {
        this.context = context
    }

    override fun onCreate(db: SQLiteDatabase) {
        val query = "CREATE TABLE IF NOT EXISTS " + tableName + " ( " + id + " INTEGER PRIMARY KEY AUTO INCREMENT, " +
                title + " TEXT, " + content + " TEXT, " + status + " TEXT );"

        db.execSQL(query)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS " + tableName)
        onCreate(db)
    }
//
//    fun getData(): List<DataWasiat> {
//
//        val db = this.writableDatabase
//        var dbList: List<DataWasiat>
//
//
//        val cursor: Cursor = db.rawQuery( "SELECT * FROM " + tableName, null)
//
//        if (cursor.moveToFirst()) {
//            do {
//                val title = cursor.getColumnIndex("title")
//                val content = cursor.getColumnIndex("content")
//                val status = cursor.getColumnIndex("status")
//
//                dbList.add(data)
//
//            } while (cursor.moveToNext())
//
//        }
//
//
//        return dbList
//    }


}