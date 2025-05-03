package com.daffodilschool.schoolmanagement.repository;

import com.daffodilschool.schoolmanagement.entity.BusMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusRepository extends JpaRepository<BusMaster,Long> {
}
