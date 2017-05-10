package com.ItemPedido;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QItemPedido is a Querydsl query type for ItemPedido
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QItemPedido extends EntityPathBase<ItemPedido> {

    private static final long serialVersionUID = -1518765311L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QItemPedido itemPedido = new QItemPedido("itemPedido");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.Pedido.QPedido pedido;

    public final com.Produto.QProduto produtos;

    public QItemPedido(String variable) {
        this(ItemPedido.class, forVariable(variable), INITS);
    }

    public QItemPedido(Path<? extends ItemPedido> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QItemPedido(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QItemPedido(PathMetadata metadata, PathInits inits) {
        this(ItemPedido.class, metadata, inits);
    }

    public QItemPedido(Class<? extends ItemPedido> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.pedido = inits.isInitialized("pedido") ? new com.Pedido.QPedido(forProperty("pedido")) : null;
        this.produtos = inits.isInitialized("produtos") ? new com.Produto.QProduto(forProperty("produtos")) : null;
    }

}

