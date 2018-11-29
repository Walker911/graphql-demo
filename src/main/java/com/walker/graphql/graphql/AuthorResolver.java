package com.walker.graphql.graphql;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.walker.graphql.dao.PostDao;
import com.walker.graphql.model.Author;
import com.walker.graphql.model.Post;

import java.util.List;

/**
 * @author walker
 * @date 2018/11/29
 */
public class AuthorResolver implements GraphQLResolver<Author> {

    private PostDao postDao;

    public AuthorResolver(PostDao postDao) {
        this.postDao = postDao;
    }

    public List<Post> getPosts(Author author) {
        return postDao.getAuthorPosts(author.getId());
    }
}
