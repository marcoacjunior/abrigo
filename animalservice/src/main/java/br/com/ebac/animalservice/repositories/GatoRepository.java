package br.com.ebac.animalservice.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.ebac.animalservice.entities.Gato;

public interface GatoRepository extends JpaRepository<Gato, Long> {

	@Query("SELECT g FROM Gato g WHERE g.dataAdocao IS NULL ORDER BY g.dataEntrada")
	List<Gato> findNotAdopted();

	@Query("SELECT g FROM Gato g WHERE g.dataAdocao IS NOT NULL")
	List<Gato> Adopted();

	@Query("SELECT g FROM Gato g ORDER BY g.nomeRecebedor")
	List<Gato> findVet(); 
}
