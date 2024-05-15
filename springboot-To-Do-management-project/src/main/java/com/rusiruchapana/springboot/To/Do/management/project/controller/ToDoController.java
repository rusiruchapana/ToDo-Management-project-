package com.rusiruchapana.springboot.To.Do.management.project.controller;

import com.rusiruchapana.springboot.To.Do.management.project.dto.ToDoDto;
import com.rusiruchapana.springboot.To.Do.management.project.service.ToDoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/todocontroller")
@AllArgsConstructor
public class ToDoController {

    private ToDoService toDoService;

    @PostMapping("/addtodo")
    public ResponseEntity<ToDoDto> addToDo(@RequestBody ToDoDto toDoDto){
        ToDoDto toDoDto1 = toDoService.addToDo(toDoDto);
        return new ResponseEntity<ToDoDto>(toDoDto1 , HttpStatus.CREATED);
    }

    @GetMapping("/gettodo/{id}")
    public ResponseEntity<ToDoDto> findDto(@PathVariable("id") Long userId){
        ToDoDto toDoDto = toDoService.getToDo(userId);
        return new ResponseEntity<>(toDoDto , HttpStatus.OK);
    }

    @GetMapping("/findalldto")
    public ResponseEntity<List<ToDoDto>> findAllDto(){
        List<ToDoDto> dtos = toDoService.getAllToDo();
        return new ResponseEntity<>(dtos , HttpStatus.OK);
    }

    @PutMapping("/updatetodo/{id}")
    public ResponseEntity<ToDoDto> updateToDo(@RequestBody ToDoDto toDoDto , @PathVariable("id") Long userId){
        ToDoDto toDoDto1 = toDoService.updateToDo(toDoDto , userId);
        return new  ResponseEntity<>(toDoDto1 , HttpStatus.OK);
    }

    @DeleteMapping("/deletetodo/{id}")
    public ResponseEntity<String> deleteToDo(@PathVariable("id") Long userId){
        toDoService.deleteToDo(userId);
        return ResponseEntity.ok("Deleted succesfully");
    }




}
