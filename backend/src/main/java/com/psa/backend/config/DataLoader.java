package com.psa.backend.config;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.psa.backend.dao.ProductDAO;
import com.psa.backend.dao.ProductVersionDAO;
import com.psa.backend.dao.TicketDAO;
import com.psa.backend.enums.TicketPriorityScaleEnum;
import com.psa.backend.enums.TicketSeverityScaleEnum;
import com.psa.backend.enums.TicketStateEnum;
import com.psa.backend.model.ProductEntity;
import com.psa.backend.model.ProductVersionEntity;
import com.psa.backend.model.TicketEntity;

@Configuration
public class DataLoader {

    private static final Random random = new Random();

    @Bean
    CommandLineRunner initDatabase(TicketDAO ticketDAO, ProductDAO productDAO, ProductVersionDAO productVersionDAO) {
        return args -> {
            if (productDAO.count() == 0) {
                productDAO.save(ProductEntity.builder().prefix("OEC").nombre("Oracle ERP Cloud").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(1L).build())
                        .version("23C").build());
                productDAO.save(ProductEntity.builder().prefix("MD365").nombre("Microsoft Dynamics 365").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(2L).build())
                        .version("2024 Wave 1").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(2L).build())
                        .version("2023 Wave 2").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(2L).build())
                        .version("2023 Wave 1").build());
                productDAO.save(ProductEntity.builder().prefix("HCM").nombre("Workday HCM").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(3L).build())
                        .version("2024 R2").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(3L).build())
                        .version("2024 R1").build());
                productDAO.save(ProductEntity.builder().prefix("SEN").nombre("ServiceNow").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(4L).build())
                        .version("Paris").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(4L).build())
                        .version("Quebec").build());
                productDAO.save(ProductEntity.builder().prefix("TAB").nombre("Tableau").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(5L).build())
                        .version("2024.1").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(5L).build())
                        .version("2023.4").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(5L).build())
                        .version("2023.3").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(5L).build())
                        .version("2022.4").build());
                productDAO.save(ProductEntity.builder().prefix("SEG").nombre("Slack Enterprise Grid").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(6L).build())
                        .version("23.01").build());
                productDAO.save(ProductEntity.builder().prefix("ZES").nombre("Zendesk Support").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(7L).build())
                        .version("6.0").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(7L).build())
                        .version("5.9").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(7L).build())
                        .version("5.8").build());
                productDAO.save(ProductEntity.builder().prefix("NSE").nombre("NetSuite ERP").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(8L).build())
                        .version("2024.1").build());
                productDAO.save(ProductEntity.builder().prefix("HSC").nombre("HubSpot CRM").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(9L).build())
                        .version("4.5.1").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(9L).build())
                        .version("4.4.9").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(9L).build())
                        .version("4.4.5").build());
                productDAO.save(ProductEntity.builder().prefix("JIRA").nombre("Jira Software").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(10L).build())
                        .version("9.4.0").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(10L).build())
                        .version("9.3.1").build());
                productDAO.save(ProductEntity.builder().prefix("GOOW").nombre("Google Workspace").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(11L).build())
                        .version("2024.05").build());
                productDAO.save(ProductEntity.builder().prefix("CONF").nombre("Confluence").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(12L).build())
                        .version("8.11.0").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(12L).build())
                        .version("8.10.0").build());
                productDAO.save(ProductEntity.builder().prefix("ONSE").nombre("Oracle NetSuite").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(13L).build())
                        .version("2024.1").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(13L).build())
                        .version("2024.2").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(13L).build())
                        .version("2023.4").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(13L).build())
                        .version("2023.2").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(13L).build())
                        .version("2023.1").build());
                productDAO.save(ProductEntity.builder().prefix("SALC").nombre("Salesforce CRM").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(14L).build())
                        .version("2025 Spring Release").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(14L).build())
                        .version("2024 Winter Release").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(14L).build())
                        .version("2023 Summer Release").build());
                productDAO.save(ProductEntity.builder().prefix("SAP").nombre("SAP ERP").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(15L).build())
                        .version("7.50").build());
                productVersionDAO.save(ProductVersionEntity.builder().producto(ProductEntity.builder().id(15L).build())
                        .version("7.51").build());
            }

            List<TicketEntity> tickets = new ArrayList<>();
                    tickets.add(TicketEntity.builder()
                .nombre("Error al emitir factura")
                .idCliente("2")
                .version(ProductVersionEntity.builder().id(26L).build())
                .estado(TicketStateEnum.FINISHED)
                .severidad(TicketSeverityScaleEnum.LEVEL_1)
                .prioridad(TicketPriorityScaleEnum.MEDIUM_PRIORITY)
                .descripcion("Al intentar emitir una factura, el sistema lanza un error inesperado que impide completar el proceso de facturación correctamente.")
                .idResponsable("47f744bb-0553-497a-b6e3-fdb64ddaca2a")
                .fechaCreacion(generateRandomDate2025())
                .build());

        tickets.add(TicketEntity.builder()
                .nombre("Falló la actualización de stock")
                .idCliente("1")
                .version(ProductVersionEntity.builder().id(29L).build())
                .estado(TicketStateEnum.FINISHED)
                .severidad(TicketSeverityScaleEnum.LEVEL_4)
                .prioridad(TicketPriorityScaleEnum.MEDIUM_PRIORITY)
                .descripcion("Los movimientos de inventario no se reflejan en tiempo real, generando inconsistencias entre el stock físico y el registrado en el sistema.")
                .idResponsable("a21147f8-6538-46d8-95ac-9ddf95ff8c29")
                .fechaCreacion(generateRandomDate2025())
                .build());

        tickets.add(TicketEntity.builder()
                .nombre("Descuadre de asiento contable")
                .idCliente("3")
                .version(ProductVersionEntity.builder().id(26L).build())
                .estado(TicketStateEnum.FINISHED)
                .severidad(TicketSeverityScaleEnum.LEVEL_1)
                .prioridad(TicketPriorityScaleEnum.HIGH_PRIORITY)
                .descripcion("Se detectaron asientos contables con sumas incorrectas entre débitos y créditos, afectando la conciliación de cuentas.")
                .idResponsable("ff14a491-e26d-4092-86ea-d76f20c165d1")
                .fechaCreacion(generateRandomDate2025())
                .build());

        tickets.add(TicketEntity.builder()
                .nombre("No se puede cerrar el periodo")
                .idCliente("2")
                .version(ProductVersionEntity.builder().id(26L).build())
                .estado(TicketStateEnum.FINISHED)
                .severidad(TicketSeverityScaleEnum.LEVEL_3)
                .prioridad(TicketPriorityScaleEnum.LOW_PRIORITY)
                .descripcion("Al intentar cerrar un periodo contable, el sistema bloquea la acción sin mostrar mensajes de error claros o registros asociados.")
                .idResponsable("2e6ecd47-fa18-490e-b25a-c9101a398b6d")
                .fechaCreacion(generateRandomDate2025())
                .build());

        tickets.add(TicketEntity.builder()
                .nombre("Problema con el tipo de cambio")
                .idCliente("1")
                .version(ProductVersionEntity.builder().id(29L).build())
                .estado(TicketStateEnum.FINISHED)
                .severidad(TicketSeverityScaleEnum.LEVEL_5)
                .prioridad(TicketPriorityScaleEnum.LOW_PRIORITY)
                .descripcion("Las operaciones en moneda extranjera no están utilizando el tipo de cambio actualizado, lo que provoca diferencias en los valores contables.")
                .idResponsable("47f744bb-0553-497a-b6e3-fdb64ddaca2a")
                .fechaCreacion(generateRandomDate2025())
                .build());

        tickets.add(TicketEntity.builder()
                .nombre("Mala conexión con AFIP")
                .idCliente("3")
                .version(ProductVersionEntity.builder().id(30L).build())
                .estado(TicketStateEnum.FINISHED)
                .severidad(TicketSeverityScaleEnum.LEVEL_2)
                .prioridad(TicketPriorityScaleEnum.HIGH_PRIORITY)
                .descripcion("Durante la validación de comprobantes fiscales, se producen cortes frecuentes en la comunicación con los servidores de AFIP.")
                .idResponsable("a21147f8-6538-46d8-95ac-9ddf95ff8c29")
                .fechaCreacion(generateRandomDate2025())
                .build());

        tickets.add(TicketEntity.builder()
                .nombre("Error en exportación contable")
                .idCliente("2")
                .version(ProductVersionEntity.builder().id(26L).build())
                .estado(TicketStateEnum.FINISHED)
                .severidad(TicketSeverityScaleEnum.LEVEL_1)
                .prioridad(TicketPriorityScaleEnum.MEDIUM_PRIORITY)
                .descripcion("Los archivos generados para exportación contable contienen campos incompletos o valores mal formateados, impidiendo su uso posterior.")
                .idResponsable("ff14a491-e26d-4092-86ea-d76f20c165d1")
                .fechaCreacion(generateRandomDate2025())
                .build());

        tickets.add(TicketEntity.builder()
                .nombre("Carga masiva con errores")
                .idCliente("1")
                .version(ProductVersionEntity.builder().id(29L).build())
                .estado(TicketStateEnum.FINISHED)
                .severidad(TicketSeverityScaleEnum.LEVEL_2)
                .prioridad(TicketPriorityScaleEnum.HIGH_PRIORITY)
                .descripcion("Al ejecutar procesos de carga masiva, varios registros presentan errores de validación y no se cargan correctamente en la base de datos.")
                .idResponsable("2e6ecd47-fa18-490e-b25a-c9101a398b6d")
                .fechaCreacion(generateRandomDate2025())
                .build());

        tickets.add(TicketEntity.builder()
                .nombre("Corte de proceso por timeout")
                .idCliente("3")
                .version(ProductVersionEntity.builder().id(30L).build())
                .estado(TicketStateEnum.FINISHED)
                .severidad(TicketSeverityScaleEnum.LEVEL_5)
                .prioridad(TicketPriorityScaleEnum.HIGH_PRIORITY)
                .descripcion("Ciertos procesos de ejecución prolongada finalizan abruptamente por exceder el tiempo de espera del servidor.")
                .idResponsable("47f744bb-0553-497a-b6e3-fdb64ddaca2a")
                .fechaCreacion(generateRandomDate2025())
                .build());

        tickets.add(TicketEntity.builder()
                .nombre("No se reflejan saldos")
                .idCliente("2")
                .version(ProductVersionEntity.builder().id(26L).build())
                .estado(TicketStateEnum.FINISHED)
                .severidad(TicketSeverityScaleEnum.LEVEL_3)
                .prioridad(TicketPriorityScaleEnum.MEDIUM_PRIORITY)
                .descripcion("Los saldos de cuentas no se actualizan tras movimientos financieros, generando diferencias con los reportes esperados.")
                .idResponsable("a21147f8-6538-46d8-95ac-9ddf95ff8c29")
                .fechaCreacion(generateRandomDate2025())
                .build());

        tickets.add(TicketEntity.builder()
                .nombre("Fallo en login de usuarios")
                .idCliente("1")
                .version(ProductVersionEntity.builder().id(18L).build())
                .estado(TicketStateEnum.FINISHED)
                .severidad(TicketSeverityScaleEnum.LEVEL_2)
                .prioridad(TicketPriorityScaleEnum.HIGH_PRIORITY)
                .descripcion("Los usuarios reportan errores al intentar iniciar sesión. El sistema no reconoce credenciales válidas y no emite mensajes de error claros.")
                .idResponsable("ff14a491-e26d-4092-86ea-d76f20c165d1")
                .fechaCreacion(generateRandomDate2025())
                .build());

        tickets.add(TicketEntity.builder()
                .nombre("Duplicación de leads")
                .idCliente("3")
                .version(ProductVersionEntity.builder().id(20L).build())
                .estado(TicketStateEnum.FINISHED)
                .severidad(TicketSeverityScaleEnum.LEVEL_3)
                .prioridad(TicketPriorityScaleEnum.MEDIUM_PRIORITY)
                .descripcion("Al importar contactos desde campañas externas, los leads se están creando múltiples veces con información duplicada.")
                .idResponsable("2e6ecd47-fa18-490e-b25a-c9101a398b6d")
                .fechaCreacion(generateRandomDate2025())
                .build());

        tickets.add(TicketEntity.builder()
                .nombre("Error al enviar correos")
                .idCliente("2")
                .version(ProductVersionEntity.builder().id(18L).build())
                .estado(TicketStateEnum.FINISHED)
                .severidad(TicketSeverityScaleEnum.LEVEL_5)
                .prioridad(TicketPriorityScaleEnum.HIGH_PRIORITY)
                .descripcion("Las notificaciones por correo no se envían correctamente. Los registros quedan en cola sin procesar o fallan silenciosamente.")
                .idResponsable("47f744bb-0553-497a-b6e3-fdb64ddaca2a")
                .fechaCreacion(generateRandomDate2025())
                .build());

        tickets.add(TicketEntity.builder()
                .nombre("No carga la sección clientes")
                .idCliente("1")
                .version(ProductVersionEntity.builder().id(20L).build())
                .estado(TicketStateEnum.FINISHED)
                .severidad(TicketSeverityScaleEnum.LEVEL_4)
                .prioridad(TicketPriorityScaleEnum.LOW_PRIORITY)
                .descripcion("La sección de clientes queda en blanco al intentar acceder. No se muestran ni cargan los datos, aunque hay conexión al servidor.")
                .idResponsable("a21147f8-6538-46d8-95ac-9ddf95ff8c29")
                .fechaCreacion(generateRandomDate2025())
                .build());

        tickets.add(TicketEntity.builder()
                .nombre("Filtros de búsqueda rotos")
                .idCliente("3")
                .version(ProductVersionEntity.builder().id(18L).build())
                .estado(TicketStateEnum.FINISHED)
                .severidad(TicketSeverityScaleEnum.LEVEL_2)
                .prioridad(TicketPriorityScaleEnum.MEDIUM_PRIORITY)
                .descripcion("Los filtros en los listados no aplican correctamente los criterios seleccionados. Se devuelven resultados erróneos o vacíos.")
                .idResponsable("ff14a491-e26d-4092-86ea-d76f20c165d1")
                .fechaCreacion(generateRandomDate2025())
                .build());

        tickets.add(TicketEntity.builder()
                .nombre("Problemas en panel de analítica")
                .idCliente("2")
                .version(ProductVersionEntity.builder().id(18L).build())
                .estado(TicketStateEnum.FINISHED)
                .severidad(TicketSeverityScaleEnum.LEVEL_1)
                .prioridad(TicketPriorityScaleEnum.MEDIUM_PRIORITY)
                .descripcion("El panel de métricas y gráficos de rendimiento muestra valores incoherentes o se queda cargando indefinidamente.")
                .idResponsable("2e6ecd47-fa18-490e-b25a-c9101a398b6d")
                .fechaCreacion(generateRandomDate2025())
                .build());

        tickets.add(TicketEntity.builder()
                .nombre("Error en reporte de ventas")
                .idCliente("1")
                .version(ProductVersionEntity.builder().id(20L).build())
                .estado(TicketStateEnum.FINISHED)
                .severidad(TicketSeverityScaleEnum.LEVEL_1)
                .prioridad(TicketPriorityScaleEnum.HIGH_PRIORITY)
                .descripcion("El reporte mensual de ventas no incluye algunas transacciones recientes, lo que afecta la visualización total de ingresos.")
                .idResponsable("47f744bb-0553-497a-b6e3-fdb64ddaca2a")
                .fechaCreacion(generateRandomDate2025())
                .build());

        tickets.add(TicketEntity.builder()
                .nombre("No se actualizan contactos")
                .idCliente("3")
                .version(ProductVersionEntity.builder().id(18L).build())
                .estado(TicketStateEnum.FINISHED)
                .severidad(TicketSeverityScaleEnum.LEVEL_3)
                .prioridad(TicketPriorityScaleEnum.MEDIUM_PRIORITY)
                .descripcion("Las modificaciones en la información de contactos no se guardan correctamente. Tras actualizar, los datos vuelven a su estado anterior.")
                .idResponsable("a21147f8-6538-46d8-95ac-9ddf95ff8c29")
                .fechaCreacion(generateRandomDate2025())
                .build());

        tickets.add(TicketEntity.builder()
                .nombre("Lentitud en dashboard")
                .idCliente("2")
                .version(ProductVersionEntity.builder().id(20L).build())
                .estado(TicketStateEnum.FINISHED)
                .severidad(TicketSeverityScaleEnum.LEVEL_4)
                .prioridad(TicketPriorityScaleEnum.LOW_PRIORITY)
                .descripcion("El panel principal de CRM tiene tiempos de carga excesivos, afectando la experiencia del usuario y el trabajo diario de los analistas.")
                .idResponsable("ff14a491-e26d-4092-86ea-d76f20c165d1")
                .fechaCreacion(generateRandomDate2025())
                .build());

        tickets.add(TicketEntity.builder()
                .nombre("Desincronización con ERP")
                .idCliente("1")
                .version(ProductVersionEntity.builder().id(18L).build())
                .estado(TicketStateEnum.FINISHED)
                .severidad(TicketSeverityScaleEnum.LEVEL_2)
                .prioridad(TicketPriorityScaleEnum.HIGH_PRIORITY)
                .descripcion("Los datos de clientes y ventas no se sincronizan correctamente con el sistema ERP. Algunos registros aparecen con diferencias entre sistemas.")
                .idResponsable("2e6ecd47-fa18-490e-b25a-c9101a398b6d")
                .fechaCreacion(generateRandomDate2025())
                .build());

        tickets.add(TicketEntity.builder()
                .nombre("Error al cargar dashboard")
                .idCliente("3")
                .version(ProductVersionEntity.builder().id(9L).build())
                .estado(TicketStateEnum.CREATED)
                .severidad(TicketSeverityScaleEnum.LEVEL_2)
                .prioridad(TicketPriorityScaleEnum.HIGH_PRIORITY)
                .descripcion("El dashboard principal no se carga correctamente al iniciar sesión. La interfaz queda en blanco o muestra un error genérico.")
                .idResponsable("47f744bb-0553-497a-b6e3-fdb64ddaca2a")
                .fechaCreacion(generateRandomDate2025())
                .build());

        tickets.add(TicketEntity.builder()
                .nombre("Datos incorrectos en gráfico de ventas")
                .idCliente("2")
                .version(ProductVersionEntity.builder().id(10L).build())
                .estado(TicketStateEnum.FINISHED)
                .severidad(TicketSeverityScaleEnum.LEVEL_3)
                .prioridad(TicketPriorityScaleEnum.MEDIUM_PRIORITY)
                .descripcion("Los valores mostrados en el gráfico de ventas no coinciden con los datos del sistema. Se identificaron discrepancias en los montos.")
                .idResponsable("a21147f8-6538-46d8-95ac-9ddf95ff8c29")
                .fechaCreacion(generateRandomDate2025())
                .build());

        tickets.add(TicketEntity.builder()
                .nombre("Conexión intermitente con servidor")
                .idCliente("1")
                .version(ProductVersionEntity.builder().id(12L).build())
                .estado(TicketStateEnum.FINISHED)
                .severidad(TicketSeverityScaleEnum.LEVEL_4)
                .prioridad(TicketPriorityScaleEnum.HIGH_PRIORITY)
                .descripcion("El sistema pierde la conexión con el servidor de manera aleatoria, afectando la carga de datos y el uso normal de la plataforma.")
                .idResponsable("ff14a491-e26d-4092-86ea-d76f20c165d1")
                .fechaCreacion(generateRandomDate2025())
                .build());

        tickets.add(TicketEntity.builder()
                .nombre("Exportación a Excel incompleta")
                .idCliente("3")
                .version(ProductVersionEntity.builder().id(9L).build())
                .estado(TicketStateEnum.FINISHED)
                .severidad(TicketSeverityScaleEnum.LEVEL_1)
                .prioridad(TicketPriorityScaleEnum.LOW_PRIORITY)
                .descripcion("Los reportes exportados a Excel omiten columnas o filas de datos relevantes. Esto impide un análisis externo correcto.")
                .idResponsable("2e6ecd47-fa18-490e-b25a-c9101a398b6d")
                .fechaCreacion(generateRandomDate2025())
                .build());

        tickets.add(TicketEntity.builder()
                .nombre("No se guarda configuración del usuario")
                .idCliente("2")
                .version(ProductVersionEntity.builder().id(10L).build())
                .estado(TicketStateEnum.FINISHED)
                .severidad(TicketSeverityScaleEnum.LEVEL_5)
                .prioridad(TicketPriorityScaleEnum.HIGH_PRIORITY)
                .descripcion("Las preferencias de usuario como idioma, filtros y visualización no se guardan entre sesiones, causando molestias al volver a ingresar.")
                .idResponsable("47f744bb-0553-497a-b6e3-fdb64ddaca2a")
                .fechaCreacion(generateRandomDate2025())
                .build());

        tickets.add(TicketEntity.builder()
                .nombre("Falla en autenticación")
                .idCliente("1")
                .version(ProductVersionEntity.builder().id(9L).build())
                .estado(TicketStateEnum.FINISHED)
                .severidad(TicketSeverityScaleEnum.LEVEL_2)
                .prioridad(TicketPriorityScaleEnum.MEDIUM_PRIORITY)
                .descripcion("Algunos usuarios no pueden autenticarse correctamente con sus credenciales. El sistema devuelve un error de sesión inválida.")
                .idResponsable("a21147f8-6538-46d8-95ac-9ddf95ff8c29")
                .fechaCreacion(generateRandomDate2025())
                .build());

        tickets.add(TicketEntity.builder()
                .nombre("Gráficos desfasados en tiempo")
                .idCliente("3")
                .version(ProductVersionEntity.builder().id(12L).build())
                .estado(TicketStateEnum.FINISHED)
                .severidad(TicketSeverityScaleEnum.LEVEL_3)
                .prioridad(TicketPriorityScaleEnum.LOW_PRIORITY)
                .descripcion("Los datos visualizados en los gráficos no están actualizados con el último cierre diario, generando confusión en las decisiones.")
                .idResponsable("ff14a491-e26d-4092-86ea-d76f20c165d1")
                .fechaCreacion(generateRandomDate2025())
                .build());

        tickets.add(TicketEntity.builder()
                .nombre("Carga lenta de reportes")
                .idCliente("2")
                .version(ProductVersionEntity.builder().id(10L).build())
                .estado(TicketStateEnum.FINISHED)
                .severidad(TicketSeverityScaleEnum.LEVEL_4)
                .prioridad(TicketPriorityScaleEnum.MEDIUM_PRIORITY)
                .descripcion("Los reportes demoran más de lo esperado en renderizarse, especialmente al aplicar múltiples filtros o agrupar información.")
                .idResponsable("2e6ecd47-fa18-490e-b25a-c9101a398b6d")
                .fechaCreacion(generateRandomDate2025())
                .build());

        tickets.add(TicketEntity.builder()
                .nombre("Error 500 al ingresar a módulo de KPIs")
                .idCliente("1")
                .version(ProductVersionEntity.builder().id(12L).build())
                .estado(TicketStateEnum.IN_PROGRESS)
                .severidad(TicketSeverityScaleEnum.LEVEL_1)
                .prioridad(TicketPriorityScaleEnum.HIGH_PRIORITY)
                .descripcion("Al acceder al módulo de KPIs, el sistema lanza un error 500 que impide visualizar cualquier métrica relacionada con el rendimiento.")
                .idResponsable("47f744bb-0553-497a-b6e3-fdb64ddaca2a")
                .fechaCreacion(generateRandomDate2025())
                .build());

        tickets.add(TicketEntity.builder()
                .nombre("Fallo en programación de reportes")
                .idCliente("3")
                .version(ProductVersionEntity.builder().id(9L).build())
                .estado(TicketStateEnum.WAITING_FOR_VALIDATION)
                .severidad(TicketSeverityScaleEnum.LEVEL_2)
                .prioridad(TicketPriorityScaleEnum.HIGH_PRIORITY)
                .descripcion("Las tareas programadas para la generación automática de reportes no se ejecutan en el horario definido o fallan sin razón aparente.")
                .idResponsable("a21147f8-6538-46d8-95ac-9ddf95ff8c29")
                .fechaCreacion(generateRandomDate2025())
                .build());

        tickets.add(TicketEntity.builder()
                .nombre("Error SAP ERP en módulo facturación")
                .idCliente("1")
                .version(ProductVersionEntity.builder().id(34L).build())
                .estado(TicketStateEnum.CREATED)
                .severidad(TicketSeverityScaleEnum.LEVEL_1)
                .prioridad(TicketPriorityScaleEnum.HIGH_PRIORITY)
                .descripcion("El módulo de facturación de SAP ERP genera errores al procesar facturas, impidiendo la emisión correcta de documentos.")
                .idResponsable("ff14a491-e26d-4092-86ea-d76f20c165d1")
                .fechaCreacion(generateRandomDate2025())
                .build());

        tickets.add(TicketEntity.builder()
                .nombre("Performance Tableau post-migración AWS")
                .idCliente("2")
                .version(ProductVersionEntity.builder().id(9L).build())
                .estado(TicketStateEnum.IN_PROGRESS)
                .severidad(TicketSeverityScaleEnum.LEVEL_3)
                .prioridad(TicketPriorityScaleEnum.MEDIUM_PRIORITY)
                .descripcion("Tras la migración a AWS, los dashboards de Tableau presentan lentitud significativa en la carga de datos y visualizaciones.")
                .idResponsable("2e6ecd47-fa18-490e-b25a-c9101a398b6d")
                .fechaCreacion(generateRandomDate2025())
                .build());

        tickets.add(TicketEntity.builder()
                .nombre("Rate limiting WhatsApp API en workflows")
                .idCliente("3")
                .version(ProductVersionEntity.builder().id(13L).build())
                .estado(TicketStateEnum.WAITING_FOR_VALIDATION)
                .severidad(TicketSeverityScaleEnum.LEVEL_2)
                .prioridad(TicketPriorityScaleEnum.HIGH_PRIORITY)
                .descripcion("Los workflows que utilizan la WhatsApp API están siendo limitados por restricciones de tasa, causando retrasos en las notificaciones.")
                .idResponsable("47f744bb-0553-497a-b6e3-fdb64ddaca2a")
                .fechaCreacion(generateRandomDate2025())
                .build());

        tickets.add(TicketEntity.builder()
                .nombre("Fallos integración POS en rollout retail")
                .idCliente("1")
                .version(ProductVersionEntity.builder().id(26L).build())
                .estado(TicketStateEnum.FINISHED)
                .severidad(TicketSeverityScaleEnum.LEVEL_2)
                .prioridad(TicketPriorityScaleEnum.MEDIUM_PRIORITY)
                .descripcion("Durante el rollout de sistemas POS en tiendas retail, se detectaron fallos en la integración con el ERP, afectando las transacciones.")
                .idResponsable("a21147f8-6538-46d8-95ac-9ddf95ff8c29")
                .fechaCreacion(generateRandomDate2025())
                .build());

        tickets.add(TicketEntity.builder()
                .nombre("Backup fallido en migración repositorios")
                .idCliente("2")
                .version(ProductVersionEntity.builder().id(24L).build())
                .estado(TicketStateEnum.CREATED)
                .severidad(TicketSeverityScaleEnum.LEVEL_4)
                .prioridad(TicketPriorityScaleEnum.HIGH_PRIORITY)
                .descripcion("Los procesos de backup durante la migración de repositorios fallaron, poniendo en riesgo la integridad de los datos.")
                .idResponsable("ff14a491-e26d-4092-86ea-d76f20c165d1")
                .fechaCreacion(generateRandomDate2025())
                .build());

        ticketDAO.saveAll(tickets);
    };
    }

    private static LocalDate generateRandomDate2025() {
        int dayOfYear = random.nextInt(365) + 1; // 1 to 365
        return LocalDate.ofYearDay(2025, dayOfYear);
    }
}
