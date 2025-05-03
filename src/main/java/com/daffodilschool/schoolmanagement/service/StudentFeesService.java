package com.daffodilschool.schoolmanagement.service;

import com.daffodilschool.schoolmanagement.dto.StudentFeeSummaryDTO;
import com.daffodilschool.schoolmanagement.dto.StudentFeesDTO;

import java.util.List;

public interface StudentFeesService {
    StudentFeesDTO saveStudentFees(StudentFeesDTO dto);
    StudentFeesDTO getStudentFeesById(Long id);
    List<StudentFeesDTO> getAllStudentFees();
    StudentFeeSummaryDTO getStudentFeeSummary(Long studentId);
}
