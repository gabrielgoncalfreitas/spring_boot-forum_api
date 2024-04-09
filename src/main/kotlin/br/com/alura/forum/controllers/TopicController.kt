package br.com.alura.forum.controllers

import br.com.alura.forum.model.Course
import br.com.alura.forum.model.Topic
import br.com.alura.forum.model.User
import br.com.alura.forum.services.topics.TopicsService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/topics")
class TopicController(
    private val service: TopicsService
) {
    @GetMapping
    fun list(): List<Topic>? {
        return service.list()
    }

    @GetMapping("/{id}")
    fun byId(@PathVariable id: Long): Topic {
        return service.byId(id)
    }
}