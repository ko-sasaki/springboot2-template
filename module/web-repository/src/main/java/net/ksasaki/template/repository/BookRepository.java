package net.ksasaki.template.repository;

import net.ksasaki.template.core.model.BookModel;

import java.util.List;

public interface BookRepository {
    List<BookModel> findAll();
}
