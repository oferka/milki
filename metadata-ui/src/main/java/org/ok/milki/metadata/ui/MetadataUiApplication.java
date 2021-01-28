package org.ok.milki.metadata.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.vaadin.artur.helpers.LaunchUtil;

@SpringBootApplication
public class MetadataUiApplication {

    public static void main(String[] args) {
        LaunchUtil.launchBrowserInDevelopmentMode(SpringApplication.run(MetadataUiApplication.class, args));
    }
}
