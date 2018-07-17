package com.thoughtvault.serviceImpl;

import com.thoughtvault.domain.Article;
import com.thoughtvault.model.request.ArticleRequest;
import com.thoughtvault.model.response.Response;
import com.thoughtvault.repository.ArticleRepo;
import com.thoughtvault.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleRepo articleRepo;
    @Override
    public Response addArticle(ArticleRequest articleRequest) {
        Article article = new Article(articleRequest.getTitle(),articleRequest.getCreatedDate(),articleRequest.getAuthor(),
                articleRequest.getLanguage(),articleRequest.getContent(),articleRequest.getArticleType());
        articleRepo.save(article);
        Response response =  new Response(HttpStatus.CREATED.toString(),null,"");
        return response;
    }

    @Override
    public Response getArticleById(int articleId) {

        Article article= articleRepo.findById(articleId);
        Response response = new Response(HttpStatus.ACCEPTED.toString(),article,"");
        return response;
    }

    @Override
    public Response getArticleByType(String articleType) {
        articleRepo.findByArticleType(articleType);
        return null;
    }

    @Override
    public Response getArticleByLanguage(String language) {
        return null;
    }
}
