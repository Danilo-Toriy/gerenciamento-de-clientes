package com.example.danilo.controller;

import com.example.danilo.entity.Cliente;
import com.example.danilo.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ResponseEntity<Cliente> save(@RequestBody Cliente novoCliente){
        Cliente cliente = clienteService.save(novoCliente);
        return ResponseEntity.status(201).build();
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> findAll(){
        List<Cliente> clienteList = clienteService.findAll();
        return clienteList.isEmpty()
                ? ResponseEntity.noContent().build()
                : ResponseEntity.ok().body(clienteList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> findById(@PathVariable Long id){
        Optional<Cliente> clienteAchado = clienteService.findById(id);
        return clienteAchado.isPresent()
                ? ResponseEntity.ok().body(clienteAchado.get())
                : ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> update(@PathVariable Long id, @RequestBody Cliente clienteAtualizado){
        Cliente cliente = clienteService.update(id, clienteAtualizado);
        return ResponseEntity.ok(cliente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id){
        clienteService.deleteById(id);
        return ResponseEntity.status(204).build();
    }
}
