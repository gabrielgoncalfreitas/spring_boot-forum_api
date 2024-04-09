package br.com.alura.forum.services.topics

import br.com.alura.forum.model.Course
import br.com.alura.forum.model.Topic
import br.com.alura.forum.model.User
import org.springframework.stereotype.Service

@Service
class TopicsService(private var topics: List<Topic>) {

    init {
        val topic1 = Topic(
            id = 1,
            title = "Dúvida Kotlin",
            text = "Variáveis no Kotlin",
            course = Course(
                id = 1, name = "Kotlin", category = "Programação"
            ),
            author = User(
                id = 1, name = "Ana da Silva", email = "ana@gmail.com"
            ),
        )

        val topic2 = Topic(
            id = 2,
            title = "Dúvida Kotlin",
            text = "Variáveis no Kotlin",
            course = Course(
                id = 1, name = "Kotlin", category = "Programação"
            ),
            author = User(
                id = 1, name = "Ana da Silva", email = "ana@gmail.com"
            ),
        )

        val topic3 = Topic(
            id = 3,
            title = "Dúvida Kotlin",
            text = "Variáveis no Kotlin",
            course = Course(
                id = 1, name = "Kotlin", category = "Programação"
            ),
            author = User(
                id = 1, name = "Ana da Silva", email = "ana@gmail.com"
            ),
        )

        topics = listOf(topic1, topic2, topic3)
    }

    fun list(): List<Topic> {
        return topics
    }

    fun byId(id: Long): Topic {
        return topics.stream().filter { t ->
            t.id === id
        }.findFirst().get()
    }
}