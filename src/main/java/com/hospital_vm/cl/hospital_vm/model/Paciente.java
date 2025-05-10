package com.hospital_vm.cl.hospital_vm.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "paciente")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique=true , length = 13, nullable=false)
    private String run;

    @Column(nullable=true)
    private String nombres;

    @Column(nullable = false)
    private String apellidos;

    @Column(nullable = true)
    private Date fechaNacimiento;

    @Column(nullable = false)
    private String correo;

    /*** Relaciones ***/
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipo", nullable = false)
    private Tipo_usuario tipoUsuario;

    @OneToOne(mappedBy = "paciente", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Ficha_paciente fichaPaciente;

    @OneToMany(mappedBy = "paciente", fetch = FetchType.LAZY)

    private List<Atencion> atenciones;

}
