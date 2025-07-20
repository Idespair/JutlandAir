package com.JutlandAir.JutlandAir.client.dto;

import com.JutlandAir.JutlandAir.client.model.Client;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ClientDTO {

    private String id;

    private String name;

    private String lastName;

    private String email;

    private String countryOfBirth;

    public ClientDTO(Client client) {
        this.id = client.getId();
        this.name = client.getName();
        this.lastName = client.getLastName();
        this.email = client.getEmail();
        this.countryOfBirth = client.getCountryOfBirth();
    }

}
