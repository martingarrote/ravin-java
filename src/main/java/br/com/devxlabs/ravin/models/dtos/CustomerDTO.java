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

    public CustomerDTO() {
    }

    public CustomerDTO(int id,
                       @NotBlank(message = "O campo nome não pode estar em branco") @NotEmpty(message = "O campo nome não pode ser vázio") String name,
                       String state,
                       String city,
                       String street,
                       String zipCode,
                       String phone,
                       @CPF @NotBlank(message = "O campo CPF não pode estar em branco") @NotEmpty(message = "O campo CPF não pode ser vázio") String cpf,
                       Date dateOfBirth,
                       String observations,
                       boolean hasActive,
                       String allergies,
                       boolean vip) {
        super();
        this.id = id;
        this.name = name;
        this.state = state;
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
        this.phone = phone;
        this.cpf = cpf;
        this.dateOfBirth = dateOfBirth;
        this.observations = observations;
        this.hasActive = hasActive;
        this.allergies = allergies;
        this.vip = vip;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public boolean isHasActive() {
        return hasActive;
    }

    public void setHasActive(boolean hasActive) {
        this.hasActive = hasActive;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
}
