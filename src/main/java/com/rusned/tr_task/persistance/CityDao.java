package com.rusned.tr_task.persistance;

import com.rusned.tr_task.entity.City;

import java.util.List;

public interface CityDao {
    List<City> findAll();
}
