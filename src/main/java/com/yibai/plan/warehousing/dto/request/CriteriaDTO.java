package com.yibai.plan.warehousing.dto.request;

import com.yibai.crown.provider.dto.request.PageRequestDTO;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @description: plan-warehousing
 * @author: lhy
 * @create: 2019-03-11 13:44
 **/
@Data
public class CriteriaDTO extends PageRequestDTO {
    private String startDate;
    private String endDate;
    private String updatedStart;
    private String updatedEnd;
    private String approvedStart;
    private String approvedEnd;
    private String prSn;
    private String sku;
    private Byte skuState;
    private Byte expired;
    private Byte approveState;
    private String stationCode;
    private Byte isTriggerPr;
    private Byte isPlanApprove;
    private Integer bd;
}
