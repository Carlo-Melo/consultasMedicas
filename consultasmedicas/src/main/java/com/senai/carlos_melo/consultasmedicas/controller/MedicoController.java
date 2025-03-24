package com.senai.carlos_melo.consultasmedicas.controller;


import com.senai.carlos_melo.consultasmedicas.entity.Medico;
import com.senai.carlos_melo.consultasmedicas.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/medicos")
public class MedicoController {

    @Autowired
    private MedicoService medicoService;

    @PostMapping
    public ResponseEntity<Medico> create(@RequestBody Medico obj){
        return ResponseEntity.status(HttpStatus.CREATED).body(medicoService.create(obj));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        medicoService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Medico> searchById(@PathVariable Long id){
        return ResponseEntity.ok().body(medicoService.searchById(id));
    }

    @GetMapping
    public ResponseEntity<List<Medico>> getAll() {
        return ResponseEntity.ok().body(medicoService.getAll());
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Medico> update(@PathVariable Long id, @RequestBody Medico obj) {
        obj.setId(id);
        return ResponseEntity.ok().body(medicoService.update(obj));
    }
}















