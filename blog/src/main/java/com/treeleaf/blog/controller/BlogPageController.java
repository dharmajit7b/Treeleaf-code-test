package com.treeleaf.blog.controller;
//
import com.fasterxml.jackson.core.JsonProcessingException;
import com.treeleaf.blog.entity.BlogPage;
import com.treeleaf.blog.service.BolgPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blogPage")
public class BlogPageController {
    @Autowired
    private BolgPageService service;

    @PostMapping("/isCreate")
    public BlogPage isCreate(@RequestBody BlogPage blogPage) throws JsonProcessingException {
        return service.isCreate(blogPage);
    }

}
