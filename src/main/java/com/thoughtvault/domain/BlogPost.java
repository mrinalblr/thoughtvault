package com.thoughtvault.domain;

import javax.persistence.*;

@Entity
@Table(name="BLOGPOST")
public class BlogPost {

    @Id
    @GeneratedValue
    @Column(name="BLOG_ID")
    private int blogId;
    @Column(name="BLOG_TITLE")
    private String blogTitle;
    @Column(name="BLOG_CATEGORY")
    private String blogCategory;
    @Column(name="BLOG_DESC")
    private String blogDescription;
    @Column(name="BLOG_IMAGE")
    private String blogImage;
    @Column(name="BLOG_REFERENCE")
    private String blogReference;
    @Column(name="BLOG_AUTHOR")
    private String blogAuthor;
    @Column(name="BLOG_DATE")
    private String blogDate;
    @Column(name="BLOG_TIME")
    private String blogTime;
    @Column(name="BLOG_CONTENT",length = 30000000)
    private String blogContent;

    public BlogPost(int blogId, String blogTitle, String blogCategory, String blogDescription, String blogImage, String blogReference, String blogAuthor, String blogDate, String blogTime, String blogContent) {
        this.blogId = blogId;
        this.blogTitle = blogTitle;
        this.blogCategory = blogCategory;
        this.blogDescription = blogDescription;
        this.blogImage = blogImage;
        this.blogReference = blogReference;
        this.blogAuthor = blogAuthor;
        this.blogDate = blogDate;
        this.blogTime = blogTime;
        this.blogContent = blogContent;
    }

    public BlogPost() {
    }

    public int getBlogId() {
        return blogId;
    }

    public void setBlogId(int blogId) {
        this.blogId = blogId;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    public String getBlogCategory() {
        return blogCategory;
    }

    public void setBlogCategory(String blogCategory) {
        this.blogCategory = blogCategory;
    }

    public String getBlogDescription() {
        return blogDescription;
    }

    public void setBlogDescription(String blogDescription) {
        this.blogDescription = blogDescription;
    }

    public String getBlogImage() {
        return blogImage;
    }

    public void setBlogImage(String blogImage) {
        this.blogImage = blogImage;
    }

    public String getBlogReference() {
        return blogReference;
    }

    public void setBlogReference(String blogReference) {
        this.blogReference = blogReference;
    }

    public String getBlogAuthor() {
        return blogAuthor;
    }

    public void setBlogAuthor(String blogAuthor) {
        this.blogAuthor = blogAuthor;
    }

    public String getBlogDate() {
        return blogDate;
    }

    public void setBlogDate(String blogDate) {
        this.blogDate = blogDate;
    }

    public String getBlogTime() {
        return blogTime;
    }

    public void setBlogTime(String blogTime) {
        this.blogTime = blogTime;
    }

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent;
    }

    @Override
    public String toString() {
        return "BlogPost{" +
                "blogId=" + blogId +
                ", blogTitle='" + blogTitle + '\'' +
                ", blogCategory='" + blogCategory + '\'' +
                ", blogDescription='" + blogDescription + '\'' +
                ", blogImage='" + blogImage + '\'' +
                ", blogReference='" + blogReference + '\'' +
                ", blogAuthor='" + blogAuthor + '\'' +
                ", blogDate='" + blogDate + '\'' +
                ", blogTime='" + blogTime + '\'' +
                ", blogContent='" + blogContent + '\'' +
                '}';
    }
}
