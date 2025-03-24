package com.senai.carlos_melo.consultasmedicas.repository;


import com.senai.carlos_melo.consultasmedicas.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente,Long> {}
