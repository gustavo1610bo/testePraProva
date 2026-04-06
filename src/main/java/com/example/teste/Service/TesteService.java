package com.example.teste.Service;

import com.example.teste.Models.TesteModels;
import com.example.teste.Repository.TesteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TesteService {

    @Autowired
    private TesteRepository testeRepository;

    public TesteModels adicionar(TesteModels testeModels){
        return testeRepository.save(testeModels);
    }

    public List<TesteModels>buscaTudo(){
        return testeRepository.findAll();
    }

    public TesteModels buscaPorId(Long id){
        return testeRepository.findById(id).orElse(null);
    }

    public void deletar(Long id){
        testeRepository.deleteById(id);
    }

    public TesteModels atualizar(Long id,TesteModels testeModels){
        TesteModels testeAtualizado = testeRepository.findById(id).orElse(null);
        testeAtualizado.setNome(testeModels.getNome());
        testeAtualizado.setEndereco(testeModels.getEndereco());
        testeAtualizado.setNumeroCasa(testeModels.getNumeroCasa());
        return testeRepository.save(testeAtualizado);
    }


}
