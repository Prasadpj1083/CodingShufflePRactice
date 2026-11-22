package com.Module2_Practice.Practice_Set.Entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Data
@Entity
@Table(name ="Employee")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private   int age;
    private LocalDateTime localDateTime;
    private boolean isActive;


    public EmployeeEntity (){

    }
}
