package com.daffodilschool.schoolmanagement.controller;

import com.daffodilschool.schoolmanagement.dto.DonationDTO;
import com.daffodilschool.schoolmanagement.service.DonationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/donations")
@RequiredArgsConstructor
public class DonationController {

    private final DonationService donationService;

    @PostMapping
    public ResponseEntity<DonationDTO> create(@RequestBody DonationDTO dto) {
        return ResponseEntity.ok(donationService.createDonation(dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<DonationDTO> get(@PathVariable Long id) {
        DonationDTO dto = donationService.getDonation(id);
        return dto != null ? ResponseEntity.ok(dto) : ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<DonationDTO>> getAll() {
        return ResponseEntity.ok(donationService.getAllDonations());
    }

    @PutMapping("/{id}")
    public ResponseEntity<DonationDTO> update(@PathVariable Long id, @RequestBody DonationDTO dto) {
        DonationDTO updated = donationService.updateDonation(id, dto);
        return updated != null ? ResponseEntity.ok(updated) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        donationService.deleteDonation(id);
        return ResponseEntity.noContent().build();
    }
}
