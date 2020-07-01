package com.hiberus.logistic.service.impl;

import com.hiberus.logistic.dto.LogisticProcessResponseDto;
import com.hiberus.logistic.dto.OrderDto;
import com.hiberus.logistic.service.interfaces.LogisticService;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LogisticServiceImpl implements LogisticService {

    public LogisticProcessResponseDto logisticProcess(OrderDto order){
        LogisticProcessResponseDto logisticProcessResponseDto = new LogisticProcessResponseDto();
        //Simulating a successfully sent order with status "SENT"
        String status = "SENT";
        logisticProcessResponseDto.setStatus(status);
        return logisticProcessResponseDto;
    }

}
