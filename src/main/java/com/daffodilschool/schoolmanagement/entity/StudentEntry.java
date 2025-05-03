package com.daffodilschool.schoolmanagement.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "studentdata")
public class StudentEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstname;
    private String middlename;
    private String lastname;
    private String fullname;
    private String fatheraadharno;
    private String mothername;
    private String motheraadharno;
    private String acadamicyear;
    private String nationality;
    private String religion;
    private String caste;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate dateofbirth;
    private String placeofbirth;
    private String bloodgroup;
    private String district;
    private String state;
    private String languagespoken;
    private String admissionclass;
    private String qualificationfather;
    private String qualificationmother;
    private String occupationfather;
    private String occupationmother;
    private String residentialaddress;
    private String permantaddress;
    private String parentcontactnumber;
    private String alternativecontactnumber;
    private String parentofficeaddress;
    private String parentofficephone;
    private String parentannulaincome;
    private String distancehometoschool;
    private String studentid;
    private String udisenumber;
    private String studentphoto;
    private int numberofdownloadlc;
    private int numberofdownloadbonafied;
    private Boolean isactive;
    private Boolean isfeespaid;
    private String studentaadharno;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate dateofaddmission;
    private Boolean isdeclarationdone;
    private double  totalfesspaid;
    private Boolean isbusserviceopt;
    private String grnumber;
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<StudentFees> feesRecords = new ArrayList<>();

    @CreationTimestamp
    private Date createddate;

    private String createdby;

    @UpdateTimestamp
    private Date updateddate;


    private String updatedby;
    // getters and setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getFatheraadharno() {
        return fatheraadharno;
    }

    public void setFatheraadharno(String fatheraadharno) {
        this.fatheraadharno = fatheraadharno;
    }

    public String getMothername() {
        return mothername;
    }

    public void setMothername(String mothername) {
        this.mothername = mothername;
    }

    public String getMotheraadharno() {
        return motheraadharno;
    }

    public void setMotheraadharno(String motheraadharno) {
        this.motheraadharno = motheraadharno;
    }

    public String getAcadamicyear() {
        return acadamicyear;
    }

    public void setAcadamicyear(String acadamicyear) {
        this.acadamicyear = acadamicyear;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getCaste() {
        return caste;
    }

    public void setCaste(String caste) {
        this.caste = caste;
    }

    public LocalDate getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(LocalDate dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getPlaceofbirth() {
        return placeofbirth;
    }

    public void setPlaceofbirth(String placeofbirth) {
        this.placeofbirth = placeofbirth;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLanguagespoken() {
        return languagespoken;
    }

    public void setLanguagespoken(String languagespoken) {
        this.languagespoken = languagespoken;
    }

    public String getAdmissionclass() {
        return admissionclass;
    }

    public void setAdmissionclass(String admissionclass) {
        this.admissionclass = admissionclass;
    }

    public String getQualificationfather() {
        return qualificationfather;
    }

    public void setQualificationfather(String qualificationfather) {
        this.qualificationfather = qualificationfather;
    }

    public String getQualificationmother() {
        return qualificationmother;
    }

    public void setQualificationmother(String qualificationmother) {
        this.qualificationmother = qualificationmother;
    }

    public String getOccupationfather() {
        return occupationfather;
    }

    public void setOccupationfather(String occupationfather) {
        this.occupationfather = occupationfather;
    }

    public String getOccupationmother() {
        return occupationmother;
    }

    public void setOccupationmother(String occupationmother) {
        this.occupationmother = occupationmother;
    }

    public String getResidentialaddress() {
        return residentialaddress;
    }

    public void setResidentialaddress(String residentialaddress) {
        this.residentialaddress = residentialaddress;
    }

    public String getPermantaddress() {
        return permantaddress;
    }

    public void setPermantaddress(String permantaddress) {
        this.permantaddress = permantaddress;
    }

    public String getParentcontactnumber() {
        return parentcontactnumber;
    }

    public void setParentcontactnumber(String parentcontactnumber) {
        this.parentcontactnumber = parentcontactnumber;
    }

    public String getAlternativecontactnumber() {
        return alternativecontactnumber;
    }

    public void setAlternativecontactnumber(String alternativecontactnumber) {
        this.alternativecontactnumber = alternativecontactnumber;
    }

    public String getParentofficeaddress() {
        return parentofficeaddress;
    }

    public void setParentofficeaddress(String parentofficeaddress) {
        this.parentofficeaddress = parentofficeaddress;
    }

    public String getParentofficephone() {
        return parentofficephone;
    }

    public void setParentofficephone(String parentofficephone) {
        this.parentofficephone = parentofficephone;
    }

    public String getParentannulaincome() {
        return parentannulaincome;
    }

    public void setParentannulaincome(String parentannulaincome) {
        this.parentannulaincome = parentannulaincome;
    }

    public String getDistancehometoschool() {
        return distancehometoschool;
    }

    public void setDistancehometoschool(String distancehometoschool) {
        this.distancehometoschool = distancehometoschool;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getUdisenumber() {
        return udisenumber;
    }

    public void setUdisenumber(String udisenumber) {
        this.udisenumber = udisenumber;
    }

    public String getStudentphoto() {
        return studentphoto;
    }

    public void setStudentphoto(String studentphoto) {
        this.studentphoto = studentphoto;
    }

    public int getNumberofdownloadlc() {
        return numberofdownloadlc;
    }

    public void setNumberofdownloadlc(int numberofdownloadlc) {
        this.numberofdownloadlc = numberofdownloadlc;
    }

    public int getNumberofdownloadbonafied() {
        return numberofdownloadbonafied;
    }

    public void setNumberofdownloadbonafied(int numberofdownloadbonafied) {
        this.numberofdownloadbonafied = numberofdownloadbonafied;
    }

    public Boolean getIsactive() {
        return isactive;
    }

    public void setIsactive(Boolean isactive) {
        this.isactive = isactive;
    }

    public Boolean getIsfeespaid() {
        return isfeespaid;
    }

    public void setIsfeespaid(Boolean isfeespaid) {
        this.isfeespaid = isfeespaid;
    }

    public String getStudentaadharno() {
        return studentaadharno;
    }

    public void setStudentaadharno(String studentaadharno) {
        this.studentaadharno = studentaadharno;
    }

    public LocalDate getDateofaddmission() {
        return dateofaddmission;
    }

    public void setDateofaddmission(LocalDate dateofaddmission) {
        this.dateofaddmission = dateofaddmission;
    }

    public Boolean getIsdeclarationdone() {
        return isdeclarationdone;
    }

    public void setIsdeclarationdone(Boolean isdeclarationdone) {
        this.isdeclarationdone = isdeclarationdone;
    }

    public double getTotalfesspaid() {
        return totalfesspaid;
    }

    public void setTotalfesspaid(double totalfesspaid) {
        this.totalfesspaid = totalfesspaid;
    }

    public Boolean getIsbusserviceopt() {
        return isbusserviceopt;
    }

    public void setIsbusserviceopt(Boolean isbusserviceopt) {
        this.isbusserviceopt = isbusserviceopt;
    }

    public String getGrnumber() {
        return grnumber;
    }

    public void setGrnumber(String grnumber) {
        this.grnumber = grnumber;
    }

    public List<StudentFees> getFeesRecords() {
        return feesRecords;
    }

    public void setFeesRecords(List<StudentFees> feesRecords) {
        this.feesRecords = feesRecords;
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public Date getUpdateddate() {
        return updateddate;
    }

    public void setUpdateddate(Date updateddate) {
        this.updateddate = updateddate;
    }

    public String getUpdatedby() {
        return updatedby;
    }

    public void setUpdatedby(String updatedby) {
        this.updatedby = updatedby;
    }
}
