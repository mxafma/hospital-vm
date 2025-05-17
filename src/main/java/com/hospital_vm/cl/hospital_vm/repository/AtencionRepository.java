package com.hospital_vm.cl.hospital_vm.repository;

import com.hospital_vm.cl.hospital_vm.model.Atencion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AtencionRepository extends JpaRepository<Atencion, Integer> {
    List<Atencion> findByPacienteId(Integer pacienteId);


}
