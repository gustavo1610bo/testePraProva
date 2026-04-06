package com.example.teste.Controller;

import com.example.teste.Models.TesteModels;
import com.example.teste.Service.TesteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/teste")
public class TesteController {
    @Autowired
    private TesteService testeService;

    @PostMapping
    private ResponseEntity<TesteModels> add(@RequestBody TesteModels testeModels){
        TesteModels teste = testeService.adicionar(testeModels);

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(teste.getId())
                .toUri();
        return ResponseEntity.created(uri).body(teste);
    }

    @GetMapping
    private ResponseEntity<List<TesteModels>>buscaTudo(){
        List<TesteModels> request = testeService.buscaTudo();
        return ResponseEntity.ok(request);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TesteModels> buscaPorId(@PathVariable Long id){
        TesteModels buscaPorId = testeService.buscaPorId(id);
        return ResponseEntity.ok(buscaPorId);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TesteModels> atualizar(@PathVariable Long id, @RequestBody TesteModels testeModels){
        TesteModels atualizado = testeService.atualizar(id,testeModels);
        return ResponseEntity.ok(atualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<TesteModels> deletar(@PathVariable Long id){
        testeService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
