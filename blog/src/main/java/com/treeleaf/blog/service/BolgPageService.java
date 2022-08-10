package com.treeleaf.blog.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.treeleaf.blog.entity.BlogPage;
import com.treeleaf.blog.reopsitory.BlogPageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BolgPageService {
    @Autowired
    private BlogPageRepository repository;

    public BlogPage isCreate(BlogPage blogPage) throws JsonProcessingException{
        blogPage.setBlogName(blogPage.getBlogName());
        blogPage.setBlogStatus(blogPage.getBlogStatus());

        return repository.save(blogPage);
    }


}
