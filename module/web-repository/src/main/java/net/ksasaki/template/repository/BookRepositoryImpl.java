package net.ksasaki.template.repository;

import lombok.RequiredArgsConstructor;
import net.ksasaki.template.core.model.BookModel;
import net.ksasaki.template.demo.persistence.mappergen.BookMapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BookRepositoryImpl implements BookRepository {

    private final BookMapper bookMapper;

    @Override
    public List<BookModel> findAll() {
        var select = bookMapper.select(e -> e.where());
        var mapper = new ModelMapper();
        List<BookModel> map = List.of(mapper.map(select, BookModel[].class));
        return map;
    }

}
