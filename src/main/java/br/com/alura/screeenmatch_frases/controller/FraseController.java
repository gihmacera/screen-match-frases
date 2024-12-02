package br.com.alura.screeenmatch_frases.controller;

import br.com.alura.screeenmatch_frases.dto.FraseDTO;
import br.com.alura.screeenmatch_frases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {

    @Autowired
    private FraseService service;

    @GetMapping("/series/frases")
    public FraseDTO obterFrases() {
        return service.obterFrases();

    }
}
