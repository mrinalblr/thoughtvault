package com.thoughtvault.service;

import com.thoughtvault.domain.BlogPost;
import com.thoughtvault.model.request.BlogPostRequest;
import com.thoughtvault.model.response.Response;
import org.springframework.stereotype.Service;

@Service
public interface BlogPostService {

    public Response addBlogPost(BlogPostRequest post);
    public Response getBlogPosts();

}
