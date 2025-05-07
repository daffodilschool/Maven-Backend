package com.daffodilschool.schoolmanagement.service;

import com.daffodilschool.schoolmanagement.dto.FeeSummaryDTO;
import com.daffodilschool.schoolmanagement.dto.StudentEntryDTO;
import com.daffodilschool.schoolmanagement.dto.StudentFeeSummaryDTO;
import com.daffodilschool.schoolmanagement.dto.StudentFeesDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface StudentFeesService {
    StudentFeesDTO saveStudentFees(StudentFeesDTO dto);
    StudentFeesDTO getStudentFeesById(Long id);
    List<StudentFeesDTO> getAllStudentFees();
    StudentFeeSummaryDTO getStudentFeeSummary(Long studentId);
    ResponseEntity<?> newsaveStudentFees(StudentFeesDTO dto);

    List<FeeSummaryDTO> getRemainingFeesForStudent(Long studentId);
}
