package com.toportyu.service;

import com.toportyu.model.Document;
import com.toportyu.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by csaba.juhasz on 21/04/2016.
 */
@Service
public class DocumentServiceImpl implements DocumentService {

    @Autowired
    DocumentRepository documentRepository;

    @Override
    public Iterable<Document> getAllDocuments() {
        return documentRepository.findAll();
    }

    @Override
    public void save(Document document) {
        documentRepository.save(document);
    }

    @Override
    public List<Document> findByTitle(String title) {
        return documentRepository.findByTitle(title);
    }
}
