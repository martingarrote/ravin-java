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

    public EmployeeDTO() {
    }

    public EmployeeDTO(int id,
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
                       @NotBlank(message = "O campo rg não pode estar em branco") @NotEmpty(message = "O campo rg não pode ser vázio") String rg,
                       @NotBlank(message = "O campo estado civil não pode estar em branco") @NotEmpty(message = "O campo estado civil não pode ser vázio") MeritalStatus meritalStatus,
                       @NotBlank(message = "O campo escolaridade não pode estar em branco") @NotEmpty(message = "O campo escolaridade não pode ser vázio") Schooling schooling,
                       @NotBlank(message = "O campo responsabilidade não pode estar em branco") @NotEmpty(message = "O campo responsabilidade não pode ser vázio") Responsibility responsability,
                       @NotBlank(message = "O campo pis não pode estar em branco") @NotEmpty(message = "O campo pis não pode ser vázio") int pis,
                       Date admissionDate,
                       Date resignationDate,
                       @NotBlank(message = "O campo disponibilidade não pode estar em branco") @NotEmpty(message = "O campo disponibilidade não pode ser vázio") EmployeeAviability employeeAviability) {
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
        this.rg = rg;
        this.meritalStatus = meritalStatus;
        this.schooling = schooling;
        this.responsability = responsability;
        this.pis = pis;
        this.admissionDate = admissionDate;
        this.resignationDate = resignationDate;
        this.employeeAviability = employeeAviability;
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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public MeritalStatus getMeritalStatus() {
        return meritalStatus;
    }

    public void setMeritalStatus(MeritalStatus meritalStatus) {
        this.meritalStatus = meritalStatus;
    }

    public Schooling getSchooling() {
        return schooling;
    }

    public void setSchooling(Schooling schooling) {
        this.schooling = schooling;
    }

    public Responsibility getResponsability() {
        return responsability;
    }

    public void setResponsability(Responsibility responsability) {
        this.responsability = responsability;
    }

    public int getPis() {
        return pis;
    }

    public void setPis(int pis) {
        this.pis = pis;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public Date getResignationDate() {
        return resignationDate;
    }

    public void setResignationDate(Date resignationDate) {
        this.resignationDate = resignationDate;
    }

    public EmployeeAviability getEmployeeAviability() {
        return employeeAviability;
    }

    public void setEmployeeAviability(EmployeeAviability employeeAviability) {
        this.employeeAviability = employeeAviability;
    }
}
