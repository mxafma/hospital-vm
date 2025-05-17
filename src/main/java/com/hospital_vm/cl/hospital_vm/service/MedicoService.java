package com.hospital_vm.cl.hospital_vm.service;

import com.hospital_vm.cl.hospital_vm.model.Medico;
import com.hospital_vm.cl.hospital_vm.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoService {

    @Autowired
    private MedicoRepository medicoRepository;

    public Medico save(Medico medico) {
        return medicoRepository.save(medico);
    }

    public List<Medico> findAll() {
        return medicoRepository.findAll();
    }
}