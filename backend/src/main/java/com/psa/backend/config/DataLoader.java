package com.psa.backend.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.psa.backend.model.ProductEntity;
import com.psa.backend.dao.ProductDAO;

import java.util.List;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner initDatabase(ProductDAO productDAO) {
        return args -> {
            //TODO: Import from CSV
            if (productDAO.count() == 0) {
                productDAO.save(ProductEntity.builder().prefix("SAP").nombre("SAP ERP").versiones(List.of("7.50", "7.51")).build());
                productDAO.save(ProductEntity.builder().prefix("OEC").nombre( "Oracle ERP Cloud").versiones(List.of("23C")).build());
                productDAO.save(ProductEntity.builder().prefix("MD365").nombre("Microsoft Dynamics 365").versiones(List.of("2024 Wave 1", "2023 Wave 2")).build());
                productDAO.save(ProductEntity.builder().prefix("HCM").nombre("Workday HCM").versiones(List.of("2024 R2", "2024 R1")).build());
                productDAO.save(ProductEntity.builder().prefix("SEN").nombre("ServiceNow").versiones(List.of("Paris", "Quebec")).build());
                productDAO.save(ProductEntity.builder().prefix("TAB").nombre("Tableau").versiones(List.of("2024.1", "2023.4")).build());
                productDAO.save(ProductEntity.builder().prefix("SEG").nombre("Slack Enterprise Grid").versiones(List.of("23.01")).build());
                productDAO.save(ProductEntity.builder().prefix("ZES").nombre("Zendesk Support").versiones(List.of("6.0", "5.9")).build());
                productDAO.save(ProductEntity.builder().prefix("NSE").nombre("NetSuite ERP").versiones(List.of("2024.1")).build());
                productDAO.save(ProductEntity.builder().prefix("HSC").nombre("HubSpot CRM").versiones(List.of("4.5.1", "4.4.9")).build());
                productDAO.save(ProductEntity.builder().prefix("JIRA").nombre("Jira Software").versiones(List.of("9.4.0", "9.3.1")).build());
                productDAO.save(ProductEntity.builder().prefix("GOOW").nombre("Google Workspace").versiones(List.of("2024.05")).build());
                productDAO.save(ProductEntity.builder().prefix("CONF").nombre("Confluence").versiones(List.of("8.11.0", "8.10.0")).build());
                productDAO.save(ProductEntity.builder().prefix("ONSE").nombre("Oracle NetSuite").versiones(List.of("2024.1", "2024.2")).build());
                productDAO.save(ProductEntity.builder().prefix("SALC").nombre("Salesforce CRM").versiones(List.of("2025 Spring Release", "2024 Winter Release")).build());
            }
        };
    }
}
