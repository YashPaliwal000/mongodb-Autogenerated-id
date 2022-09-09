package com.yash.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.yash.mongo.entity.Book;

public interface BookRepository extends MongoRepository<Book,Integer> {
}
