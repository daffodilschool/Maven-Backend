package com.daffodilschool.schoolmanagement.mapper;


import com.daffodilschool.schoolmanagement.dto.StudentEntryDTO;
import com.daffodilschool.schoolmanagement.entity.StudentEntry;

public class StudentEntryMapper {
    public static StudentEntryDTO toDto(StudentEntry studentEntry) {
        StudentEntryDTO dto = new StudentEntryDTO();

        return dto;
    }

    public static StudentEntry toEntity(StudentEntryDTO dto) {
        StudentEntry student = new StudentEntry();

        return student;
    }
}
