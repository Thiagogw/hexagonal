package br.com.study.hexagonal.core.port.inbound;

import br.com.study.hexagonal.core.domain.Book;

public interface BookInboundPort {

    Book save(Book book);
}
