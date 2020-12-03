package article.category;

import article.article.Article;
import lombok.RequiredArgsConstructor;
import org.jooq.Configuration;

import javax.inject.Singleton;
import java.util.List;

import static article.jooq.generated.article.Tables.ARTICLES;
import static article.jooq.generated.article.Tables.CATEGORIES;

@Singleton
@RequiredArgsConstructor
public class CategoryStorage {
  private final Configuration configuration;

  public List<Category> getAll() {
    return configuration
        .dsl()
        .selectFrom(CATEGORIES)
        .fetch(record -> Category.builder().id(record.getId()).name(record.getName()).build());
  }

  public List<Article> getAllArticlesByCategory(int categoryId) {
    return configuration
            .dsl()
            .select(ARTICLES.ID, ARTICLES.TITLE)
            .from(ARTICLES)
            .where(ARTICLES.CATEGORY_ID.eq(categoryId))
            .fetch(record -> Article.builder().id(record.value1()).title(record.value2()).build());
  }

  public int saveCategory(Category category) {
    return configuration
        .dsl()
        .insertInto(CATEGORIES)
        .set(CATEGORIES.NAME, category.getName())
        .returning(CATEGORIES.ID)
        .execute();
  }
}
