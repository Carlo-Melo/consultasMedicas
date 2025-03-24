package com.senai.carlos_melo.consultasmedicas.service;


import com.senai.carlos_melo.consultasmedicas.entity.Medico;
import com.senai.carlos_melo.consultasmedicas.entity.Paciente;
import com.senai.carlos_melo.consultasmedicas.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    public Paciente create(Paciente obj) {
        return pacienteRepository.save(obj);
    }

    public void delete(Long id){
        pacienteRepository.deleteById(id);
    }

    public Paciente searchById(Long id){
        Optional<Paciente> obj = pacienteRepository.findById(id);
        return obj.get();
    }

    public List<Paciente> getAll(){
        return pacienteRepository.findAll();
    }

    public Paciente update(Paciente obj){
        Optional<Paciente> newObj = pacienteRepository.findById(obj.getId());
        return pacienteRepository.save(newObj.get());
    }

    private void updatePaciente(Optional<Paciente> newObj, Paciente obj) {
        newObj.get().setNome(obj.getNome());
    }
}
