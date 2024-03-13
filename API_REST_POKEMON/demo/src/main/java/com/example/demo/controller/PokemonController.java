package com.example.demo.controller;

import com.example.demo.model.Pokemon;
import com.example.demo.services.PokemonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping ("/pokemon")
public class PokemonController {
    private final PokemonService service;
    @GetMapping
    public List<Pokemon> findAll() {
        return service.findAll();
    }
    @GetMapping("/{id}")
    public Pokemon findById(@PathVariable int id) {
        return service.findById( id );
    }

    @PostMapping
    public int insert(@RequestBody Pokemon pokemon) {
        return service.insert(pokemon);
    }

    @DeleteMapping
    public int delete(@PathVariable("/{id}") int id) {
        return service.delete(id);
    }
}
