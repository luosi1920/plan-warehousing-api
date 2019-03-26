package com.yibai.plan.warehousing.service;

import com.yibai.crown.provider.dto.response.PageResponseDTO;
import com.yibai.plan.warehousing.dto.request.TrackerDTO;
import com.yibai.plan.warehousing.dto.request.TrackerQueryDTO;
import com.yibai.plan.warehousing.dto.response.TrackerRespDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @description: plan-warehousing
 * @author: lx
 * @create: 2019-03-11 15:35
 **/
//公用的远程调用接口
public interface TrackerRemoteService {
    //获取需求跟踪列表
    @RequestMapping(value = "/teacker/list",method=RequestMethod.POST)
    List<TrackerRespDTO> trackerList(@RequestBody TrackerQueryDTO trackerQueryDTO);

    //获取需求跟踪总记录数
    @RequestMapping(value = "/teacker/total",method=RequestMethod.POST)
    Integer trackerTotal(@RequestBody TrackerQueryDTO trackerQueryDTO);

    //获取单条需求跟踪记录
    @RequestMapping(value = "/teacker/selectOne",method = RequestMethod.POST)
    TrackerRespDTO selectOne(@RequestBody TrackerDTO trackerDTO);
}
