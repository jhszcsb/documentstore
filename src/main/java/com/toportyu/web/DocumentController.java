package com.toportyu.web;

import com.toportyu.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @RequestMapping(value = "/document", method = RequestMethod.GET)
    public String getDocument() {
        return documentService.getDocument();
    }
}
