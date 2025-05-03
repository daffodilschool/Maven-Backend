package com.daffodilschool.schoolmanagement.service.impl;

import com.daffodilschool.schoolmanagement.dto.StaffDTO;
import com.daffodilschool.schoolmanagement.entity.Staff;
import com.daffodilschool.schoolmanagement.mapper.StaffMapper;
import com.daffodilschool.schoolmanagement.repository.StaffRepository;
import com.daffodilschool.schoolmanagement.service.StaffService;
import com.daffodilschool.schoolmanagement.service.StudentPhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffRepository repository;
    @Autowired
    private StudentPhotoService studentPhotoService;

    @Override
    public List<StaffDTO> getAllStaff() {
        return repository.findAll().stream()
                .map(StaffMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public StaffDTO getStaffById(Long id) {
        return repository.findById(id)
                .map(StaffMapper::toDto)
                .orElseThrow(() -> new RuntimeException("Staff not found"));
    }

    @Override
    public StaffDTO createStaff(StaffDTO dto) {
        String photoUrl = null;

        try {
            photoUrl = studentPhotoService.saveStudentPhoto(dto.getStaffType().toString(), "staffphoto.jpg");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Staff staff = StaffMapper.toEntity(dto);
        staff.setStaffphoto(photoUrl);
        return StaffMapper.toDto(repository.save(staff));
    }

    @Override
    public StaffDTO updateStaff(Long id, StaffDTO dto) {
        String photoUrl = null;
        Staff staff = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Staff not found"));

        // Update fields
        staff.setStaffType(dto.getStaffType());
        staff.setFirstname(dto.getFirstname());
        staff.setMiddlename(dto.getMiddlename());
        staff.setLastname(dto.getLastname());
        staff.setMobileNumber(dto.getMobileNumber());
        staff.setAadharNumber(dto.getAadharNumber());
        staff.setAddress(dto.getAddress());
        staff.setPancard(dto.getPancard());
        staff.setDateOfJoining(dto.getDateOfJoining());
        staff.setUpdatedDate(dto.getUpdatedDate());
        staff.setUpdatedBy(dto.getUpdatedBy());
        try {
            photoUrl = studentPhotoService.saveStudentPhoto(dto.getStaffType().toString(), "staffphoto.jpg");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        staff.setStaffphoto(photoUrl);

        return StaffMapper.toDto(repository.save(staff));
    }

    @Override
    public void deleteStaff(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Staff not found");
        }
        repository.deleteById(id);
    }
}
