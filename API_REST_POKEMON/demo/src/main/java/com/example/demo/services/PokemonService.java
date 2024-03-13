package com.example.demo.services;

import com.example.demo.model.Pokemon;

import java.util.List;

public interface PokemonService {
    List<Pokemon> findAll();
    Pokemon findById(int id);
    int insert(Pokemon pokemon);
    int delete(int id);
}
