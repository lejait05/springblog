package com.example.codeup.springblog.model;

import org.apache.catalina.User;

import javax.persistence.*;

@Entity
@Table(name = "post")

public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(columnDefinition = "INT")
    private long id;
    @Column(nullable = false, length = 240)
    private String title;
    @Column(nullable = false, columnDefinition = "TEXT")
    private String body;

//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private User user;

    public Post(long id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public Post() {

    }

    public Post(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}