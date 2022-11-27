package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import service.HeroService;

@RestController
public class HeroController {

	@Autowired
	HeroService heroService;
	
	@GetMapping("/hero")
	
}
