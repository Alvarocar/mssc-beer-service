package dev.alvarocar.msscbeerservice.business.controller;

import dev.alvarocar.msscbeerservice.model.dto.Beer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("api/v1/beer")
@RestController
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<Beer> getBeerById(@PathVariable UUID beerId){
        //todo impl
        return new ResponseEntity<>(Beer.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody Beer beer){
        //todo impl
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping()
    public ResponseEntity updateBeerById(@RequestBody Beer beer){
        //todo impl
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
