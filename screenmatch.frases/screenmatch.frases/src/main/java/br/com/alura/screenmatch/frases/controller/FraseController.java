package br.com.alura.screenmatch.frases.controller;

import br.com.alura.screenmatch.frases.dto.FraseDTO;
import br.com.alura.screenmatch.frases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series")
public class FraseController {

    @Autowired
    private FraseService fraseService;

    @GetMapping("/frases")
    public FraseDTO obterFraseAleatoria() {
        return fraseService.obterFraseAleatoria();
    }
}
