package com.vkstech.actuator.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class TestModel {

    @Id
    private Integer id;

    private String name;
}
