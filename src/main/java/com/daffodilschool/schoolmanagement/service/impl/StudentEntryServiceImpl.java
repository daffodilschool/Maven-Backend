package com.daffodilschool.schoolmanagement.service.impl;

import com.daffodilschool.schoolmanagement.dto.StudentEntryDTO;
import com.daffodilschool.schoolmanagement.entity.StudentEntry;
import com.daffodilschool.schoolmanagement.repository.StudentEntryRepository;
import com.daffodilschool.schoolmanagement.service.StudentEntryService;
import com.daffodilschool.schoolmanagement.service.StudentPhotoService;
import com.daffodilschool.schoolmanagement.utils.CustomResponsePojo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class StudentEntryServiceImpl implements StudentEntryService {
    @Autowired
    private StudentEntryRepository repository;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private StudentPhotoService studentPhotoService;

    @Override
    public List<StudentEntry> getAllStudent() {
        return repository.findAll();
    }

    @Override
    public Optional<StudentEntry> getStudentById(Long id) {
        return repository.findById(id);
    }

    @Override
    public ResponseEntity<?> createStudent(StudentEntryDTO dto) {
        ResponseEntity<?> success = null;
        String photoUrl = null;
       /* StudentEntry user = StudentEntryMapper.toEntity(dto);
        StudentEntryMapper.toDto(repository.save(user));*/


      /* ResponseEntity<?> success = null;*/
        try {
            photoUrl = studentPhotoService.saveStudentPhoto(dto.getStudentphoto().toString(), "photo.jpg");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        StudentEntry productInfo = modelMapper.map(dto, StudentEntry.class);
        productInfo.setStudentphoto(photoUrl);
        repository.save(productInfo);
        success=  new ResponseEntity<>(new CustomResponsePojo("200", "Student saved successfully"), HttpStatus.OK);
        return success;
    }
    @Override
    public List<StudentEntry> searchByAnyName(String name) {
        return repository.searchByNamePart(name);
    }
    @Override
    public List<StudentEntry> getStudentsByAdmissionClass(String admissionclass) {
        return repository.findByAdmissionclass(admissionclass);
    }

}
