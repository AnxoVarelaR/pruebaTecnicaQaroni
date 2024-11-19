package com.qrn.pruebaTecnicaQaroni.books.infrastructure;

import com.qrn.pruebaTecnicaQaroni.CycleAvoidingMappingContext;
import com.qrn.pruebaTecnicaQaroni.books.domain.Book;
import com.qrn.pruebaTecnicaQaroni.books.domain.ports.out.BookRepositoryPort;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class JpaBookRepositoryAdapter implements BookRepositoryPort {

    private final JpaBookRepository jpaBookRepository;
    private final BookMapper bookMapper;

    public JpaBookRepositoryAdapter(JpaBookRepository jpaBookRepository, BookMapper bookMapper) {
        this.jpaBookRepository = jpaBookRepository;
        this.bookMapper = bookMapper;
    }

    @Override
    public Book save(Book book) {
        return bookMapper.toBook(
                jpaBookRepository.save(bookMapper.toBookEntity(book,new CycleAvoidingMappingContext())), new CycleAvoidingMappingContext());
    }

    @Override
    public Optional<Book> findById(Long id) {
        return jpaBookRepository.findById(id).map(bookEntity -> bookMapper.toBook(bookEntity,new CycleAvoidingMappingContext()));
    }

    @Override
    public List<Book> findAll() {
        return bookMapper.toBookList(jpaBookRepository.findAll(),new CycleAvoidingMappingContext());
    }

    @Override
    public Optional<Book> update(Book book) {
        if (jpaBookRepository.existsById(book.getBk_id())){
            return Optional.of(bookMapper.toBook(jpaBookRepository.save(bookMapper.toBookEntity(book,new CycleAvoidingMappingContext())),new CycleAvoidingMappingContext()));
        }
        return Optional.empty();
    }

    @Override
    public Optional<Long> deleteById(Long id) {
        if (jpaBookRepository.existsById(id)) {
            jpaBookRepository.deleteById(id);
            return Optional.of(id);
        }
        return Optional.empty();
    }
}
