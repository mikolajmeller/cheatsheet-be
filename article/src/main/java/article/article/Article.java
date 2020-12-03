package article.article;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
public class Article {

  private Integer id;
  private Integer categoryId;
  private String title;
  private String content;
  private LocalDateTime created;
}
