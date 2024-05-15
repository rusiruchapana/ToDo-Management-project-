package com.rusiruchapana.springboot.To.Do.management.project.service.impl;

import com.rusiruchapana.springboot.To.Do.management.project.dto.ToDoDto;
import com.rusiruchapana.springboot.To.Do.management.project.entity.ToDoEntity;
import com.rusiruchapana.springboot.To.Do.management.project.repository.ToDoRepository;
import com.rusiruchapana.springboot.To.Do.management.project.service.ToDoService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ToDoServiceImpl implements ToDoService {

    private ToDoRepository toDoRepository;
    private ModelMapper modelMapper;

    @Override
    public ToDoDto addToDo(ToDoDto toDoDto) {

        ToDoEntity toDoEntity = modelMapper.map(toDoDto , ToDoEntity.class);

        toDoRepository.save(toDoEntity);
        
        ToDoDto toDoDto1 = modelMapper.map(toDoEntity , ToDoDto.class);

        return toDoDto1;
    }
}
