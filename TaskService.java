package com.example.TodoApp.Todo.Application.services;

import com.example.TodoApp.Todo.Application.entity.TaskEntity;
import com.example.TodoApp.Todo.Application.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    public final TaskRepository taskRepository;
    public TaskService(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }
    public List<TaskEntity> getAllTasks(){
        return taskRepository.findAll();
    }
    public void addTask(TaskEntity taskEntity){
        taskRepository.save(taskEntity);
    }
    public void deleteTaskById(Long id){
         taskRepository.deleteById(id);
    }
    public void deleteAllTasks(){
        taskRepository.deleteAll();
    }
    public void toggleTask(Long id){
        Optional<TaskEntity> taskOpt = taskRepository.findById(id);
        taskOpt.ifPresent(task ->{
            task.setCompleted(!task.isCompleted());
            taskRepository.save(task);
        });

    }
}
