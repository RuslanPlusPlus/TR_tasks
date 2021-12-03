package com.rusned.tr_task.service;

import com.rusned.tr_task.domain.CityEntity;

import java.util.List;

public interface CityService {
    List<CityEntity> findAll();
    CityEntity findById(Long entityId);
    CityEntity create(CityEntity cityEntity);
    void delete(Long entityId);
    CityEntity update(Long entityId, CityEntity cityEntity);
}
