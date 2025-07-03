package com.example.TodoApp.Todo.Application.repository;

import com.example.TodoApp.Todo.Application.entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskEntity, Long> {

}
