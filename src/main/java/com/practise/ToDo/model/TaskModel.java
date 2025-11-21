package com.practise.ToDo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class TaskModel {

    private int id;
    private String text;
    private boolean status;

}
