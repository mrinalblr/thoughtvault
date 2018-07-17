package com.thoughtvault.model.request;

public class ArticleRequest {
    private int id;
    private String title;
    private String createdDate;
    private String author;
    private String language;
    private String content;
    private String articleType;

    public ArticleRequest(int id, String title, String createdDate, String author, String language, String content, String articleType) {
        this.id = id;
        this.title = title;
        this.createdDate = createdDate;
        this.author = author;
        this.language = language;
        this.content = content;
        this.articleType = articleType;
    }

    public ArticleRequest() {
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
