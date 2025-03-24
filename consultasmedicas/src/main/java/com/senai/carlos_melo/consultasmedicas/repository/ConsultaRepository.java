package com.senai.carlos_melo.consultasmedicas.repository;

import com.senai.carlos_melo.consultasmedicas.entity.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta,Long> {
}
