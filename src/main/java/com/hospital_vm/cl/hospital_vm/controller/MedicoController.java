package com.hospital_vm.cl.hospital_vm.controller;

import com.hospital_vm.cl.hospital_vm.model.Medico;
import com.hospital_vm.cl.hospital_vm.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;

    @PostMapping
    public Medico crearMedico(@RequestBody Medico medico) {
        return medicoRepository.save(medico);
    }
}