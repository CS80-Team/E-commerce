package swe.project.ecommerce.service.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import swe.project.ecommerce.dto.AddressDTO;
import swe.project.ecommerce.mapper.impl.AddressMapper;
import swe.project.ecommerce.repository.AddressRepository;
import swe.project.ecommerce.service.CrudService;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class AddressServiceImpl implements CrudService<AddressDTO> {

    private final AddressRepository addressRepository;
    private final AddressMapper addressMapper;

    public AddressServiceImpl(AddressRepository addressRepository, AddressMapper addressMapper) {
        this.addressRepository = addressRepository;
        this.addressMapper = addressMapper;
    }


    @Override
    public void create(AddressDTO entityDto) {

    }

    @Override
    public List<AddressDTO> getAllEntities() {
        return addressRepository.findAll().stream().map(addressMapper::mapToDTO).collect(Collectors.toList());
    }

    @Override
    public List<AddressDTO> getAllEntitiesById(UUID entityId) {
        return addressRepository.getAddressesById(entityId);
    }

    @Override
    public AddressDTO getEntityById(UUID entityId) {
        return null;
    }

    @Override
    public ResponseEntity<String> updateEntity(UUID entityUuid, AddressDTO entityDto) {
        return null;
    }

    @Override
    public void deleteEntity(UUID entityUuid) {

    }
}
