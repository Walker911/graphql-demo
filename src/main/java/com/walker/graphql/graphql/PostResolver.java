package com.walker.graphql.graphql;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.walker.graphql.dao.AuthorDao;
import com.walker.graphql.model.Author;
import com.walker.graphql.model.Post;

import java.util.Optional;

/**
 * @author walker
 * @date 2018/11/29
 */
public class PostResolver implements GraphQLResolver<Post> {

    private AuthorDao authorDao;

    public PostResolver(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }

    public Optional<Author> getAuthor(Post post) {
        return authorDao.getAuthor(post.getAuthorId());
    }
}
