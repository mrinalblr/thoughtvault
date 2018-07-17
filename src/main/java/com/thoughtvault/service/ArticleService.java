package com.thoughtvault.service;

import com.thoughtvault.model.request.ArticleRequest;
import com.thoughtvault.model.response.Response;
import org.springframework.stereotype.Service;

@Service
public interface ArticleService {
    public Response addArticle(ArticleRequest articleRequest);
    public Response getArticleById(int articleId);
    public Response getArticleByType(String articleType);
    public Response getArticleByLanguage(String language);
}
