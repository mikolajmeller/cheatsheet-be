package article.api;

import article.article.Article;
import article.category.Category;
import article.category.CategoryService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;

@Controller("category")
@RequiredArgsConstructor
public class CategoryApi {
  private final CategoryService categoryService;

  @Get("all")
  public HttpResponse<List<Category>> getCategories() {
    return HttpResponse.ok(categoryService.getAllCategories());
  }

  @Get("{id}/articles")
  public HttpResponse<List<Article>> getCategoryArticles(
      @PathVariable("id") @NotNull Integer categoryId) {
    return HttpResponse.ok(categoryService.getArticlesByCategory(categoryId));
  }

  @Post
  public HttpResponse<Integer> createCategory(@Body("name") String name) {
    return HttpResponse.ok(categoryService.createCategory(Category.builder().name(name).build()));
  }
}
