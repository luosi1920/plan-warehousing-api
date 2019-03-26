package com.yibai.plan.warehousing.dto.response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

//@Getter
//@Setter
//@Data
public class TestDataRespDTO implements Serializable {

    private static final long serialVersionUID = 5483756844615500117L;

    private Integer id;

    private String name;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
