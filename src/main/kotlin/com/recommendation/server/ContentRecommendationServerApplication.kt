package com.recommendation.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ContentRecommendationServerApplication

fun main(args: Array<String>) {
	runApplication<ContentRecommendationServerApplication>(*args)
}
