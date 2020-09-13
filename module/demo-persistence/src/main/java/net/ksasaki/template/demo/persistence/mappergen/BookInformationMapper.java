package net.ksasaki.template.demo.persistence.mappergen;

import static net.ksasaki.template.demo.persistence.mappergen.BookInformationDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import net.ksasaki.template.demo.persistence.modelgen.BookInformation;
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
public interface BookInformationMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_information")
    BasicColumn[] selectList = BasicColumn.columnList(bookId, isbn, name, createdAt);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_information")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_information")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_information")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<BookInformation> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_information")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<BookInformation> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_information")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("BookInformationResult")
    Optional<BookInformation> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_information")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="BookInformationResult", value = {
        @Result(column="book_id", property="bookId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="isbn", property="isbn", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<BookInformation> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_information")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_information")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, bookInformation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_information")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, bookInformation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_information")
    default int deleteByPrimaryKey(Long bookId_) {
        return delete(c -> 
            c.where(bookId, isEqualTo(bookId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_information")
    default int insert(BookInformation record) {
        return MyBatis3Utils.insert(this::insert, record, bookInformation, c ->
            c.map(bookId).toProperty("bookId")
            .map(isbn).toProperty("isbn")
            .map(name).toProperty("name")
            .map(createdAt).toProperty("createdAt")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_information")
    default int insertMultiple(Collection<BookInformation> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, bookInformation, c ->
            c.map(bookId).toProperty("bookId")
            .map(isbn).toProperty("isbn")
            .map(name).toProperty("name")
            .map(createdAt).toProperty("createdAt")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_information")
    default int insertSelective(BookInformation record) {
        return MyBatis3Utils.insert(this::insert, record, bookInformation, c ->
            c.map(bookId).toPropertyWhenPresent("bookId", record::getBookId)
            .map(isbn).toPropertyWhenPresent("isbn", record::getIsbn)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(createdAt).toPropertyWhenPresent("createdAt", record::getCreatedAt)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_information")
    default Optional<BookInformation> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, bookInformation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_information")
    default List<BookInformation> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, bookInformation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_information")
    default List<BookInformation> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, bookInformation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_information")
    default Optional<BookInformation> selectByPrimaryKey(Long bookId_) {
        return selectOne(c ->
            c.where(bookId, isEqualTo(bookId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_information")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, bookInformation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_information")
    static UpdateDSL<UpdateModel> updateAllColumns(BookInformation record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(bookId).equalTo(record::getBookId)
                .set(isbn).equalTo(record::getIsbn)
                .set(name).equalTo(record::getName)
                .set(createdAt).equalTo(record::getCreatedAt);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_information")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(BookInformation record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(bookId).equalToWhenPresent(record::getBookId)
                .set(isbn).equalToWhenPresent(record::getIsbn)
                .set(name).equalToWhenPresent(record::getName)
                .set(createdAt).equalToWhenPresent(record::getCreatedAt);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_information")
    default int updateByPrimaryKey(BookInformation record) {
        return update(c ->
            c.set(isbn).equalTo(record::getIsbn)
            .set(name).equalTo(record::getName)
            .set(createdAt).equalTo(record::getCreatedAt)
            .where(bookId, isEqualTo(record::getBookId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_information")
    default int updateByPrimaryKeySelective(BookInformation record) {
        return update(c ->
            c.set(isbn).equalToWhenPresent(record::getIsbn)
            .set(name).equalToWhenPresent(record::getName)
            .set(createdAt).equalToWhenPresent(record::getCreatedAt)
            .where(bookId, isEqualTo(record::getBookId))
        );
    }
}