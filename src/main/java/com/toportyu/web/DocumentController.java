package com.toportyu.web;

import com.toportyu.model.Document;
import com.toportyu.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by csaba.juhasz on 21/04/2016.
 */
@RestController
public class DocumentController {

    @Autowired
    DocumentService documentService;

    @RequestMapping(value = "/documents", method = RequestMethod.GET)
    public List<Document> getAllDocuments() {
        return documentService.getAllDocuments();
    }
}
