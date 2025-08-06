package com.JutlandAir.JutlandAir.client.dto.request;

import com.JutlandAir.JutlandAir.client.model.Gender;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClientRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String lastName;

    @NotNull
    private Gender gender;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String countryOfBirth;

    @NotBlank
    private String passport;

    @NotBlank
    @Size(min = 8, message = "Password must be at least 8 characters")
    private String password;
}
