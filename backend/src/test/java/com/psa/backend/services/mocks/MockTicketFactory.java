package com.psa.backend.services.mocks;

import com.psa.backend.dto.ResponseTicketDTO;
import com.psa.backend.enums.TicketPriorityScaleEnum;
import com.psa.backend.enums.TicketSeverityScaleEnum;
import com.psa.backend.enums.TicketStateEnum;

import java.util.Arrays;
import java.util.List;

public class MockTicketFactory {

    public static List<ResponseTicketDTO> crearTicketsDeEjemplo() {
        return Arrays.asList(
                ResponseTicketDTO.builder()
                        .internalId("BI-000001")
                        .codigo("BI-000001")
                        .nombre("Error al cargar dashboard")
                        .prioridad(TicketPriorityScaleEnum.HIGH_PRIORITY)
                        .severidad(TicketSeverityScaleEnum.LEVEL_3)
                        .estado(TicketStateEnum.CREATED)
                        .descripcion("El dashboard principal no se carga correctamente")
                        .version("1.2.0")
                        .idProducto("1")
                        .idCliente("1")
                        .idResponsable("1")
                        .build(),

                ResponseTicketDTO.builder()
                        .internalId("BI-000002")
                        .codigo("BI-000002")
                        .nombre("Datos incorrectos en gráfico")
                        .prioridad(TicketPriorityScaleEnum.MEDIUM_PRIORITY)
                        .severidad(TicketSeverityScaleEnum.LEVEL_5)
                        .estado(TicketStateEnum.IN_PROGRESS)
                        .descripcion("El gráfico de ventas muestra cifras equivocadas")
                        .version("1.1.0")
                        .idProducto("2")
                        .idCliente("2")
                        .idResponsable("2")
                        .build()
        );
    }
}
