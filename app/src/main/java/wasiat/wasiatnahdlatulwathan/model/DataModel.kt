package wasiat.wasiatnahdlatulwathan.model

/**
 * Created by aheat on 7/3/18.
 */
class DataModel {

    var id: Int? = null
    var title: String? = null
    var content: String? = null
    var status: Int? = null

    fun setId(id: Int) {
        this.id = id
    }

    fun getId(): Int {
        return id!!
    }

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

    fun getStatus(): Int {
        return status!!
    }

    fun setStatus(status: Int) {
        this.status = status
    }



}