package com.daanan.IntrotoSpringandSpringBoot.config;

import com.daanan.IntrotoSpringandSpringBoot.datastructure.SinglyLinkList.SinglyLinkedList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public <T> SinglyLinkedList<T> genericSinglyLinkedList() {
        return new SinglyLinkedList<>();
    }
}
