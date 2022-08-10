package com.treeleaf.code.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "blog")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BlogPost {

    @Id
    @GeneratedValue
    private int blogId;
    private String subject;
    private String comment;
    private String userName;


    public void updatePost(int blogId, BlogPost blogPost) {

    }
}
