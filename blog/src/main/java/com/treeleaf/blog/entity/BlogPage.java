package com.treeleaf.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "blog_page")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlogPage {
    @Id
    @GeneratedValue
    private int id;
    private String blogName;
    private String blogStatus;


}
