package com.rusned.tr_task.domain;

import javax.persistence.*;

@Entity
@Table(name = "city")
public class CityEntity {

    @Id
    @GeneratedValue
    private Long id;

    String name;

    public CityEntity(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
