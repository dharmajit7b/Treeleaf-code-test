package com.treeleaf.blog.reopsitory;

import com.treeleaf.blog.entity.BlogPage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogPageRepository extends JpaRepository<BlogPage,Integer> {
    BlogPage findByBlogID(int blogId);
}
