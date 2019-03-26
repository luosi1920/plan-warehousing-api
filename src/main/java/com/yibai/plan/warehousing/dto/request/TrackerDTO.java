package com.yibai.plan.warehousing.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @description: plan-warehousing
 * @author: lx
 * @create: 2019-03-12 14:27
 **/
@Getter
@Setter
public class TrackerDTO {
    private static final long serialVersionUID = 3254297929154173060L;

    private String gid;
    private String prSn;

    private String sku;

    private String stationCode;

    private String skuName;

    private Integer purchaseOrderQty;

    private Short bd;

    private Integer requireQty;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date expectExhaustDate;

    private Byte approveState;

    private String purSn;

    private String isActualPurchase;

    private Integer purchaseQty;

    private Integer surplusQty;

    private Byte purState;

    private String remark;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updatedAt;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createdAt;

    public TrackerDTO() {
    }
}
