package br.com.devxlabs.ravin.models.dtos;

import br.com.devxlabs.ravin.enums.CommandaStatus;
import br.com.devxlabs.ravin.models.entities.Customer;
import br.com.devxlabs.ravin.models.entities.OrderDetail;
import br.com.devxlabs.ravin.models.entities.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.io.Serial;
import java.util.List;

public class TabDTO {

    @Serial
    private static final long serialVersionUID = 1L;

    private int id;

    @NotNull(message = "É necessário ter uma mesa vinculada a comanda.")
    private Table table;

    private Customer customer;

    private List<OrderDetail> orders;

    @NotBlank(message = "O campo código não pode estar em branco")
    @NotEmpty(message = "O campo código não pode ser vázio")
    private String code;

    private String comments;

    @NotBlank(message = "O campo status não pode estar em branco")
    @NotEmpty(message = "O campo status não pode ser vázio")
    private CommandaStatus tabStatus;

    public TabDTO() {
    }

    public TabDTO(int id,
                  @NotNull(message = "É necessário ter uma mesa vinculada a comanda.") Table table,
                  Customer customer,
                  List<OrderDetail> orders,
                  @NotBlank(message = "O campo código não pode estar em branco") @NotEmpty(message = "O campo código não pode ser vázio") String code,
                  String comments,
                  @NotBlank(message = "O campo status não pode estar em branco") @NotEmpty(message = "O campo status não pode ser vázio") CommandaStatus tabStatus) {
        super();
        this.id = id;
        this.table = table;
        this.customer = customer;
        this.orders = orders;
        this.code = code;
        this.comments = comments;
        this.tabStatus = tabStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<OrderDetail> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderDetail> orders) {
        this.orders = orders;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public CommandaStatus getTabStatus() {
        return tabStatus;
    }

    public void setTabStatus(CommandaStatus tabStatus) {
        this.tabStatus = tabStatus;
    }
}
