package com.practise.ToDo.repo;

import com.practise.ToDo.model.TaskModel;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class TaskRepo {

    List<TaskModel> tasks=new ArrayList<>(Arrays.asList(
        new TaskModel(1,"Study React 1 hour",false),

        new TaskModel(2,"Learn Spring Boot",false)

    ));

    public List<TaskModel> getAllTasks() {
        return tasks;
    }

    public List<TaskModel> getFinishedTasks() {
        List<TaskModel> finished=new ArrayList<>();
        for(TaskModel task:tasks){
            if(task.isStatus()){
                finished.add(task);
            }
        }
        return finished;
    }

    public TaskModel getTaskById(int id) {
        for(TaskModel task:tasks){
            if(task.getId() == id){
                return task;
            }
        }
        return null;
    }

    public void addTask(TaskModel task) {
        tasks.add(task);
        System.out.println("Added job with id :"+task.getId());
    }

    public TaskModel updateTask(int id) {
        for(TaskModel task:tasks){
            if(task.getId() == id){
                if(task.isStatus()){
                    task.setStatus(false);
                    return task;
                }
                else{
                    task.setStatus(true);
                    return task;
                }
            }
        }
        return null;
    }

    public void deleteTask(int id) {
        for(TaskModel task:tasks){
            if(task.getId() == id){
                tasks.remove(task);
            }
        }
    }

    public List<TaskModel> getUnfinishedTasks() {
        List<TaskModel> finished=new ArrayList<>();
        for(TaskModel task:tasks){
            if(!task.isStatus()){
                finished.add(task);
            }
        }
        return finished;
    }
}
