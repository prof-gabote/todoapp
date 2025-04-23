package com.todoapp.todoapp.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.todoapp.todoapp.modelo.Tarea;

@Repository
public class TareaRepository {

    private final List<Tarea> tareas = new ArrayList<>();
    private Long nextId = 1L;

    public List<Tarea> findAll() {
        return tareas;
    }

    public Tarea save (Tarea tarea) {
        tarea.setId(nextId++);
        tareas.add(tarea);
        return tarea;
    }

}
