package br.com.devxlabs.ravin.models.dtos;

import br.com.devxlabs.ravin.enums.CommandaStatus;
import br.com.devxlabs.ravin.models.entities.Customer;
import br.com.devxlabs.ravin.models.entities.OrderDetail;
import br.com.devxlabs.ravin.models.entities.Table;
import jakarta.persistence.*;
import jakarta.validation.Valid;
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
}
