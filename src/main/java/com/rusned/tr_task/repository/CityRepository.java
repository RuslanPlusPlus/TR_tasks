package com.rusned.tr_task.repository;

import com.rusned.tr_task.domain.CityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository
        extends JpaRepository<CityEntity, Long> {
}
