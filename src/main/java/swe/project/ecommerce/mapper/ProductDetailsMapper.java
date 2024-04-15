package swe.project.ecommerce.mapper;

import swe.project.ecommerce.dto.ProductDetailsDto;
import swe.project.ecommerce.model.ProductDetails;

import java.util.function.Function;

public class ProductDetailsMapper implements Function<ProductDetails, ProductDetailsDto> {

    @Override
    public ProductDetailsDto apply(ProductDetails productDetails) {
        return new ProductDetailsDto(
                productDetails.getBrand(),
                productDetails.getIsStock(),
                productDetails.getManufactureDate(),
                productDetails.getColor(),
                productDetails.getPrice(),
                productDetails.getQuantity());
    }
}
