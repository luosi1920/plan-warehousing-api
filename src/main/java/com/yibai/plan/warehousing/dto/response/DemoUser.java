package com.yibai.plan.warehousing.dto.response;

import lombok.Data;

import java.util.List;

/**
 * @description: plan-warehousing
 * @author: lhy
 * @create: 2019-03-09 14:43
 **/
@Data
public class DemoUser {
    private Integer id;
    private List<TestDataRespDTO> list;
}
