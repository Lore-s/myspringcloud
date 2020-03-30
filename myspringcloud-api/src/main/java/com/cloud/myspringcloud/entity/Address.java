package com.cloud.myspringcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @ClassName Address
 * @Description TODO
 * @Author lihaoyi
 * @Date 2020/3/10 17:22
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Address implements Serializable {
    private Integer addressNo;
    private String aName;
    private String dbSource;
    private Integer deleted;
}
