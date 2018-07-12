package com.quejboard.app.controllers;

import com.quejboard.app.model.Swiezak;
import com.quejboard.app.repository.SwiezakRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("api/swiezaks")
public class SwiezakController {

    @Autowired
    SwiezakRepository repository;


    @GetMapping
    public List<Swiezak> find() {
        List<Swiezak> allWords = repository.findByNameLastLetters("ak");
        return allWords;
        // allWords.forEach(System.out::println);
    }

    @GetMapping("/{id}")
    public Swiezak get(@PathVariable("id") int id) {
        return repository.findById(id);
    }

    @GetMapping("/random")
    public String getRandomSwiezak() {
        List<Swiezak> swiezaks = repository.findByNameLastLetters("ak");
        Random r = new Random();
        int randomInt = r.nextInt(swiezaks.size());
        String randomSwiezak = swiezaks.get(randomInt).getSwiezakNaDzis();
        return randomSwiezak;
    }
}





