package com.JutlandAir.JutlandAir.client.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class ReservationDTO {

    private String id;

    private LocalDateTime reservationDate;

    private String clientId;

    private String clientName;

    private String seatId;

    public ReservationDTO(String id, LocalDateTime reservationDate, String clientId, String clientName, String seatId) {
        this.id = id;
        this.reservationDate = reservationDate;
        this.clientId = clientId;
        this.clientName = clientName;
        this.seatId = seatId;
    }
}
