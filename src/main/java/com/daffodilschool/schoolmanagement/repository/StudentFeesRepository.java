package com.daffodilschool.schoolmanagement.repository;

import com.daffodilschool.schoolmanagement.dto.FeeSummaryDTO;
import com.daffodilschool.schoolmanagement.entity.StudentFees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentFeesRepository extends JpaRepository<StudentFees, Long> {
    List<StudentFees>findByStudentId(Long studentid);
    @Query("SELECT SUM(sf.amountpaid) FROM StudentFees sf")
    Double getTotalFeesPaid();

    @Query("SELECT new com.daffodilschool.schoolmanagement.dto.FeeSummaryDTO(sf.feeType.feeid, sf.feeType.feestype, sf.feeType.feeamount, SUM(sf.amountpaid)) " +
            "FROM StudentFees sf WHERE sf.student.id = :studentId GROUP BY sf.feeType.feeid, sf.feeType.feestype, sf.feeType.feeamount")
    List<FeeSummaryDTO> getFeeSummaryByStudent(@Param("studentId") Long studentId);


}
