package swe.project.ecommerce.service;

import org.springframework.http.ResponseEntity;
import swe.project.ecommerce.dto.ProductDto;

import java.util.List;
import java.util.UUID;

public interface CrudService<Entity, EntityDto> {
    void create(EntityDto entityDto);

    List<Entity> getAllEntities();

    EntityDto getEntityById(UUID entityId);

    ResponseEntity<String> updateEntity(UUID entityUuid, EntityDto entityDto);

    void deleteEntity(UUID entityUuid);
}
