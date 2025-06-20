package com.psa.backend.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.psa.backend.model.ProductEntity;
import com.psa.backend.model.ProductVersionEntity;
import com.psa.backend.model.TicketEntity;
import com.psa.backend.dao.ProductDAO;
import com.psa.backend.dao.ProductVersionDAO;
import com.psa.backend.dao.TicketDAO;
import com.psa.backend.enums.TicketPriorityScaleEnum;
import com.psa.backend.enums.TicketSeverityScaleEnum;
import com.psa.backend.enums.TicketStateEnum;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner initDatabase(TicketDAO ticketDAO, ProductDAO productDAO, ProductVersionDAO productVersionDAO) {
        return args -> {
            // TODO: Import from CSV
            if (productDAO.count() == 0) {
                productDAO.save(ProductEntity.builder().prefix("SAP").nombre("SAP ERP").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(1L).build()).version("23C").build());
                productDAO.save(ProductEntity.builder().prefix("OEC").nombre("Oracle ERP Cloud").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(2L).build()).version("2024 Wave 1").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(2L).build()).version("2024 Wave 2").build());
                productDAO.save(ProductEntity.builder().prefix("MD365").nombre("Microsoft Dynamics 365").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(3L).build()).version("2024 R2").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(3L).build()).version("2024 R1").build());
                productDAO.save(ProductEntity.builder().prefix("HCM").nombre("Workday HCM").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(4L).build()).version("Paris").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(4L).build()).version("Quebec").build());
                productDAO.save(ProductEntity.builder().prefix("SEN").nombre("ServiceNow").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(5L).build()).version("2024.1").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(5L).build()).version("2023.4").build());
                productDAO.save(ProductEntity.builder().prefix("TAB").nombre("Tableau").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(6L).build()).version("23.01").build());
                productDAO.save(ProductEntity.builder().prefix("SEG").nombre("Slack Enterprise Grid").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(7L).build()).version("6.0").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(7L).build()).version("5.9").build());
                productDAO.save(ProductEntity.builder().prefix("ZES").nombre("Zendesk Support").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(8L).build()).version("2024.1").build());
                productDAO.save(ProductEntity.builder().prefix("NSE").nombre("NetSuite ERP").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(9L).build()).version("4.5.1").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(9L).build()).version("4.4.9").build());
                productDAO.save(ProductEntity.builder().prefix("HSC").nombre("HubSpot CRM").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(10L).build()).version("9.4.0").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(10L).build()).version("9.3.1").build());
                productDAO.save(ProductEntity.builder().prefix("JIRA").nombre("Jira Software").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(11L).build()).version("2024.05").build());
                productDAO.save(ProductEntity.builder().prefix("GOOW").nombre("Google Workspace").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(12L).build()).version("8.11.0").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(12L).build()).version("8.10.0").build());
                productDAO.save(ProductEntity.builder().prefix("CONF").nombre("Confluence").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(13L).build()).version("2024.1").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(13L).build()).version("2024.2").build());
                productDAO.save(ProductEntity.builder().prefix("ONSE").nombre("Oracle NetSuite").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(14L).build()).version("2025 Spring Release").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(14L).build()).version("2024 Winter Release").build());
                productDAO.save(ProductEntity.builder().prefix("SALC").nombre("Salesforce CRM").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(15L).build()).version("7.50").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(15L).build()).version("7.51").build());
            }
            ticketDAO.save(TicketEntity.builder().prioridad(TicketPriorityScaleEnum.HIGH_PRIORITY)
                    .version(ProductVersionEntity.builder().id(1L).build()).estado(TicketStateEnum.CREATED)
                    .severidad(TicketSeverityScaleEnum.LEVEL_1)
                    .nombre("TEST NOMBRE").descripcion("Test").idResponsable("ff14a491-e26d-4092-86ea-d76f20c165d1")
                    .idCliente("1").fechaCreacion(LocalDate.of(2025,01,12)).build());
        };
    }
}
