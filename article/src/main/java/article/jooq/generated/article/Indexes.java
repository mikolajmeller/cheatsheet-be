/*
 * This file is generated by jOOQ.
 */
package article.jooq.generated.article;


import article.jooq.generated.article.tables.Articles;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables in article.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index ARTICLES_IDX__ARTICLE__TITLE = Internal.createIndex(DSL.name("idx__article__title"), Articles.ARTICLES, new OrderField[] { Articles.ARTICLES.TITLE }, false);
}
