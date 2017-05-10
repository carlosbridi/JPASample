package com.projetoprincipal;

import java.util.ArrayList;
import java.util.List;

import com.ItemPedido.ItemPedido;
import com.Pedido.Pedido;
import com.Pedido.PedidoPersist;
import com.Produto.Produto;
import com.Produto.ProdutoPersist;

public class Principal {

	public static void main(String[] args) {
		
		ProdutoPersist produtoPersist = new ProdutoPersist();
		
		Produto prod = new Produto();
		prod.setDescricao("Camisa 1");
		prod.setQtdest(10);
		produtoPersist.save(prod);
		
		Pedido ped = new Pedido();
		ped.setCliente(1);
		ped.setValpedido(10);
		
		
		ItemPedido itemPedido1 = new ItemPedido();
		itemPedido1.setProdutos(prod);
		itemPedido1.setPedido(ped);
		
		ItemPedido itemPedido2 = new ItemPedido();
		itemPedido2.setProdutos(prod);
		itemPedido2.setPedido(ped);
		
		List<ItemPedido> listaItemPedido = new ArrayList<ItemPedido>();
		listaItemPedido.add(itemPedido1);
		listaItemPedido.add(itemPedido2);		
		
		ped.setItemPedido(listaItemPedido);
		
		
		PedidoPersist pedidoPersist = new PedidoPersist();
		pedidoPersist.save(ped);
		
		
		
	}
	
}
