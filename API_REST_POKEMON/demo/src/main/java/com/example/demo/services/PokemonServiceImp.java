package com.example.demo.services;

import com.example.demo.mapper.PokemonMapper;
import com.example.demo.model.Pokemon;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PokemonServiceImp implements PokemonService {

    private final PokemonMapper mapper;



    @Override
    public List<Pokemon> findAll() {
        return mapper.findAll();
    }

    @Override
    public Pokemon findById(int id) {
        return mapper.findById(id);
    }

    @Override
    public int insert(Pokemon pokemon) {
        return mapper.insert(pokemon);
    }

    @Override
    public int delete(int id) {
        return mapper.deleteById(id);
    }
}
