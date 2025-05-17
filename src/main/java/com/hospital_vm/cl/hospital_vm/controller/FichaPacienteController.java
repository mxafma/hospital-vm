package com.hospital_vm.cl.hospital_vm.controller;

import com.hospital_vm.cl.hospital_vm.model.Ficha_paciente;
import com.hospital_vm.cl.hospital_vm.service.FichaPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/fichas")
public class FichaPacienteController {

    @Autowired
    private FichaPacienteService fichaPacienteService;

    @PostMapping
    public Ficha_paciente crearFicha(@RequestBody Ficha_paciente ficha) {
        return fichaPacienteService.save(ficha);
    }
}