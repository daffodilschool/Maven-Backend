package com.daffodilschool.schoolmanagement.service;

import com.daffodilschool.schoolmanagement.dto.DonationDTO;

import java.util.List;

public interface DonationService {

    DonationDTO createDonation(DonationDTO dto);
    DonationDTO getDonation(Long id);
    List<DonationDTO> getAllDonations();
    DonationDTO updateDonation(Long id, DonationDTO dto);
    void deleteDonation(Long id);

}
