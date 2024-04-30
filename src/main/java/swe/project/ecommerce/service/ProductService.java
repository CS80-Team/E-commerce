package swe.project.ecommerce.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import swe.project.ecommerce.dto.ProductDto;
import swe.project.ecommerce.mapper.ProductMapper;
import swe.project.ecommerce.repository.ProductRepository;
import swe.project.ecommerce.model.Product;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ProductService implements CrudService<Product, ProductDto>, PageableService<ProductDto> {

    @Autowired
    private final ProductRepository productRepository;
    private final ProductMapper productMapper = new ProductMapper();

    public Page<ProductDto> getAllEntityPages(Integer pageNo,
                                           Integer pageSize,
                                           Sort.Direction sortDir,
                                           String sortBy) {

        return productRepository.findAll(
                PageRequest.of(
                        pageNo,
                        pageSize,
                        sortDir,
                        sortBy)
        ).map(productMapper::mapToDto);
    }

    @Override
    public void create(ProductDto productDto) {
        productRepository.save(productMapper.mapToEntity(productDto));
    }

    @Override
    public List<Product> getAllEntities() {
        return null;
    }

    public ResponseEntity<String> updateEntity(UUID productId, ProductDto productDto) {
        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new IllegalStateException("Product with id " + productId + " does not exist"));

        product.setName(productDto.name());
        product.setDescription(productDto.description());
        product.setSummary(productDto.summary());

        productRepository.save(product);

        return new ResponseEntity<>("Product updated successfully", HttpStatus.OK);
    }

    public void deleteEntity(UUID productId) {
        productRepository.deleteById(productId);
    }

    @Override
    public ProductDto getEntityById(UUID productId) {
        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new IllegalStateException("Product with id " + productId + " does not exist"));

        return productMapper.mapToDto(product);
    }

    public ProductDto getProductById(UUID productId) {
        return productMapper.mapToDto(productRepository.findById(productId)
                .orElseThrow(() -> new IllegalStateException("Product with id " + productId + " does not exist")));
    }

}
