package com.rusned.tr_task.service.impl;

import com.rusned.tr_task.entity.City;
import com.rusned.tr_task.persistance.CityDao;
import com.rusned.tr_task.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    private final CityDao cityDao;

    @Autowired
    public CityServiceImpl(CityDao cityDao){
        this.cityDao = cityDao;
    }

    @Override
    public List<City> findAll() {
        return cityDao.findAll();
    }
}