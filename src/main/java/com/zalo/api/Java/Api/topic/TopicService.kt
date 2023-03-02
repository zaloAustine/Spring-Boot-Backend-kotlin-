package com.zalo.api.Java.Api.topic

import org.springframework.stereotype.Service

@Service
class TopicService {

    private val topics = mutableListOf(
        Topic("Spring", "spring Framework", "spring framework description"),
        Topic("java", "java", "java description"),
        Topic("kotlin", "kotlin", "kotlin description")
    )

    fun getAllTopics() = topics

    fun getTopic(id: String): Topic? {
        return topics.find { it.id?.lowercase() == id.lowercase() }
    }

    fun addTopic(topic: Topic) = topics.add(topic)

    fun updateTopic(id: String, topic: Topic) = topics.find { it.id?.lowercase() == id.lowercase() }.apply {
        this?.description = topic.description
        this?.name = topic.name
    }
    fun deleteTopic(id: String) = topics.removeIf{it.id == id}
}