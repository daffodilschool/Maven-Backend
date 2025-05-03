package com.daffodilschool.schoolmanagement.repository;

import com.daffodilschool.schoolmanagement.entity.StudentFees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentFeesRepository extends JpaRepository<StudentFees, Long> {
    List<StudentFees>findByStudentId(Long studentid);
    @Query("SELECT SUM(sf.amountpaid) FROM StudentFees sf")
    Double getTotalFeesPaid();


}
