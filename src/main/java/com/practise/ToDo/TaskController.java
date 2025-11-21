package com.practise.ToDo;

import com.practise.ToDo.model.TaskModel;
import com.practise.ToDo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    TaskService service;

    @GetMapping("tasks")
    public List<TaskModel> getAllTasks(){
        return service.getAllTasks();
    }

    @GetMapping("tasks/finished")
    public List<TaskModel> getFinishedTasks(){
        return service.getFinishedTasks();
    }

    @GetMapping("tasks/unfinished")
    public List<TaskModel> getUnfinishedTasks(){
        return service.getUnfinishedTasks();
    }

    @GetMapping("tasks/{id}")
    public TaskModel getTaskById(@PathVariable int id){
        return service.getTaskById(id);
    }

    @PostMapping("tasks")
    public void addTask(@RequestBody TaskModel task){
        service.addTask(task);
    }

    @PutMapping("tasks/{id}")
    public TaskModel updateTask(@PathVariable int id){
        return service.updateTask(id);
    }

    @DeleteMapping("tasks/{id}")
    public void deleteTask(@PathVariable int id){
        service.deleteTask(id);
    }

}
