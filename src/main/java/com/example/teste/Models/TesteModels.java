package com.example.teste.Models;

import com.example.teste.Enum.TesteEnum;
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
    private TesteEnum tipo;

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

    public TesteEnum getTipo() {
        return tipo;
    }

    public void setTipo(TesteEnum tipo) {
        this.tipo = tipo;
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
