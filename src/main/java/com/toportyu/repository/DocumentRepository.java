package com.toportyu.repository;

import com.toportyu.model.Document;

import java.util.List;

/**
 * Created by csaba.juhasz on 21/04/2016.
 */
public interface DocumentRepository extends org.springframework.data.repository.Repository<Document, Long> {

    public List<Document> findAll();

}
