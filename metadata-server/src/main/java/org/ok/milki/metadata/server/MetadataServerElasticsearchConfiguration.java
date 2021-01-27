package org.ok.milki.metadata.server;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;

@Configuration
public class MetadataServerElasticsearchConfiguration extends AbstractElasticsearchConfiguration {

    private final MetadataServerRestHighLevelClientConfiguration metadataServerRestHighLevelClientConfiguration;

    public MetadataServerElasticsearchConfiguration(@Autowired MetadataServerRestHighLevelClientConfiguration metadataServerRestHighLevelClientConfiguration) {
        this.metadataServerRestHighLevelClientConfiguration = metadataServerRestHighLevelClientConfiguration;
    }

    @Override
    @Bean
    public RestHighLevelClient elasticsearchClient() {
        final ClientConfiguration clientConfiguration = ClientConfiguration.builder()
                .connectedTo(metadataServerRestHighLevelClientConfiguration.getConnectTo())
                .build();
        return RestClients.create(clientConfiguration).rest();
    }
}
