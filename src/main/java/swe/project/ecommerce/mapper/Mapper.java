package swe.project.ecommerce.mapper;

public interface Mapper<Entity, EntityDTO> {
    Entity mapToEntity(EntityDTO entityDTO);

    EntityDTO mapToDTO(Entity entity);
}
