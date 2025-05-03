package com.daffodilschool.schoolmanagement.controller;

import com.daffodilschool.schoolmanagement.dto.StudentFeeSummaryDTO;
import com.daffodilschool.schoolmanagement.dto.StudentFeesDTO;
import com.daffodilschool.schoolmanagement.service.StudentFeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/studentfees")
public class StudentFeesController {

    @Autowired
    private StudentFeesService studentFeesService;

    @PostMapping
    public StudentFeesDTO saveStudentFees(@RequestBody StudentFeesDTO dto) {
        return studentFeesService.saveStudentFees(dto);
    }

    @GetMapping("/{id}")
    public StudentFeesDTO getStudentFees(@PathVariable Long id) {
        return studentFeesService.getStudentFeesById(id);
    }

    @GetMapping
    public List<StudentFeesDTO> getAllFees() {
        return studentFeesService.getAllStudentFees();
    }

    @GetMapping("/summary")
    public StudentFeeSummaryDTO getFeeSummary(@PathVariable Long studentId) {
        return studentFeesService.getStudentFeeSummary(studentId);
    }

}
