package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import entity.Hero;
import repository.IHero;

public class HeroService {

	@Autowired
	IHero heroRepository;
	
	public List<Hero> getAll() {
		var Heroes = new ArrayList<Hero>();
		heroRepository.findAll().forEach(hero -> Heroes.add(hero));
		return Heroes;
	}
	
	public Hero getById(Long id) {
		return heroRepository.findById(id).get();
	}
	
	public void save(Hero hero) {
		heroRepository.save(hero);
	}
	
	public void delete(Long id) {
		heroRepository.deleteById(id);
	}
	
	
}
