package com.zalo.api.Java.Api.topic

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class TopicController {

    @Autowired
    private lateinit var topicService: TopicService

    @RequestMapping("/topics")
    fun getAllTopics(): List<Topic> = topicService.getAllTopics()

    @RequestMapping("/topics/{id}")
    fun getTopic(@PathVariable id: String): Topic? = topicService.getTopic(id)

    @RequestMapping(method = [RequestMethod.POST], value = ["/topics"])
    fun addTopic(@RequestBody topic: Topic) = topicService.addTopic(topic)

    @RequestMapping(method = [RequestMethod.PUT], value = ["/topics/{id}"])
    fun updateTopic(@PathVariable id: String,@RequestBody topic: Topic) = topicService.updateTopic(id,topic)
}