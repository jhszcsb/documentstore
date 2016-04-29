package com.toportyu.repository;


import com.toportyu.model.Document;

import java.util.List;

/**
 * Created by csaba.juhasz on 21/04/2016.
 */
public interface DocumentRepository extends BaseRepository<Document, Long> {

    /*
    This method will be implemented by Spring by resolving the method name
    and creating a query which finds Document objects by their title field.
     */
    List<Document> findByTitle(String title);

}
