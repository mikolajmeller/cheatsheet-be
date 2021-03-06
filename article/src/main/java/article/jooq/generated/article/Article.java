/*
 * This file is generated by jOOQ.
 */
package article.jooq.generated.article;


import article.jooq.generated.DefaultCatalog;
import article.jooq.generated.article.tables.Articles;
import article.jooq.generated.article.tables.Categories;
import article.jooq.generated.article.tables.Databasechangelog;
import article.jooq.generated.article.tables.Databasechangeloglock;
import article.jooq.generated.article.tables.Keywords;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Article extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>article</code>
     */
    public static final Article ARTICLE = new Article();

    /**
     * The table <code>article.articles</code>.
     */
    public final Articles ARTICLES = Articles.ARTICLES;

    /**
     * The table <code>article.categories</code>.
     */
    public final Categories CATEGORIES = Categories.CATEGORIES;

    /**
     * The table <code>article.DATABASECHANGELOG</code>.
     */
    public final Databasechangelog DATABASECHANGELOG = Databasechangelog.DATABASECHANGELOG;

    /**
     * The table <code>article.DATABASECHANGELOGLOCK</code>.
     */
    public final Databasechangeloglock DATABASECHANGELOGLOCK = Databasechangeloglock.DATABASECHANGELOGLOCK;

    /**
     * The table <code>article.keywords</code>.
     */
    public final Keywords KEYWORDS = Keywords.KEYWORDS;

    /**
     * No further instances allowed
     */
    private Article() {
        super("article", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            Articles.ARTICLES,
            Categories.CATEGORIES,
            Databasechangelog.DATABASECHANGELOG,
            Databasechangeloglock.DATABASECHANGELOGLOCK,
            Keywords.KEYWORDS);
    }
}
