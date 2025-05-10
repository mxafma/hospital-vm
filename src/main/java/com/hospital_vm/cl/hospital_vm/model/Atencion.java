package com.hospital_vm.cl.hospital_vm.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@Table(name = "atencion")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Atencion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "fecha_atencion", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaAtencion;

    @Column(name = "hora_atencion", nullable = false)
    @Temporal(TemporalType.TIME)
    private Date horaAtencion;

    @Column(nullable = false, precision = 10, scale = 2)
    private Double costo;

    @Column(length = 300)
    private String comentario;

    /*** Many-to-One con Paciente ***/
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_paciente", nullable = false)
    private Paciente paciente;

    /*** Many-to-One con Medico ***/
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_medico", nullable = false)
    private Medico medico;
}
