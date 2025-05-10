package com.hospital_vm.cl.hospital_vm.repository;

import com.hospital_vm.cl.hospital_vm.model.Ficha_paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ficha_pacienteRepository extends JpaRepository<Ficha_paciente, Integer> {
    // Por ejemplo:
    // Optional<FichaPaciente> findByPacienteId(Integer pacienteId);
}
