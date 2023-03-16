package com.example.CRUD.model;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.persistence.EntityManager;
import jakarta.persistence.metamodel.EntityType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;


import java.util.Set;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class CConsultationTests {

    @Autowired
    private EntityManager entityManager;

    @Test
    public void testCreateConsultationTableWithRequiredFields() {

        EntityType<CConsultation> consultationType = entityManager.getMetamodel().entity(CConsultation.class);

        assertThat(consultationType).isNotNull();
        assertThat(consultationType.getName()).isEqualTo("CConsultation");
        assertThat(entityManager.getEntityManagerFactory().getMetamodel().getEntities())
                .extracting("name").contains("CConsultation");

        Set<String> attributeNames = consultationType.getAttributes().stream()
                .map(attribute -> attribute.getName()).collect(Collectors.toSet());

        assertThat(attributeNames).containsExactlyInAnyOrder("id", "name", "stack", "title", "description", "date");
    }

}
