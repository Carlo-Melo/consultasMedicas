package com.senai.carlos_melo.consultasmedicas.controller;

import com.senai.carlos_melo.consultasmedicas.entity.Paciente;
import com.senai.carlos_melo.consultasmedicas.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/pacientes")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    public ResponseEntity<Paciente> create(@RequestBody Paciente obj){
        return ResponseEntity.status(HttpStatus.CREATED).body(pacienteService.create(obj));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        pacienteService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Paciente> searchById(@PathVariable Long id){
        return ResponseEntity.ok().body(pacienteService.searchById(id));
    }

    @GetMapping
    public ResponseEntity<List<Paciente>> getAll() {
        return ResponseEntity.ok().body(pacienteService.getAll());
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Paciente> update(@PathVariable Long id, @RequestBody Paciente obj) {
        obj.setId(id);
        return ResponseEntity.ok().body(pacienteService.update(obj));
    }
}
