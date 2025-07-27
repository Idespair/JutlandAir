package com.JutlandAir.JutlandAir.client.dto.output;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SeatDTO {

private String id;

private String seatNumber;

    public SeatDTO(String id, String seatNumber) {
        this.id = id;
        this.seatNumber = seatNumber;
    }
}
