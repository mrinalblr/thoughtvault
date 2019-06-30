package com.thoughtvault.serviceImpl;

import com.thoughtvault.domain.BlogPost;
import com.thoughtvault.model.request.BlogPostRequest;
import com.thoughtvault.model.response.Response;
import com.thoughtvault.repository.BlogPostRepo;
import com.thoughtvault.service.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BlogPostServiceImpl implements BlogPostService {
    @Autowired
    private BlogPostRepo blogPostRepo;
    @Override
    public Response addBlogPost(BlogPostRequest blogPost) {
        BlogPost post = new BlogPost(blogPost.getBlogId(),blogPost.getBlogTitle(),blogPost.getBlogCategory(),blogPost.getBlogDescription(),blogPost.getBlogImage(),blogPost.getBlogReference(),
                blogPost.getBlogAuthor(),blogPost.getBlogDate(),blogPost.getBlogTime(),blogPost.getBlogContent());
         blogPostRepo.save(post);
        Response res = new Response(HttpStatus.CREATED.toString(),null,"");
        return res;
    }

    @Override
    public Response getBlogPosts() {
        List<BlogPost> blogPosts = new ArrayList<>();
        blogPosts = blogPostRepo.findAll();
        Response res = new Response(HttpStatus.OK.toString(),blogPosts,"");
        return res;
    }
}
