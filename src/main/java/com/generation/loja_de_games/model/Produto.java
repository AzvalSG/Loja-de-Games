package com.generation.loja_de_games.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "tb_produto")
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	

	@Size(min = 5, max = 255, message = "Limite de caracteres 255")
	private String nomeprod;


	@Size(min = 5, max = 255, message = "Limite de caracteres 255")
	private String descricaoprod;

	

	private int quantidadeprod;
	

	private int precoprod;
	

	private String validadeprod;
	
	@ManyToOne
	@JsonIgnoreProperties("Produto")
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeprod() {
		return nomeprod;
	}

	public void setNomeprod(String nomeprod) {
		this.nomeprod = nomeprod;
	}

	public String getDescricaoprod() {
		return descricaoprod;
	}

	public void setDescricaoprod(String descricaoprod) {
		this.descricaoprod = descricaoprod;
	}

	public int getQuantidadeprod() {
		return quantidadeprod;
	}

	public void setQuantidadeprod(int quantidadeprod) {
		this.quantidadeprod = quantidadeprod;
	}

	public int getPrecoprod() {
		return precoprod;
	}

	public void setPrecoprod(int precoprod) {
		this.precoprod = precoprod;
	}

	public String getValidadeprod() {
		return validadeprod;
	}

	public void setValidadeprod(String validadeprod) {
		this.validadeprod = validadeprod;
	}

	public Categoria getCategorias() {
		return categoria;
	}

	public void setCategorias(Categoria categoria) {
		this.categoria = categoria;
	}
	

}
