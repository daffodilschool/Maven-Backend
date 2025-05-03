package com.daffodilschool.schoolmanagement.repository;

import com.daffodilschool.schoolmanagement.entity.Donation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DonationRepository extends JpaRepository<Donation, Long> {

    @Query("SELECT SUM(d.donationamount) FROM Donation d")
    Double getTotalDonationsReceived();
}
