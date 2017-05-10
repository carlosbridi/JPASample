package com.Pedido;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.ItemPedido.ItemPedido;
import com.utils.EntityId;

@Entity
@Table(name = "pedido")
@SequenceGenerator(name="pedido_seq", sequenceName = "pedido_seq", allocationSize = 1, initialValue = 1)
public class Pedido implements EntityId<Long>{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pedido_seq")
	private Long id;
	
	private int cliente;
	
	private double valpedido;
	
	@OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
	private List<ItemPedido> listaItemPedido = new ArrayList<ItemPedido>();
	
	@Override
	public Long getId() {
		return id;
	}

	public int getCliente() {
		return cliente;
	}

	public void setCliente(int cliente) {
		this.cliente = cliente;
	}

	public double getValpedido() {
		return valpedido;
	}

	public void setValpedido(double valpedido) {
		this.valpedido = valpedido;
	}

	

	public void setId(Long id) {
		this.id = id;
	}

	public List<ItemPedido> getItemPedido() {
		return listaItemPedido;
	}

	public void setItemPedido(List<ItemPedido> listaItemPedido) {
		this.listaItemPedido = listaItemPedido;
	}
	
	

}
