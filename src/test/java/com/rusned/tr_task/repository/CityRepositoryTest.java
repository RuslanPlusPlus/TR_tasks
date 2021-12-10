package com.rusned.tr_task.repository;

import com.rusned.tr_task.domain.CityEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

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
}