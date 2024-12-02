package br.com.alura.screeenmatch_frases.repository;

import br.com.alura.screeenmatch_frases.principal.Frases;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FraseRepository extends JpaRepository<Frases, Long> {
    @Query("SELECT f FROM Frases f order by function('RANDOM') LIMIT 1")
    Frases buscaFraseAleatoria();
}
