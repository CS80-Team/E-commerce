package swe.project.ecommerce.mapper.impl;

import swe.project.ecommerce.dto.ProductDto;
import swe.project.ecommerce.mapper.Mapper;
import swe.project.ecommerce.model.Product;

import java.util.HashSet;
import java.util.UUID;

public final class ProductMapper implements Mapper<Product, ProductDto> {
    @Override
    public Product mapToEntity(ProductDto productDto) {
        return new Product(
                UUID.randomUUID(),
                new HashSet<>(),
                productDto.name(),
                productDto.description(),
                productDto.summary()
        );
    }

    @Override
    public ProductDto mapToDTO(Product product) {
        return new ProductDto(
                product.getName(),
                product.getDescription(),
                product.getSummary()
        );
    }
}
