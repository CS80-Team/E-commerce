package swe.project.ecommerce.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

public interface PageableService<EntityDto> {
    Page<EntityDto> getAllEntityPages(Integer pageNo,
                                   Integer pageSize,
                                   Sort.Direction sortDir,
                                   String sortBy);
}
