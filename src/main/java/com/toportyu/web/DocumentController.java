package com.toportyu.web;

import com.toportyu.model.Document;
import com.toportyu.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by csaba.juhasz on 21/04/2016.
 */
@RestController
public class DocumentController {

    @Autowired
    DocumentService documentService;

    @RequestMapping(value = "/documents", method = RequestMethod.GET)
    public Iterable<Document> getAllDocuments() {
        return documentService.getAllDocuments();
    }

    @RequestMapping(value = "/documents", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void saveNewDocument(@RequestBody Document document) {
        documentService.save(document);
    }
}
