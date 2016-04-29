package com.toportyu.service;

import com.toportyu.model.Document;

import java.util.List;

/**
 * Created by csaba.juhasz on 21/04/2016.
 */
public interface DocumentService {

    Iterable<Document> getAllDocuments();

    void save(Document document);

    List<Document> findByTitle(String title);
}
