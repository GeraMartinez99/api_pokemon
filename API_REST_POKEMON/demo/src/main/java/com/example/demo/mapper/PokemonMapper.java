package com.example.demo.mapper;

import com.example.demo.model.Pokemon;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PokemonMapper {
    @Select("SELECT * FROM pokemon")
    List<Pokemon> findAll();

    @Select("SELECT * FROM pokemon WHERE ic = #{id}")
    Pokemon findById(@Param("id") int id);

    @Delete("DELETE FROM pokemon WHERE id = #{id}")
    int deleteById(@Param("id") int id);

    @Insert("INSERT INTO pokemon(id, nombre, estatus, edad ) VALUES (#{id}, #{nombre}, #{estatus}, #{edad}) ")
    int insert(Pokemon pokemon);

    //@Update("UPDATE FROM poke")
}
