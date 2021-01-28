package org.ok.milki.metadata.server.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.ok.milki.metadata.model.tenant.Tenant;
import org.ok.milki.metadata.server.repository.TenantRepository;
import org.ok.milki.utils.id.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import javax.validation.constraints.NotNull;

import static java.lang.String.format;
import static org.hamcrest.Matchers.containsString;
import static org.ok.milki.metadata.model.MetadataPaths.TENANT_PATH;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class TenantControllerTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private TenantRepository tenantRepository;

    @Autowired
    private IdGenerator idGenerator;

    @Test
    public void shouldSave() throws Exception {
        Tenant tenant = getSampleTenant();
        MvcResult mvcResult = mvc.perform(post(format("/%s", TENANT_PATH))
                .contentType(MediaType.APPLICATION_JSON)
                .content(new ObjectMapper().writeValueAsString(tenant))
                .accept(MediaType.APPLICATION_JSON))
                .andDo(log())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString(tenant.getName())))
                .andReturn();
        tenantRepository.delete(tenant);
    }

    @Test
    public void shouldDelete() throws Exception {
        Tenant tenant = getSampleTenant();
        Tenant savedTenant = tenantRepository.save(tenant);
        MvcResult mvcResult = mvc.perform(delete(format("/%s", TENANT_PATH))
                .contentType(MediaType.APPLICATION_JSON)
                .content(new ObjectMapper().writeValueAsString(savedTenant))
                .accept(MediaType.APPLICATION_JSON))
                .andDo(log())
                .andExpect(status().isNoContent())
                .andReturn();
    }

    private @NotNull Tenant getSampleTenant() {
        return new Tenant(idGenerator.generate(), "Tenant 1");
    }
}