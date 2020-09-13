package net.ksasaki.template.core.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BookModel {
    private Long bookId;
    private LocalDateTime createdAt;
}
