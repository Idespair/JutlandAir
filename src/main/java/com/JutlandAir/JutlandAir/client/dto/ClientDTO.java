package com.JutlandAir.JutlandAir.client.dto;

import com.JutlandAir.JutlandAir.client.model.Client;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClientDTO {

    private String id;

    private String name;

    private String lastName;

    private String email;

    private String countryOfBirth;
}
