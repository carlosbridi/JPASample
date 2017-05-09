package com.sala;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QSala is a Querydsl query type for Sala
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSala extends EntityPathBase<Sala> {

    private static final long serialVersionUID = -844429567L;

    public static final QSala sala = new QSala("sala");

    public final StringPath codigoSala = createString("codigoSala");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath nomeSala = createString("nomeSala");

    public QSala(String variable) {
        super(Sala.class, forVariable(variable));
    }

    public QSala(Path<? extends Sala> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSala(PathMetadata metadata) {
        super(Sala.class, metadata);
    }

}

