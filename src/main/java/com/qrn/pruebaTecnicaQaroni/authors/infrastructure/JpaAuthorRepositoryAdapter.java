package com.qrn.pruebaTecnicaQaroni.authors.infrastructure;

import com.qrn.pruebaTecnicaQaroni.CycleAvoidingMappingContext;
import com.qrn.pruebaTecnicaQaroni.authors.domain.Author;
import com.qrn.pruebaTecnicaQaroni.authors.domain.ports.out.AuthorRepositoryPort;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class JpaAuthorRepositoryAdapter implements AuthorRepositoryPort {
    private final JpaAuthorRepository jpaAuthorRepository;
    private final AuthorMapper authorMapper;

    public JpaAuthorRepositoryAdapter(JpaAuthorRepository jpaAuthorRepository, AuthorMapper authorMapper) {
        this.jpaAuthorRepository = jpaAuthorRepository;
        this.authorMapper = authorMapper;
    }

    @Override
    public Author save(Author author) {
        return authorMapper.toAuthor(
                jpaAuthorRepository.save(authorMapper.toAuthorEntity(author, new CycleAvoidingMappingContext())),new CycleAvoidingMappingContext()
        );
    }

    @Override
    public Optional<Author> findById(Long id) {
        return jpaAuthorRepository.findById(id).map(authorEntity -> authorMapper.toAuthor(authorEntity, new CycleAvoidingMappingContext()));
    }


    @Override
    public List<Author> findAll() {
        return authorMapper.toAuthorList(jpaAuthorRepository.findAll(), new CycleAvoidingMappingContext());
    }

    @Override
    public Optional<Author> update(Author author) {
        if (jpaAuthorRepository.existsById(author.getAuth_id())) {
            return Optional.of(authorMapper.toAuthor(jpaAuthorRepository.save(authorMapper.toAuthorEntity(author, new CycleAvoidingMappingContext())), new CycleAvoidingMappingContext()));
        } else {
            return Optional.empty();
        }

    }

    @Override
    public Optional<Long> deleteById(Long id) {
        if (jpaAuthorRepository.existsById(id)) {
            jpaAuthorRepository.deleteById(id);
            return Optional.of(id);
        }
        return Optional.empty();
    }
}
