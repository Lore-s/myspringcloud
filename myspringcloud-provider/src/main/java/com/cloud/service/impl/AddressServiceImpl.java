package com.cloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.mapper.AddressMapper;
import com.cloud.myspringcloud.entity.Address;
import com.cloud.service.IAddressService;
import org.springframework.stereotype.Service;

/**
 * @ClassName AddressServiceImpl
 * @Description TODO
 * @Author lihaoyi
 * @Date 2020/3/11 16:28
 * @Version 1.0
 **/
@Service
public class AddressServiceImpl extends ServiceImpl<AddressMapper, Address> implements IAddressService {
}
