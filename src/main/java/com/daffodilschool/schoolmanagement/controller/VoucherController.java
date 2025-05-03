package com.daffodilschool.schoolmanagement.controller;

import com.daffodilschool.schoolmanagement.dto.VoucherDto;
import com.daffodilschool.schoolmanagement.service.VoucherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/voucher")
public class VoucherController {

    @Autowired
    private VoucherService voucherService;

    @GetMapping()
    public List<VoucherDto> getAllVouchers(){
        return voucherService.getAllVouchers();
    }

    @GetMapping("/{id}")
    public VoucherDto getVoucherById(@PathVariable Long id){
        return voucherService.getVoucherById(id);
    }

    @PostMapping
    public VoucherDto createVoucher (@RequestBody VoucherDto voucherDto){
        return voucherService.createVoucher(voucherDto);
    }

    @PutMapping("/update")
    public VoucherDto updateVoucherById (@RequestBody VoucherDto voucherDto){
        return voucherService.updateVoucherById(voucherDto);
    }

}
