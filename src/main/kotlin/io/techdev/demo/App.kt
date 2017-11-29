package io.techdev.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import javax.annotation.PostConstruct

@SpringBootApplication
open class App {

    @Autowired lateinit var repository: MessageRepository

    @PostConstruct
    internal fun init() {
        repository.save(Message("Message #1"))
        repository.save(Message("Message #2"))
        repository.save(Message("Message #3"))
    }

}

fun main(args: Array<String>) {
    SpringApplication.run(App::class.java, *args)
}
