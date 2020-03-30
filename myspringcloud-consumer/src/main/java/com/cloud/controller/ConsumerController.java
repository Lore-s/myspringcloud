package com.cloud.controller;

import com.cloud.myspringcloud.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ConsumerController
 * @Description TODO
 * @Author lihaoyi
 * @Date 2020/3/12 15:18
 * @Version 1.0
 **/
@RestController
public class ConsumerController {

    public static final String REST_URL = "http://MYSPRINGCLOUD-ADDRESS/api";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getAddressById")
    public JsonData getAddressById() {
        JsonData jsonData = restTemplate.getForObject(REST_URL + "/getAddress/" + 1, JsonData.class);
        return jsonData;
    }

    @GetMapping("/getAddress")
    public JsonData getAddress() {
        JsonData jsonData = restTemplate.getForObject(REST_URL + "/getAllAddress", JsonData.class);
        return jsonData;
    }
}
