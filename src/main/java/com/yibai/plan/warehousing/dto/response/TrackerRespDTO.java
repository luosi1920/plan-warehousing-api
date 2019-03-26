package com.yibai.plan.warehousing.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * @description: plan-warehousing
 * @author: lx
 * @create: 2019-03-11 15:21
 **/
@Getter
@Setter
public class TrackerRespDTO implements Serializable {
    private static final long serialVersionUID = 3254297929154173061L;
    private String gid;//
    private String prSn;//需求单号
    private String sku;//sku
    private String stationCode;//站点
    private String skuName;//sku中文名字
    private Integer purchaseOrderQty;//订购数量(pcs)
    private Short bd;//BD(pcs)
    private Integer requireQty;//需求数量(pcs)
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date expectExhaustDate;//预计缺货时间
    private Byte approveState;//审核状态
    private String purSn;//备货单号
    private String isActualPurchase;//是否需要实际备货 Y 需要 N 不需要
    private Integer purchaseQty;//备货数量(pcs)
    private Integer surplusQty;//多余库存(pcs)
    private Byte purState;//备货单状态
    private String remark;//审核备注
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updatedAt;//更新时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createdAt;//生成时间

    public TrackerRespDTO() {
    }
}
