package com.toportyu.service;

import org.springframework.stereotype.Service;

/**
 * Created by csaba.juhasz on 21/04/2016.
 */
@Service
public class DocumentServiceImpl implements DocumentService {

    @Override
    public String getDocument() {
        return "Dummy document.";
    }

}
