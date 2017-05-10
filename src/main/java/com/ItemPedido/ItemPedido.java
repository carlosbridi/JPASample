package com.ItemPedido;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.Pedido.Pedido;
import com.Produto.Produto;
import com.utils.EntityId;

@Entity
@Table
@SequenceGenerator(name="itempedido_seq", sequenceName = "itempedido_seq", allocationSize = 1, initialValue = 1)
public class ItemPedido implements EntityId<Long>{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "itempedido_seq")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "pedido_id")
	private Pedido pedido;
		
	@OneToOne
	private Produto produtos;
	
	@Override
	public Long getId() {
		return id;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	

	public void setId(Long id) {
		this.id = id;
	}

	public Produto getListaProdutos() {
		return produtos;
	}

	public Produto getProdutos() {
		return produtos;
	}

	public void setProdutos(Produto produtos) {
		this.produtos = produtos;
	}

	
	
	

}
