package com.toportyu.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * Created by csaba.juhasz on 29/04/2016.
 */
@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable> extends CrudRepository<T, ID> {

    /*

    This is a base repository extending Spring's CrudRepository

    The @NoRepositoryBean annotation means that Spring will not try to inject a bean for this type.
    This is because BaseRepository is an intermediate interface, and you only want a Spring bean
    to be created from the derived interface.

     */
}
