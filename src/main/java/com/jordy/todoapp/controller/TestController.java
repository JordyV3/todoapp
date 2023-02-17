package com.jordy.todoapp.controller;


import com.jordy.todoapp.persistence.entity.Task;
import com.jordy.todoapp.service.TaskService;
import com.jordy.todoapp.service.dto.TaskInDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    private final TaskService taskService;

    public TestController(TaskService taskService) {
        this.taskService = taskService;
    }


    @PostMapping("-task")
    public Task createTask(@RequestBody TaskInDto taskInDto){
        return this.taskService.createTask(taskInDto);
    }

}
