package com.cloud.myspringcloud.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: JsonData
 * @Description: TODO 封装json结果集
 * @Author lihaoyi
 * @Date 2020/3/11 16:32
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JsonData {
    private Object data;
    private String msg;
    private int code;
    private boolean success;
}
