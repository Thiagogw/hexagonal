package br.com.study.hexagonal.core.port.outbound;

import br.com.study.hexagonal.core.domain.Book;

public interface BookOutboundPort {

    Book save(Book book);
}
