package br.ufms.desafio.entity;

import java.io.Serializable;

/**
 * Created by Diego Dalto
 * Copyright (c) 2018, UFMS, All rights reserved.
 */
public abstract class Entidade implements Serializable {

    @Override
    public abstract int hashCode();

    /**
     * Indicates whether some other object is "equal to" this one.
     * <p>
     * Warning - this method won't work in the case the id fields are not set.
     *
     * @param object the other object
     * @return true if both objects have the same ID
     */
    @Override
    public abstract boolean equals(Object object);

    @Override
    public abstract String toString();
}