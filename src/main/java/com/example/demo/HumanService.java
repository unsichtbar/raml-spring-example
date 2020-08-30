package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Human;

import org.springframework.stereotype.Component;

@Component
public class HumanService {

    private List<Human> humans = new ArrayList<>();

    public List<Human> getAllHumans(){
        return humans;
    }
    
    public Human save(Human h) {
        this.humans.add(h);
        return h;
    }
}