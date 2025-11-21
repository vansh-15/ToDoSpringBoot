package com.practise.ToDo.service;

import com.practise.ToDo.model.TaskModel;
import com.practise.ToDo.repo.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepo repo;

    public List<TaskModel> getAllTasks() {
        return repo.getAllTasks();
    }

    public List<TaskModel> getFinishedTasks() {
        return repo.getFinishedTasks();
    }

    public TaskModel getTaskById(int id) {
        return repo.getTaskById(id);
    }

    public void addTask(TaskModel task) {
        repo.addTask(task);
    }

    public TaskModel updateTask(int id) {
        return repo.updateTask(id);
    }

    public void deleteTask(int id) {
        repo.deleteTask(id);
    }

    public List<TaskModel> getUnfinishedTasks() {
        return repo.getUnfinishedTasks();
    }
}
