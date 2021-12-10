package com.rusned.tr_task.repository;

import com.rusned.tr_task.domain.CityEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@TestPropertySource(locations = "classpath:/application-test.properties")
@Sql("/city-data.sql")
class CityRepositoryTest {

    @Autowired
    private CityRepository repository;

    @Test
    void should_find_all_cities() {
        List<CityEntity> recipes = repository.findAll();
        assertThat(recipes)
                .hasSize(3);
    }

    @Test
    void should_find_city_by_id(){
        long id = 1;
        String name = "London";
        CityEntity expectedEntity = new CityEntity(id, name);
        Optional<CityEntity> actualEntity = repository.findById(id);
        assertEquals(expectedEntity, actualEntity.orElseThrow());
    }
}