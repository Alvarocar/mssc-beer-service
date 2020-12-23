package dev.alvarocar.msscbeerservice.model.pagination;

import dev.alvarocar.msscbeerservice.model.dto.Beer;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class BeerPageList extends PageImpl<Beer> {
    public BeerPageList(List<Beer> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public BeerPageList(List<Beer> content) {
        super(content);
    }
}
