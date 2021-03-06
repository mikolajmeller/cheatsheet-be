/*
 * This file is generated by jOOQ.
 */
package article.jooq.generated.article.tables;


import article.jooq.generated.article.Article;
import article.jooq.generated.article.Indexes;
import article.jooq.generated.article.Keys;
import article.jooq.generated.article.tables.records.KeywordsRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
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
public class Keywords extends TableImpl<KeywordsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>article.keywords</code>
     */
    public static final Keywords KEYWORDS = new Keywords();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<KeywordsRecord> getRecordType() {
        return KeywordsRecord.class;
    }

    /**
     * The column <code>article.keywords.id</code>.
     */
    public final TableField<KeywordsRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>article.keywords.article_id</code>.
     */
    public final TableField<KeywordsRecord, Integer> ARTICLE_ID = createField(DSL.name("article_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>article.keywords.name</code>.
     */
    public final TableField<KeywordsRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>article.keywords.description</code>.
     */
    public final TableField<KeywordsRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB.defaultValue(DSL.field("NULL", SQLDataType.CLOB)), this, "");

    private Keywords(Name alias, Table<KeywordsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Keywords(Name alias, Table<KeywordsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>article.keywords</code> table reference
     */
    public Keywords(String alias) {
        this(DSL.name(alias), KEYWORDS);
    }

    /**
     * Create an aliased <code>article.keywords</code> table reference
     */
    public Keywords(Name alias) {
        this(alias, KEYWORDS);
    }

    /**
     * Create a <code>article.keywords</code> table reference
     */
    public Keywords() {
        this(DSL.name("keywords"), null);
    }

    public <O extends Record> Keywords(Table<O> child, ForeignKey<O, KeywordsRecord> key) {
        super(child, key, KEYWORDS);
    }

    @Override
    public Schema getSchema() {
        return Article.ARTICLE;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.KEYWORDS_KEYWORDS__ARTICLE_ID, Indexes.KEYWORDS_KEYWORDS__NAME);
    }

    @Override
    public Identity<KeywordsRecord, Integer> getIdentity() {
        return (Identity<KeywordsRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<KeywordsRecord> getPrimaryKey() {
        return Keys.KEY_KEYWORDS_PRIMARY;
    }

    @Override
    public List<UniqueKey<KeywordsRecord>> getKeys() {
        return Arrays.<UniqueKey<KeywordsRecord>>asList(Keys.KEY_KEYWORDS_PRIMARY, Keys.KEY_KEYWORDS_NAME);
    }

    @Override
    public Keywords as(String alias) {
        return new Keywords(DSL.name(alias), this);
    }

    @Override
    public Keywords as(Name alias) {
        return new Keywords(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Keywords rename(String name) {
        return new Keywords(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Keywords rename(Name name) {
        return new Keywords(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, Integer, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
