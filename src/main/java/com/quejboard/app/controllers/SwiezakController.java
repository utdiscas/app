package com.quejboard.app.controllers;

import com.quejboard.app.model.Swiezak;
import com.quejboard.app.repository.SwiezakRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

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


    public void schedulingDailySwiezakLottery() {
        //final String swiezak;
        TimerTask repeatedTask = new TimerTask() {
            public void run() {
                String swiezak = getRandomSwiezak();
                // System.out.println("Task performed on " + new Date());
            }
        };

        Timer timer = new Timer("Timer");
//TODO: change for daily interval
        long delay = 1000L; //1000L;
        long period = 1000L * 15L; // 1000L * 60L * 60L * 24L;
        timer.scheduleAtFixedRate(repeatedTask, delay, period);
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





