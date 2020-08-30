package com.example.demo;

import java.util.List;

import javax.validation.Valid;

import com.example.demo.model.Human;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class HumanControllerImpl implements HumanController {

    private HumanService humansService;

    @Override
    public ResponseEntity<List<Human>> getHumans() {
        return ResponseEntity.ok(this.humansService.getAllHumans());
    }

    @Override
    public ResponseEntity<Human> createHuman(@Valid Human human) {
        var saved = this.humansService.save(human);
        return ResponseEntity.ok(saved);
    }
    
}