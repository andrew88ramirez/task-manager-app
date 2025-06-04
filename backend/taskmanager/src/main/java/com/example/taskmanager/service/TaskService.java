package com.example.taskmanager.service;

import com.example.taskmanager.model.Task;
import com.example.taskmanager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    
    @Autowired
    private TaskRepository repo;

    public List<Task> getAll() {
        return repo.findAll();
    }

    public Task create(Task task) {
        return repo.save(task);
    }

    public Task update(Long id, Task task) {
        task.setId(id);
        return repo.save(task);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
