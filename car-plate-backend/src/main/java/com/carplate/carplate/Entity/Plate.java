package com.carplate.carplate.Entity;


import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Data
public class Plate {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private  Long id;

    private  String plateNumber;

    private  Float star;

    private  Integer starCount;

    @OneToMany
    private List<Comment> commentList = new ArrayList<>();
}
