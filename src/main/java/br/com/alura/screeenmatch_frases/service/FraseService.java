package br.com.alura.screeenmatch_frases.service;

import br.com.alura.screeenmatch_frases.dto.FraseDTO;
import br.com.alura.screeenmatch_frases.principal.Frases;
import br.com.alura.screeenmatch_frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repository;

    public FraseDTO obterFrases(){
        Frases frases = repository.buscaFraseAleatoria();
        return new FraseDTO(frases.getTitulo(), frases.getFrase(), frases.getPersonagem(), frases.getPoster());
    }
}
