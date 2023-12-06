package br.com.study.hexagonal.infrastructure;

import br.com.study.hexagonal.adapter.outbound.repository.BookOutboundPortImpl;
import br.com.study.hexagonal.core.port.inbound.BookInboundPort;
import br.com.study.hexagonal.core.port.outbound.BookOutboundPort;
import br.com.study.hexagonal.core.usecase.BookInboundPortImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class BeanConfiguration {

    @Bean
    public BookInboundPort bookInboundPort(BookOutboundPort bookOutboundPort) {
        return new BookInboundPortImpl(bookOutboundPort);
    }

    @Bean
    public BookOutboundPort bookOutboundPort(MongoTemplate mongoTemplate) {
        return new BookOutboundPortImpl(mongoTemplate);
    }
}
