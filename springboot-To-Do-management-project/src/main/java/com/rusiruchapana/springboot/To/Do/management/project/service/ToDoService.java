package com.rusiruchapana.springboot.To.Do.management.project.service;

import com.rusiruchapana.springboot.To.Do.management.project.dto.ToDoDto;

import java.util.List;

public interface ToDoService {
    public ToDoDto addToDo(ToDoDto toDoDto);
    public ToDoDto getToDo(Long userId);
    public List<ToDoDto> getAllToDo();
    public ToDoDto updateToDo(ToDoDto toDoDto , Long id);
    public void deleteToDo(Long userId);
    public ToDoDto completeToDo(Long userId);
    public ToDoDto inCompleteToDo(Long userId);

}
