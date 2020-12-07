package article.api;

import article.article.Article;
import article.article.ArticleNotFound;
import article.article.ArticleService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Controller("article")
@RequiredArgsConstructor
public class ArticleApi {
  private final ArticleService articleService;

  @Get("{id}")
  public HttpResponse<Article> getById(@PathVariable("id") @NotNull Integer id) {
    try {
      return HttpResponse.ok(articleService.getFullArticle(id));
    } catch (ArticleNotFound e) {
      return HttpResponse.notFound();
    }
  }

  @Post
  public HttpResponse<Integer> createArticle(
      @Body("title") @NotEmpty String title,
      @Body("categoryId") @NotNull Integer categoryId,
      @Body("content") String content
  ) {
    return HttpResponse.ok(
        articleService.saveArticle(
            Article.builder().title(title).content(content).categoryId(categoryId).build()));
  }
}
