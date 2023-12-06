package br.com.study.hexagonal.adapter.inbound.controller;

import br.com.study.hexagonal.core.domain.Book;
import br.com.study.hexagonal.core.port.inbound.BookInboundPort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping
public class BookController {

    public static final String PATH = "/v1/books";

    private final BookInboundPort bookInboundPort;

    public BookController(BookInboundPort bookInboundPort) {
        this.bookInboundPort = bookInboundPort;
    }

    @PostMapping(path = PATH)
    ResponseEntity<Void> create(Book book) {
        String id = bookInboundPort.save(book).getId();

        return ResponseEntity.created(URI.create(PATH + id)).build();
    }
}
