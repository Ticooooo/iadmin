package club.mikusun.iadmin.provide.post.dao;

import club.mikusun.iadmin.db.depencies.jpa.service.BaseService;
import club.mikusun.iadmin.domain.post.Post;
import org.springframework.stereotype.Repository;

@Repository
public interface PostDao extends BaseService<Post, Integer> {
}
