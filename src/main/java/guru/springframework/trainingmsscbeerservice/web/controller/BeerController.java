package guru.springframework.trainingmsscbeerservice.web.controller;

import java.util.UUID;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import guru.springframework.trainingmsscbeerservice.web.model.BeerDto;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

	@GetMapping("/{beerId}")
	public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId) {
		
		// TODO impl
		return new ResponseEntity<BeerDto> (BeerDto.builder().build(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity createNewBeer(@RequestBody @Validated BeerDto beerDto) {
		
		// TODO impl
		return new ResponseEntity(HttpStatus.CREATED);
	}
	
	@PutMapping("/{beerId}")
	public ResponseEntity updateBeerById(@PathVariable("beerId") UUID beerId, @Validated @RequestBody BeerDto beerDto) {
		
		// TODO impl
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}
}
