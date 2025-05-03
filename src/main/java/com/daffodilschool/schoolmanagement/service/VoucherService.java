package com.daffodilschool.schoolmanagement.service;

import com.daffodilschool.schoolmanagement.dto.VoucherDto;

import java.util.List;

public interface VoucherService {
    List<VoucherDto> getAllVouchers();
    VoucherDto getVoucherById(Long id);
    VoucherDto createVoucher(VoucherDto voucherDto);
    VoucherDto updateVoucherById(VoucherDto voucherDto);
}
