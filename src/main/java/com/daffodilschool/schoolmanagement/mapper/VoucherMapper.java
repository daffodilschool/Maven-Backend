package com.daffodilschool.schoolmanagement.mapper;

import com.daffodilschool.schoolmanagement.dto.VoucherDto;
import com.daffodilschool.schoolmanagement.entity.Voucher;

public class VoucherMapper {

    public static VoucherDto toDto(Voucher voucher) {
        VoucherDto voucherDto = new VoucherDto();
        voucherDto.setId(voucher.getId());
        if (voucher.getBusId() != null) {
            voucherDto.setBusId(voucher.getBusId().getId());
        }

        if (voucher.getStaffId() != null) {
            voucherDto.setStaffId(voucher.getStaffId().getId());
        }
        /*voucherDto.setBusId(voucher.getBusId());
        voucherDto.setStaffId(voucherDto.getStaffId());*/
        voucherDto.setTransactionType(voucher.getTransactionType());
        voucherDto.setVoucherId(voucher.getVoucherId());
        voucherDto.setExpenseCategory(voucher.getExpenseCategory());
        voucherDto.setExpenseAmount(voucher.getExpenseAmount());
        voucherDto.setTransactionId(voucher.getTransactionId());
        voucherDto.setQuantity(voucher.getQuantity());
        voucherDto.setRatePerUnit(voucher.getRatePerUnit());
        voucherDto.setDescription(voucher.getDescription());
        voucherDto.setExpenseDate(voucher.getExpenseDate());
        voucherDto.setOtherReason(voucher.getOtherReason());
        voucherDto.setCreatedDate(voucher.getCreatedDate());
        voucherDto.setCreatedBy(voucher.getCreatedBy());
        voucherDto.setUpdatedDate(voucher.getUpdatedDate());
        voucherDto.setUpdatedBy(voucher.getUpdatedBy());
        return voucherDto;
    }

    public static Voucher toEntity(VoucherDto voucherDto){
        Voucher voucher = new Voucher();
        voucher.setId(voucherDto.getId());
        voucher.setVoucherId(voucherDto.getVoucherId());
       /* voucher.setBusId(voucherDto.getBusId());
        voucher.setStaffId(voucherDto.getStaffId());*/
        voucher.setExpenseCategory(voucherDto.getExpenseCategory());
        voucher.setExpenseAmount(voucherDto.getExpenseAmount());
        voucher.setTransactionId(voucherDto.getTransactionId());
        voucher.setQuantity(voucherDto.getQuantity());
        voucher.setRatePerUnit(voucherDto.getRatePerUnit());
        voucher.setDescription(voucherDto.getDescription());
        voucher.setExpenseDate(voucherDto.getExpenseDate());
        voucher.setOtherReason(voucherDto.getOtherReason());
        voucher.setCreatedDate(voucherDto.getCreatedDate());
        voucher.setCreatedBy(voucherDto.getCreatedBy());
        voucher.setUpdatedDate(voucherDto.getUpdatedDate());
        voucher.setUpdatedBy(voucherDto.getUpdatedBy());
        return voucher;
    }
}
