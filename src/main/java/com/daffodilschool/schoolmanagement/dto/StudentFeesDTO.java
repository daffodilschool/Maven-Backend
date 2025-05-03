package com.daffodilschool.schoolmanagement.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;
@Data
public class StudentFeesDTO {

    private Long id;
    private Long studentId;
    private Long feeTypeId;
    //private Double totalfees;
    private Double amountpaid;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate feespaiddate;
    private String modeoftransaction;
    private String registerrecieptid;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate createddate;
    private String createdby;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate updateddate;
    private String updatedby;

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getFeeTypeId() {
        return feeTypeId;
    }

    public void setFeeTypeId(Long feeTypeId) {
        this.feeTypeId = feeTypeId;
    }




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
}
