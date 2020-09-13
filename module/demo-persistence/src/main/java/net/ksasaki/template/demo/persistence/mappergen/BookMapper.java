package net.ksasaki.template.demo.persistence.mappergen;

import static net.ksasaki.template.demo.persistence.mappergen.BookDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import net.ksasaki.template.demo.persistence.modelgen.Book;
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
public interface BookMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book")
    BasicColumn[] selectList = BasicColumn.columnList(bookId, createdAt);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Book> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Book> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("BookResult")
    Optional<Book> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="BookResult", value = {
        @Result(column="book_id", property="bookId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Book> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, book, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, book, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book")
    default int deleteByPrimaryKey(Long bookId_) {
        return delete(c -> 
            c.where(bookId, isEqualTo(bookId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book")
    default int insert(Book record) {
        return MyBatis3Utils.insert(this::insert, record, book, c ->
            c.map(bookId).toProperty("bookId")
            .map(createdAt).toProperty("createdAt")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book")
    default int insertMultiple(Collection<Book> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, book, c ->
            c.map(bookId).toProperty("bookId")
            .map(createdAt).toProperty("createdAt")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book")
    default int insertSelective(Book record) {
        return MyBatis3Utils.insert(this::insert, record, book, c ->
            c.map(bookId).toPropertyWhenPresent("bookId", record::getBookId)
            .map(createdAt).toPropertyWhenPresent("createdAt", record::getCreatedAt)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book")
    default Optional<Book> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, book, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book")
    default List<Book> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, book, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book")
    default List<Book> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, book, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book")
    default Optional<Book> selectByPrimaryKey(Long bookId_) {
        return selectOne(c ->
            c.where(bookId, isEqualTo(bookId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, book, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book")
    static UpdateDSL<UpdateModel> updateAllColumns(Book record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(bookId).equalTo(record::getBookId)
                .set(createdAt).equalTo(record::getCreatedAt);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Book record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(bookId).equalToWhenPresent(record::getBookId)
                .set(createdAt).equalToWhenPresent(record::getCreatedAt);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book")
    default int updateByPrimaryKey(Book record) {
        return update(c ->
            c.set(createdAt).equalTo(record::getCreatedAt)
            .where(bookId, isEqualTo(record::getBookId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book")
    default int updateByPrimaryKeySelective(Book record) {
        return update(c ->
            c.set(createdAt).equalToWhenPresent(record::getCreatedAt)
            .where(bookId, isEqualTo(record::getBookId))
        );
    }
}