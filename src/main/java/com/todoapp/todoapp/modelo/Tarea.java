package com.todoapp.todoapp.modelo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Tarea {

    private Long id;
    private String description;
    private boolean completed;
    
}
