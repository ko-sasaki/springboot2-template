package net.ksasaki.template.demo.persistence.mappergen;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class BookDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book")
    public static final Book book = new Book();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: book.book_id")
    public static final SqlColumn<Long> bookId = book.bookId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: book.created_at")
    public static final SqlColumn<LocalDateTime> createdAt = book.createdAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book")
    public static final class Book extends SqlTable {
        public final SqlColumn<Long> bookId = column("book_id", JDBCType.BIGINT);

        public final SqlColumn<LocalDateTime> createdAt = column("created_at", JDBCType.TIMESTAMP);

        public Book() {
            super("book");
        }
    }
}