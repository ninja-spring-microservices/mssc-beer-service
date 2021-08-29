package balaji.springframweork.msscbeerservice.web.controller;

import balaji.springframweork.msscbeerservice.web.model.BeerDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/beer")
public class BeerController {

    @GetMapping("{beerId}")
    public ResponseEntity<BeerDTO> getBeerById(@PathVariable("beerId")UUID beerId) {
        // TODO Impl
        return new ResponseEntity<>(BeerDTO.builder()
                .id(beerId)
                .build(),
                HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> saveNewBeer(@RequestBody BeerDTO beerDTO) {
        // TODO Impl
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping("{beerId}")
    public ResponseEntity<Void> updateBeer(@PathVariable("beerId")UUID beerId, @RequestBody BeerDTO beerDTO) {
        // TODO Impl
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
