package com.senai.IsabelaMarques.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class clientes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcCliente;

	@Column(name = "nome clientes")
	private String nCliente;

	@Column(name = "telefone")
	private String fone;

	public Long getId() {
		return idcCliente;
	}

	public void setId(Long id) {
		this.idcCliente = id;
	}

	public String getName() {
		return nCliente;
	}

	public void setName(String nCliente) {
		this.nCliente = nCliente;
	}

	public String getfone() {
		return fone;
	}

	public void setfone(String fone) {
		this.fone = fone;
	}

}
