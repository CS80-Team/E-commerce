package swe.project.ecommerce.mapper;

import swe.project.ecommerce.dto.ProdDetailsDto;
import swe.project.ecommerce.model.ProdDetails;

import java.util.UUID;

public final class ProdDetailsMapper implements Mapper<ProdDetails, ProdDetailsDto> {

    @Override
    public ProdDetailsDto mapToDto(ProdDetails prodDetails) {
        return new ProdDetailsDto(
                prodDetails.getProduct(),
                prodDetails.getCreationDate(),
                prodDetails.getLastUpdateDate(),
                prodDetails.getManufactureDate(),
                prodDetails.getColor(),
                prodDetails.getBrand(),
                prodDetails.getIsStock(),
                prodDetails.getPrice()
        );
    }

    @Override
    public ProdDetails mapToEntity(ProdDetailsDto prodDetailsDto) {
        return new ProdDetails(
                UUID.randomUUID(),
                prodDetailsDto.product(),
                prodDetailsDto.creationDate(),
                prodDetailsDto.lastUpdateDate(),
                prodDetailsDto.manufactureDate(),
                prodDetailsDto.color(),
                prodDetailsDto.brand(),
                prodDetailsDto.isStock(),
                prodDetailsDto.price(),
                Integer.MAX_VALUE
        );
    }
}
