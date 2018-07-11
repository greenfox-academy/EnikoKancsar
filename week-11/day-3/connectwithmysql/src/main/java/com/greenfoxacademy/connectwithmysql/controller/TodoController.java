package com.greenfoxacademy.connectwithmysql.controller;

import com.greenfoxacademy.connectwithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {

    @Autowired
    TodoRepository todoRepository;

    @GetMapping({"", "/list"})
    public String list(@RequestParam(required = false) Boolean isActive, Model model) {
        model.addAttribute("todos", todoRepository.findAll());
        model.addAttribute("isActive", isActive);
        return "todolist";
    }
}