package org.ISC.ISC.Tabelas;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_cestas")
public class Cestas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_cestas;

	@NotNull
	@Size(min = 2, max = 255)
	private String nome;
	
	@NotNull
	@Size(min = 2, max = 255)
	private String sobrenome;
	
	
	private String rg;
	
	@NotNull
	private Date dataNasc;
	
	private String cep; 

	@NotNull
	private String endereco;

	private String complemento;

	private String cidade;
	
	@NotNull
	private String bairro;
	
	private String texto;

	
	
	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public long getId_cestas() {
		return id_cestas;
	}

	public void setId_cestas(long id_cestas) {
		this.id_cestas = id_cestas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	
	
}