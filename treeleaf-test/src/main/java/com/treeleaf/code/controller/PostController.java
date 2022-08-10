package com.treeleaf.code.controller;
//V. Should have CRUD operation for blog POST, GET, EDIT, and DELETE
//mapping,


import com.treeleaf.code.entity.BlogPost;
import com.treeleaf.code.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/blog")
public class PostController {

/// Here CURD is implement with  Implement the


    @Autowired
    private PostRepository postRepository;

    @PostMapping("/create")
    public String createPost(@RequestBody BlogPost blogPost, Principal principal) {
        blogPost.setUserName(principal.getName());
        postRepository.save(blogPost);
        return principal.getName(); //create by admin and monitor
    }

    @GetMapping("/approvePost/{blogId}")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('MONITOR')")
    public String approvePost(@PathVariable int blogId) {
        BlogPost blogPost = postRepository.findById(blogId).get();
        postRepository.save(blogPost);
        return "BlogPost Approved !!";
    }
    // only Admin User can reject post
    @GetMapping("/removePost/{blogId}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String removePost(@PathVariable int blogId) {
        BlogPost blogPost = postRepository.findById(blogId).get();
        postRepository.save(blogPost);
        return "BlogPost Rejected !!";
    }

    //All user can View
    @GetMapping("/viewAll")
    public List<BlogPost> viewAll() {
        return new ArrayList<>(postRepository.findAll());
    }

    //delete
    @DeleteMapping("/{blogId}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void deleteSubject (@PathVariable("blogId") int blogId){
        postRepository.deleteById(blogId);
    }

    //update
    @PutMapping("/{blogId}")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('MONITOR')")
    public void updatePost(@PathVariable int blogId, @RequestBody BlogPost blogPost){
        blogPost.updatePost(blogId, blogPost);
    }
}