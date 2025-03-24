package com.senai.carlos_melo.consultasmedicas.entity;


import com.sun.jdi.StringReference;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_pacientes")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private long id;

    private String nome;

    private double cpf;

    private String dataNacimento;

    private String telefone;

    public Paciente() {
    }

    public Paciente(long id, String nome, double cpf, String dataNacimento, String telefone) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNacimento = dataNacimento;
        this.telefone = telefone;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    public String getDataNacimento() {
        return dataNacimento;
    }

    public void setDataNacimento(String dataNacimento) {
        this.dataNacimento = dataNacimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
