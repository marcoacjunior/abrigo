package br.com.ebac.animalservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ebac.animalservice.entities.Cachorro;
import br.com.ebac.animalservice.repositories.CachorroRepository;

@RestController
@RequestMapping("/cachorro")
public class CachorroController { 
	
	private CachorroRepository repository;
	
	public CachorroController(CachorroRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping
	private List<Cachorro> findAll() {
		return repository.findAll();
	}
	
	@PostMapping
	private Cachorro create(@RequestBody Cachorro cachorro) {
		return repository.save(cachorro);
		
	}
	
	@GetMapping("/nao-adotados")
	private List <Cachorro> findNotAdopted() {
		return repository.findNotAdopted(); 
	}
	 
	@GetMapping("/adotados")
	private List <Cachorro> findAdopted() { 
		return repository.Adopted(); 
	}
}
