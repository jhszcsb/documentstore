package com.toportyu.service;

import com.toportyu.DocumentStoreApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by csaba.juhasz on 21/04/2016.
 */
@ContextConfiguration(classes = DocumentStoreApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class DocumentServiceTest {

    @Autowired
    DocumentService documentService;

    @Test
    public void getDocument() {
        //Assert.assertEquals("Example Document", documentService.getDocument().getTitle());
    }

    // TODO: mock database layer and add tests
}
