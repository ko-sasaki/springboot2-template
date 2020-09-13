package net.ksasaki.template.demo.persistence.mappergen;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class BookInformationDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_information")
    public static final BookInformation bookInformation = new BookInformation();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: book_information.book_id")
    public static final SqlColumn<Long> bookId = bookInformation.bookId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: book_information.isbn")
    public static final SqlColumn<String> isbn = bookInformation.isbn;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: book_information.name")
    public static final SqlColumn<String> name = bookInformation.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: book_information.created_at")
    public static final SqlColumn<LocalDateTime> createdAt = bookInformation.createdAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_information")
    public static final class BookInformation extends SqlTable {
        public final SqlColumn<Long> bookId = column("book_id", JDBCType.BIGINT);

        public final SqlColumn<String> isbn = column("isbn", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> createdAt = column("created_at", JDBCType.TIMESTAMP);

        public BookInformation() {
            super("book_information");
        }
    }
}