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
            if (productDAO.count() == 0) {
                productDAO.save(new ProductEntity("P-0001", "SAP ERP", List.of("7.50", "7.51")));
                productDAO.save(new ProductEntity("P-0002", "Oracle ERP Cloud", List.of("23C")));
                productDAO.save(new ProductEntity("P-0003", "Microsoft Dynamics 365", List.of("2024 Wave 1", "2023 Wave 2")));
                productDAO.save(new ProductEntity("P-0004", "Workday HCM", List.of("2024 R2", "2024 R1")));
                productDAO.save(new ProductEntity("P-0005", "ServiceNow", List.of("Paris", "Quebec")));
                productDAO.save(new ProductEntity("P-0006", "Tableau", List.of("2024.1", "2023.4")));
                productDAO.save(new ProductEntity("P-0007", "Slack Enterprise Grid", List.of("23.01")));
                productDAO.save(new ProductEntity("P-0008", "Zendesk Support", List.of("6.0", "5.9")));
                productDAO.save(new ProductEntity("P-0009", "NetSuite ERP", List.of("2024.1")));
                productDAO.save(new ProductEntity("P-0010", "HubSpot CRM", List.of("4.5.1", "4.4.9")));
                productDAO.save(new ProductEntity("P-0011", "Jira Software", List.of("9.4.0", "9.3.1")));
                productDAO.save(new ProductEntity("P-0012", "Google Workspace", List.of("2024.05")));
                productDAO.save(new ProductEntity("P-0013", "Confluence", List.of("8.11.0", "8.10.0")));
                productDAO.save(new ProductEntity("P-0014", "Oracle NetSuite", List.of("2024.1", "2024.2")));
                productDAO.save(new ProductEntity("P-0015", "Salesforce CRM", List.of("2025 Spring Release", "2024 Winter Release")));
            }
        };
    }
}
