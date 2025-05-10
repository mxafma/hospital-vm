package com.hospital_vm.cl.hospital_vm.repository;

import com.hospital_vm.cl.hospital_vm.model.Tipo_usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Tipo_usuarioRepository extends JpaRepository<Tipo_usuario, Integer> {

}
