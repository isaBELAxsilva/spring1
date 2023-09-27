package com.senai.IsabelaMarques.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.IsabelaMarques.Servico.Clienteservices;
import com.senai.IsabelaMarques.entities.clientes;

@RestController
@RequestMapping("/clientes")
public class ClienteControler {
	private final Clienteservices services;
	
	@Autowired
	public ClienteControler (Clienteservices services) {
		this.services = services;
	}
	
	@PostMapping
	public clientes createclientes (@RequestBody clientes Cliente ) {
		return services.saveclientes(Cliente);
	}
	
	@GetMapping("/{id}")
	public clientes getclientes (@PathVariable Long id) {
		return services.getclientesById(id);
	}
	
	@GetMapping
	public List<clientes> getAllclientes () {
		return services.getAllcliente();
	}
	
	@DeleteMapping("/{id}")
	public void deleteclientes (@PathVariable Long id) {
		services.deleteclientes(id);
	}
	

}
