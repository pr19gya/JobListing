package com.pr19gya.joblisting.repository;

import com.pr19gya.joblisting.models.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);
}
