package com.toportyu.service;

import com.toportyu.model.Document;
import org.springframework.stereotype.Service;

/**
 * Created by csaba.juhasz on 21/04/2016.
 */
@Service
public class DocumentServiceImpl implements DocumentService {

    @Override
    public Document getDocument() {

        Document document = new Document();
        document.setId(1l);
        document.setTitle("Example Document");
        document.setBody(
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, "
                        + "sed do eiusmod tempor incididunt ut labore et dolore "
                        + "magna aliqua. Ut enim ad minim veniam, quis nostrud "
                        + "exercitation ullamco laboris nisi ut aliquip ex ea "
                        + "commodo consequat. Duis aute irure dolor in reprehenderit "
                        + "in voluptate velit esse cillum dolore eu fugiat nulla pariatur. "
                        + "Excepteur sint occaecat cupidatat non proident, sunt in "
                        + "culpa qui officia deserunt mollit anim id est laborum.");
        document.setInternalMessage("This is not visible in the serialized JSON");

        return document;
    }

}
