package swe.project.ecommerce.service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import swe.project.ecommerce.model.Discount;
import swe.project.ecommerce.repository.DiscountRepository;
import swe.project.ecommerce.service.CrudService;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class DiscountService implements CrudService<Discount, Discount> {
    private final DiscountRepository discountRepository;

    public Discount getDiscountByProductId(UUID productId) {
        return discountRepository.findByProductId(productId);
    }

    @Override
    public void create(Discount discount) {
        discountRepository.save(discount);
    }

    @Override
    public List<Discount> getAllEntities() {
        return null;
    }

    @Override
    public Discount getEntityById(UUID entityId) {
        return discountRepository.findById(entityId).orElse(null);
    }

    @Override
    public ResponseEntity<String> updateEntity(UUID entityUuid, Discount discount) {
        Optional<Discount> entity = discountRepository.findById(entityUuid);

        if (entity.isPresent()) {
            this.deleteEntity(entityUuid);
            discountRepository.save(discount);
            return ResponseEntity.ok("Discount updated successfully");
        } else {
            return ResponseEntity.badRequest().body("Discount not found");
        }
    }

    @Override
    public void deleteEntity(UUID entityUuid) {
        discountRepository.deleteById(entityUuid);
    }
}
