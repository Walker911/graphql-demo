package com.walker.graphql.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.walker.graphql.dao.PostDao;
import com.walker.graphql.model.Post;

import java.util.List;

public class Query implements GraphQLQueryResolver {

    private PostDao postDao;

    public Query(PostDao postDao) {
        this.postDao = postDao;
    }

    public List<Post> recentPosts(int count, int offset) {
        return postDao.getRecentPosts(count, offset);
    }
}
