package br.com.devxlabs.ravin.models.dtos;

import br.com.devxlabs.ravin.enums.EmployeeAviability;
import br.com.devxlabs.ravin.enums.MeritalStatus;
import br.com.devxlabs.ravin.enums.Responsibility;
import br.com.devxlabs.ravin.enums.Schooling;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.br.CPF;

import java.io.Serial;
import java.util.Date;

public class EmployeeDTO {

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

    @NotBlank(message = "O campo rg não pode estar em branco")
    @NotEmpty(message = "O campo rg não pode ser vázio")
    private String rg;

    @NotBlank(message = "O campo estado civil não pode estar em branco")
    @NotEmpty(message = "O campo estado civil não pode ser vázio")
    private MeritalStatus meritalStatus;

    @NotBlank(message = "O campo escolaridade não pode estar em branco")
    @NotEmpty(message = "O campo escolaridade não pode ser vázio")
    private Schooling schooling;

    @NotBlank(message = "O campo responsabilidade não pode estar em branco")
    @NotEmpty(message = "O campo responsabilidade não pode ser vázio")
    private Responsibility responsability;

    @NotBlank(message = "O campo PIS não pode estar em branco")
    @NotEmpty(message = "O campo PIS não pode ser vázio")
    private int pis;

    private Date admissionDate;

    private Date resignationDate;

    @NotBlank(message = "O campo disponibilidade não pode estar em branco")
    @NotEmpty(message = "O campo disponibilidade não pode ser vázio")
    private EmployeeAviability employeeAviability;

}
