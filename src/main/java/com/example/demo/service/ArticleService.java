package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ArticleRepository;
import com.example.demo.vo.Article;

@Service
public class ArticleService {

	@Autowired
	ArticleRepository articleRepository;

	public ArticleService(ArticleRepository articleRepository) {
		this.articleRepository = articleRepository;
	}

	public int writeArticle(String title, String body) {
		articleRepository.writeArticle(title, body);

		return articleRepository.getLastInsertId();
	}

	public Article getArticleById(int id) {
		return articleRepository.getArticleById(id);
	}

	public void deleteArticle(int id) {
		articleRepository.deleteArticle(id);
	}

	public List<Article> getArticles() {
		return articleRepository.getArticles();
	}

	public void doModify(int id, String title, String body) {
		articleRepository.modifyArticle(id,title,body);
	}
}