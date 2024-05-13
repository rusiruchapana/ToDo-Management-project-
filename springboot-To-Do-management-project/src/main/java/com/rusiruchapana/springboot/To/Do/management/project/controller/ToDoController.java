package com.rusiruchapana.springboot.To.Do.management.project.controller;

import com.rusiruchapana.springboot.To.Do.management.project.dto.ToDoDto;
import com.rusiruchapana.springboot.To.Do.management.project.service.ToDoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/todocontroller")
@AllArgsConstructor
public class ToDoController {

    private ToDoService toDoService;

    @PostMapping("/addtodo")
    public ResponseEntity<ToDoDto> addToDo(@RequestBody ToDoDto toDoDto){
        ToDoDto toDoDto1 = toDoService.addToDo(toDoDto);
        return new ResponseEntity<ToDoDto>(toDoDto1 , HttpStatus.CREATED);
    }

}
