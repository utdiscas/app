package com.quejboard.app;

import com.quejboard.app.model.Swiezak;
import com.quejboard.app.repository.SwiezakRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DataLoader {

    @Autowired
    SwiezakRepository repository;

    @PostConstruct
    public  void init() {
        repository.save(new Swiezak("Pazerniak"));
        repository.save(new Swiezak("Biedak"));
        repository.save(new Swiezak("Zwierzak"));
        repository.save(new Swiezak("Przystojniak"));
        repository.save(new Swiezak("Świeżak"));
        repository.save(new Swiezak("Troll"));
        repository.save(new Swiezak("Duza"));
        repository.save(new Swiezak("Quej"));
        repository.save(new Swiezak("Cwaniak"));
        repository.save(new Swiezak("Chlebak"));
        repository.save(new Swiezak("Rybak"));
        repository.save(new Swiezak("Stajniak"));
        repository.save(new Swiezak("Zderzak"));
    }
}
