package wasiat.wasiatnahdlatulwathan.model

/**
 * Created by aheat on 7/3/18.
 */
class DataWasiat {

    var id: String? = null
    var title: String? = null
    var status: String? = null

    constructor(id: String, title: String, status: String) {
        this.id = id
        this.title = title
        this.status = status
    }

}