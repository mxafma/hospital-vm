package com.hospital_vm.cl.hospital_vm.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Table(name = "medico")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "run_medico", length = 10, unique = true, nullable = false)
    private String runMedico;

    @Column(name = "nombre_completo", length = 100, nullable = false)
    private String nombreCompleto;

    @Column(length = 100, nullable = false)
    private String especialidad;

    @Column(name = "jefe_turno", length = 1)
    private String jefeTurno;

    /*** One-to-Many con Atencion ***/
    @OneToMany(mappedBy = "medico", fetch = FetchType.LAZY)
    private List<Atencion> atenciones;
}
