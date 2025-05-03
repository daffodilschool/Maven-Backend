package com.daffodilschool.schoolmanagement.repository;

import com.daffodilschool.schoolmanagement.entity.FeeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeeTypeRepository extends JpaRepository<FeeType, Long> {}
