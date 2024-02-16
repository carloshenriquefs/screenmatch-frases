package br.com.alura.screenmatch.frases.repository;

import br.com.alura.screenmatch.frases.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FraseRepository extends JpaRepository<Frase, Long> {
}
