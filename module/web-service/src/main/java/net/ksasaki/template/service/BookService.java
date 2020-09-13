package net.ksasaki.template.service;

import net.ksasaki.template.core.model.BookModel;

import java.util.List;

public interface BookService {
    List<BookModel> getAll();

    List<String> getString();
}
