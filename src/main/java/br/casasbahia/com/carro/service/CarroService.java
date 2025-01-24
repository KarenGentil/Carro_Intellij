package br.casasbahia.com.carro.service;


import br.casasbahia.com.carro.model.Carro;
import br.casasbahia.com.carro.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class CarroService {

    private final Logger log = Logger.getLogger(this.getClass().getName());

    @Autowired
    CarroRepository carroRepository;

    public List<Carro> findAll() {
        log.info("Pesquisando carros cadastrados");
        return carroRepository.findAll();
    }

}
