package com.hospital_vm.cl.hospital_vm.service;

import com.hospital_vm.cl.hospital_vm.model.Ficha_paciente;
import com.hospital_vm.cl.hospital_vm.model.Paciente;
import com.hospital_vm.cl.hospital_vm.repository.Ficha_pacienteRepository;
import com.hospital_vm.cl.hospital_vm.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FichaPacienteService {

    @Autowired
    private Ficha_pacienteRepository fichaPacienteRepository;

    @Autowired
    private PacienteRepository pacienteRepository;

    public Ficha_paciente save(Ficha_paciente ficha) {
        // Recupera el paciente gestionado por JPA
        Paciente paciente = pacienteRepository.findById(ficha.getPaciente().getId())
            .orElseThrow(() -> new RuntimeException("Paciente no encontrado"));
        ficha.setPaciente(paciente);
        return fichaPacienteRepository.save(ficha);
    }
}