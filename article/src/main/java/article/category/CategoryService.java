package article.category;

import article.article.Article;
import lombok.RequiredArgsConstructor;

import javax.inject.Singleton;
import java.util.List;

@Singleton
@RequiredArgsConstructor
public final class CategoryService {

  private final CategoryStorage storage;

  public List<Category> getAllCategories() {
    return storage.getAll();
  }

  public int createCategory(Category category) {
    return storage.saveCategory(category);
  }

  public List<Article> getArticlesByCategory(int categoryId) {
    return storage.getAllArticlesByCategory(categoryId);
  }
}
