package net.ksasaki.template.controller;

import lombok.RequiredArgsConstructor;
import net.ksasaki.template.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

@RestController
@RequiredArgsConstructor
@RequestMapping("book")
public class BookController {

    private final BookService bookService;

    @GetMapping("getAll")
    public Mono getAll() {
        return Mono.defer(() -> {
            return Mono.just(bookService.getAll());
        }).subscribeOn(Schedulers.elastic());
    }
}
