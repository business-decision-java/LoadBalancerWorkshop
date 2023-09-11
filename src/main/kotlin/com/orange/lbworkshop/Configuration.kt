package com.orange.lbworkshop

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate

@Configuration
class Configuration {


    @Bean
    fun restTemplate() = RestTemplate()
}