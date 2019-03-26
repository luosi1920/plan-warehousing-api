package com.yibai.plan.warehousing.service;

import com.yibai.crown.provider.dto.response.PageResponseDTO;
import com.yibai.plan.warehousing.dto.request.CriteriaDTO;
import com.yibai.plan.warehousing.dto.request.UpdateReqDTO;
import com.yibai.plan.warehousing.dto.response.YibaiOverseaPrListDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


public interface YiBaiOverSeaRemoteService {
    @RequestMapping(value = "/overSeaList/queryByCriteria", method = RequestMethod.POST,consumes = "application/json")
    PageResponseDTO<YibaiOverseaPrListDto> queryByCriteria(@RequestBody CriteriaDTO criteriaDto);

    @RequestMapping(value = "/overSeaList/updateByGid",method = RequestMethod.POST,consumes = "application/json")
    String updateByGid(@RequestBody UpdateReqDTO dto);

    @RequestMapping(value = "/overSeaList/queryByGid",method = RequestMethod.GET,consumes = "application/json")
    YibaiOverseaPrListDto queryByGid(@RequestParam("gid") String gid);
}
