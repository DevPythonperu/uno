package com.wheelz.api.dto.reserva;

import com.wheelz.api.entity.reserva.EstadoReserva;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReservaResponse {
    private Long id;
    private Long idUsuario;
    private Long idcarro;
    private Date fechaEntrega;
    private Date fechaDevolucion;
    private Long idTipoCobertura;
    private EstadoReserva estadoReserva;
    private BigDecimal precioTotal;
    private String qr;
}
