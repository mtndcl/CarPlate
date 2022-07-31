package com.carplate.carplate.Entity;


import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table
@Data
public class Person extends EntityCore {

    private String username;

    private String password;

    @CreatedDate
    private Date createdDate;

    @OneToMany
    private List<Comment> commentList=new ArrayList<>();

}
