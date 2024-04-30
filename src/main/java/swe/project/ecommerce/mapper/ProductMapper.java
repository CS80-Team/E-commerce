package swe.project.ecommerce.mapper;

import swe.project.ecommerce.dto.ProductDto;
import swe.project.ecommerce.model.Product;

import java.util.HashSet;
import java.util.UUID;

public final class ProductMapper implements Mapper<Product, ProductDto> {

    @Override
    public ProductDto mapToDto(Product product) {
        return new ProductDto(
                product.getName(),
                product.getDescription(),
                product.getSummary()
        );
    }

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
}
