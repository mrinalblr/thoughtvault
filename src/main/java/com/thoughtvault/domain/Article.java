package com.thoughtvault.domain;

import javax.persistence.*;

@Entity
@Table(name="ARTICLE")
public class Article {
    @Id
    @GeneratedValue
    @Column(name="ID")
    private int id;
    @Column(name="TITLE")
    private String title;
    @Column(name="CREATED_DATE")
    private String createdDate;
    @Column(name="AUTHOR")
    private String author;
    @Column(name="LANGUAGE")
    private String language;
    @Column(name="CONTENT")
    private String content;
    @Column(name="ARTICLE_TYPE")
    private String articleType;

    public Article(String title, String createdDate, String author, String language, String content, String articleType) {
        this.title = title;
        this.createdDate = createdDate;
        this.author = author;
        this.language = language;
        this.content = content;
        this.articleType = articleType;
    }

    public Article() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getArticleType() {
        return articleType;
    }

    public void setArticleType(String articleType) {
        this.articleType = articleType;
    }
}
