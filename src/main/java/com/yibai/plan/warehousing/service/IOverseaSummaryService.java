package com.yibai.plan.warehousing.service;

import com.yibai.plan.warehousing.dto.response.OverseaSummaryDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public interface IOverseaSummaryService {
    @RequestMapping(value = "/testService/queryOverseaSummaryList", method = RequestMethod.GET)
    List<OverseaSummaryDTO> queryOverseaSummaryList(OverseaSummaryDTO dto);
    @RequestMapping(value = "/testService/insertOverseasum", method = RequestMethod.POST)
    void addOverseaSummary(OverseaSummaryDTO dto);
}
