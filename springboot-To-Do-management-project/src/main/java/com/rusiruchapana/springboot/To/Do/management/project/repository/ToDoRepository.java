package com.rusiruchapana.springboot.To.Do.management.project.repository;

import com.rusiruchapana.springboot.To.Do.management.project.entity.ToDoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDoEntity , Long> {
}
