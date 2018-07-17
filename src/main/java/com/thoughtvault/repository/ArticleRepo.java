package com.thoughtvault.repository;

import com.thoughtvault.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepo extends JpaRepository<Article,Integer> {

    Article findById(int id);
    List<Article> findByArticleType(String articleType);
}
