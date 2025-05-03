package com.daffodilschool.schoolmanagement.dto;

import lombok.Data;

@Data
public class StudentFeeSummaryDTO {
    private Long studentId;
    private String studentName;
    private Double totalFees;
    private Double totalPaid;
    private Double remainingFees;

    // Constructors
    public StudentFeeSummaryDTO() {}

    public StudentFeeSummaryDTO(Long studentId, String studentName, Double totalFees, Double totalPaid) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.totalFees = totalFees;
        this.totalPaid = totalPaid;
        this.remainingFees = totalFees - totalPaid;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Double getTotalFees() {
        return totalFees;
    }

    public void setTotalFees(Double totalFees) {
        this.totalFees = totalFees;
    }

    public Double getTotalPaid() {
        return totalPaid;
    }

    public void setTotalPaid(Double totalPaid) {
        this.totalPaid = totalPaid;
    }

    public Double getRemainingFees() {
        return remainingFees;
    }

    public void setRemainingFees(Double remainingFees) {
        this.remainingFees = remainingFees;
    }
// Getters and Setters
}
