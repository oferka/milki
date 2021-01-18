package org.ok.milki.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.ok.milki.model.utils.Identifiable;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Field;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import static org.springframework.data.elasticsearch.annotations.FieldType.Keyword;

@AllArgsConstructor
@NoArgsConstructor
public class Product implements Identifiable {

    @Getter
    @NotNull
    @Size(min = 2, max = 6)
    @NotBlank
    @Id
    @Field(type = Keyword)
    private String id;
}
