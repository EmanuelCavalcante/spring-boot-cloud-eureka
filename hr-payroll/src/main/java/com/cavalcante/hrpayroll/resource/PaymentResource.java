package com.cavalcante.hrpayroll.resource;

import com.cavalcante.hrpayroll.entities.Payment;
import com.cavalcante.hrpayroll.service.PaymentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/payments")
public class PaymentResource {
    @Autowired
    private PaymentServices paymentServices;

    @GetMapping(value = "/{workerId}/days/{days}")
    public ResponseEntity<Payment> getPayment(@PathVariable Long workerId, @PathVariable Integer days) {
        return ResponseEntity.ok(paymentServices.getPayment(workerId, days));
    }
}
