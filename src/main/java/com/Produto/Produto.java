package com.Produto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.utils.EntityId;


@Entity
@Table
@SequenceGenerator(name="produto_seq", sequenceName = "produto_seq", allocationSize = 1, initialValue = 1)
public class Produto implements EntityId<Long> {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto_seq")
	private Long id;
	
	private String descricao;
	
	private int qtdest;
	
	
	@Override
	public Long getId() {
		return id;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public int getQtdest() {
		return qtdest;
	}


	public void setQtdest(int qtdest) {
		this.qtdest = qtdest;
	}


	public void setId(Long id) {
		this.id = id;
	}
	
	

	
	
}
