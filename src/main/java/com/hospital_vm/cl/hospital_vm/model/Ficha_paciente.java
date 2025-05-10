package com.hospital_vm.cl.hospital_vm.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ficha_paciente")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ficha_paciente {

    @Id
    @Column(name = "id_paciente")
    private Integer id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_paciente")
    private Paciente paciente;

    @Column(name = "datos_personales", length = 100)
    private String datosPersonales1;

    @Column(name = "datos_personales_2", length = 100)
    private String datosPersonales2;

    @Column(name = "datos_personales_3", length = 100)
    private String datosPersonales3;

    @Column(name = "datos_personales_4", length = 100)
    private String datosPersonales4;

    @Column(name = "datos_personales_5", length = 100)
    private String datosPersonales5;
}
