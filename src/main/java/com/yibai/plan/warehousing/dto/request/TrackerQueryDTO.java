package com.yibai.plan.warehousing.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @description: plan-warehousing
 * @author: lx
 * @create: 2019-03-11 14:44
 **/
@Getter
@Setter
public class TrackerQueryDTO implements Serializable {
    private static final long serialVersionUID = 3254297929154173059L;
    private String gid;
    private String expectExhaustDateBegin;//预计取货时间开始
    private String expectExhaustDateEnd;//预计缺货时间结束
    private String ecreatedAtBegin;//生成时间开始
    private String createdAtEnd;//生成时间结束
    private String prSn;//需求单号
    private String sku;
    private String purSn;//备货单号
    private Integer purState;//备货单状态
    private String stationCode;//站点
    private Integer pageNum;//页码
    private Integer pageSize;//每页记录条数
    private Integer start;//从第几条开始查

    public TrackerQueryDTO() {
    }
}
