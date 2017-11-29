package io.techdev.demo

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Message(var text: String = "Default") {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null
        get() {
            return field
        }
        set(value) {
            field = value
        }

    val timestamp = Date().time

}
