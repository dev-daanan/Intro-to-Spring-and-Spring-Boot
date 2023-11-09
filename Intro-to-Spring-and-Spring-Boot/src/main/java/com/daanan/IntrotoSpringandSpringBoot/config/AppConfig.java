package com.daanan.IntrotoSpringandSpringBoot.config;

import com.daanan.IntrotoSpringandSpringBoot.datastructure.DoublyLinkedList.DoublyLinkedList;
import com.daanan.IntrotoSpringandSpringBoot.datastructure.Queue.Queue;
import com.daanan.IntrotoSpringandSpringBoot.datastructure.SinglyLinkList.SinglyLinkedList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public <T> SinglyLinkedList<T> genericSinglyLinkedList() {
        return new SinglyLinkedList<>();
    }

    @Bean
    public <T> DoublyLinkedList<T> genericDoublyLinkedList() {
        return new DoublyLinkedList<>();
    }

    @Bean
    public <T> Queue<T> genericQueue() {
        return new Queue<>();
    }

}
