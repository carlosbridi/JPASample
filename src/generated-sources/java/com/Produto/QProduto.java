package com.Produto;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QProduto is a Querydsl query type for Produto
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QProduto extends EntityPathBase<Produto> {

    private static final long serialVersionUID = -1125305769L;

    public static final QProduto produto = new QProduto("produto");

    public final StringPath descricao = createString("descricao");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> qtdest = createNumber("qtdest", Integer.class);

    public QProduto(String variable) {
        super(Produto.class, forVariable(variable));
    }

    public QProduto(Path<? extends Produto> path) {
        super(path.getType(), path.getMetadata());
    }

    public QProduto(PathMetadata metadata) {
        super(Produto.class, metadata);
    }

}

