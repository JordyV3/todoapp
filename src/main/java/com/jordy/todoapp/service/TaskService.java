package com.jordy.todoapp.service;

import com.jordy.todoapp.mapper.TaskInDtoToTask;
import com.jordy.todoapp.persistence.entity.Task;
import com.jordy.todoapp.persistence.repository.TaskRepository;
import com.jordy.todoapp.service.dto.TaskInDto;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    private final TaskRepository repository;
    private final TaskInDtoToTask mapper;

    public TaskService(TaskRepository repository, TaskInDtoToTask mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public Task createTask(TaskInDto taskInDto){
        Task task = mapper.map(taskInDto);
        return this.repository.save(task);
    }
}
