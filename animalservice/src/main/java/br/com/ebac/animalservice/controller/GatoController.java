package br.com.ebac.animalservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ebac.animalservice.entities.Gato;
import br.com.ebac.animalservice.repositories.GatoRepository;

@RestController
@RequestMapping("/gato")
public class GatoController { 
	
	private GatoRepository repository;
	
	public GatoController(GatoRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping
	private List<Gato> findAll() {
		return repository.findAll();
	}
	
	@PostMapping
	private Gato create(@RequestBody Gato gato) {
		return repository.save(gato);
		
	}
	
	@GetMapping("/nao-adotados")
	private List <Gato> findNotAdopted() {
		return repository.findNotAdopted(); 
	}
	 
	@GetMapping("/adotados")
	private List <Gato> findAdopted() { 
		return repository.Adopted(); 
	}
	
	@GetMapping("/recebedores")
	private List <Gato> findVet() {
		return repository.findVet(); 
	}
}
