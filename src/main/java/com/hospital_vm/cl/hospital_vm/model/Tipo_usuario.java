package com.hospital_vm.cl.hospital_vm.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tipo_usuario")
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Tipo_usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 40, nullable = false)
    private String nombre;

    /*** Inversa de Paciente ⇄ TipoUsuario ***/
    @OneToMany(mappedBy = "tipoUsuario", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Paciente> pacientes;
}
