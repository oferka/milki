package org.ok.milki.metadata.model.product_domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.ok.milki.model.utils.id.Identifiable;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import static org.springframework.data.elasticsearch.annotations.FieldType.Keyword;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(indexName = "milki_product_domain_health_impacting_event")
public class ProductDomainHealthImpactingEvent implements Identifiable {

    @Id
    @Getter
    @NotNull
    @Size(min = 2, max = 64)
    @NotBlank
    @Field(type = Keyword)
    private String id;

    @Getter
    @NotNull
    @Size(min = 2, max = 64)
    @NotBlank
    @Field(type = Keyword)
    private String name;

    @Getter
    @NotNull
    @Field(type = FieldType.Object)
    private ProductDomainHealthAspect productDomainHealthAspect;
}
