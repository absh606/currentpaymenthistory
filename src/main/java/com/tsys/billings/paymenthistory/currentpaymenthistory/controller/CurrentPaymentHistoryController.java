package com.tsys.billings.paymenthistory.currentpaymenthistory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tsys.billings.paymenthistory.currentpaymenthistory.model.Response;
import com.tsys.billings.paymenthistory.currentpaymenthistory.services.PaymentHistoryService;

@RestController
public class CurrentPaymentHistoryController {
	
	@Autowired
	PaymentHistoryService paymentHistoryService;
	
	@GetMapping("/paymentHistories")
	public Response getCurrentHistory(@RequestParam String customerId, @RequestParam String fromDate, @RequestParam String toDate, @RequestParam String limit, @RequestParam String offset) {
		return paymentHistoryService.getCurrentHistory(customerId, fromDate, toDate, limit, offset);
	}
	
}
