package com.hiberus.logistic.service.interfaces;

import com.hiberus.logistic.dto.LogisticProcessResponseDto;
import com.hiberus.logistic.dto.OrderDto;

public interface LogisticService {

    public LogisticProcessResponseDto logisticProcess(OrderDto order);
}
