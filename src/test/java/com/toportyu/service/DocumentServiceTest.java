package com.toportyu.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by csaba.juhasz on 21/04/2016.
 */
public class DocumentServiceTest {

    DocumentServiceImpl documentService;

    @Before
    public void setUp() {
        documentService = new DocumentServiceImpl();
    }

    @Test
    public void getDocument() {
        Assert.assertEquals("Dummy document.", documentService.getDocument());
    }
}
