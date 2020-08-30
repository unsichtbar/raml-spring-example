package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.GetObjectResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class DrinkControllerImpl implements DrinkController {

    @Override
    public ResponseEntity<List<GetObjectResponse>> getGetObjectResponses() {
        // TODO Auto-generated method stub
        var list = new ArrayList<GetObjectResponse>();
        var e = new GetObjectResponse();
        e.setName("alex");
        e.setType("super type");
        list.add(e);
        return ResponseEntity.ok(list);
    }


}