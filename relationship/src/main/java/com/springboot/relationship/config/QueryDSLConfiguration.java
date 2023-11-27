package com.springboot.relationship.config;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Configuration
public class QueryDSLConfiguration {
    @PersistenceContext
    EntityManager entityManager;

    @Bean
    public JPAQueryFactory jpaQueryFactory() {
        return new JPAQueryFactory(entityManager);
    }
}
