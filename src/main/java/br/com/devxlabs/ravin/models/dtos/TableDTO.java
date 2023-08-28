package br.com.devxlabs.ravin.models.dtos;

import br.com.devxlabs.ravin.enums.TableStatus;
import br.com.devxlabs.ravin.models.entities.Employee;
import br.com.devxlabs.ravin.models.entities.Tab;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.io.Serial;
import java.util.List;

public class TableDTO {

    private static final int MIN_NUMBER_VALUE = 1;

    @Serial
    private static final long serialVersionUID = 1L;

    private int id;

    @NotNull(message = "É necessário informar um funcionário")
    private Employee employee;

    private List<Tab> tabs;

    @NotBlank(message = "O campo nome não pode estar em branco")
    @NotEmpty(message = "O campo nome não pode ser vázio")
    private String name;

    @NotBlank(message = "O campo código não pode estar em branco")
    @NotEmpty(message = "O campo código não pode ser vázio")
    private String code;

    @NotBlank(message = "O campo número não pode estar em branco")
    @NotEmpty(message = "O campo número não pode ser vázio")
    @Min(MIN_NUMBER_VALUE)
    private int number;

    @NotBlank(message = "O campo status da mesa não pode estar em branco")
    @NotEmpty(message = "O campo status da mesa não pode ser vázio")
    private TableStatus tableStatus;

    public TableDTO() {
    }

    public TableDTO(int id,
                    @NotNull(message = "É necessário informar um funcionário") Employee employee,
                    List<Tab> tabs,
                    @NotBlank(message = "O campo nome não pode estar em branco") @NotEmpty(message = "O campo nome não pode ser vázio") String name,
                    @NotBlank(message = "O campo código não pode estar em branco") @NotEmpty(message = "O campo código não pode ser vázio") String code,
                    @NotBlank(message = "O campo número não pode estar em branco") @NotEmpty(message = "O campo número não pode ser vázio") int number,
                    @NotBlank(message = "O campo status da mesa não pode estar em branco") @NotEmpty(message = "O campo status da mesa não pode ser vázio") TableStatus tableStatus) {
        super();
        this.id = id;
        this.employee = employee;
        this.tabs = tabs;
        this.name = name;
        this.code = code;
        this.number = number;
        this.tableStatus = tableStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public List<Tab> getTabs() {
        return tabs;
    }

    public void setTabs(List<Tab> tabs) {
        this.tabs = tabs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public TableStatus getTableStatus() {
        return tableStatus;
    }

    public void setTableStatus(TableStatus tableStatus) {
        this.tableStatus = tableStatus;
    }
}
