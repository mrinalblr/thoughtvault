package com.thoughtvault.model.request;



public class BlogPostRequest {


    private int blogId;

    private String blogTitle;

    private String blogCategory;

    private String blogDescription;

    private String blogImage;

    private String blogReference;

    private String blogAuthor;

    private String blogDate;

    private String blogTime;

    private String blogContent;

    public BlogPostRequest() {

    }

    public BlogPostRequest(int blogId, String blogTitle, String blogCategory, String blogDescription, String blogImage, String blogReference, String blogAuthor, String blogDate, String blogTime, String blogContent) {
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
        return "BlogPostRequest{" +
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
