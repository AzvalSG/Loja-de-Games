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
	
//	@NotBlank(message = "Esse é um campo obrigatório!")
	@Size(min = 5, max = 255, message = "Limite de caracteres 255")
	private String nomeprod;

//	@NotBlank(message = "Esse é um campo obrigatório!")
	@Size(min = 5, max = 255, message = "Limite de caracteres 255")
	private String descricaoprod;

	
//	@NotBlank(message = "Esse é um campo obrigatório!")
	private int quantidadeprod;
	
//	@NotBlank(message = "Esse é um campo obrigatório!")
	private int precoprod;
	
//	@NotBlank(message = "Esse é um campo obrigatório!")
	private String validadeprod;
	
	@ManyToOne
	@JsonIgnoreProperties("Produto")
	private Categoria categorias;

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
		return categorias;
	}

	public void setCategorias(Categoria categorias) {
		this.categorias = categorias;
	}
	

}
