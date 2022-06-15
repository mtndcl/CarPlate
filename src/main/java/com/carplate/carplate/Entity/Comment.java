package com.carplate.carplate.Entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
@Data
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private  Long id;

    private  String text;

    private  float star;

    private Date createdDate;
}
