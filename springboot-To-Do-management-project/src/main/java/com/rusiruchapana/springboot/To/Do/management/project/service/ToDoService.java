package com.rusiruchapana.springboot.To.Do.management.project.service;

import com.rusiruchapana.springboot.To.Do.management.project.dto.ToDoDto;

public interface ToDoService {
    public ToDoDto addToDo(ToDoDto toDoDto);
    public ToDoDto getToDo(Long userId);

}
