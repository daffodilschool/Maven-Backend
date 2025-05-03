package com.daffodilschool.schoolmanagement.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DashboardMetricsDTO {

    private Double totalIncome;
    private Double totalExpenses;
    private Long totalStudentsOnboarded;

    public Double getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(Double totalIncome) {
        this.totalIncome = totalIncome;
    }

    public Double getTotalExpenses() {
        return totalExpenses;
    }

    public void setTotalExpenses(Double totalExpenses) {
        this.totalExpenses = totalExpenses;
    }

    public Long getTotalStudentsOnboarded() {
        return totalStudentsOnboarded;
    }

    public void setTotalStudentsOnboarded(Long totalStudentsOnboarded) {
        this.totalStudentsOnboarded = totalStudentsOnboarded;
    }
}
