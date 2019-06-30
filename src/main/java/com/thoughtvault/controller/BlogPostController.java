package com.thoughtvault.controller;

import com.thoughtvault.model.request.BlogPostRequest;
import com.thoughtvault.model.response.Response;
import com.thoughtvault.service.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
public class BlogPostController {
    @Autowired
    private BlogPostService blogPostService;

    @PostMapping("/blog/addBlogPost")
    public Response addBlogPost(@RequestBody BlogPostRequest blogPostRequest){
       return blogPostService.addBlogPost(blogPostRequest);

    }

    @GetMapping("/blog/getAllBlogPosts")
    public Response getAllBlogPosts(){
        return blogPostService.getBlogPosts();
    }

}
