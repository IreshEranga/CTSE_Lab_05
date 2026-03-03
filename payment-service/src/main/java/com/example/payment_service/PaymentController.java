package com.example.payment_service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private List<Map<String, Object>> payments = new ArrayList<>();
    private int idCounter = 1;

    @GetMapping
    public List<Map<String, Object>> getPayments() {
        return payments;
    }

    @PostMapping("/process")
    public ResponseEntity<Map<String, Object>> processPayment(@RequestBody Map<String, Object> payment) {
        payment.put("id", idCounter++);
        payment.put("status", "SUCCESS");
        payments.add(payment);
        return ResponseEntity.status(HttpStatus.CREATED).body(payment);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getPayment(@PathVariable int id) {
        Optional<Map<String, Object>> paymentOpt = payments.stream()
                .filter(p -> p.get("id").equals(id))
                .findFirst();
        return paymentOpt.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
}