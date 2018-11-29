package com.walker.graphql.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.walker.graphql.dao.PostDao;
import com.walker.graphql.model.Post;

import java.util.UUID;

/**
 * @author walker
 * @date 2018/11/29
 */
public class Mutation implements GraphQLMutationResolver {

    private PostDao postDao;

    public Mutation(PostDao postDao) {
        this.postDao = postDao;
    }

    public Post writePost(String title, String text, String category, String author) {
        Post post = new Post();
        post.setId(UUID.randomUUID().toString());
        post.setTitle(title);
        post.setText(text);
        post.setCategory(category);
        post.setAuthorId(author);
        postDao.savePost(post);

        return post;
    }
}
