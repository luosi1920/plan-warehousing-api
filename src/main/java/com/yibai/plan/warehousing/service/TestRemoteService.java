package com.yibai.plan.warehousing.service;

import com.yibai.plan.warehousing.dto.response.DemoUser;
import com.yibai.plan.warehousing.dto.response.TestDataRespDTO;
import com.yibai.plan.warehousing.dto.response.YibaiOverseaPrListDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface TestRemoteService {

    @RequestMapping(value = "/testService/hello", method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    @RequestMapping(value = "/testService/queryTestDataAll", method = RequestMethod.GET)
    List<TestDataRespDTO> queryTestDataAll();

    @RequestMapping(value = "/testService/addUser", method = RequestMethod.POST, consumes = "application/json")
    void saveUser(@RequestBody YibaiOverseaPrListDto dto);

    @RequestMapping(value = "/testService/selectMore", method = RequestMethod.GET)
    DemoUser selectMore();

}
