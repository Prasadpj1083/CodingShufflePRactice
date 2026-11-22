package com.Module2_Practice.Practice_Set.dto;


import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Data
public class EmployeeDTO {
    private Long id;
    private String name;
    private String email;
    private   int age;
    private LocalDateTime localDateTime;
    private boolean isActive;


    public EmployeeDTO(){

    }
}
