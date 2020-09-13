package net.ksasaki.template.demo.persistence.modelgen;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.annotation.Generated;

public class BookAuthor implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: book_author.book_author_id")
    private Long bookAuthorId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: book_author.book_id")
    private Long bookId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: book_author.author_name")
    private String authorName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: book_author.created_at")
    private LocalDateTime createdAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_author")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: book_author.book_author_id")
    public Long getBookAuthorId() {
        return bookAuthorId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_author")
    public BookAuthor withBookAuthorId(Long bookAuthorId) {
        this.setBookAuthorId(bookAuthorId);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: book_author.book_author_id")
    public void setBookAuthorId(Long bookAuthorId) {
        this.bookAuthorId = bookAuthorId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: book_author.book_id")
    public Long getBookId() {
        return bookId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_author")
    public BookAuthor withBookId(Long bookId) {
        this.setBookId(bookId);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: book_author.book_id")
    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: book_author.author_name")
    public String getAuthorName() {
        return authorName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_author")
    public BookAuthor withAuthorName(String authorName) {
        this.setAuthorName(authorName);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: book_author.author_name")
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: book_author.created_at")
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_author")
    public BookAuthor withCreatedAt(LocalDateTime createdAt) {
        this.setCreatedAt(createdAt);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: book_author.created_at")
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_author")
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        BookAuthor other = (BookAuthor) that;
        return (this.getBookAuthorId() == null ? other.getBookAuthorId() == null : this.getBookAuthorId().equals(other.getBookAuthorId()))
            && (this.getBookId() == null ? other.getBookId() == null : this.getBookId().equals(other.getBookId()))
            && (this.getAuthorName() == null ? other.getAuthorName() == null : this.getAuthorName().equals(other.getAuthorName()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_author")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBookAuthorId() == null) ? 0 : getBookAuthorId().hashCode());
        result = prime * result + ((getBookId() == null) ? 0 : getBookId().hashCode());
        result = prime * result + ((getAuthorName() == null) ? 0 : getAuthorName().hashCode());
        result = prime * result + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: book_author")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bookAuthorId=").append(bookAuthorId);
        sb.append(", bookId=").append(bookId);
        sb.append(", authorName=").append(authorName);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}