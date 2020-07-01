package com.hiberus.logistic.dto;

public class LogisticProcessResponseDto {

    private String status;

    public LogisticProcessResponseDto() {
    }

    public LogisticProcessResponseDto(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "LogisticProcessResponseDto{" +
                "status='" + status + '\'' +
                '}';
    }
}
