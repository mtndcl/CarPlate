package com.carplate.carplate.Entity;


import lombok.Data;

import javax.persistence.*;

@MappedSuperclass
@Data
public class EntityCore {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

}
