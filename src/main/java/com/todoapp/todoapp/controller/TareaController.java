package com.todoapp.todoapp.controller;

import org.springframework.web.bind.annotation.RestController;

import com.todoapp.todoapp.modelo.Tarea;
import com.todoapp.todoapp.repository.TareaRepository;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/todoapp")
@RequiredArgsConstructor
public class TareaController {

    private final TareaRepository repo;

    @GetMapping("/status")
    public ResponseEntity<String> getStatus() {
        return ResponseEntity.ok().body("El ms ToDoApp está operativo 👍");
    }

    @PostMapping()
    public ResponseEntity<Tarea> agregarTarea(@RequestBody Tarea tarea) {
        
        repo.save(tarea);
        return ResponseEntity.status(201).body(tarea);
    }

    @GetMapping()
    public ResponseEntity<List<Tarea>> obtenerTodas() {

        List<Tarea> tareas = repo.findAll();

        return ResponseEntity.ok().body(tareas);

    }
    
    
}
