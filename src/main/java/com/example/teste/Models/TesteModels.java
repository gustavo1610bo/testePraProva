package com.example.teste.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_teste")
public class TesteModels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Nome")
    private String nome;
    @Column(name = "Endereco")
    private String endereco;
    @Column(name = "NumeroCasa")
    private int numeroCasa;

    public TesteModels() {
    }

    public TesteModels(String nome, String endereco, int numeroCasa) {
        this.nome = nome;
        this.endereco = endereco;
        this.numeroCasa = numeroCasa;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }
}
