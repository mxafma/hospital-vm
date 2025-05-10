package com.hospital_vm.cl.hospital_vm.controller;

import com.hospital_vm.cl.hospital_vm.model.Paciente;
import com.hospital_vm.cl.hospital_vm.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/v1/pacientes")

public class PacienteController {
    @Autowired
    private PacienteService pacienteService;

    @GetMapping
    public ResponseEntity<List<Paciente>> listar () {
        List<Paciente> pacientes = pacienteService.findAll();
        if (pacientes.isEmpty()){
            return ResponseEntity.noContent().build();

        }
        return ResponseEntity.ok(pacientes);

    }
    
    @PostMapping
    public ResponseEntity<Paciente> guardar(@RequestBody Paciente paciente) {
        
        Paciente productoMuevo = pacienteService.save(paciente);
        return ResponseEntity.status(HttpStatus.CREATED).body(productoMuevo);

    }

    @GetMapping("/{id}")
    public ResponseEntity<Paciente> buscar(@PathVariable Integer id) {

        try{
            Paciente paciente = pacienteService.findById(id);
            return ResponseEntity.ok(paciente);
        }catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Paciente> actualizar(@PathVariable Integer id, @RequestBody Paciente paciente){

        try{
            Paciente pac = pacienteService.findById(id);
            pac.setId(id);
            pac.setRun(paciente.getRun());
            pac.setNombres(paciente.getNombres());
            pac.setApellidos(paciente.getApellidos());
            pac.setFechaNacimiento(paciente.getFechaNacimiento());
            pac.setCorreo(paciente.getCorreo());
            pacienteService.save(pac);
            return ResponseEntity.ok(paciente);
        } catch (Exception e){
            return ResponseEntity.notFound().build();
        }
        

    }
    
    
    @DeleteMapping("{id}")
    public ResponseEntity<?> eliminar (@PathVariable Long id){
        try{
            pacienteService.delete(id);
            return ResponseEntity.noContent().build();

        }catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    }
}
