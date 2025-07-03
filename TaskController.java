package com.example.TodoApp.Todo.Application.controller;

import com.example.TodoApp.Todo.Application.entity.TaskEntity;
import com.example.TodoApp.Todo.Application.services.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TaskController {
    private final TaskService service;

    public TaskController(TaskService service){
        this.service = service;
    }
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("tasks",service.getAllTasks());
        model.addAttribute("newTask", new TaskEntity());
        return "index";
    }
    @PostMapping("/add")
    public String addTask(@ModelAttribute TaskEntity newTask){
        service.addTask(newTask);
        return "redirect:/";
    }
    @PostMapping("/delete/{id}")
    public String deleteTask(@PathVariable Long id){
        service.deleteTaskById(id);
        return "redirect:/";
    }
    @GetMapping("/toggle/{id}")
    public String toggleTask(@PathVariable Long id){
        service.toggleTask(id);
        return "redirect:/";
    }
    @GetMapping("/deleteAll")
    public String deleteAllTasks(){
        service.deleteAllTasks();
        return "redirect:/";
    }
}
