package article.article;

import article.category.CategoryNotFound;
import lombok.RequiredArgsConstructor;

import javax.inject.Singleton;

@Singleton
@RequiredArgsConstructor
public class ArticleService {

  private final ArticleStorage storage;

  public Article getFullArticle(int articleId) {
    return storage.getArticle(articleId).orElseThrow(ArticleNotFound::new);
  }

  public int saveArticle(Article article) {
    if (!storage.categoryExists(article.getCategoryId())) {
      throw new CategoryNotFound();
    }
    return storage.saveArticle(article);
  }
}
