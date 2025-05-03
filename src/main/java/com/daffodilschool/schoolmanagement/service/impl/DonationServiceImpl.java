package com.daffodilschool.schoolmanagement.service.impl;

import com.daffodilschool.schoolmanagement.config.JwtService;
import com.daffodilschool.schoolmanagement.dto.DonationDTO;
import com.daffodilschool.schoolmanagement.entity.Donation;
import com.daffodilschool.schoolmanagement.repository.DonationRepository;
import com.daffodilschool.schoolmanagement.service.DonationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DonationServiceImpl implements DonationService {

    private final DonationRepository donationRepository;

    public DonationDTO createDonation(DonationDTO dto) {
        Donation donation = toEntity(dto);
        return toDTO(donationRepository.save(donation));
    }

    public DonationDTO getDonation(Long id) {
        return donationRepository.findById(id)
                .map(this::toDTO)
                .orElse(null);
    }

    public List<DonationDTO> getAllDonations() {
        return donationRepository.findAll()
                .stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    public DonationDTO updateDonation(Long id, DonationDTO dto) {
        Donation existing = donationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Donation not found with id: " + id));

        // Only update fields that are not null
        if (dto.getRegisterreciptid() != null) existing.setRegisterreciptid(dto.getRegisterreciptid());
        if (dto.getDanoarname() != null) existing.setDonarname(dto.getDanoarname());
        if (dto.getDonaraddress() != null) existing.setDonaraddress(dto.getDonaraddress());
        if (dto.getDonationamount() != null) existing.setDonationamount(dto.getDonationamount());
        if (dto.getDonarcontactnumber() != null) existing.setDonarcontactnumber(dto.getDonarcontactnumber());
        if (dto.getDonationdate() != null) existing.setDonationdate(dto.getDonationdate());
        if (dto.getDonarpancardno() != null) existing.setDonarpancardno(dto.getDonarpancardno());
        if (dto.getCreateddate() != null) existing.setCreateddate(dto.getCreateddate());
        if (dto.getCreatedby() != null) existing.setCreatedby(dto.getCreatedby());
        if (dto.getUpdateddate() != null) existing.setUpdateddate(dto.getUpdateddate());
        if (dto.getUpdatedby() != null) existing.setUpdatedby(dto.getUpdatedby());
        if (dto.getDonationType() != null) existing.setDonationType(dto.getDonationType());
        if (dto.getDonationDescription() != null) existing.setDonationDescription(dto.getDonationDescription());

        Donation updated = donationRepository.save(existing);
        return toDTO(updated);
    }

    public void deleteDonation(Long id) {
        donationRepository.deleteById(id);
    }

    // Converters
    private DonationDTO toDTO(Donation d) {
        return DonationDTO.builder()
                .id(d.getId())
                .registerreciptid(String.valueOf(d.getRegisterreciptid()))
                .danoarname(d.getDonarname())
                .donaraddress(d.getDonaraddress())
                .donationamount(d.getDonationamount())
                .donarcontactnumber(d.getDonarcontactnumber())
                .donationdate(d.getDonationdate())
                .donarpancardno(d.getDonarpancardno())
                .createddate(d.getCreateddate())
                .createdby(d.getCreatedby())
                .updateddate(d.getUpdateddate())
                .updatedby(d.getUpdatedby())
                .donationType(d.getDonationType())
                .donationDescription(d.getDonationDescription())
                .build();
    }

    private Donation toEntity(DonationDTO dto) {
        System.out.println("username#");
        //String username= JwtService.getCurrentUser().getUsername();
        System.out.println("username@!#");
        //System.out.println(username);
        return Donation.builder()
                .id(dto.getId())
                .registerreciptid(String.valueOf(Long.valueOf(dto.getRegisterreciptid())))
                .donarname(dto.getDanoarname())
                .donaraddress(dto.getDonaraddress())
                .donationamount(dto.getDonationamount())
                .donarcontactnumber(dto.getDonarcontactnumber())
                .donationdate(dto.getDonationdate())
                .donarpancardno(dto.getDonarpancardno())
                .createddate(dto.getCreateddate())
                .createdby(dto.getCreatedby())
                .updateddate(dto.getUpdateddate())
                .updatedby(dto.getUpdatedby())
                .donationType(dto.getDonationType())
                .donationDescription(dto.getDonationDescription())
                .build();
    }
}
