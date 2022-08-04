package com.zcoders.cliente.controller;

import com.zcoders.cliente.exception.ClienteExistenteException;
import com.zcoders.cliente.exception.ClienteInexistenteException;
import com.zcoders.cliente.model.Cliente;
import com.zcoders.cliente.repository.ClienteRepository;
import com.zcoders.cliente.request.ClienteRequest;
import com.zcoders.cliente.response.ClienteResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ClienteResponse inserir(@RequestBody ClienteRequest request){
        clienteRepository.findByEmail(request.getEmail())
                .ifPresent(f -> {
                    throw new ClienteExistenteException();});

        Cliente cliente = request.toModel();

        clienteRepository.save(cliente);

        return ClienteResponse.build(cliente);
    }

    @GetMapping("/{id}")
    public ClienteResponse consultar(@PathVariable("id") Long id){
        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(ClienteInexistenteException::new);

        return ClienteResponse.build(cliente);
    }

}
