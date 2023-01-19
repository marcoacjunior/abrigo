package br.com.ebac.animalservice.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.ebac.animalservice.entities.Cachorro;

public interface CachorroRepository extends JpaRepository<Cachorro, Long> {

	@Query("SELECT c FROM Cachorro c WHERE c.dataAdocao IS NULL ORDER BY c.dataEntrada")
	List<Cachorro> findNotAdopted();

	@Query("SELECT c FROM Cachorro c WHERE c.dataAdocao IS NOT NULL")
	List<Cachorro> Adopted();

}
