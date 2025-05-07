package com.daffodilschool.schoolmanagement.service;

import com.daffodilschool.schoolmanagement.dto.StudentEntryDTO;
import com.daffodilschool.schoolmanagement.entity.StudentEntry;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface StudentEntryService {
    List<StudentEntry> getAllStudent();
    Optional<StudentEntry> getStudentById(Long id);
    ResponseEntity<?> createStudent(StudentEntryDTO dto);
    List<StudentEntry> searchByAnyName(String name);
    List<StudentEntry> getStudentsByAdmissionClass(String admissionclass);
}
