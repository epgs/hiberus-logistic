package com.hiberus.logistic.controller;

import com.hiberus.logistic.dto.LogisticProcessResponseDto;
import com.hiberus.logistic.dto.OrderDto;
import com.hiberus.logistic.service.interfaces.LogisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/logistic")
public class LogisticController {

    @Autowired
    LogisticService logisticService;

    @PostMapping
    @ResponseBody
    public LogisticProcessResponseDto logisticProcess(@RequestBody OrderDto order){

        return logisticService.logisticProcess(order);
    }
}
