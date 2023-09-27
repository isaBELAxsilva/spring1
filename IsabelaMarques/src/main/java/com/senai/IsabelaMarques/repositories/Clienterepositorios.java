package com.senai.IsabelaMarques.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.IsabelaMarques.entities.clientes;

public interface Clienterepositorios extends JpaRepository<clientes, Long> {
	
}
