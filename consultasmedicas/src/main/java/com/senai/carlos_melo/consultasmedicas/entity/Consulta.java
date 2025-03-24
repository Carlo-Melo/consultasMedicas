package com.senai.carlos_melo.consultasmedicas.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "tb_consultas")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private long id;

    private String data;

    private String horario;

    private String medico;

    private String paciente;

    public Consulta() {
    }

    public Consulta(long id, String data, String horario, String medico, String paciente) {
        this.id = id;
        this.data = data;
        this.horario = horario;
        this.medico = medico;
        this.paciente = paciente;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }
}
