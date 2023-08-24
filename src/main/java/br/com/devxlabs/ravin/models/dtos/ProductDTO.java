package br.com.devxlabs.ravin.models.dtos;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

import br.com.devxlabs.ravin.enums.ProductType;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

public class ProductDTO implements Serializable {

    private static final String MIN_COST_PRICE = "0.0";
    private static final String MIN_SALE_PRICE = "0.0";

    @Serial
    private static final long serialVersionUID = 1L;

    private int id;

    @NotBlank(message = "O campo nome não pode estar em branco")
    @NotEmpty(message = "O campo nome não pode ser vázio")
    private String name;

    @NotBlank(message = "O campo descrição não pode estar em branco")
    @NotEmpty(message = "O campo descrição não pode ser vázio")
    private String description;

    @NotBlank(message = "O campo código não pode estar em branco")
    @NotEmpty(message = "O campo código não pode ser vázio")
    private String code;

    @DecimalMin(value = MIN_COST_PRICE, message = "O preço de custo não pode ser negativo")
    private double costPrice;

    @DecimalMin(value = MIN_SALE_PRICE, message = "O preço de venda não pode ser negativo")
    private double salePrice;

    @NotBlank(message = "O campo tempo de preparação não pode estar em branco")
    @NotEmpty(message = "O campo tempo de preparação não pode ser vázio")
    private String preparationTime;

    @NotBlank(message = "O campo tipo de produto não pode estar em branco")
    @NotEmpty(message = "O campo tipo de produto não pode ser vázio")
    private ProductType productType;

    private boolean hasActive = true;

    public ProductDTO() {

    }

    public ProductDTO(int id,
                      @NotBlank(message = "O campo nome não pode estar em branco") @NotEmpty(message = "O campo nome não pode ser vázio") String name,
                      @NotBlank(message = "O campo descrição não pode estar em branco") @NotEmpty(message = "O campo descrição não pode ser vázio") String description,
                      @NotBlank(message = "O campo codigo não pode estar em branco") @NotEmpty(message = "O campo codigo não pode ser vázio") String code,
                      @DecimalMin(value = MIN_COST_PRICE, message = "O preço de custo não pode ser negativo") double costPrice,
                      @DecimalMin(value = MIN_SALE_PRICE, message = "O preço de venda não pode ser negativo") double salePrice,
                      @NotBlank(message = "O campo tempo de preparação não pode estar em branco") @NotEmpty(message = "O campo tempo de preparação não pode ser vázio") String preparationTime,
                      @NotBlank(message = "O campo tipo de produto não pode estar em branco") @NotEmpty(message = "O campo tipo de produto não pode ser vázio") ProductType productType,
                      boolean hasActive) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.code = code;
        this.costPrice = costPrice;
        this.salePrice = salePrice;
        this.preparationTime = preparationTime;
        this.productType = productType;
        this.hasActive = hasActive;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public String getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(String preparationTime) {
        this.preparationTime = preparationTime;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public boolean isHasActive() {
        return hasActive;
    }

    public void setHasActive(boolean hasActive) {
        this.hasActive = hasActive;
    }
}