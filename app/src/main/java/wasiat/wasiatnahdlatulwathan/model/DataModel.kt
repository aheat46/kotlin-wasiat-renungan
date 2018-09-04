package wasiat.wasiatnahdlatulwathan.model

/**
 * Created by aheat on 7/3/18.
 */
class DataModel {

    var title: String? = null
    var content: String? = null
    var status: Int? = null

    fun setTitles(title: String) {
        this.title = title
    }

    fun getTitles(): String {
        return title!!
    }

    fun getContents(): String {
        return content!!
    }

    fun setContents(content: String) {
        this.content = content
    }

    fun getstatus(): Int {
        return status!!
    }

    fun setStatus(status: Int) {
        this.status = status
    }



}