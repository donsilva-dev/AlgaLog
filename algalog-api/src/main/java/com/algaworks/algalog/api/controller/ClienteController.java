package com.algaworks.algalog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		
		Cliente cliente = new Cliente();
		cliente.setId(1L);
		cliente.setNome("Douglas");
		cliente.setEmail("teste@teste.com");
		cliente.setTelefone("3333-3333");
		
		Cliente cliente1 = new Cliente();
		cliente1.setId(2L);
		cliente1.setNome("Nunes");
		cliente1.setEmail("teste1@teste.com");
		cliente1.setTelefone("13333-13333");
		
		return Arrays.asList(cliente, cliente1);
		
	}

}