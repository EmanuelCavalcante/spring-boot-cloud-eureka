package com.cavalcante.hrpayroll.service;

import com.cavalcante.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentServices {

    public Payment getPayment(Long workerId, Integer days) {
        return new Payment("Bob", 200d, days);
    }


}
