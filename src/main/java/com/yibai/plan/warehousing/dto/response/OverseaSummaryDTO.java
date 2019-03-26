package com.yibai.plan.warehousing.dto.response;

import java.io.Serializable;
import java.util.Date;

/**
 * @description: codeplan 需求汇总dto
 * @author: zxf
 * @create: 2019-03-12 14:06
 **/
public class OverseaSummaryDTO implements Serializable {
    private String  gid ;//主键
    private String sku;//
    private String skuName;//sku名称
    private String remark;//备注
    private Date  createAt;//生成时间
    private Date  updateAt;//更新时间
    private Date earlistExhaustDate;//最早缺货时间
    private Integer totalRequired;//sku总需求数量
    private Date beginEarlistExhaustDate;
    private Date endlistExhaustDate;
    private Date beginCreateAt;
    private Date endCreateAt;

    public Date getBeginEarlistExhaustDate() {
        return beginEarlistExhaustDate;
    }

    public void setBeginEarlistExhaustDate(Date beginEarlistExhaustDate) {
        this.beginEarlistExhaustDate = beginEarlistExhaustDate;
    }

    public Date getEndlistExhaustDate() {
        return endlistExhaustDate;
    }

    public void setEndlistExhaustDate(Date endlistExhaustDate) {
        this.endlistExhaustDate = endlistExhaustDate;
    }

    public Date getBeginCreateAt() {
        return beginCreateAt;
    }

    public void setBeginCreateAt(Date beginCreateAt) {
        this.beginCreateAt = beginCreateAt;
    }

    public Date getEndCreateAt() {
        return endCreateAt;
    }

    public void setEndCreateAt(Date endCreateAt) {
        this.endCreateAt = endCreateAt;
    }

    public String getGid() {
        return gid;
    }

    public Integer getTotalRequired() {
        return totalRequired;
    }

    public void setTotalRequired(Integer totalRequired) {
        this.totalRequired = totalRequired;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Date getEarlistExhaustDate() {
        return earlistExhaustDate;
    }

    public void setEarlistExhaustDate(Date earlistExhaustDate) {
        this.earlistExhaustDate = earlistExhaustDate;
    }

}
