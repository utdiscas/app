package com.quejboard.app.controllers;

import com.quejboard.app.model.Swiezak;
import com.quejboard.app.repository.SwiezakRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/swiezaks")
public class SwiezakController {

    @Autowired
    SwiezakRepository repository;


    @GetMapping
    public List<Swiezak> find(){
        List<Swiezak> allSwiezaks =repository.findByNameLastLetters("ak");
        return  allSwiezaks;
       // allSwiezaks.forEach(System.out::println);
    }

    @GetMapping("/{id}")
    public Swiezak get(@PathVariable("id") int id){
        return repository.findById(id);
    }
}





