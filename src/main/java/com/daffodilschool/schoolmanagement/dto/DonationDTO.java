package com.daffodilschool.schoolmanagement.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DonationDTO {
    private Long id;
    private String registerreciptid;
    private String danoarname;
    private String donaraddress;
    private Double donationamount;
    private String donarcontactnumber;

    private String donationType;
    private String donationDescription;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate donationdate;
    private String donarpancardno;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate createddate;
    private String createdby;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate updateddate;
    private String updatedby;

    private String modeoftransaction;
    private Long transactionId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRegisterreciptid() {
        return registerreciptid;
    }

    public void setRegisterreciptid(String registerreciptid) {
        this.registerreciptid = registerreciptid;
    }

    public String getDanoarname() {
        return danoarname;
    }

    public void setDanoarname(String danoarname) {
        this.danoarname = danoarname;
    }

    public String getDonaraddress() {
        return donaraddress;
    }

    public void setDonaraddress(String donaraddress) {
        this.donaraddress = donaraddress;
    }

    public Double getDonationamount() {
        return donationamount;
    }

    public void setDonationamount(Double donationamount) {
        this.donationamount = donationamount;
    }

    public String getDonarcontactnumber() {
        return donarcontactnumber;
    }

    public void setDonarcontactnumber(String donarcontactnumber) {
        this.donarcontactnumber = donarcontactnumber;
    }

    public LocalDate getDonationdate() {
        return donationdate;
    }

    public void setDonationdate(LocalDate donationdate) {
        this.donationdate = donationdate;
    }

    public String getDonarpancardno() {
        return donarpancardno;
    }

    public void setDonarpancardno(String donarpancardno) {
        this.donarpancardno = donarpancardno;
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

    public String getDonationType() {
        return donationType;
    }

    public void setDonationType(String donationType) {
        this.donationType = donationType;
    }

    public String getDonationDescription() {
        return donationDescription;
    }

    public void setDonationDescription(String donationDescription) {
        this.donationDescription = donationDescription;
    }

    public String getModeoftransaction() {
        return modeoftransaction;
    }

    public void setModeoftransaction(String modeoftransaction) {
        this.modeoftransaction = modeoftransaction;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }
}