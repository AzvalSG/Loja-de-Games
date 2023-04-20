package com.generation.loja_de_games.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

//	@NotBlank(message = "Esse é um campo obrigatório!")
	@Size(min = 5, max = 255, message = "Limite de caracteres 255")
	private String descricaocat;

//	@NotBlank(message = "Esse é um campo obrigatório!")
	@Size(min = 5, max = 255, message = "Limite de caracteres 255")
	private String nomecat;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categoria", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("categoria")
	private List<Produto> produto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricaocat() {
		return descricaocat;
	}

	public void setDescricaocat(String descricaocat) {
		this.descricaocat = descricaocat;
	}

	public String getNomecat() {
		return nomecat;
	}

	public void setNomecat(String nomecat) {
		this.nomecat = nomecat;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProdutos(List<Produto> produto) {
		this.produto = produto;
	}

}