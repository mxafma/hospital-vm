package com.hospital_vm.cl.hospital_vm.service;

import com.hospital_vm.cl.hospital_vm.model.Atencion;
import com.hospital_vm.cl.hospital_vm.repository.AtencionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AtencionService {

    @Autowired
    private AtencionRepository atencionRepository;

    public List<Atencion> obtenerAtencionesPorPaciente(Integer pacienteId) {
        return atencionRepository.findByPacienteId(pacienteId);
    }

    public Atencion save(Atencion atencion) {
        return atencionRepository.save(atencion);
    }

    public List<Atencion> findAll() {
        return atencionRepository.findAll();
    }
}