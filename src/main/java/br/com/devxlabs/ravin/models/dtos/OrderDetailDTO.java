package br.com.devxlabs.ravin.models.dtos;

import br.com.devxlabs.ravin.enums.PreparationOrderStatus;
import br.com.devxlabs.ravin.models.entities.Product;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.io.Serial;
import java.sql.Timestamp;

public class OrderDetailDTO {

    public static final Long MIN_QUANTITY = 1L;

    @Serial
    private static final long serialVersionUID = 1L;

    private int id;

    @NotNull(message = "É necessário ter um produto associado a um pedido.")
    private Product product;

    private Timestamp requestDateTime;
    private Timestamp startPreparationDateTime;

    private Timestamp remindingPreparationTime;

    @NotBlank(message = "O campo status de preparação não pode estar em branco")
    @NotEmpty(message = "O campo status de preparação não pode ser vázio")
    private PreparationOrderStatus preparationOrderStatus;

    private String comments;

    @NotBlank(message = "O campo quantidade não pode estar em branco")
    @NotEmpty(message = "O campo quantidade não pode ser vázio")
    @Min(value = MIN_QUANTITY, message = "A quantidade deve ser no mínimo um")
    private int quantity;

    public OrderDetailDTO() {
    }

    public OrderDetailDTO(int id,
                          @NotNull(message = "É necessário ter um produto associado a um pedido.") Product product,
                          Timestamp requestDateTime,
                          Timestamp startPreparationDateTime,
                          Timestamp remindingPreparationTime,
                          @NotBlank(message = "O campo status de preparação não pode estar em branco") @NotEmpty(message = "O campo status de preparação não pode ser vázio") PreparationOrderStatus preparationOrderStatus,
                          String comments,
                          @NotBlank(message = "O campo quantidade não pode estar em branco") @NotEmpty(message = "O campo quantidade não pode ser vázio") @Min(value = MIN_QUANTITY, message = "A quantidade deve ser no mínimo um") int quantity) {
        super();
        this.id = id;
        this.product = product;
        this.requestDateTime = requestDateTime;
        this.startPreparationDateTime = startPreparationDateTime;
        this.remindingPreparationTime = remindingPreparationTime;
        this.preparationOrderStatus = preparationOrderStatus;
        this.comments = comments;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Timestamp getRequestDateTime() {
        return requestDateTime;
    }

    public void setRequestDateTime(Timestamp requestDateTime) {
        this.requestDateTime = requestDateTime;
    }

    public Timestamp getStartPreparationDateTime() {
        return startPreparationDateTime;
    }

    public void setStartPreparationDateTime(Timestamp startPreparationDateTime) {
        this.startPreparationDateTime = startPreparationDateTime;
    }

    public Timestamp getRemindingPreparationTime() {
        return remindingPreparationTime;
    }

    public void setRemindingPreparationTime(Timestamp remindingPreparationTime) {
        this.remindingPreparationTime = remindingPreparationTime;
    }

    public PreparationOrderStatus getPreparationOrderStatus() {
        return preparationOrderStatus;
    }

    public void setPreparationOrderStatus(PreparationOrderStatus preparationOrderStatus) {
        this.preparationOrderStatus = preparationOrderStatus;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
