package com.daffodilschool.schoolmanagement.repository;


import com.daffodilschool.schoolmanagement.entity.StudentEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface StudentEntryRepository extends JpaRepository<StudentEntry, Long> {

    @Query("SELECT COUNT(se) FROM StudentEntry se WHERE se.isactive = true")
    Long getTotalActiveStudents();

    @Query("SELECT s FROM StudentEntry s " +
            "WHERE LOWER(s.firstname) LIKE LOWER(CONCAT('%', :name, '%')) " +
            "OR LOWER(s.middlename) LIKE LOWER(CONCAT('%', :name, '%')) " +
            "OR LOWER(s.lastname) LIKE LOWER(CONCAT('%', :name, '%'))")
    List<StudentEntry> searchByNamePart(@Param("name") String name);

}
