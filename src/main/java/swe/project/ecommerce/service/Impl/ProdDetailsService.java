package swe.project.ecommerce.service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import swe.project.ecommerce.dto.ProdDetailsDto;
import swe.project.ecommerce.mapper.impl.ProdDetailsMapper;
import swe.project.ecommerce.model.ProdDetails;
import swe.project.ecommerce.repository.ProdDetailsRepository;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ProdDetailsService {

    @Autowired
    private final ProdDetailsRepository prodDetailsRepository;
    private final ProdDetailsMapper prodDetailsMapper = new ProdDetailsMapper();

    public List<ProdDetails> getProdDetailsByProductId(UUID productId) {
        return prodDetailsRepository.findByProductId(productId);
    }

    public void addNewProdDetails(ProdDetailsDto prodDetailsDto) {
        prodDetailsRepository.save(prodDetailsMapper.mapToEntity(prodDetailsDto));
    }

    public void updateProdDetails(UUID prodDetailsId, ProdDetailsDto prodDetailsDto) {
        ProdDetails prodDetails = prodDetailsRepository.findById(prodDetailsId)
                .orElseThrow(() -> new IllegalStateException("Product details with id " + prodDetailsId + " does not exist"));

        prodDetails.setProduct(prodDetailsDto.product());
        prodDetails.setCreationDate(prodDetailsDto.creationDate());
        prodDetails.setLastUpdateDate(prodDetailsDto.lastUpdateDate());
        prodDetails.setManufactureDate(prodDetailsDto.manufactureDate());
        prodDetails.setColor(prodDetailsDto.color());
        prodDetails.setBrand(prodDetailsDto.brand());
        prodDetails.setIsStock(prodDetailsDto.isStock());
        prodDetails.setPrice(prodDetailsDto.price());

        prodDetailsRepository.save(prodDetails);
    }

    public void deleteProdDetails(UUID prodDetailsId) {
        prodDetailsRepository.deleteById(prodDetailsId);
    }

}
