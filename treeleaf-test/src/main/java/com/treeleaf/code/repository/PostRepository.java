package com.treeleaf.code.repository;

import com.treeleaf.code.entity.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<BlogPost,Integer> {
}
