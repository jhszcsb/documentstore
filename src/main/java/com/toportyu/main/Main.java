package com.toportyu.main;

import com.toportyu.service.DocumentService;
import com.toportyu.service.DocumentServiceImpl;

/**
 * Created by csaba.juhasz on 21/04/2016.
 */
public class Main {

    public static void main (String[] args) {

        DocumentService documentService = new DocumentServiceImpl();

        System.out.println(documentService.getDocument());

    }
}
