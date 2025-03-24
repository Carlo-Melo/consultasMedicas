package com.senai.carlos_melo.consultasmedicas.controller;


import com.senai.carlos_melo.consultasmedicas.entity.Consulta;
import com.senai.carlos_melo.consultasmedicas.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/consultas")
public class ConsultaController {

    @Autowired
    private ConsultaService consultaService;

    @PostMapping
    public ResponseEntity<Consulta> create(@RequestBody Consulta obj){
        return ResponseEntity.status(HttpStatus.CREATED).body(consultaService.create(obj));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        consultaService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Consulta> searchById(@PathVariable Long id){
        return ResponseEntity.ok().body(consultaService.searchById(id));
    }

    @GetMapping
    public ResponseEntity<List<Consulta>> getAll() {
        return ResponseEntity.ok().body(consultaService.getAll());
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Consulta> update(@PathVariable Long id, @RequestBody Consulta obj) {
        obj.setId(id);
        return ResponseEntity.ok().body(consultaService.update(obj));
    }
}
