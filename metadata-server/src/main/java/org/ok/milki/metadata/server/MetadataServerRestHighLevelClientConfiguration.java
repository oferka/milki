package org.ok.milki.metadata.server;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Configuration
@PropertySource("classpath:metadata-server-elasticsearch-rest-client.properties")
@ConfigurationProperties(prefix = "metadata.server.elasticsearch.rest.client")
@Data
public class MetadataServerRestHighLevelClientConfiguration {

    @NotNull
    @NotBlank
    @Size(min = 2, max = 256)
    private String connectTo = "localhost:9200";
}
