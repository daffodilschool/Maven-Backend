package com.daffodilschool.schoolmanagement.controller;

import com.daffodilschool.schoolmanagement.dto.StaffDTO;
import com.daffodilschool.schoolmanagement.service.StaffService;
import com.daffodilschool.schoolmanagement.service.impl.StaffServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/staff")
public class StaffController {

    @Autowired
    private StaffServiceImpl staffService;

    @GetMapping
    public List<StaffDTO> getAll() {
        return staffService.getAllStaff();
    }

    @GetMapping("/{id}")
    public StaffDTO getById(@PathVariable Long id) {
        return staffService.getStaffById(id);
    }

    @PostMapping
    public StaffDTO create(@RequestBody StaffDTO dto) {
        return staffService.createStaff(dto);
    }

    @PutMapping("/{id}")
    public StaffDTO update(@PathVariable Long id, @RequestBody StaffDTO dto) {
        return staffService.updateStaff(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        staffService.deleteStaff(id);
    }
}
