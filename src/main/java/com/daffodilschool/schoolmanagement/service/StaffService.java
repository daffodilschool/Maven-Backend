package com.daffodilschool.schoolmanagement.service;

import com.daffodilschool.schoolmanagement.dto.StaffDTO;

import java.util.List;

public interface StaffService {

    List<StaffDTO> getAllStaff();
    StaffDTO getStaffById(Long id);
    StaffDTO createStaff(StaffDTO dto);
    StaffDTO updateStaff(Long id, StaffDTO dto);
    void deleteStaff(Long id);
}
