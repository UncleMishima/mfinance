package com.mishima.mfinance.service.dto;

import java.math.BigDecimal;
import java.time.Instant;

public class ExpenseDTO {

    private Long id;

    private BigDecimal amount;

    private String comment;

    private Instant date;

    private String categoryName;

    public Long getId() {
        return id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getComment() {
        return comment;
    }

    public Instant getDate() {
        return date;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
