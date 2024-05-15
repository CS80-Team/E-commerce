package swe.project.ecommerce.service;

import org.springframework.http.ResponseEntity;
import swe.project.ecommerce.dto.ProductDto;

import java.util.List;
import java.util.UUID;

public interface CrudService<EntityDTO> {
    void create(EntityDTO entityDTO);

    List<EntityDTO> getAllEntities();

    List<EntityDTO> getAllEntitiesById(UUID entityId);

    EntityDTO getEntityById(UUID entityId);

    ResponseEntity<String> updateEntity(UUID entityUuid, EntityDTO entityDTO);

    void deleteEntity(UUID entityUuid);
}