package com.daffodilschool.schoolmanagement.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Donation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String registerreciptid;
    private String donarname;
    private String donaraddress;
    private Double donationamount;
    private String donarcontactnumber;

    private String donationType;
    private String donationDescription;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate donationdate;
    private String donarpancardno;
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

    public String getRegisterreciptid() {
        return registerreciptid;
    }

    public void setRegisterreciptid(String registerreciptid) {
        this.registerreciptid = registerreciptid;
    }

    public String getDonarname() {
        return donarname;
    }

    public void setDonarname(String donarname) {
        this.donarname = donarname;
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
}