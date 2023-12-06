package br.com.study.hexagonal.core.usecase;

import br.com.study.hexagonal.core.domain.Book;
import br.com.study.hexagonal.core.port.inbound.BookInboundPort;
import br.com.study.hexagonal.core.port.outbound.BookOutboundPort;

public class BookInboundPortImpl implements BookInboundPort {

    private final BookOutboundPort bookOutboundPort;

    public BookInboundPortImpl(BookOutboundPort bookOutboundPort) {
        this.bookOutboundPort = bookOutboundPort;
    }

    @Override
    public Book save(Book book) {
        if (book.getEdition().equals("Premium")) {
            System.out.println("Notify manager of a premium edition.");
        }

        return bookOutboundPort.save(book);
    }
}
