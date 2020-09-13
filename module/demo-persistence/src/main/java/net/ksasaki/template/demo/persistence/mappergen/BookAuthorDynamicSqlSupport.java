package net.ksasaki.template.demo.persistence.mappergen;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class BookAuthorDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_author")
    public static final BookAuthor bookAuthor = new BookAuthor();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: book_author.book_author_id")
    public static final SqlColumn<Long> bookAuthorId = bookAuthor.bookAuthorId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: book_author.book_id")
    public static final SqlColumn<Long> bookId = bookAuthor.bookId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: book_author.author_name")
    public static final SqlColumn<String> authorName = bookAuthor.authorName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: book_author.created_at")
    public static final SqlColumn<LocalDateTime> createdAt = bookAuthor.createdAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_author")
    public static final class BookAuthor extends SqlTable {
        public final SqlColumn<Long> bookAuthorId = column("book_author_id", JDBCType.BIGINT);

        public final SqlColumn<Long> bookId = column("book_id", JDBCType.BIGINT);

        public final SqlColumn<String> authorName = column("author_name", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> createdAt = column("created_at", JDBCType.TIMESTAMP);

        public BookAuthor() {
            super("book_author");
        }
    }
}