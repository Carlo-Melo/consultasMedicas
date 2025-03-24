package com.senai.carlos_melo.consultasmedicas.service;


import com.senai.carlos_melo.consultasmedicas.entity.Medico;
import com.senai.carlos_melo.consultasmedicas.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicoService {

    @Autowired
    private MedicoRepository medicoRepository;

    public Medico create(Medico obj){
        return medicoRepository.save(obj);
    }

    public void delete(Long id){
        medicoRepository.deleteById(id);
    }

    public Medico searchById(Long id){
        Optional<Medico> obj = medicoRepository.findById(id);
        return obj.get();
    }

    public List<Medico> getAll(){
        return medicoRepository.findAll();
    }

    public Medico update(Medico obj){
        Optional<Medico> newObj = medicoRepository.findById(obj.getId());
        return medicoRepository.save(newObj.get());
    }

    private void updateMedico(Optional<Medico> newObj, Medico obj) {
        newObj.get().setNome(obj.getNome());
    }

}
