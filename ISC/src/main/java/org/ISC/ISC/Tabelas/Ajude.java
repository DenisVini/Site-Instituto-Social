package org.ISC.ISC.Tabelas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_ajude")
public class Ajude {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_ajude;
	
	private String nome;
	
	private long telefone;
	
	private String email;
	
	private String texto;

	
	
	
	public long getId_ajude() {
		return id_ajude;
	}

	public void setId_ajude(long id_ajude) {
		this.id_ajude = id_ajude;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
	

}
