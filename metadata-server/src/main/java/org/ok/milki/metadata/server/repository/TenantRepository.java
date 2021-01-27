package org.ok.milki.metadata.server.repository;

import org.ok.milki.metadata.model.tenant.Tenant;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TenantRepository extends ElasticsearchRepository<Tenant, String> {
}
