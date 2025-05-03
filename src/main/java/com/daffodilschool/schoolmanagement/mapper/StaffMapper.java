package com.daffodilschool.schoolmanagement.mapper;


import com.daffodilschool.schoolmanagement.dto.StaffDTO;
import com.daffodilschool.schoolmanagement.entity.Staff;

public class StaffMapper {

    public static StaffDTO toDto(Staff staff) {
        StaffDTO dto = new StaffDTO();
        dto.setId(staff.getId());
        dto.setStaffType(staff.getStaffType());
        dto.setFirstname(staff.getFirstname());
        dto.setMiddlename(staff.getMiddlename());
        dto.setLastname(staff.getLastname());
        dto.setMobileNumber(staff.getMobileNumber());
        dto.setAadharNumber(staff.getAadharNumber());
        dto.setAddress(staff.getAddress());
        dto.setPancard(staff.getPancard());
        dto.setDateOfJoining(staff.getDateOfJoining());
        dto.setCreatedDate(staff.getCreatedDate());
        dto.setCreatedBy(staff.getCreatedBy());
        dto.setUpdatedDate(staff.getUpdatedDate());
        dto.setUpdatedBy(staff.getUpdatedBy());
        dto.setStaffphoto(staff.getStaffphoto());
        return dto;
    }

    public static Staff toEntity(StaffDTO dto) {
        Staff staff = new Staff();
        staff.setId(dto.getId()); // Optional: Set only if needed
        staff.setStaffType(dto.getStaffType());
        staff.setFirstname(dto.getFirstname());
        staff.setMiddlename(dto.getMiddlename());
        staff.setLastname(dto.getLastname());
        staff.setMobileNumber(dto.getMobileNumber());
        staff.setAadharNumber(dto.getAadharNumber());
        staff.setAddress(dto.getAddress());
        staff.setPancard(dto.getPancard());
        staff.setDateOfJoining(dto.getDateOfJoining());
        staff.setCreatedDate(dto.getCreatedDate());
        staff.setCreatedBy(dto.getCreatedBy());
        staff.setUpdatedDate(dto.getUpdatedDate());
        staff.setUpdatedBy(dto.getUpdatedBy());
        staff.setStaffphoto(dto.getStaffphoto());
        return staff;
    }
}
