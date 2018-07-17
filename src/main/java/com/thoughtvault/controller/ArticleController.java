package com.thoughtvault.controller;

import com.thoughtvault.model.request.ArticleRequest;
import com.thoughtvault.model.response.Response;
import com.thoughtvault.service.ArticleService;
import com.thoughtvault.serviceImpl.ArticleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ArticleController {

    @Autowired
    private ArticleServiceImpl articleServiceImpl;
    @PostMapping("/addArticle")
    public Response addArticle(@RequestBody ArticleRequest articleRequest){
        Response response = articleServiceImpl.addArticle(articleRequest);
       return response;
    }
    @GetMapping("/getArticleById/{id}")
    public Response getArticleById(@PathVariable("id") int id){
        Response response = articleServiceImpl.getArticleById(id);
        return response;
    }
    @GetMapping("/getArticleByType/{articleType}")
    public Response getArticleByType(@PathVariable("articleType") String articleType){
        Response response = articleServiceImpl.getArticleByType(articleType);
        return response;
    }
}
