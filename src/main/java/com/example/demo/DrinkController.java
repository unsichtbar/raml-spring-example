
package com.example.demo;

import java.util.List;
import com.example.demo.model.GetObjectResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * Provides interaction with 'Drink' resource
 * (Generated with springmvc-raml-parser v.2.0.5)
 * 
 */
@RestController
@Validated
@RequestMapping(value = "/api/drinks", produces = "application/json")
public interface DrinkController {


    /**
     * Retrieves a list of available drinks.
     * 
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<List<GetObjectResponse>> getGetObjectResponses();

}
