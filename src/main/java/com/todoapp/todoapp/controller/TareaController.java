package com.todoapp.todoapp.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/todoapp")
public class TareaController {

    @GetMapping("/status")
    public String getStatus() {
        return "El ms ToDoApp está operativo 👍";
    }
    
}
