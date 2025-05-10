package com.hospital_vm.cl.hospital_vm.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Table(name = "tipo_usuario")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tipo_usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 40, nullable = false)
    private String nombre;

    /*** Inversa de Paciente ⇄ TipoUsuario ***/
    @OneToMany(mappedBy = "tipoUsuario", fetch = FetchType.LAZY)
    private List<Paciente> pacientes;
}
