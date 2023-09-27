package com.senai.IsabelaMarques.Servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.IsabelaMarques.entities.clientes;
import com.senai.IsabelaMarques.repositories.Clienterepositorios;

@Service
public class Clienteservices {
	private final Clienterepositorios repositorios;

	@Autowired
	public Clienteservices(Clienterepositorios repositorios) {
		this.repositorios = repositorios;
	}

	public clientes saveclientes(clientes cliente) {
		return repositorios.save(cliente);
	}

	public clientes getclientesById(Long id) {
		return repositorios.findById(id).orElse(null);
	}

	public List<clientes> getAllcliente() {
		return repositorios.findAll();
	}

	public void deleteclientes(Long id) {
		repositorios.deleteById(id);
	}

}
