/*
 * This file is generated by jOOQ.
 */
package article.jooq.generated.article.tables;


import article.jooq.generated.article.Article;
import article.jooq.generated.article.Indexes;
import article.jooq.generated.article.Keys;
import article.jooq.generated.article.tables.records.ArticlesRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Articles extends TableImpl<ArticlesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>article.articles</code>
     */
    public static final Articles ARTICLES = new Articles();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ArticlesRecord> getRecordType() {
        return ArticlesRecord.class;
    }

    /**
     * The column <code>article.articles.id</code>.
     */
    public final TableField<ArticlesRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>article.articles.category_id</code>.
     */
    public final TableField<ArticlesRecord, Integer> CATEGORY_ID = createField(DSL.name("category_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>article.articles.title</code>.
     */
    public final TableField<ArticlesRecord, String> TITLE = createField(DSL.name("title"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>article.articles.content</code>.
     */
    public final TableField<ArticlesRecord, String> CONTENT = createField(DSL.name("content"), SQLDataType.CLOB.defaultValue(DSL.field("NULL", SQLDataType.CLOB)), this, "");

    /**
     * The column <code>article.articles.created</code>.
     */
    public final TableField<ArticlesRecord, LocalDateTime> CREATED = createField(DSL.name("created"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.field("current_timestamp()", SQLDataType.LOCALDATETIME)), this, "");

    private Articles(Name alias, Table<ArticlesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Articles(Name alias, Table<ArticlesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>article.articles</code> table reference
     */
    public Articles(String alias) {
        this(DSL.name(alias), ARTICLES);
    }

    /**
     * Create an aliased <code>article.articles</code> table reference
     */
    public Articles(Name alias) {
        this(alias, ARTICLES);
    }

    /**
     * Create a <code>article.articles</code> table reference
     */
    public Articles() {
        this(DSL.name("articles"), null);
    }

    public <O extends Record> Articles(Table<O> child, ForeignKey<O, ArticlesRecord> key) {
        super(child, key, ARTICLES);
    }

    @Override
    public Schema getSchema() {
        return Article.ARTICLE;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ARTICLES_ARTICLES__CATEGORY_ID);
    }

    @Override
    public Identity<ArticlesRecord, Integer> getIdentity() {
        return (Identity<ArticlesRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<ArticlesRecord> getPrimaryKey() {
        return Keys.KEY_ARTICLES_PRIMARY;
    }

    @Override
    public List<UniqueKey<ArticlesRecord>> getKeys() {
        return Arrays.<UniqueKey<ArticlesRecord>>asList(Keys.KEY_ARTICLES_PRIMARY, Keys.KEY_ARTICLES_TITLE);
    }

    @Override
    public Articles as(String alias) {
        return new Articles(DSL.name(alias), this);
    }

    @Override
    public Articles as(Name alias) {
        return new Articles(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Articles rename(String name) {
        return new Articles(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Articles rename(Name name) {
        return new Articles(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, Integer, String, String, LocalDateTime> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
