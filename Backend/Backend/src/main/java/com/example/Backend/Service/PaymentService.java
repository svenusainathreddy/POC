 package com.example.Backend.Service;

import com.example.Backend.Model.Payment;

public interface PaymentService {
    void processPayment(Payment payment);
    Payment getPaymentStatus(String paymentId);
}
