package com.toportyu.repository;

import com.toportyu.model.Document;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

/**
 * Created by csaba.juhasz on 25/04/2016.
 */
public class DocumentRepositoryTest {

    @Mock
    private DocumentRepository documentRepository;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        List<Document> documents = new ArrayList<>();
        documents.add(new Document());
        documents.add(new Document());
        when(documentRepository.findAll()).thenReturn(documents);
    }

    @Test
    public void getDocuments() {
        Assert.assertEquals(2, documentRepository.findAll().size());
    }
}
