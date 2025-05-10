package com.hospital_vm.cl.hospital_vm.repository;

import com.hospital_vm.cl.hospital_vm.model.Atencion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtencionRepository extends JpaRepository<Atencion, Integer> {
    // Ejemplo de query nativa:
    // @Query("SELECT a FROM Atencion a WHERE a.paciente.id = :pacienteId")
    // List<Atencion> findByPacienteId(@Param("pacienteId") Integer pacienteId);
}
