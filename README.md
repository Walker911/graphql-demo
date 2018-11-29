# content

- learn from [baeldung](https://www.baeldung.com/spring-graphql)

```graphql
{
  recentPosts(count: 5, offset: 0) {
    id
    title
    text
    category
    author {
      id
      name
      thumbnail
    }
  }
}
```