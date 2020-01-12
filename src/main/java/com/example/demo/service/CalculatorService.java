package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int sum(int value1, int value2) {
        return value1 + value2;
    }
}
