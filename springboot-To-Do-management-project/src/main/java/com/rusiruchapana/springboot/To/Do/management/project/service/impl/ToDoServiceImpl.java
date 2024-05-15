package com.rusiruchapana.springboot.To.Do.management.project.service.impl;

import com.rusiruchapana.springboot.To.Do.management.project.dto.ToDoDto;
import com.rusiruchapana.springboot.To.Do.management.project.entity.ToDoEntity;
import com.rusiruchapana.springboot.To.Do.management.project.exception.ResourcesNotFoundException;
import com.rusiruchapana.springboot.To.Do.management.project.repository.ToDoRepository;
import com.rusiruchapana.springboot.To.Do.management.project.service.ToDoService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.in;

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






    @Override
    public ToDoDto getToDo(Long userId) {

        ToDoEntity toDoEntity = toDoRepository.findById(userId).orElseThrow(()-> new ResourcesNotFoundException("The give id is not in the database."));
        ToDoDto toDoDto = modelMapper.map(toDoEntity , ToDoDto.class);
        return toDoDto;
    }

    @Override
    public List<ToDoDto> getAllToDo() {
        List<ToDoEntity> toDoEntityList = toDoRepository.findAll();
        return toDoEntityList.stream().map((toDos)-> modelMapper.map(toDos , ToDoDto.class)).collect(Collectors.toList());
    }
}
