package com.rusiruchapana.springboot.To.Do.management.project.service.impl;

import com.rusiruchapana.springboot.To.Do.management.project.dto.ToDoDto;
import com.rusiruchapana.springboot.To.Do.management.project.entity.ToDoEntity;
import com.rusiruchapana.springboot.To.Do.management.project.repository.ToDoRepository;
import com.rusiruchapana.springboot.To.Do.management.project.service.ToDoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ToDoServiceImpl implements ToDoService {

    private ToDoRepository toDoRepository;

    @Override
    public ToDoDto addToDo(ToDoDto toDoDto) {

        ToDoEntity toDoEntity = new ToDoEntity();
        toDoEntity.setTitle(toDoDto.getTitle());
        toDoEntity.setDescription(toDoDto.getDescription());
        toDoEntity.setCompleted(toDoDto.isCompleted());

        toDoRepository.save(toDoEntity);

        ToDoDto toDoDto1 = new ToDoDto();
        toDoDto1.setId(toDoEntity.getId());
        toDoDto1.setTitle(toDoEntity.getTitle());
        toDoDto1.setDescription(toDoEntity.getDescription());
        toDoDto1.setCompleted(toDoEntity.getCompleted());



        return toDoDto1;
    }
}
