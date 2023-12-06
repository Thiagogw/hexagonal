package br.com.study.hexagonal.adapter.outbound.repository;

import br.com.study.hexagonal.core.domain.Book;
import br.com.study.hexagonal.core.port.outbound.BookOutboundPort;
import org.springframework.data.mongodb.core.MongoTemplate;

public class BookOutboundPortImpl implements BookOutboundPort {

    private final MongoTemplate mongoTemplate;

    public BookOutboundPortImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public Book save(Book book) {
        return mongoTemplate.save(book);
    }
}
