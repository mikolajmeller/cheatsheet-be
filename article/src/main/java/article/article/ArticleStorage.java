package article.article;

import lombok.RequiredArgsConstructor;
import org.jooq.Configuration;

import javax.inject.Singleton;
import java.util.List;
import java.util.Optional;

import static article.jooq.generated.article.Tables.ARTICLES;

@Singleton
@RequiredArgsConstructor
public class ArticleStorage {
  private final Configuration configuration;

  public Optional<Article> getArticle(int articleId) {
    return configuration
        .dsl()
        .selectFrom(ARTICLES)
        .where(ARTICLES.ID.eq(articleId))
        .fetchOptional(
            record ->
                Article.builder()
                    .id(record.getId())
                    .title(record.getTitle())
                    .created(record.getCreated())
                    .content(record.getContent())
                    .categoryId(record.getCategoryId())
                    .build());
  }

  public int saveArticle(Article article) {
    return configuration
        .dsl()
        .insertInto(ARTICLES)
        .set(ARTICLES.TITLE, article.getTitle())
        .set(ARTICLES.CONTENT, article.getContent())
        .set(ARTICLES.CATEGORY_ID, article.getCategoryId())
        .returning(ARTICLES.ID)
        .execute();
  }
}
