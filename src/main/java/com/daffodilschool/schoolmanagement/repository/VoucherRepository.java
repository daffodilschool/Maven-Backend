package com.daffodilschool.schoolmanagement.repository;

import com.daffodilschool.schoolmanagement.entity.Voucher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface VoucherRepository extends JpaRepository<Voucher, Long> {

    @Query("SELECT SUM(v.expenseAmount) FROM Voucher v")
    Double getTotalExpenses();

    Optional<Voucher> findByVoucherId(Long id);
}
