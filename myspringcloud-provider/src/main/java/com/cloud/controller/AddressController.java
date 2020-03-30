package com.cloud.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cloud.myspringcloud.entity.Address;
import com.cloud.myspringcloud.util.GetResult;
import com.cloud.myspringcloud.util.JsonData;
import com.cloud.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName AddressController
 * @Description TODO
 * @Author lihaoyi
 * @Date 2020/3/11 16:32
 * @Version 1.0
 **/
@RestController
public class AddressController {

    @Autowired
    private IAddressService iAddressService;

    @GetMapping("/getAddress/{id}")
    public JsonData getAddress(@PathVariable Integer id) {
        return GetResult.result(iAddressService.getOne(new QueryWrapper<Address>().eq("address_no", id)));
    }

    @GetMapping("/getAllAddress")
    public JsonData getAllAddress() {
        return GetResult.result(iAddressService.list());
    }
}
