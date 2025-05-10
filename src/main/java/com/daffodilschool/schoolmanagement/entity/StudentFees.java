package com.daffodilschool.schoolmanagement.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;

@Entity
@Data
@Getter
@Setter
public class StudentFees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private StudentEntry student;

    @ManyToOne
    @JoinColumn(name = "feetypeid")
    private FeeType feeType;

    //private Double totalfees;
    private Double amountpaid;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate feespaiddate;
    private String modeoftransaction;
    private Long transactionId;
    private String registerrecieptid;
    @CreationTimestamp
    private LocalDate createddate;
    private String createdby;
    @UpdateTimestamp
    private LocalDate updateddate;
    private String updatedby;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public StudentEntry getStudent() {
        return student;
    }

    public void setStudent(StudentEntry student) {
        this.student = student;
    }

    public FeeType getFeeType() {
        return feeType;
    }

    public void setFeeType(FeeType feeType) {
        this.feeType = feeType;
    }

/*    public Double getTotalfees() {
        return totalfees;
    }

    public void setTotalfees(Double totalfees) {
        this.totalfees = totalfees;
    }*/

    public Double getAmountpaid() {
        return amountpaid;
    }

    public void setAmountpaid(Double amountpaid) {
        this.amountpaid = amountpaid;
    }

    public LocalDate getFeespaiddate() {
        return feespaiddate;
    }

    public void setFeespaiddate(LocalDate feespaiddate) {
        this.feespaiddate = feespaiddate;
    }

    public String getModeoftransaction() {
        return modeoftransaction;
    }

    public void setModeoftransaction(String modeoftransaction) {
        this.modeoftransaction = modeoftransaction;
    }

    public String getRegisterrecieptid() {
        return registerrecieptid;
    }

    public void setRegisterrecieptid(String registerrecieptid) {
        this.registerrecieptid = registerrecieptid;
    }

    public LocalDate getCreateddate() {
        return createddate;
    }

    public void setCreateddate(LocalDate createddate) {
        this.createddate = createddate;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public LocalDate getUpdateddate() {
        return updateddate;
    }

    public void setUpdateddate(LocalDate updateddate) {
        this.updateddate = updateddate;
    }

    public String getUpdatedby() {
        return updatedby;
    }

    public void setUpdatedby(String updatedby) {
        this.updatedby = updatedby;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }
}
