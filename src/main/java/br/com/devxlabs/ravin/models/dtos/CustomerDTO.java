package br.com.devxlabs.ravin.models.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.br.CPF;

import java.io.Serial;
import java.util.Date;

public class CustomerDTO {

    @Serial
    private static final long serialVersionUID = 1L;

    private int id;

    @NotBlank(message = "O campo nome não pode estar em branco")
    @NotEmpty(message = "O campo nome não pode ser vázio")
    private String name;

    private String state;

    private String city;

    private String street;

    private String zipCode;

    private String phone;

    @CPF
    @NotBlank(message = "O campo CPF não pode estar em branco")
    @NotEmpty(message = "O campo CPF não pode ser vázio")
    private String cpf;

    private Date dateOfBirth;
    private String observations;

    private boolean hasActive = true;

    private String allergies;

    private boolean vip;
}
