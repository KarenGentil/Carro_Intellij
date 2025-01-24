package br.casasbahia.com.carro.controller;

import br.casasbahia.com.carro.model.Carro;
import br.casasbahia.com.carro.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "carro")
public class CarroController {

    @Autowired
    CarroService carroService;

    @GetMapping
    public List<Carro> findAll(){
        return carroService.findAll();
    }

}
