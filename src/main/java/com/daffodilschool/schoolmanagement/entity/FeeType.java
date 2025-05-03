package com.daffodilschool.schoolmanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class FeeType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long feeid;

    private String feestype;
    private Double feeamount;

    public Long getFeeid() {
        return feeid;
    }

    public void setFeeid(Long feeid) {
        this.feeid = feeid;
    }

    public String getFeestype() {
        return feestype;
    }

    public void setFeestype(String feestype) {
        this.feestype = feestype;
    }

    public Double getFeeamount() {
        return feeamount;
    }

    public void setFeeamount(Double feeamount) {
        this.feeamount = feeamount;
    }
// Getters and setters
}
