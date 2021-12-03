package com.rusned.tr_task.service.impl;

import com.rusned.tr_task.domain.CityEntity;
import com.rusned.tr_task.repository.CityRepository;
import com.rusned.tr_task.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// TODO: 12/3/2021 add exception handling

@Service
public class CityServiceImpl implements CityService {

    private final CityRepository cityRepository;

    @Autowired
    public CityServiceImpl(CityRepository cityRepository){
        this.cityRepository = cityRepository;
    }

    @Override
    public List<CityEntity> findAll() {
        return cityRepository.findAll();
    }

    @Override
    public CityEntity findById(Long entityId) {
        Optional<CityEntity> cityEntityFromDb = cityRepository.findById(entityId);
        if (cityEntityFromDb.isEmpty()) {
            // TODO: 12/3/2021 throw exception
        }
        return cityEntityFromDb.get();
    }

    @Override
    public CityEntity create(CityEntity cityEntity) {
        return cityRepository.save(cityEntity);
    }

    @Override
    public void delete(Long entityId) {
        cityRepository.deleteById(entityId);
    }

    @Override
    public CityEntity update(Long entityId, CityEntity cityEntity) {
        CityEntity cityEntityFromDb = findById(entityId);
        cityEntityFromDb.setName(cityEntity.getName());
        return cityEntityFromDb;
    }
}