package org.ok.milki.metadata.client;

import static org.ok.milki.metadata.model.MetadataPaths.METADATA_PATH;

public interface MetadataServerUriComponents {

    String SCHEMA = "http";

    String HOST = "localhost";

    int PORT = 8080;

    String ROOT_URL = SCHEMA + "://" + HOST + ":" + PORT + "/";

    String METADATA_ROOT_URL = ROOT_URL + METADATA_PATH;
}
