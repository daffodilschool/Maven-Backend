package com.daffodilschool.schoolmanagement.service.impl;

import com.daffodilschool.schoolmanagement.dto.VoucherDto;
import com.daffodilschool.schoolmanagement.entity.BusMaster;
import com.daffodilschool.schoolmanagement.entity.Voucher;
import com.daffodilschool.schoolmanagement.exception.ResourceNotFoundException;
import com.daffodilschool.schoolmanagement.mapper.VoucherMapper;
import com.daffodilschool.schoolmanagement.repository.BusRepository;
import com.daffodilschool.schoolmanagement.repository.VoucherRepository;
import com.daffodilschool.schoolmanagement.service.VoucherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class VoucherServiceImpl implements VoucherService {
    @Autowired
    private VoucherRepository voucherRepository;
    @Autowired
    private BusRepository busRepository;

    @Override
    public List<VoucherDto> getAllVouchers() {
        return voucherRepository.findAll().stream().
                map(VoucherMapper::toDto).toList();
    }

    @Override
    public VoucherDto getVoucherById(Long id) {
        Optional<Voucher> voucher = voucherRepository.findByVoucherId(id);
        if (voucher.isPresent()){
            return VoucherMapper.toDto(voucher.get());
        } else {
            throw new ResourceNotFoundException("Voucher id is not present: " + id);
        }
    }

    @Override
    public VoucherDto createVoucher(VoucherDto voucherDto) {
        //voucherDto.setCreatedDate(LocalDate.now());
//        voucherDto.setCreatedBy();
        //voucherDto.setUpdatedDate(LocalDate.now());
//        voucherDto.setUpdatedBy();
        Voucher voucher = VoucherMapper.toEntity(voucherDto);
        if (voucherDto.getBusId() != null) {
            BusMaster busMaster = busRepository.findById(voucherDto.getBusId())
                    .orElseThrow(() -> new RuntimeException("BusMaster not found"));
            voucher.setBusId(busMaster);
        }



        return VoucherMapper.toDto(voucherRepository.save(voucher));
    }

    @Override
    public VoucherDto updateVoucherById(VoucherDto voucherDto) {
        Optional<Voucher> voucher = voucherRepository.findById(voucherDto.getId());
        if (voucher.isPresent()) {
//            voucherDto.setCreatedBy(voucher.get().getCreatedBy());
            voucherDto.setCreatedDate(voucher.get().getCreatedDate());
//            voucherDto.setUpdatedBy();
            voucherDto.setUpdatedDate(LocalDate.now());
            return VoucherMapper.toDto(voucherRepository.save(VoucherMapper.toEntity(voucherDto)));

        }
        else {
            throw new ResourceNotFoundException("Voucher Id is not present:"+voucherDto.getId());
        }

    }
}
