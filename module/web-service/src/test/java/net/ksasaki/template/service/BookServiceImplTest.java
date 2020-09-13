package net.ksasaki.template.service;

import lombok.extern.slf4j.Slf4j;
import net.ksasaki.template.core.model.BookModel;
import net.ksasaki.template.repository.BookRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

@Slf4j
@ExtendWith(MockitoExtension.class)
class BookServiceImplTest {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookServiceImpl bookService;

    @Test
    void test() throws ExecutionException, InterruptedException {
        Mockito.when(bookRepository.findAll()).thenReturn(Collections.emptyList());
        List<BookModel> all = bookService.getAll();
        Assertions.assertIterableEquals(all, Collections.emptyList());
    }
}