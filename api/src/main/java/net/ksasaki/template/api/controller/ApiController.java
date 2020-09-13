package net.ksasaki.template.api.controller;

import lombok.RequiredArgsConstructor;
import net.ksasaki.template.service.BookService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class ApiController {

    private final BookService bookService;

    @RequestMapping
    public Mono index(){
        return Mono.just(bookService.getAll());
    }
}
