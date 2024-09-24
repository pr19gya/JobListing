package com.pr19gya.joblisting.repository;

import com.pr19gya.joblisting.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface PostRepository extends MongoRepository<Post, String> {
}
