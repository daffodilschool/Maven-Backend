package com.daffodilschool.schoolmanagement.service.impl;

import com.daffodilschool.schoolmanagement.dto.StudentFeeSummaryDTO;
import com.daffodilschool.schoolmanagement.dto.StudentFeesDTO;
import com.daffodilschool.schoolmanagement.entity.StudentEntry;
import com.daffodilschool.schoolmanagement.entity.StudentFees;
import com.daffodilschool.schoolmanagement.repository.FeeTypeRepository;
import com.daffodilschool.schoolmanagement.repository.StudentEntryRepository;
import com.daffodilschool.schoolmanagement.repository.StudentFeesRepository;
import com.daffodilschool.schoolmanagement.service.StudentFeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentFeesServiceImpl implements StudentFeesService {

    @Autowired
    private StudentFeesRepository studentFeesRepository;

    @Autowired
    private StudentEntryRepository studentRepository;

    @Autowired
    private FeeTypeRepository feeTypeRepository;

    @Override
    public StudentFeesDTO saveStudentFees(StudentFeesDTO dto) {
        StudentFees fees = new StudentFees();
        fees.setStudent(studentRepository.findById(dto.getStudentId()).orElse(null));
        fees.setFeeType(feeTypeRepository.findById(dto.getFeeTypeId()).orElse(null));
        //fees.setTotalfees(dto.getTotalfees());
        fees.setAmountpaid(dto.getAmountpaid());
        fees.setFeespaiddate(dto.getFeespaiddate());
        fees.setModeoftransaction(dto.getModeoftransaction());
        fees.setRegisterrecieptid(dto.getRegisterrecieptid());
        fees.setCreateddate(dto.getCreateddate());
        fees.setCreatedby(dto.getCreatedby());
        fees.setUpdateddate(dto.getUpdateddate());
        fees.setUpdatedby(dto.getUpdatedby());

        StudentFees saved = studentFeesRepository.save(fees);
        dto.setId(saved.getId());
        return dto;
    }

    @Override
    public StudentFeesDTO getStudentFeesById(Long id) {
        return studentFeesRepository.findById(id)
            .map(f -> {
                StudentFeesDTO dto = new StudentFeesDTO();
                dto.setId(f.getId());
                dto.setStudentId(f.getStudent().getId());
                dto.setFeeTypeId(f.getFeeType().getFeeid());
                //dto.setTotalfees(f.getTotalfees());
                dto.setAmountpaid(f.getAmountpaid());
                dto.setFeespaiddate(f.getFeespaiddate());
                dto.setModeoftransaction(f.getModeoftransaction());
                dto.setRegisterrecieptid(f.getRegisterrecieptid());
                dto.setCreateddate(f.getCreateddate());
                dto.setCreatedby(f.getCreatedby());
                dto.setUpdateddate(f.getUpdateddate());
                dto.setUpdatedby(f.getUpdatedby());
                return dto;
            }).orElse(null);
    }

    @Override
    public List<StudentFeesDTO> getAllStudentFees() {
        return studentFeesRepository.findAll().stream().map(f -> {
            StudentFeesDTO dto = new StudentFeesDTO();
            dto.setId(f.getId());
            dto.setStudentId(f.getStudent().getId());
            dto.setFeeTypeId(f.getFeeType().getFeeid());
            //dto.setTotalfees(f.getTotalfees());
            dto.setAmountpaid(f.getAmountpaid());
            dto.setFeespaiddate(f.getFeespaiddate());
            dto.setModeoftransaction(f.getModeoftransaction());
            dto.setRegisterrecieptid(f.getRegisterrecieptid());
            dto.setCreateddate(f.getCreateddate());
            dto.setCreatedby(f.getCreatedby());
            dto.setUpdateddate(f.getUpdateddate());
            dto.setUpdatedby(f.getUpdatedby());
            return dto;
        }).collect(Collectors.toList());
    }

    @Override
    public StudentFeeSummaryDTO getStudentFeeSummary(Long studentId) {
        StudentEntry student = studentRepository.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        List<StudentFees> fees = studentFeesRepository.findByStudentId(studentId);
        double totalPaid = fees.stream()
                .mapToDouble(fee -> fee.getAmountpaid() != null ? fee.getAmountpaid() : 0.0)
                .sum();

        return new StudentFeeSummaryDTO(
                student.getId(),
                student.getFullname(),
                student.getTotalfesspaid(),
                totalPaid
        );
    }
}
