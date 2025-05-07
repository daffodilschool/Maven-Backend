package com.daffodilschool.schoolmanagement.dto;

public class FeeSummaryDTO {
    private Long feeTypeId;
    private String feeTypeName;
    private Double totalAmount;
    private Double paidAmount;
    private Double remainingAmount;
    public FeeSummaryDTO(Long feeTypeId, String feeTypeName, Double totalAmount, Double paidAmount) {
        this.feeTypeId = feeTypeId;
        this.feeTypeName = feeTypeName;
        this.totalAmount = totalAmount;
        this.paidAmount = paidAmount != null ? paidAmount : 0.0;
        this.remainingAmount = totalAmount - this.paidAmount;
    }

    public Long getFeeTypeId() {
        return feeTypeId;
    }

    public void setFeeTypeId(Long feeTypeId) {
        this.feeTypeId = feeTypeId;
    }

    public String getFeeTypeName() {
        return feeTypeName;
    }

    public void setFeeTypeName(String feeTypeName) {
        this.feeTypeName = feeTypeName;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(Double paidAmount) {
        this.paidAmount = paidAmount;
    }

    public Double getRemainingAmount() {
        return remainingAmount;
    }

    public void setRemainingAmount(Double remainingAmount) {
        this.remainingAmount = remainingAmount;
    }
}
