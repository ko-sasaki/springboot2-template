package net.ksasaki.template.demo.persistence.mappergen;

import static net.ksasaki.template.demo.persistence.mappergen.BookAuthorDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import net.ksasaki.template.demo.persistence.modelgen.BookAuthor;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface BookAuthorMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_author")
    BasicColumn[] selectList = BasicColumn.columnList(bookAuthorId, bookId, authorName, createdAt);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_author")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_author")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_author")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<BookAuthor> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_author")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<BookAuthor> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_author")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("BookAuthorResult")
    Optional<BookAuthor> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_author")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="BookAuthorResult", value = {
        @Result(column="book_author_id", property="bookAuthorId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="book_id", property="bookId", jdbcType=JdbcType.BIGINT),
        @Result(column="author_name", property="authorName", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<BookAuthor> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_author")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_author")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, bookAuthor, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_author")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, bookAuthor, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_author")
    default int deleteByPrimaryKey(Long bookAuthorId_) {
        return delete(c -> 
            c.where(bookAuthorId, isEqualTo(bookAuthorId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_author")
    default int insert(BookAuthor record) {
        return MyBatis3Utils.insert(this::insert, record, bookAuthor, c ->
            c.map(bookAuthorId).toProperty("bookAuthorId")
            .map(bookId).toProperty("bookId")
            .map(authorName).toProperty("authorName")
            .map(createdAt).toProperty("createdAt")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_author")
    default int insertMultiple(Collection<BookAuthor> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, bookAuthor, c ->
            c.map(bookAuthorId).toProperty("bookAuthorId")
            .map(bookId).toProperty("bookId")
            .map(authorName).toProperty("authorName")
            .map(createdAt).toProperty("createdAt")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_author")
    default int insertSelective(BookAuthor record) {
        return MyBatis3Utils.insert(this::insert, record, bookAuthor, c ->
            c.map(bookAuthorId).toPropertyWhenPresent("bookAuthorId", record::getBookAuthorId)
            .map(bookId).toPropertyWhenPresent("bookId", record::getBookId)
            .map(authorName).toPropertyWhenPresent("authorName", record::getAuthorName)
            .map(createdAt).toPropertyWhenPresent("createdAt", record::getCreatedAt)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_author")
    default Optional<BookAuthor> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, bookAuthor, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_author")
    default List<BookAuthor> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, bookAuthor, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_author")
    default List<BookAuthor> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, bookAuthor, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_author")
    default Optional<BookAuthor> selectByPrimaryKey(Long bookAuthorId_) {
        return selectOne(c ->
            c.where(bookAuthorId, isEqualTo(bookAuthorId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_author")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, bookAuthor, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_author")
    static UpdateDSL<UpdateModel> updateAllColumns(BookAuthor record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(bookAuthorId).equalTo(record::getBookAuthorId)
                .set(bookId).equalTo(record::getBookId)
                .set(authorName).equalTo(record::getAuthorName)
                .set(createdAt).equalTo(record::getCreatedAt);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_author")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(BookAuthor record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(bookAuthorId).equalToWhenPresent(record::getBookAuthorId)
                .set(bookId).equalToWhenPresent(record::getBookId)
                .set(authorName).equalToWhenPresent(record::getAuthorName)
                .set(createdAt).equalToWhenPresent(record::getCreatedAt);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_author")
    default int updateByPrimaryKey(BookAuthor record) {
        return update(c ->
            c.set(bookId).equalTo(record::getBookId)
            .set(authorName).equalTo(record::getAuthorName)
            .set(createdAt).equalTo(record::getCreatedAt)
            .where(bookAuthorId, isEqualTo(record::getBookAuthorId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_author")
    default int updateByPrimaryKeySelective(BookAuthor record) {
        return update(c ->
            c.set(bookId).equalToWhenPresent(record::getBookId)
            .set(authorName).equalToWhenPresent(record::getAuthorName)
            .set(createdAt).equalToWhenPresent(record::getCreatedAt)
            .where(bookAuthorId, isEqualTo(record::getBookAuthorId))
        );
    }
}