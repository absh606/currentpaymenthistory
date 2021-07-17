package com.tsys.billings.paymenthistory.currentpaymenthistory.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Output {
	
	Results result;
	
	@JsonIgnore
	Errors error;
	
	public Results getResult() {
		return result;
	}
	
	public void setResult(Results result) {
		this.result = result;
	}
	
	public Errors getError() {
		return error;
	}
	public void setError(Errors error) {
		this.error = error;
	}
}
