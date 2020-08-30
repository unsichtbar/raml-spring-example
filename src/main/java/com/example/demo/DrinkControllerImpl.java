package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Drink;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class DrinkControllerImpl implements DrinkController {

    @Override
    public ResponseEntity<List<Drink>> getDrinks() {
        // TODO Auto-generated method stub
        return ResponseEntity.ok(new ArrayList<>());
    }

}