package net.ksasaki.template.service;


import lombok.RequiredArgsConstructor;
import net.ksasaki.template.core.CacheKeyType;
import net.ksasaki.template.core.model.BookModel;
import net.ksasaki.template.repository.BookRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    @Cacheable(CacheKeyType.SAMPLE_KEY)
    public List<BookModel> getAll() {

        return bookRepository.findAll();
    }

    @Override
    @Cacheable(CacheKeyType.SAMPLE_KEY)
    public List<String> getString() {
        return List.of("a", "b", "c");
    }
}
