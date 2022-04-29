package com.spring.microservicos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.microservicos.entities.Payment;
import com.spring.microservicos.entities.Worker;
import com.spring.microservicos.feignclients.WorkerFeignClient;

@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(long workerId, int days) {
		
		Worker worker = workerFeignClient.findById(workerId).getBody(); 
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
		
	}

}
