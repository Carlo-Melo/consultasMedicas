package com.senai.carlos_melo.consultasmedicas.service;


import com.senai.carlos_melo.consultasmedicas.entity.Consulta;
import com.senai.carlos_melo.consultasmedicas.repository.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsultaService {

    @Autowired
    private ConsultaRepository consultaRepository;

    public Consulta create(Consulta obj){
        return consultaRepository.save(obj);
    }

    public void delete(Long id){
        consultaRepository.deleteById(id);
    }

    public Consulta searchById(Long id){
        Optional<Consulta> obj = consultaRepository.findById(id);
        return obj.get();
    }

    public List<Consulta> getAll(){
        return consultaRepository.findAll();
    }

    public Consulta update(Consulta obj){
        Optional<Consulta> newObj = consultaRepository.findById(obj.getId());
        return consultaRepository.save(newObj.get());
    }

    private void updateConsulta(Optional<Consulta> newObj, Consulta obj) {
        newObj.get().setHorario(obj.getHorario());
    }


}
