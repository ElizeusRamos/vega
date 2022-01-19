package com.vega.swaggercodegen.controller;

import com.vegas.swaggercodegen.controller.DefaultApi;
import com.vegas.swaggercodegen.controller.PokemonApi;
import com.vegas.swaggercodegen.model.PokemonDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController implements PokemonApi, DefaultApi {

    @Override
    public ResponseEntity<PokemonDto> findAllPokemons() {
        return null;
    }

    @Override
    public ResponseEntity<PokemonDto> findPokemonById(Long id) {

        return null;
    }

    @Override
    public ResponseEntity<String> rootGet() {
        var msg = "API Rest - Vega - Api a partir de especificação Swagger - Consumo da API externa PokeApi";
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }
}
