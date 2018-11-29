package com.walker.graphql.dao;

import com.walker.graphql.model.Author;

import java.util.List;
import java.util.Optional;

/**
 * @author walker
 * @date 2018/11/29
 */
public class AuthorDao {

    private List<Author> authors;

    public AuthorDao(List<Author> authors) {
        this.authors = authors;
    }

    public Optional<Author> getAuthor(String id) {
        return authors.stream().filter(author -> id.equals(author.getId())).findFirst();
    }
}
