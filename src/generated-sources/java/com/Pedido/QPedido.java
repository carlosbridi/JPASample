package com.Pedido;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPedido is a Querydsl query type for Pedido
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPedido extends EntityPathBase<Pedido> {

    private static final long serialVersionUID = -894271391L;

    public static final QPedido pedido = new QPedido("pedido");

    public final NumberPath<Integer> cliente = createNumber("cliente", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<com.ItemPedido.ItemPedido, com.ItemPedido.QItemPedido> listaItemPedido = this.<com.ItemPedido.ItemPedido, com.ItemPedido.QItemPedido>createList("listaItemPedido", com.ItemPedido.ItemPedido.class, com.ItemPedido.QItemPedido.class, PathInits.DIRECT2);

    public final NumberPath<Double> valpedido = createNumber("valpedido", Double.class);

    public QPedido(String variable) {
        super(Pedido.class, forVariable(variable));
    }

    public QPedido(Path<? extends Pedido> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPedido(PathMetadata metadata) {
        super(Pedido.class, metadata);
    }

}

