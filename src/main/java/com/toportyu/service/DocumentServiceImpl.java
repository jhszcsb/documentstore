package com.toportyu.service;

import com.toportyu.model.Document;
import com.toportyu.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by csaba.juhasz on 21/04/2016.
 */
@Service
public class DocumentServiceImpl implements DocumentService {

    @Autowired
    DocumentRepository documentRepository;

    @Override
    public Document getDocument() {
        return documentRepository.getDocument();
    }

}
