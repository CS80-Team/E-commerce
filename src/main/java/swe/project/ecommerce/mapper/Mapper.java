package swe.project.ecommerce.mapper;

public interface Mapper<Entity, EntityDto> {
    Entity mapToEntity(EntityDto entityDto);

    EntityDto mapToDto(Entity entity);
}
