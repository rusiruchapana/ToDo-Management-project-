package com.rusiruchapana.springboot.To.Do.management.project.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ToDoDto {

    private Long id;
    private String title;
    private String description;
    private boolean completed;
}
