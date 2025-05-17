package com.hospital_vm.cl.hospital_vm.controller;

import com.hospital_vm.cl.hospital_vm.model.Atencion;
import com.hospital_vm.cl.hospital_vm.service.AtencionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/atenciones")
public class AtencionController {

    @Autowired
    private AtencionService atencionService;

    @GetMapping("/paciente/{pacienteId}")
    public List<Atencion> getAtencionesPorPaciente(@PathVariable Integer pacienteId) {
        return atencionService.obtenerAtencionesPorPaciente(pacienteId);
    }

    @PostMapping
    public Atencion crearAtencion(@RequestBody Atencion atencion) {
        return atencionService.save(atencion);
    }

    @GetMapping
    public List<Atencion> getAllAtenciones() {
        return atencionService.findAll();
    }
}