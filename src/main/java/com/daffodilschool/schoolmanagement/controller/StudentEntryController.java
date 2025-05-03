package com.daffodilschool.schoolmanagement.controller;


import com.daffodilschool.schoolmanagement.dto.StudentEntryDTO;
import com.daffodilschool.schoolmanagement.entity.StudentEntry;
import com.daffodilschool.schoolmanagement.service.StudentEntryService;
import com.daffodilschool.schoolmanagement.utils.CustomResponsePojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/studententry")
public class StudentEntryController {
    @Autowired
    private StudentEntryService studentEntryService;

    @GetMapping("/hello")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<CustomResponsePojo> hello() {
        CustomResponsePojo  response = new CustomResponsePojo("200", "Hello World");
        return ResponseEntity.ok(response);
    }

    @GetMapping("/getAll")
    public List<StudentEntry>  getAll() {
        List<StudentEntry> dtoList=  studentEntryService.getAllStudent();
        CustomResponsePojo<List<StudentEntry>> response = new CustomResponsePojo<>("success", "All students", dtoList);
        //CustomResponsePojo<List<StudentEntryDTO>> response = new CustomResponsePojo<>("200", "List of students", dtoList);
        return dtoList;
    }

    @GetMapping("/{id}")
    public Optional<StudentEntry> getById(@PathVariable Long id) {
        return studentEntryService.getStudentById(id);
    }

    @PostMapping("/add")
    public ResponseEntity<?> create(@RequestBody StudentEntryDTO dto) {
        ResponseEntity<?> student = studentEntryService.createStudent(dto);
        return student;
    }

    @GetMapping("/search")
    public ResponseEntity<List<StudentEntry>> searchByName(@RequestParam String name) {
        List<StudentEntry> students = studentEntryService.searchByAnyName(name);
        return ResponseEntity.ok(students);
    }

}
