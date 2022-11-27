package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Hero;

public interface IHero extends JpaRepository<Hero, Long>{
	
	List<Hero> findByNameContain(String contain);

}
